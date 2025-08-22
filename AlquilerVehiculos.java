import javax.swing.*;

public class AlquilerVehiculos {
    public static void main(String[] args) {

            String nombre;
            int edad;
            boolean pregunta;
            boolean residente;
            int vehiculo;
            double horas;
            double moto=1000;
            double jeepeta=4000;
            double carro=2500;
            double subtotalMOTO;
            double subtotalJEEPETA;
            double descuentoJEEPETA;
            double descuentoMoto;
            double totalMoto;
            double totalJEEPETA;
            double subtotalCARRO;
            double descuentoCARRO;
            double totalCARRO;


            nombre= JOptionPane.showInputDialog("Cual es tu nombre? ");
            String pregunta1 = JOptionPane.showInputDialog("vienes a buscar un carro? ");
            pregunta=Boolean.parseBoolean(pregunta1);
            String edad2=JOptionPane.showInputDialog("Cual es tu edad? ");
            edad=Integer.parseInt(edad2);
            String residente2=JOptionPane.showInputDialog("eres residente? ");
            residente=Boolean.parseBoolean(residente2);
            String vehiculo2=JOptionPane.showInputDialog("que vehiculo vas a querer? 1 moto 2 jeepeta 3 carro? ");
            vehiculo=Integer.parseInt(vehiculo2);
            String horas2=JOptionPane.showInputDialog("que horas a querer? ");
            horas=Double.parseDouble(horas2);


            //calculos

            //MOTO
            subtotalMOTO=horas*moto;
            descuentoMoto=subtotalMOTO* 0.20;
            totalMoto=subtotalMOTO - descuentoMoto;

            //JEEPETA
            subtotalJEEPETA= horas*jeepeta;
            descuentoJEEPETA= subtotalJEEPETA*0.20;
            totalJEEPETA= subtotalJEEPETA - descuentoJEEPETA;

            //CARRO
            subtotalCARRO= horas*carro;
            descuentoCARRO= subtotalCARRO*0.20;
            totalCARRO= subtotalCARRO - descuentoCARRO;





            if(!pregunta){
                JOptionPane.showMessageDialog(null,nombre +" entonces para que viene? a comprar pan? en la esquina venden muy buenos");

            } else if (edad<18) {
                JOptionPane.showMessageDialog(null, nombre +" eres menor de edad");
            } else if (vehiculo<=0 && vehiculo>=4) {
                JOptionPane.showMessageDialog(null, nombre+" vehiculo invalido");


            }else if (pregunta && edad>=18 && edad<=24){
                JOptionPane.showMessageDialog(null,nombre+" por tener entre 18 y 25 años solo puedes alquilar motos total a pagar "+"\n"+
                                             "horas solicitadas "+horas+"\n"+
                                              "costo del alquiler "+moto+"\n"+
                                              "total a pagar "+subtotalMOTO);


            }else if(pregunta && edad>=25){
                if (residente ) {
                    if (vehiculo == 1) {
                        JOptionPane.showMessageDialog(null,nombre+" por ser residente te daremos un 20% de descueto en el alquiler de tu moto "+"\n"+
                                                     "subtotal "+subtotalMOTO+"\n"+
                                                     "horas solicitadas "+horas+"\n"+
                                                      "costo del alquiler "+moto+"\n"+
                                                      "descuento "+descuentoMoto+"\n"+
                                                       "total a pagar "+totalMoto+"\n");

                    }else if (vehiculo == 2){
                        JOptionPane.showMessageDialog(null,nombre+" por ser residente te daremos un 20% de descuento en el alquiler de tu jeepeta "+
                                                     "subtotal "+subtotalJEEPETA+"\n"+
                                                      "horas solicitadas "+horas+"\n"+
                                                     "costo del alquiler "+jeepeta+"\n"+
                                                     "descuento "+descuentoJEEPETA+"\n"+
                                                      "total a pagar "+totalJEEPETA+"\n");

                    } else if (vehiculo == 3) {
                        JOptionPane.showMessageDialog(null, nombre+" por ser residente te daremos un 20% de descuento en el alquiler de tu carro "+"\n"+
                                                     "subtotal "+subtotalCARRO+"\n"+
                                                       "horas solicitadas "+horas+"\n"+
                                                      "costo del alquiler " +carro+"\n"+
                                                      "descuento "+descuentoCARRO+"\n"+
                                                      "total a pagar "+totalCARRO+"\n");


                    }


                }else {
                    if(vehiculo==1) {
                        JOptionPane.showMessageDialog(null, nombre+"gracias por alquilar con nosotros una moto" + "\n" +
                                "horas solicitas " + horas+"\n" +
                                "costo del alquiler " + moto+ "\n" +
                                "total a pagar " + subtotalMOTO + "\n");
                    }if (vehiculo==2){
                        JOptionPane.showMessageDialog(null,nombre+"gracias por alquilar con nosotros una jeepeta "+"\n"+
                                                     "horas solicitadas "+horas+"\n"+
                                                      "costo del alquiler "+jeepeta+"\n"+
                                                       "total a pagar " + subtotalJEEPETA + "\n");

                    }if (vehiculo==3) {
                        JOptionPane.showMessageDialog(null,nombre+"gracias por alquilar con nosotros un carro "+"\n"+
                                              "horas solicitadas "+horas+"\n"+
                                                "costo del alquiler "+carro+"\n"+
                                                "total a pagar " + subtotalCARRO + "\n");
                    }

                }

            }


    }


}
