import javax.swing.*;

public class concional_if {
    public static void main(String[] args) {
        String nombre;
        int compra;
        double resultado;
        double resultado2;
        double resultado3;
        double resultado4;
        double descuento1=0.20;
        double descuento2=0.10;

        nombre= JOptionPane.showInputDialog("Ingrese su nombre");
        String compra2=JOptionPane.showInputDialog("Ingrese su compra: ");
        compra=Integer.parseInt(compra2);

        //calculos
        resultado=compra * descuento1;
        resultado2=compra - resultado;

        resultado3=compra * descuento2;
        resultado4=compra - resultado3;

        //analisis de dato
        if(compra>=5000){
            JOptionPane.showMessageDialog(null, "felicidades " +nombre +" por gastar mas de 5000 pesos te daremos un 20% a tu compra"+"\n"+
                    "su decuento es de "+ resultado+" pesos"+"\n "+
                    "total a pagar " +resultado2 +" pesos");


        }else if(compra>= 2000 && compra<5000){
            JOptionPane.showMessageDialog(null, "felicidades "+nombre+" por gastar entre 2000 y 5000 pesos tendras un descuento del 10% " +"\n"+
                    "su descuento es de "+ resultado3+"\n"+
                    "total a pagar " +resultado4 +" pesos");


        }else{
            JOptionPane.showMessageDialog(null, "Lo sentimos no aplicas a los descuentos disponibles");
        }

    }
}


