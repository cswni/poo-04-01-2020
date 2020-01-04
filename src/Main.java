import javax.swing.*;
public class Main {
    public static void main(String[] args){
        Universidad universidad = new Universidad();
        Estudiante estudiante = new Estudiante("Carlos Andres","Perez","123456789A");
        // create a jframe
        JFrame frame = new JFrame("Ejemplo");
        JOptionPane.showMessageDialog(frame, estudiante.getInformacion(),"Hola",JOptionPane.PLAIN_MESSAGE);
        System.exit(0);
        //System.out.println(universidad.lema);
        //System.out.println(universidad.telefono);
    }
}
