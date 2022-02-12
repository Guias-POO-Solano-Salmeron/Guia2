package guia2;
import javax.swing.*;
import java.util.concurrent.ThreadLocalRandom;

public class Complementario_2 {
    public static void main(String[] args){
        String[] bolitas = {"Roja", "Verde", "Blanca"};
        String gastoInput;
        double gasto, descuento, gastoTotal;
        int agarrarBolita;
        int minIndexBolita = 0;
        int maxIndexBolita = 1;
        ThreadLocalRandom tlr = ThreadLocalRandom.current();
        int randomIndiceBolita = tlr.nextInt(0, bolitas.length);
        String randomBolita = bolitas[randomIndiceBolita];

        gastoInput = JOptionPane.showInputDialog("Ingrese el gasto de sus compras");
        gasto = Double.parseDouble(gastoInput);

        agarrarBolita = JOptionPane.showConfirmDialog(null,
                "¿Desea probar su suerte sacando una bolita y así conseguir un descuento?");
        if(agarrarBolita == JOptionPane.YES_OPTION){
            if(randomBolita.equals("Roja")){
                System.out.println("Su bolita es de color rojo\nTendrá un descuento del 10%");
                descuento = gasto * 0.10;
                gastoTotal = gasto - descuento;
                System.out.println("El total es de: " + gastoTotal);
            } else if (randomBolita.equals("Verde")){
                System.out.println("Su bolita es de color verde\nTendrá un descuento del 5%");
                descuento = gasto * 0.05;
                gastoTotal = gasto - descuento;
                System.out.println("El total es de: " + gastoTotal);
            } else if (randomBolita.equals("Blanca")){
                System.out.println("Su bolita es de color blanca\nNo tiene descuento. Gracias por participar :)");
                gastoTotal = gasto;
                System.out.println("El total es de: " + gastoTotal);
            }
            System.out.println("N random: " + randomIndiceBolita);
        } else if (agarrarBolita == JOptionPane.NO_OPTION){
            System.out.println("Está bien. \nEntonces el valor de su compra es de: " +
                    gasto + "\nGracias por su compra, vuelva pronto :)");
        }
    }
}
