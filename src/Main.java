public class Main {
    public static void main(String[] args){
        Universidad universidad = new Universidad();
        Estudiante estudiante = new Estudiante("Carlos Andres","Perez","123456789A");

        System.out.println(universidad.nombre);
        System.out.println(universidad.lema);
        System.out.println(universidad.telefono);
    }
}
