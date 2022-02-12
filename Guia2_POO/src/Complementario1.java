package guia1;
import javax.swing.JOptionPane;
import javax.swing.*;
public class Complementario1 {
    public static void main(String[] args) {
        String nota;
        float nota1 = 0;
        nota = JOptionPane.showInputDialog("Ingrese la nota del alumno");
        while (!isNumber(nota)) {
            nota = JOptionPane.showInputDialog(null,
                    "Valor incorrecto, Por favor inserta un número positivo");
        }
        nota1 = Float.parseFloat(nota);
        if (nota1 < 0){
            JOptionPane.showMessageDialog(null, "No puedes ingresar números negativos","Error", JOptionPane.ERROR_MESSAGE);
            System.exit(0);
        }else if (nota1>10){
            JOptionPane.showMessageDialog(null, "La nota no puede ser mayor a 10","Error", JOptionPane.ERROR_MESSAGE);
            System.exit(0);
        }
        else{
            if (nota1 >= 7 && nota1<=10){
                JOptionPane.showMessageDialog(null, "EL alumno está aprobado" ,"Resultado",JOptionPane.PLAIN_MESSAGE);
                System.exit(0);
            }else if (nota1 >=6.50 && nota1<=6.99){
                JOptionPane.showMessageDialog(null, "El alumno tiene derecho a hacer un examen de suficiencia" ,"Resultado",JOptionPane.PLAIN_MESSAGE);
                System.exit(0);
            }
            else{
                JOptionPane.showMessageDialog(null, "El alumno está reprobado:" ,"Resultado",JOptionPane.PLAIN_MESSAGE);
                System.exit(0);
            }
        };

    }

    private static boolean isNumber(String n) {
        try {
            Float.parseFloat(n);
            return true;
        } catch (NumberFormatException nfe) {
            return false;
        }
    }
}


