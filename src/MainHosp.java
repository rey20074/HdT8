/*
* Última modificación el 23/04/2020
* Clase Main para la implementacion de Heaps y Priority Queue en java
*
* @author José Mariano Reyes
* 20074
* */

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.PriorityQueue;

public class MainHosp {

    static VectorHeap<Paciente> VH = new VectorHeap<Paciente>();

    public static void main(String[]args){

        String linea;
        String[] lista;
        ArrayList<Paciente> datos=new ArrayList<Paciente>();

        //leer archivo y crear pacientes
        try{
            File file = new File("pacientes.txt");
            Scanner input = new Scanner(file);
            while(input.hasNextLine()){
                linea= input.nextLine();
                lista = linea.split(",");
                System.out.println("El paciente "+lista[0]+" tiene"+lista[1]+" y es de prioridad"+lista[2]);
                Paciente paciente=new Paciente(lista[0],lista[1],lista[2]);
                datos.add(paciente);
                VH.add(paciente);
            }

        }catch (Exception e) {
            System.out.println("\nNo existe dicho archivo");
        }

        boolean run=true;
        int op=0;
        Scanner scan=new Scanner(System.in);

        while (run==true){
            try{
                System.out.println("\nElija una opción para avanzar:\n1. VectorHeap\n2. PriorityQueue (JCF)\n3. Salir\n>>");
                op=scan.nextInt();

                //implementacion de VectorHeap
                if(op==1){
                    System.out.println("\nLos pacientes ingresaron de la siguiente manera:\n");
                    for(Paciente p:datos){
                        System.out.println(p);
                    }

                    System.out.println("\nDebido a la prioridad de las enfermedades los pacientes deben ser atendidos de la siguiente forma: \n");
                    while(!VH.isEmpty()){
                        System.out.println(VH.remove().toString());
                    }
                }

                //implementacion del JCF
                else if(op==2){
                    PriorityQueue<Paciente> pq = new PriorityQueue<Paciente>();
                    for(Paciente p:datos){
                        pq.offer(p);
                    }
                    while(!pq.isEmpty()){
                        System.out.println(pq.poll());
                    }

                }
                else if(op==3){
                    System.out.println("Eligió salir, adios.");
                    run=false;
                }
                else{
                    System.out.println("\nEl numero ingresado no es una opcion");
                }
            }
            catch (Exception e){
                System.out.println("\nNo se ingreso una opción numérica");
            }
        }

    }
}
