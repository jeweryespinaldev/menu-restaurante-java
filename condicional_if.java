import javax.swing.*;
import java.util.Scanner;

public class condicional_if {

    public static void main(String[] args) {

        String nombre;
        int menu;
        int hamburguesa = 150;
        int pizza = 200;
        int hotdog = 100;
        int cuantos;
        int resultado;
        int resultado2;
        int resultado3;

        nombre = JOptionPane.showInputDialog(null, "Di nombre ");
        String menu2 = JOptionPane.showInputDialog(null, "Nuestro menu: 1 hamburguesa 150 pesos, 2 pizza 200 pesos, 3 hot dog 100 pesos 4 salir ¿cual opcion eliges? ");
        menu = Integer.parseInt(menu2);
        String cuantos2 = JOptionPane.showInputDialog(null, "cauntos(a) vas a querer?");
        cuantos = Integer.parseInt(cuantos2);


        //calculos
        resultado = menu * hamburguesa * cuantos;

        resultado2 = menu * pizza * cuantos;

        resultado3 = menu * hotdog * cuantos;

        //analisis de datos
        if (menu == 1) {
            JOptionPane.showMessageDialog(null, nombre + ", ordonaste " + cuantos + " hamburguesa " + "\n" +
                    " total a pagar " + resultado);


        } else if (menu == 2) {
            JOptionPane.showMessageDialog(null, nombre + ", ordenaste " + cuantos + " pizza " + "\n" +
                    " total a pagar " + resultado2);

        } else if (menu == 3) {
            JOptionPane.showMessageDialog(null, nombre + ", ordenaste " + cuantos + " hot dog" + "\n" +
                    " total a pagar " + resultado3);{

            }
                } else if (menu == 4) {
            JOptionPane.showMessageDialog(null, "Gracias por visitarnos");


        }else{
            JOptionPane.showMessageDialog(null, "Opcion no permitida");
        }
    }
}