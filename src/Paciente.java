/*
 * Última modificación el 23/04/2020
 * Clase de Paciente con toda la ficha del paciente y clase comparable
 *
 * @author José Mariano Reyes
 * 20074
 * */

public class Paciente implements Comparable{

    private String nombre;
    private String dolencia;
    private String prioridad;

    public Paciente(String nombre,String dolencia,String prioridad){
        this.nombre=nombre;
        this.dolencia=dolencia;
        this.prioridad=prioridad;
    }

    @Override
    public String toString() {
        String x="El paciente "+nombre+" tiene "+dolencia+" y es de prioridad "+prioridad;
        return x;
    }

    @Override
    public int compareTo(Object o) {
        return 0;
    }
}
