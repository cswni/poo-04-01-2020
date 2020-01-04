public class Estudiante {
    String nombre = "";
    String apellido = "";
    String cedula = "";

    public Estudiante(String nombre,String apellido, String cedula){
        this.nombre = "Me llamo "+ nombre;
        this.apellido = apellido;
        this.cedula = cedula;
    }
    public String getInformacion (){
        return nombre + " " +apellido +" y me identifico con cedula # "+cedula;
    }
}
