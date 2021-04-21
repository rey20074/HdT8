/*
 * Última modificación el 23/04/2020
 * Clase de Paciente con toda la ficha del paciente y clase comparable
 *
 * @author José Mariano Reyes
 * 20074
 * */

public class Paciente implements Comparable<Paciente>{

    //atributos inciales
    private String nombre;
    private String dolencia;
    private String prioridad;

    //constructor
    public Paciente(String nombre,String dolencia,String prioridad){
        this.nombre=nombre;
        this.dolencia=dolencia;
        this.prioridad=prioridad;
    }

    //getters y setters
    public String getNombre() {
        return nombre;
    }

    public String getDolencia() {
        return dolencia;
    }

    public String getPrioridad() {
        return prioridad;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setDolencia(String dolencia) {
        this.dolencia = dolencia;
    }

    public void setPrioridad(String prioridad) {
        this.prioridad = prioridad;
    }

    //string del paciente
    @Override
    public String toString() {
        String x="El paciente "+nombre+" tiene "+dolencia+" y es de prioridad "+prioridad;
        return x;
    }

    //clase comparable entre las prioridades de los pacientes para poder definir la prioridad de cada uno
    @Override
    public int compareTo(Paciente paciente) {
        return this.prioridad.compareTo(paciente.prioridad);
    }
}
