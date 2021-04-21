/*
* Última modificación el 23/04/2020
* Clase Main para la implementaci[on de Heaps y Priority Qeue en java
*
* @author José Mariano Reyes
* 20074
* */

import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;

public class MainHosp {
    public static void main(String[]args){
        String linea;
        String[] lista;
        ArrayList<Paciente> Datos=new ArrayList<Paciente>();

        try{
            File file = new File("src/pacientes.txt");
            Scanner input = new Scanner(file);
            while(input.hasNextLine()){
                linea= input.nextLine();
                lista = linea.split(",");
                System.out.println("El paciente: "+lista[0]+" tiene:"+lista[1]+" es de prioridad:"+lista[2]);
                Paciente paciente=new Paciente(lista[0],lista[1],lista[2]);
                Datos.add(paciente);
            }

        }catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println("\n");

    }
}
