import javax.swing.*;
import java.util.Map;
import java.util.HashMap;
import java.util.Set;
import java.util.Iterator;


public class Complementario_4 {
    public static void main(String[] args) {

        String carnet;
        String nombre;
        String search;
        String optionInput;

        int option;

        HashMap<String, String> Estudiantes = new HashMap<>();

        do{
            optionInput = JOptionPane.showInputDialog(
                    null,
                    "~~ 1. Ingresar un estudiante \n" +
                            "~~ 2. Ver estudiante \n" +
                            "~~ 3. Buscar Estudiante \n" +
                            "~~ 4. Salir"
            );
            option = Integer.parseInt(optionInput);

            if(option >= 1 && option <= 4){
                switch (option){

                    case 1:
                        carnet = JOptionPane.showInputDialog(
                                "Ingresa el carnet del estudiante"
                        );
                        nombre = JOptionPane.showInputDialog(
                                "Ingresa el nombre del estudiante"
                        );
                        Estudiantes.put(carnet, nombre);
                        break;

                    case 2:
                        System.out.println(
                                "HashMap:"
                        );
                        Set set = Estudiantes.entrySet();
                        Iterator iterator = set.iterator();

                        while (iterator.hasNext()) {
                            Map.Entry mentry = (Map.Entry) iterator.next();
                            System.out.println(
                                    "Carnet: " +
                                            mentry.getKey() +
                                            " - Nombre: " +
                                            mentry.getValue()
                            );
                        }
                        break;

                    case 3:
                        search = JOptionPane.showInputDialog(
                                "Ingresa el carnet del estudiante"
                        );
                        String carnetEstudiante = Estudiantes.get(search);
                        JOptionPane.showMessageDialog(
                                null,
                                "\nEl estudiante dueño del carnet: " +
                                        carnetEstudiante
                        );

                    case 4:
                        JOptionPane.showMessageDialog(
                                null,
                                "Adiós :)"
                        );
                        break;

                }
            } else {
                JOptionPane.showMessageDialog(
                        null,
                        "Ingresa una opción correcta :/"
                );
            }
        }while (option !=4);
    }
}
