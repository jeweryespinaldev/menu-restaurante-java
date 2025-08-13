import java.util.Scanner;

public class FacturaDosProductos {
    public static void main(String[] args) {

        double producto1;
        double producto2;
        double suma;
        double resultado;
        double resultado2;
        double itbis;


        Scanner sc = new Scanner(System.in);
        System.out.println("ingrese el precio de primer producto");
        producto1 = sc.nextDouble();
        System.out.println("ingrese el precio del segundo producto");
        producto2 = sc.nextDouble();


        //calculos
        suma=producto1+producto2;
        resultado=suma *0.18;
        resultado2=resultado + suma;

        if(producto1>0 && producto2>0){
            System.out.println("el precio de los 2 productos es de "+resultado2+"con  impuesto incluidos "+"\n"+
                                "producto 1 "+producto1+"\n"+
                                 "producto 2 "+producto2+"\n"+
                                  "la suma de los productos "+suma+"\n"+
                                  "itbis "+resultado+"\n"+
                                   "total a pagar "+resultado2);

        }


    }
}
