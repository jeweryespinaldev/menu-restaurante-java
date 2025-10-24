import java.util.Scanner;

public class SistemaNotas {
    public static void main(String[] args) {

        //variables

        int nota;
        int contador=1;
        int valor=0;
        int maximo=-999;
        int minimo=999;
        String sexo;
        int MasculinoNotas=0;
        int FemeninoNotas=0;
        int sumaGeneral=0;
        int sumaSexo=0;
        String mensaje=" ";
        int sumaMasculino=0,sumaFemenino=0;

        //entrada de datos

        Scanner input=new Scanner(System.in);
        System.out.println("cuantas notas vas a ingresar?");
        nota=input.nextInt();

        //ANALISIS DE DATOS


        while (nota<=0){
            System.out.println("escriba un valor valido");
            nota=input.nextInt();
        }

        do {
            System.out.println("escriba la nota "+contador);
            valor=input.nextInt();
            sumaGeneral+=valor;

            System.out.println("escriba el sexo de la persona de esa nota "+contador+"(masculino/femenino)");
            sexo=input.next();


            if (sexo.equalsIgnoreCase("masculino") || sexo.equalsIgnoreCase("femenino")) {

                if (valor >= 70) {
                    System.out.println("nota aprobada");
                } else {
                    System.out.println("nota reprobada");
                }
            }

            if (valor>=maximo){
                maximo=valor;

                if (sexo.equalsIgnoreCase("masculino")){
                    mensaje="masculino";
                }
                if (sexo.equalsIgnoreCase("femenino")){
                    mensaje="femenino";
                }

            }
            if (valor<=minimo){
                minimo=valor;

                if (sexo.equalsIgnoreCase("masculino")){
                    mensaje="masculino";
                }
                if (sexo.equalsIgnoreCase("femenino")){
                    mensaje="femenino";
                }

            }
            while (valor<=0 || valor>100){
                System.out.println("escriba un valor valido para la nota "+contador);
                valor=input.nextInt();
            }
            while (!sexo.trim().equalsIgnoreCase("masculino") && !sexo.trim().equalsIgnoreCase("femenino")){
                System.out.println("escriba el sexo de la nota numero "+contador);
                sexo=input.next();
            }
            if (sexo.equalsIgnoreCase("masculino")){


                sumaMasculino += valor;

                MasculinoNotas++;


            }
            if (sexo.equalsIgnoreCase("femenino")){
                sumaFemenino+=valor;
                FemeninoNotas++;

            }


            sumaSexo=MasculinoNotas+FemeninoNotas;


            contador++;
        }while (contador<=nota);

        System.out.println("notas ingresadas="+nota);
        System.out.println("suma general de notas="+sumaGeneral);
        System.out.println("sexo ingresados="+sumaSexo);
        System.out.println("suma de notas del sexo masculino="+sumaMasculino);
        System.out.println("suma de notas del sexo femenino="+sumaFemenino);
        System.out.println("promedio general de notas="+sumaGeneral/nota);
        if (MasculinoNotas>0) {
            System.out.println("promedio de notas de varones=" + sumaMasculino / MasculinoNotas);
        }
        if (FemeninoNotas>0) {
            System.out.println("promedio de notas de hembras=" + sumaFemenino / FemeninoNotas);
        }
        System.out.println("nota mas alta y el sexo=" +maximo+"/"+mensaje);
        System.out.println("nota mas baja y el sexo="+minimo+"/"+mensaje);
    }
}
