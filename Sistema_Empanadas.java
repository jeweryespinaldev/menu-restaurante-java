import java.util.Scanner;

public class Sistema_Empanadas {
    public static void main(String[] args) {

        int dia=1;
        String DiasSemana=" ";
        //DIA 1 EMPANADAS Y BEBIDAS

        //empanada de queso
        int ventasQuesoDia1;
        int sumaQuesoDia1;
        int GanaciasEmpanadaQuesoDia1=0;
        int contadorQuesoDia1=0;
        String Salir;

        //empanada de jamon
        int ventasJamonDia1;
        int sumaJamonDia1;

        int contadorJamonDia1=0;
        int GanaciasEmpanadaJamonDia1=0;

        //empanada de jamon y queso
        int ventasJamonQuesoDia1;
        int sumaJamonQuesoDia1;
        int contadorJamonQuesoDia1=0;
        int GanaciasEmpanadaJamonQuesoDia1=0;

        //bebidas
        int sumaAguaDia1=0,sumaRefrescoDia1=0,sumaJugoMangoDia1=0,sumaJugoPiñaDia1=0;
        int contadorAguaDia1=0,contadorRefrescoDia1=0,contadorJugoMangoDia1=0,contadorJugoPiñaDia1=0;
        int contadorAguaGananciaDia1=1,contadorRefrescoGanaciasDia1=1,contadorJugoMangoGananciasDia1=1,contadorJugoPiñaGananciasDia1=1;

        //DIA 2 EMPANADAS Y BEBIDAS
        int ventasQuesoDia2;
        int sumaQuesoDia2;
        int GanaciasEmpanadaQuesoDia2=0;
        int contadorQuesoDia2=0;



        int ventasJamonDia2=0;
        int sumaJamonDia2=0;
        int contadorJamonDia2=0;
        int GanaciasEmpanadaJamonDia2=0;

        //empanada de jamon y queso
        int ventasJamonQuesoDia2=0;
        int sumaJamonQuesoDia2=0;
        int contadorJamonQuesoDia2=0;
        int GanaciasEmpanadaJamonQuesoDia2=0;

        //bebidas
        int sumaAguaDia2=0,sumaRefrescoDia2=0,sumaJugoMangoDia2=0,sumaJugoPiñaDia2=0;
        int contadorAguaDia2=0,contadorRefrescoDia2=0,contadorJugoMangoDia2=0,contadorJugoPiñaDia2=0;
        int contadorAguaGananciaDia2=1,contadorRefrescoGanaciasDia2=1,contadorJugoMangoGananciasDia2=1,contadorJugoPiñaGananciasDia2=1;

        //DIA 3 EMPANADAS Y BEBIDAS
        int ventasQuesoDia3=0;
        int sumaQuesoDia3=0;
        int GanaciasEmpanadaQuesoDia3=0;
        int contadorQuesoDia3=0;



        int ventasJamonDia3=0;
        int sumaJamonDia3=0;
        int contadorJamonDia3=0;
        int GanaciasEmpanadaJamonDia3=0;

        //empanada de jamon y queso
        int ventasJamonQuesoDia3=0;
        int sumaJamonQuesoDia3=0;
        int contadorJamonQuesoDia3=0;
        int GanaciasEmpanadaJamonQuesoDia3=0;

        //bebidas
        int sumaAguaDia3=0,sumaRefrescoDia3=0,sumaJugoMangoDia3=0,sumaJugoPiñaDia3=0;
        int contadorAguaDia3=0,contadorRefrescoDia3=0,contadorJugoMangoDia3=0,contadorJugoPiñaDia3=0;
        int contadorAguaGananciaDia3=1,contadorRefrescoGanaciasDia3=1,contadorJugoMangoGananciasDia3=1,contadorJugoPiñaGananciasDia3=1;

        //DIA 4 EMPANADAS Y BEBIDAS
        int ventasQuesoDia4=0;
        int sumaQuesoDia4=0;
        int GanaciasEmpanadaQuesoDia4=0;
        int contadorQuesoDia4=0;



        int ventasJamonDia4=0;
        int sumaJamonDia4=0;
        int contadorJamonDia4=0;
        int GanaciasEmpanadaJamonDia4=0;

        //empanada de jamon y queso
        int ventasJamonQuesoDia4=0;
        int sumaJamonQuesoDia4=0;
        int contadorJamonQuesoDia4=0;
        int GanaciasEmpanadaJamonQuesoDia4=0;

        //bebidas
        int sumaAguaDia4=0,sumaRefrescoDia4=0,sumaJugoMangoDia4=0,sumaJugoPiñaDia4=0;
        int contadorAguaDia4=0,contadorRefrescoDia4=0,contadorJugoMangoDia4=0,contadorJugoPiñaDia4=0;
        int contadorAguaGananciaDia4=1,contadorRefrescoGanaciasDia4=1,contadorJugoMangoGananciasDia4=1,contadorJugoPiñaGananciasDia4=1;
        //DIA 4 EMPANADAS Y BEBIDAS

        int ventasQuesoDia5=0;
        int sumaQuesoDia5=0;
        int GanaciasEmpanadaQuesoDia5=0;
        int contadorQuesoDia5=0;



        int ventasJamonDia5=0;
        int sumaJamonDia5=0;
        int contadorJamonDia5=0;
        int GanaciasEmpanadaJamonDia5=0;

        //empanada de jamon y queso
        int ventasJamonQuesoDia5=0;
        int sumaJamonQuesoDia5=0;
        int contadorJamonQuesoDia5=0;
        int GanaciasEmpanadaJamonQuesoDia5=0;

        //bebidas
        int sumaAguaDia5=0,sumaRefrescoDia5=0,sumaJugoMangoDia5=0,sumaJugoPiñaDia5=0;
        int contadorAguaDia5=0,contadorRefrescoDia5=0,contadorJugoMangoDia5=0,contadorJugoPiñaDia5=0;
        int contadorAguaGananciaDia5=1,contadorRefrescoGanaciasDia5=1,contadorJugoMangoGananciasDia5=1,contadorJugoPiñaGananciasDia5=1;




        //VENTAS DEL DIA VARIABLES
        int ventasAver,EmpanadasAver,BebidasAver;

        //REPETICIONES DE COMPRA
        String AgregarEmpanadas;
        String DeseasBebida;

        //PRECIOS DE LAS BEBIDAS
        int precioAgua=10,precioRefresco=20,precioJugoMango=25,precioJugoPiña=25;

        //PRECIOS DE LAS EMPANADAS
        int empanadaQueso=50;
        int empanadaJamon=50;
        int empanadaJamonQueso=120;

        //TOTALES EMPANADAS
        int empanadasTotalesQueso=0;
        int empanadasTotalesJamon=0;
        int empanadasTotalesJamonQueso=0;
        int TotalGeneralEmpanadas=0;
        int GananciasEmpanadasTotales=0;

        //TOTALES BEBIDAS
        int aguaTotales=0;
        int refrescoTotales=0;
        int jugoMangoTotales=0;
        int jugoPiñaTotales=0;
        int TotalGeneralBebidas=0;
        int GananciasBebidaTotales=0;

        Scanner input=new Scanner(System.in);




        String AgregarBebidas;

        while (dia<=5) {

            //DIAS
            switch (dia){
                case 1-> DiasSemana="lunes";
                case 2-> DiasSemana="martes";
                case 3-> DiasSemana="miercoles";
                case 4-> DiasSemana="jueves";
                case 5-> DiasSemana="viernes";




            }

            for (int menu = 0; menu != 3; ) {
                //menu principal
                System.out.println("====RESTAURANTE EMPANADA FELIZ🥟====");
                System.out.println("dia actual "+DiasSemana);
                System.out.println("1. Acceder al menu");
                System.out.println("2. ventas del dia");
                System.out.println("3 salir");
                menu = input.nextInt();

                switch (menu) {
                    case 1:
                        for (int Empanadas = 0; Empanadas != 4; ) {
                            //menu de empanadas
                            System.out.println("MENU ACTUAL");
                            System.out.println("1. EMPANADA DE QUESO=50$");
                            System.out.println("2. EMPANADA DE JAMON=50$");
                            System.out.println("3. EMPANADA DE JAMON Y QUESO=120$");
                            System.out.println("4. salir");
                            Empanadas = input.nextInt();

                            if (dia == 1) {

                                //empanada de queso

                                if (Empanadas == 1) {


                                    do {
                                        //venta de empanada de queso dia 1
                                        System.out.println("cuantas empanadas de queso se venderan?");
                                        ventasQuesoDia1 = input.nextInt();


                                        System.out.println("quiere agregar mas empanadas de queso? s/n");
                                        AgregarEmpanadas = input.next();

                                        while (!AgregarEmpanadas.equalsIgnoreCase("s") && !AgregarEmpanadas.equalsIgnoreCase("n")) {
                                            System.out.println("debes decir s/n para seguir");
                                            AgregarEmpanadas = input.next();
                                        }
                                        sumaQuesoDia1 = empanadaQueso * ventasQuesoDia1;
                                        GanaciasEmpanadaQuesoDia1 += sumaQuesoDia1;
                                        contadorQuesoDia1 += ventasQuesoDia1;


                                    } while (AgregarEmpanadas.equalsIgnoreCase("s"));

                                    System.out.println("deseas agregar una bebida a tu empanada? s/n");
                                    DeseasBebida = input.next();

                                    while (DeseasBebida.equalsIgnoreCase("s") && DeseasBebida.equalsIgnoreCase("n")) {
                                        System.out.println("debes elejir s/n para seguir con la accion");
                                        DeseasBebida = input.next();
                                    }


                                    if (DeseasBebida.equalsIgnoreCase("s")) {

                                        for (int menuDeBebidas = 0; menuDeBebidas != 5; ) {


                                            //menu de bebidas
                                            System.out.println("===BEBIDAS===");
                                            System.out.println("1. AGUA=10$");
                                            System.out.println("2. REFRESCO=20$");
                                            System.out.println("3. JUGO DE MANGO=25$");
                                            System.out.println("4. JUGO DE PIÑA=25$");
                                            System.out.println("5 salir");
                                            menuDeBebidas = input.nextInt();


                                            switch (menuDeBebidas) {

                                                case 1:
                                                    sumaAguaDia1 = precioAgua * contadorAguaGananciaDia1;
                                                    contadorAguaGananciaDia1++;
                                                    contadorAguaDia1++;

                                                case 2:
                                                    sumaRefrescoDia1 = precioRefresco * contadorRefrescoGanaciasDia1;
                                                    contadorRefrescoGanaciasDia1++;
                                                    contadorRefrescoDia1++;

                                                case 3:
                                                    sumaJugoMangoDia1 = precioJugoMango * contadorJugoMangoGananciasDia1;
                                                    contadorJugoMangoGananciasDia1++;
                                                    contadorJugoMangoDia1++;

                                                case 4:
                                                    sumaJugoPiñaDia1 = precioJugoPiña * contadorJugoPiñaGananciasDia1;
                                                    contadorJugoPiñaGananciasDia1++;
                                                    contadorJugoMangoDia1++;


                                            }


                                            if (menuDeBebidas < 1 || menuDeBebidas >= 6) {
                                                System.out.println("ERROR");
                                                break;
                                            }

                                            System.out.println("deseas agregar otra bebida? s/n");
                                            AgregarBebidas = input.next();

                                            while (!AgregarBebidas.equalsIgnoreCase("s") && !AgregarBebidas.equalsIgnoreCase("n")) {
                                                System.out.println("debes elegir una opcion");
                                                AgregarBebidas = input.next();
                                            }

                                            if (AgregarBebidas.equalsIgnoreCase("n")) {
                                                break;
                                            }


                                        }


                                    }


                                }
                                //empanada de jamon
                                if (Empanadas == 2) {

                                    do {
                                        //venta de empanada de empanada de jamon dia 1
                                        System.out.println("cuantas empanadas de jamon se venderan?");
                                        ventasJamonDia1 = input.nextInt();

                                        sumaJamonDia1 = empanadaJamon * ventasJamonDia1;
                                        GanaciasEmpanadaJamonDia1 += sumaJamonDia1;
                                        contadorJamonDia1 += ventasJamonDia1;


                                        System.out.println("quiere agregar mas empanadas de jamon? s/n");
                                        AgregarEmpanadas = input.next();

                                        while (!AgregarEmpanadas.equalsIgnoreCase("s") && !AgregarEmpanadas.equalsIgnoreCase("n")) {
                                            System.out.println("debes decir s/n para seguir");
                                            AgregarEmpanadas = input.next();
                                        }


                                    } while (AgregarEmpanadas.equalsIgnoreCase("s"));

                                    System.out.println("deseas agregar una bebida a tu empanada? s/n");
                                    DeseasBebida = input.next();

                                    while (DeseasBebida.equalsIgnoreCase("s") && DeseasBebida.equalsIgnoreCase("n")) {
                                        System.out.println("debes elejir s/n para seguir con la accion");
                                        DeseasBebida = input.next();
                                    }


                                    if (DeseasBebida.equalsIgnoreCase("s")) {

                                        for (int menuDeBebidas = 0; menuDeBebidas != 5; ) {


                                            //menu de bebidas
                                            System.out.println("===BEBIDAS===");
                                            System.out.println("1. AGUA=10$");
                                            System.out.println("2. REFRESCO=20$");
                                            System.out.println("3. JUGO DE MANGO=25$");
                                            System.out.println("4. JUGO DE PIÑA=25$");
                                            System.out.println("5 salir");
                                            menuDeBebidas = input.nextInt();
                                            switch (menuDeBebidas) {

                                                case 1:
                                                    sumaAguaDia1 = precioAgua * contadorAguaGananciaDia1;
                                                    contadorAguaGananciaDia1++;
                                                    contadorAguaDia1++;

                                                case 2:
                                                    sumaRefrescoDia1 = precioRefresco * contadorRefrescoGanaciasDia1;
                                                    contadorRefrescoGanaciasDia1++;
                                                    contadorRefrescoDia1++;

                                                case 3:
                                                    sumaJugoMangoDia1 = precioJugoMango * contadorJugoMangoGananciasDia1;
                                                    contadorJugoMangoGananciasDia1++;
                                                    contadorJugoMangoDia1++;

                                                case 4:
                                                    sumaJugoPiñaDia1 = precioJugoPiña * contadorJugoPiñaGananciasDia1;
                                                    contadorJugoPiñaGananciasDia1++;
                                                    contadorJugoMangoDia1++;


                                            }


                                            if (menuDeBebidas < 1 || menuDeBebidas >= 6) {
                                                System.out.println("ERROR");
                                                break;
                                            }

                                            System.out.println("deseas agregar otra bebida? s/n");
                                            AgregarBebidas = input.next();

                                            while (!AgregarBebidas.equalsIgnoreCase("s") && !AgregarBebidas.equalsIgnoreCase("n")) {
                                                System.out.println("debes elegir una opcion");
                                                AgregarBebidas = input.next();
                                            }

                                            if (AgregarBebidas.equalsIgnoreCase("n")) {
                                                break;
                                            }


                                        }


                                    }


                                }
                                //empanada de jamon y queso dia 1
                                if (Empanadas == 3) {

                                    do {
                                        //venta de empanada de jamon y queso dia 1
                                        System.out.println("cuantas empanadas de jamon y queso se venderan?");
                                        ventasJamonQuesoDia1 = input.nextInt();


                                        System.out.println("quiere agregar mas empanadas de jamon y queso? s/n");
                                        AgregarEmpanadas = input.next();

                                        while (!AgregarEmpanadas.equalsIgnoreCase("s") && !AgregarEmpanadas.equalsIgnoreCase("n")) {
                                            System.out.println("debes decir s/n para seguir");
                                            AgregarEmpanadas = input.next();
                                        }
                                        sumaJamonQuesoDia1 = empanadaJamonQueso * ventasJamonQuesoDia1;
                                        GanaciasEmpanadaJamonQuesoDia1 += sumaJamonQuesoDia1;
                                        contadorJamonQuesoDia1 += ventasJamonQuesoDia1;


                                    } while (AgregarEmpanadas.equalsIgnoreCase("s"));

                                    System.out.println("deseas agregar una bebida a tu empanada? s/n");
                                    DeseasBebida = input.next();

                                    while (DeseasBebida.equalsIgnoreCase("s") && DeseasBebida.equalsIgnoreCase("n")) {
                                        System.out.println("debes elejir s/n para seguir con la accion");
                                        DeseasBebida = input.next();
                                    }


                                    if (DeseasBebida.equalsIgnoreCase("s")) {

                                        for (int menuDeBebidas = 0; menuDeBebidas != 5; ) {


                                            //menu de bebidas
                                            System.out.println("===BEBIDAS===");
                                            System.out.println("1. AGUA=10$");
                                            System.out.println("2. REFRESCO=20$");
                                            System.out.println("3. JUGO DE MANGO=25$");
                                            System.out.println("4. JUGO DE PIÑA=25$");
                                            System.out.println("5 salir");
                                            menuDeBebidas = input.nextInt();


                                            switch (menuDeBebidas) {

                                                case 1:
                                                    sumaAguaDia1 = precioAgua * contadorAguaGananciaDia1;
                                                    contadorAguaGananciaDia1++;
                                                    contadorAguaDia1++;

                                                case 2:
                                                    sumaRefrescoDia1 = precioRefresco * contadorRefrescoGanaciasDia1;
                                                    contadorRefrescoGanaciasDia1++;
                                                    contadorRefrescoDia1++;

                                                case 3:
                                                    sumaJugoMangoDia1 = precioJugoMango * contadorJugoMangoGananciasDia1;
                                                    contadorJugoMangoGananciasDia1++;
                                                    contadorJugoMangoDia1++;

                                                case 4:
                                                    sumaJugoPiñaDia1 = precioJugoPiña * contadorJugoPiñaGananciasDia1;
                                                    contadorJugoPiñaGananciasDia1++;
                                                    contadorJugoPiñaDia1++;


                                            }
                                            if (menuDeBebidas < 1 || menuDeBebidas >= 6) {
                                                System.out.println("ERROR");
                                                break;
                                            }

                                            System.out.println("deseas agregar otra bebida? s/n");
                                            AgregarBebidas = input.next();

                                            while (!AgregarBebidas.equalsIgnoreCase("s") && !AgregarBebidas.equalsIgnoreCase("n")) {
                                                System.out.println("debes elegir una opcion");
                                                AgregarBebidas = input.next();
                                            }

                                            if (AgregarBebidas.equalsIgnoreCase("n")) {
                                                break;
                                            }


                                        }


                                    }


                                }

                            }
                            if (dia == 2) {

                                if (Empanadas == 1) {

                                    do {
                                        //venta de empanada de queso dia 2
                                        System.out.println("cuantas empanadas de queso se venderan?");
                                        ventasQuesoDia2 = input.nextInt();


                                        System.out.println("quiere agregar mas empanadas de queso? s/n");
                                        AgregarEmpanadas = input.next();

                                        while (!AgregarEmpanadas.equalsIgnoreCase("s") && !AgregarEmpanadas.equalsIgnoreCase("n")) {
                                            System.out.println("debes decir s/n para seguir");
                                            AgregarEmpanadas = input.next();
                                        }
                                        sumaQuesoDia2 = empanadaQueso * ventasQuesoDia2;
                                        GanaciasEmpanadaQuesoDia2 += sumaQuesoDia2;
                                        contadorQuesoDia2 += ventasQuesoDia2;


                                    } while (AgregarEmpanadas.equalsIgnoreCase("s"));

                                    System.out.println("deseas agregar una bebida a tu empanada? s/n");
                                    DeseasBebida = input.next();

                                    while (DeseasBebida.equalsIgnoreCase("s") && DeseasBebida.equalsIgnoreCase("n")) {
                                        System.out.println("debes elejir s/n para seguir con la accion");
                                        DeseasBebida = input.next();
                                    }


                                    if (DeseasBebida.equalsIgnoreCase("s")) {

                                        for (int menuDeBebidas = 0; menuDeBebidas != 5; ) {


                                            //menu de bebidas
                                            System.out.println("===BEBIDAS===");
                                            System.out.println("1. AGUA=10$");
                                            System.out.println("2. REFRESCO=20$");
                                            System.out.println("3. JUGO DE MANGO=25$");
                                            System.out.println("4. JUGO DE PIÑA=25$");
                                            System.out.println("5 salir");
                                            menuDeBebidas = input.nextInt();


                                            switch (menuDeBebidas) {

                                                case 1:
                                                    sumaAguaDia2 = precioAgua * contadorAguaGananciaDia2;
                                                    contadorAguaGananciaDia2++;
                                                    contadorAguaDia2++;

                                                case 2:
                                                    sumaRefrescoDia2 = precioRefresco * contadorRefrescoGanaciasDia2;
                                                    contadorRefrescoGanaciasDia2++;
                                                    contadorRefrescoDia2++;

                                                case 3:
                                                    sumaJugoMangoDia2 = precioJugoMango * contadorJugoMangoGananciasDia2;
                                                    contadorJugoMangoGananciasDia2++;
                                                    contadorJugoMangoDia2++;

                                                case 4:
                                                    sumaJugoPiñaDia2 = precioJugoPiña * contadorJugoPiñaGananciasDia2;
                                                    contadorJugoPiñaGananciasDia2++;
                                                    contadorJugoMangoDia2++;


                                            }


                                            if (menuDeBebidas < 1 || menuDeBebidas >= 6) {
                                                System.out.println("ERROR");
                                                break;
                                            }

                                            System.out.println("deseas agregar otra bebida? s/n");
                                            AgregarBebidas = input.next();

                                            while (!AgregarBebidas.equalsIgnoreCase("s") && !AgregarBebidas.equalsIgnoreCase("n")) {
                                                System.out.println("debes elegir una opcion");
                                                AgregarBebidas = input.next();
                                            }

                                            if (AgregarBebidas.equalsIgnoreCase("n")) {
                                                break;
                                            }


                                        }


                                    }
                                }
                                if (Empanadas == 2) {

                                    do {
                                        //venta de empanada de empanada de jamon dia 2
                                        System.out.println("cuantas empanadas de jamon se venderan?");
                                        ventasJamonDia2 = input.nextInt();

                                        sumaJamonDia2 = empanadaJamon * ventasJamonDia2;
                                        GanaciasEmpanadaJamonDia2 += sumaJamonDia2;
                                        contadorJamonDia2 += ventasJamonDia2;


                                        System.out.println("quiere agregar mas empanadas de jamon? s/n");
                                        AgregarEmpanadas = input.next();

                                        while (!AgregarEmpanadas.equalsIgnoreCase("s") && !AgregarEmpanadas.equalsIgnoreCase("n")) {
                                            System.out.println("debes decir s/n para seguir");
                                            AgregarEmpanadas = input.next();
                                        }


                                    } while (AgregarEmpanadas.equalsIgnoreCase("s"));

                                    System.out.println("deseas agregar una bebida a tu empanada? s/n");
                                    DeseasBebida = input.next();

                                    while (DeseasBebida.equalsIgnoreCase("s") && DeseasBebida.equalsIgnoreCase("n")) {
                                        System.out.println("debes elejir s/n para seguir con la accion");
                                        DeseasBebida = input.next();
                                    }


                                    if (DeseasBebida.equalsIgnoreCase("s")) {

                                        for (int menuDeBebidas = 0; menuDeBebidas != 5; ) {


                                            //menu de bebidas
                                            System.out.println("===BEBIDAS===");
                                            System.out.println("1. AGUA=10$");
                                            System.out.println("2. REFRESCO=20$");
                                            System.out.println("3. JUGO DE MANGO=25$");
                                            System.out.println("4. JUGO DE PIÑA=25$");
                                            System.out.println("5 salir");
                                            menuDeBebidas = input.nextInt();
                                            switch (menuDeBebidas) {

                                                case 1:
                                                    sumaAguaDia2 = precioAgua * contadorAguaGananciaDia2;
                                                    contadorAguaGananciaDia2++;
                                                    contadorAguaDia2++;

                                                case 2:
                                                    sumaRefrescoDia2 = precioRefresco * contadorRefrescoGanaciasDia2;
                                                    contadorRefrescoGanaciasDia2++;
                                                    contadorRefrescoDia2++;

                                                case 3:
                                                    sumaJugoMangoDia2 = precioJugoMango * contadorJugoMangoGananciasDia2;
                                                    contadorJugoMangoGananciasDia2++;
                                                    contadorJugoMangoDia2++;

                                                case 4:
                                                    sumaJugoPiñaDia2 = precioJugoPiña * contadorJugoPiñaGananciasDia2;
                                                    contadorJugoPiñaGananciasDia2++;
                                                    contadorJugoMangoDia2++;


                                            }


                                            if (menuDeBebidas < 1 || menuDeBebidas >= 6) {
                                                System.out.println("ERROR");
                                                break;
                                            }

                                            System.out.println("deseas agregar otra bebida? s/n");
                                            AgregarBebidas = input.next();

                                            while (!AgregarBebidas.equalsIgnoreCase("s") && !AgregarBebidas.equalsIgnoreCase("n")) {
                                                System.out.println("debes elegir una opcion");
                                                AgregarBebidas = input.next();
                                            }

                                            if (AgregarBebidas.equalsIgnoreCase("n")) {
                                                break;
                                            }


                                        }


                                    }


                                }
                                //empanada de jamon y queso dia 2
                                if (Empanadas == 3) {

                                    do {
                                        //venta de empanada de jamon y queso dia 2
                                        System.out.println("cuantas empanadas de jamon y queso se venderan?");
                                        ventasJamonQuesoDia2 = input.nextInt();


                                        System.out.println("quiere agregar mas empanadas de jamon y queso? s/n");
                                        AgregarEmpanadas = input.next();

                                        while (!AgregarEmpanadas.equalsIgnoreCase("s") && !AgregarEmpanadas.equalsIgnoreCase("n")) {
                                            System.out.println("debes decir s/n para seguir");
                                            AgregarEmpanadas = input.next();
                                        }
                                        sumaJamonQuesoDia2 = empanadaJamonQueso * ventasJamonQuesoDia2;
                                        GanaciasEmpanadaJamonQuesoDia2 += sumaJamonQuesoDia2;
                                        contadorJamonQuesoDia2 += ventasJamonQuesoDia2;


                                    } while (AgregarEmpanadas.equalsIgnoreCase("s"));

                                    System.out.println("deseas agregar una bebida a tu empanada? s/n");
                                    DeseasBebida = input.next();

                                    while (DeseasBebida.equalsIgnoreCase("s") && DeseasBebida.equalsIgnoreCase("n")) {
                                        System.out.println("debes elejir s/n para seguir con la accion");
                                        DeseasBebida = input.next();
                                    }


                                    if (DeseasBebida.equalsIgnoreCase("s")) {

                                        for (int menuDeBebidas = 0; menuDeBebidas != 5; ) {


                                            //menu de bebidas
                                            System.out.println("===BEBIDAS===");
                                            System.out.println("1. AGUA=10$");
                                            System.out.println("2. REFRESCO=20$");
                                            System.out.println("3. JUGO DE MANGO=25$");
                                            System.out.println("4. JUGO DE PIÑA=25$");
                                            System.out.println("5 salir");
                                            menuDeBebidas = input.nextInt();


                                            switch (menuDeBebidas) {

                                                case 1:
                                                    sumaAguaDia2 = precioAgua * contadorAguaGananciaDia2;
                                                    contadorAguaGananciaDia2++;
                                                    contadorAguaDia2++;

                                                case 2:
                                                    sumaRefrescoDia2 = precioRefresco * contadorRefrescoGanaciasDia2;
                                                    contadorRefrescoGanaciasDia2++;
                                                    contadorRefrescoDia2++;

                                                case 3:
                                                    sumaJugoMangoDia2 = precioJugoMango * contadorJugoMangoGananciasDia2;
                                                    contadorJugoMangoGananciasDia2++;
                                                    contadorJugoMangoDia2++;

                                                case 4:
                                                    sumaJugoPiñaDia2 = precioJugoPiña * contadorJugoPiñaGananciasDia2;
                                                    contadorJugoPiñaGananciasDia2++;
                                                    contadorJugoPiñaDia2++;


                                            }
                                            if (menuDeBebidas < 1 || menuDeBebidas >= 6) {
                                                System.out.println("ERROR");
                                                break;
                                            }

                                            System.out.println("deseas agregar otra bebida? s/n");
                                            AgregarBebidas = input.next();

                                            while (!AgregarBebidas.equalsIgnoreCase("s") && !AgregarBebidas.equalsIgnoreCase("n")) {
                                                System.out.println("debes elegir una opcion");
                                                AgregarBebidas = input.next();
                                            }

                                            if (AgregarBebidas.equalsIgnoreCase("n")) {
                                                break;
                                            }


                                        }


                                    }


                                }


                            }
                            if (dia == 3) {

                                if (Empanadas == 1) {

                                    do {
                                        //venta de empanada de queso dia 3
                                        System.out.println("cuantas empanadas de queso se venderan?");
                                        ventasQuesoDia3 = input.nextInt();


                                        System.out.println("quiere agregar mas empanadas de queso? s/n");
                                        AgregarEmpanadas = input.next();

                                        while (!AgregarEmpanadas.equalsIgnoreCase("s") && !AgregarEmpanadas.equalsIgnoreCase("n")) {
                                            System.out.println("debes decir s/n para seguir");
                                            AgregarEmpanadas = input.next();
                                        }
                                        sumaQuesoDia3 = empanadaQueso * ventasQuesoDia3;
                                        GanaciasEmpanadaQuesoDia3 += sumaQuesoDia3;
                                        contadorQuesoDia3 += ventasQuesoDia3;


                                    } while (AgregarEmpanadas.equalsIgnoreCase("s"));

                                    System.out.println("deseas agregar una bebida a tu empanada? s/n");
                                    DeseasBebida = input.next();

                                    while (DeseasBebida.equalsIgnoreCase("s") && DeseasBebida.equalsIgnoreCase("n")) {
                                        System.out.println("debes elejir s/n para seguir con la accion");
                                        DeseasBebida = input.next();
                                    }


                                    if (DeseasBebida.equalsIgnoreCase("s")) {

                                        for (int menuDeBebidas = 0; menuDeBebidas != 5; ) {


                                            //menu de bebidas
                                            System.out.println("===BEBIDAS===");
                                            System.out.println("1. AGUA=10$");
                                            System.out.println("2. REFRESCO=20$");
                                            System.out.println("3. JUGO DE MANGO=25$");
                                            System.out.println("4. JUGO DE PIÑA=25$");
                                            System.out.println("5 salir");
                                            menuDeBebidas = input.nextInt();


                                            switch (menuDeBebidas) {

                                                case 1:
                                                    sumaAguaDia3 = precioAgua * contadorAguaGananciaDia3;
                                                    contadorAguaGananciaDia3++;
                                                    contadorAguaDia3++;

                                                case 2:
                                                    sumaRefrescoDia3 = precioRefresco * contadorRefrescoGanaciasDia3;
                                                    contadorRefrescoGanaciasDia3++;
                                                    contadorRefrescoDia3++;

                                                case 3:
                                                    sumaJugoMangoDia3 = precioJugoMango * contadorJugoMangoGananciasDia3;
                                                    contadorJugoMangoGananciasDia3++;
                                                    contadorJugoMangoDia3++;

                                                case 4:
                                                    sumaJugoPiñaDia3 = precioJugoPiña * contadorJugoPiñaGananciasDia3;
                                                    contadorJugoPiñaGananciasDia3++;
                                                    contadorJugoMangoDia3++;


                                            }


                                            if (menuDeBebidas < 1 || menuDeBebidas >= 6) {
                                                System.out.println("ERROR");
                                                break;
                                            }

                                            System.out.println("deseas agregar otra bebida? s/n");
                                            AgregarBebidas = input.next();

                                            while (!AgregarBebidas.equalsIgnoreCase("s") && !AgregarBebidas.equalsIgnoreCase("n")) {
                                                System.out.println("debes elegir una opcion");
                                                AgregarBebidas = input.next();
                                            }

                                            if (AgregarBebidas.equalsIgnoreCase("n")) {
                                                break;
                                            }


                                        }


                                    }
                                }
                                if (Empanadas == 2) {

                                    do {
                                        //venta de empanada de empanada de jamon dia 3
                                        System.out.println("cuantas empanadas de jamon se venderan?");
                                        ventasJamonDia3 = input.nextInt();

                                        sumaJamonDia3 = empanadaJamon * ventasJamonDia3;
                                        GanaciasEmpanadaJamonDia3 += sumaJamonDia3;
                                        contadorJamonDia3 += ventasJamonDia3;


                                        System.out.println("quiere agregar mas empanadas de jamon? s/n");
                                        AgregarEmpanadas = input.next();

                                        while (!AgregarEmpanadas.equalsIgnoreCase("s") && !AgregarEmpanadas.equalsIgnoreCase("n")) {
                                            System.out.println("debes decir s/n para seguir");
                                            AgregarEmpanadas = input.next();
                                        }


                                    } while (AgregarEmpanadas.equalsIgnoreCase("s"));

                                    System.out.println("deseas agregar una bebida a tu empanada? s/n");
                                    DeseasBebida = input.next();

                                    while (DeseasBebida.equalsIgnoreCase("s") && DeseasBebida.equalsIgnoreCase("n")) {
                                        System.out.println("debes elejir s/n para seguir con la accion");
                                        DeseasBebida = input.next();
                                    }


                                    if (DeseasBebida.equalsIgnoreCase("s")) {

                                        for (int menuDeBebidas = 0; menuDeBebidas != 5; ) {


                                            //menu de bebidas
                                            System.out.println("===BEBIDAS===");
                                            System.out.println("1. AGUA=10$");
                                            System.out.println("2. REFRESCO=20$");
                                            System.out.println("3. JUGO DE MANGO=25$");
                                            System.out.println("4. JUGO DE PIÑA=25$");
                                            System.out.println("5 salir");
                                            menuDeBebidas = input.nextInt();
                                            switch (menuDeBebidas) {

                                                case 1:
                                                    sumaAguaDia3 = precioAgua * contadorAguaGananciaDia3;
                                                    contadorAguaGananciaDia3++;
                                                    contadorAguaDia3++;

                                                case 2:
                                                    sumaRefrescoDia3 = precioRefresco * contadorRefrescoGanaciasDia3;
                                                    contadorRefrescoGanaciasDia3++;
                                                    contadorRefrescoDia3++;

                                                case 3:
                                                    sumaJugoMangoDia3 = precioJugoMango * contadorJugoMangoGananciasDia3;
                                                    contadorJugoMangoGananciasDia3++;
                                                    contadorJugoMangoDia3++;

                                                case 4:
                                                    sumaJugoPiñaDia3 = precioJugoPiña * contadorJugoPiñaGananciasDia3;
                                                    contadorJugoPiñaGananciasDia3++;
                                                    contadorJugoMangoDia3++;


                                            }


                                            if (menuDeBebidas < 1 || menuDeBebidas >= 6) {
                                                System.out.println("ERROR");
                                                break;
                                            }

                                            System.out.println("deseas agregar otra bebida? s/n");
                                            AgregarBebidas = input.next();

                                            while (!AgregarBebidas.equalsIgnoreCase("s") && !AgregarBebidas.equalsIgnoreCase("n")) {
                                                System.out.println("debes elegir una opcion");
                                                AgregarBebidas = input.next();
                                            }

                                            if (AgregarBebidas.equalsIgnoreCase("n")) {
                                                break;
                                            }


                                        }


                                    }


                                }
                                //empanada de jamon y queso dia 3
                                if (Empanadas == 3) {

                                    do {
                                        //venta de empanada de jamon y queso dia 3
                                        System.out.println("cuantas empanadas de jamon y queso se venderan?");
                                        ventasJamonQuesoDia3 = input.nextInt();


                                        System.out.println("quiere agregar mas empanadas de jamon y queso? s/n");
                                        AgregarEmpanadas = input.next();

                                        while (!AgregarEmpanadas.equalsIgnoreCase("s") && !AgregarEmpanadas.equalsIgnoreCase("n")) {
                                            System.out.println("debes decir s/n para seguir");
                                            AgregarEmpanadas = input.next();
                                        }
                                        sumaJamonQuesoDia3 = empanadaJamonQueso * ventasJamonQuesoDia3;
                                        GanaciasEmpanadaJamonQuesoDia3 += sumaJamonQuesoDia3;
                                        contadorJamonQuesoDia3 += ventasJamonQuesoDia3;


                                    } while (AgregarEmpanadas.equalsIgnoreCase("s"));

                                    System.out.println("deseas agregar una bebida a tu empanada? s/n");
                                    DeseasBebida = input.next();

                                    while (DeseasBebida.equalsIgnoreCase("s") && DeseasBebida.equalsIgnoreCase("n")) {
                                        System.out.println("debes elejir s/n para seguir con la accion");
                                        DeseasBebida = input.next();
                                    }


                                    if (DeseasBebida.equalsIgnoreCase("s")) {

                                        for (int menuDeBebidas = 0; menuDeBebidas != 5; ) {


                                            //menu de bebidas
                                            System.out.println("===BEBIDAS===");
                                            System.out.println("1. AGUA=10$");
                                            System.out.println("2. REFRESCO=20$");
                                            System.out.println("3. JUGO DE MANGO=25$");
                                            System.out.println("4. JUGO DE PIÑA=25$");
                                            System.out.println("5 salir");
                                            menuDeBebidas = input.nextInt();


                                            switch (menuDeBebidas) {

                                                case 1:
                                                    sumaAguaDia3 = precioAgua * contadorAguaGananciaDia3;
                                                    contadorAguaGananciaDia3++;
                                                    contadorAguaDia3++;

                                                case 2:
                                                    sumaRefrescoDia3 = precioRefresco * contadorRefrescoGanaciasDia3;
                                                    contadorRefrescoGanaciasDia3++;
                                                    contadorRefrescoDia3++;

                                                case 3:
                                                    sumaJugoMangoDia3 = precioJugoMango * contadorJugoMangoGananciasDia3;
                                                    contadorJugoMangoGananciasDia3++;
                                                    contadorJugoMangoDia3++;

                                                case 4:
                                                    sumaJugoPiñaDia3 = precioJugoPiña * contadorJugoPiñaGananciasDia3;
                                                    contadorJugoPiñaGananciasDia3++;
                                                    contadorJugoPiñaDia3++;


                                            }
                                            if (menuDeBebidas < 1 || menuDeBebidas >= 6) {
                                                System.out.println("ERROR");
                                                break;
                                            }

                                            System.out.println("deseas agregar otra bebida? s/n");
                                            AgregarBebidas = input.next();

                                            while (!AgregarBebidas.equalsIgnoreCase("s") && !AgregarBebidas.equalsIgnoreCase("n")) {
                                                System.out.println("debes elegir una opcion");
                                                AgregarBebidas = input.next();
                                            }

                                            if (AgregarBebidas.equalsIgnoreCase("n")) {
                                                break;
                                            }


                                        }


                                    }


                                }


                            }
                            if (dia==4){

                                if (Empanadas == 1) {

                                    do {
                                        //venta de empanada de queso dia 4
                                        System.out.println("cuantas empanadas de queso se venderan?");
                                        ventasQuesoDia4 = input.nextInt();


                                        System.out.println("quiere agregar mas empanadas de queso? s/n");
                                        AgregarEmpanadas = input.next();

                                        while (!AgregarEmpanadas.equalsIgnoreCase("s") && !AgregarEmpanadas.equalsIgnoreCase("n")) {
                                            System.out.println("debes decir s/n para seguir");
                                            AgregarEmpanadas = input.next();
                                        }
                                        sumaQuesoDia4 = empanadaQueso * ventasQuesoDia4;
                                        GanaciasEmpanadaQuesoDia4 += sumaQuesoDia4;
                                        contadorQuesoDia4 += ventasQuesoDia4;


                                    } while (AgregarEmpanadas.equalsIgnoreCase("s"));

                                    System.out.println("deseas agregar una bebida a tu empanada? s/n");
                                    DeseasBebida = input.next();

                                    while (DeseasBebida.equalsIgnoreCase("s") && DeseasBebida.equalsIgnoreCase("n")) {
                                        System.out.println("debes elejir s/n para seguir con la accion");
                                        DeseasBebida = input.next();
                                    }


                                    if (DeseasBebida.equalsIgnoreCase("s")) {

                                        for (int menuDeBebidas = 0; menuDeBebidas != 5; ) {


                                            //menu de bebidas
                                            System.out.println("===BEBIDAS===");
                                            System.out.println("1. AGUA=10$");
                                            System.out.println("2. REFRESCO=20$");
                                            System.out.println("3. JUGO DE MANGO=25$");
                                            System.out.println("4. JUGO DE PIÑA=25$");
                                            System.out.println("5 salir");
                                            menuDeBebidas = input.nextInt();


                                            switch (menuDeBebidas) {

                                                case 1:
                                                    sumaAguaDia4 = precioAgua * contadorAguaGananciaDia4;
                                                    contadorAguaGananciaDia4++;
                                                    contadorAguaDia4++;

                                                case 2:
                                                    sumaRefrescoDia4 = precioRefresco * contadorRefrescoGanaciasDia4;
                                                    contadorRefrescoGanaciasDia4++;
                                                    contadorRefrescoDia4++;

                                                case 3:
                                                    sumaJugoMangoDia4 = precioJugoMango * contadorJugoMangoGananciasDia4;
                                                    contadorJugoMangoGananciasDia4++;
                                                    contadorJugoMangoDia4++;

                                                case 4:
                                                    sumaJugoPiñaDia4 = precioJugoPiña * contadorJugoPiñaGananciasDia4;
                                                    contadorJugoPiñaGananciasDia4++;
                                                    contadorJugoMangoDia4++;


                                            }


                                            if (menuDeBebidas < 1 || menuDeBebidas >= 6) {
                                                System.out.println("ERROR");
                                                break;
                                            }

                                            System.out.println("deseas agregar otra bebida? s/n");
                                            AgregarBebidas = input.next();

                                            while (!AgregarBebidas.equalsIgnoreCase("s") && !AgregarBebidas.equalsIgnoreCase("n")) {
                                                System.out.println("debes elegir una opcion");
                                                AgregarBebidas = input.next();
                                            }

                                            if (AgregarBebidas.equalsIgnoreCase("n")) {
                                                break;
                                            }


                                        }


                                    }
                                }
                                if (Empanadas == 2) {

                                    do {
                                        //venta de empanada de empanada de jamon dia 4
                                        System.out.println("cuantas empanadas de jamon se venderan?");
                                        ventasJamonDia4 = input.nextInt();

                                        sumaJamonDia4 = empanadaJamon * ventasJamonDia4;
                                        GanaciasEmpanadaJamonDia4 += sumaJamonDia4;
                                        contadorJamonDia4 += ventasJamonDia4;


                                        System.out.println("quiere agregar mas empanadas de jamon? s/n");
                                        AgregarEmpanadas = input.next();

                                        while (!AgregarEmpanadas.equalsIgnoreCase("s") && !AgregarEmpanadas.equalsIgnoreCase("n")) {
                                            System.out.println("debes decir s/n para seguir");
                                            AgregarEmpanadas = input.next();
                                        }


                                    } while (AgregarEmpanadas.equalsIgnoreCase("s"));

                                    System.out.println("deseas agregar una bebida a tu empanada? s/n");
                                    DeseasBebida = input.next();

                                    while (DeseasBebida.equalsIgnoreCase("s") && DeseasBebida.equalsIgnoreCase("n")) {
                                        System.out.println("debes elejir s/n para seguir con la accion");
                                        DeseasBebida = input.next();
                                    }


                                    if (DeseasBebida.equalsIgnoreCase("s")) {

                                        for (int menuDeBebidas = 0; menuDeBebidas != 5; ) {


                                            //menu de bebidas
                                            System.out.println("===BEBIDAS===");
                                            System.out.println("1. AGUA=10$");
                                            System.out.println("2. REFRESCO=20$");
                                            System.out.println("3. JUGO DE MANGO=25$");
                                            System.out.println("4. JUGO DE PIÑA=25$");
                                            System.out.println("5 salir");
                                            menuDeBebidas = input.nextInt();
                                            switch (menuDeBebidas) {

                                                case 1:
                                                    sumaAguaDia4 = precioAgua * contadorAguaGananciaDia4;
                                                    contadorAguaGananciaDia4++;
                                                    contadorAguaDia4++;

                                                case 2:
                                                    sumaRefrescoDia4 = precioRefresco * contadorRefrescoGanaciasDia4;
                                                    contadorRefrescoGanaciasDia4++;
                                                    contadorRefrescoDia4++;

                                                case 3:
                                                    sumaJugoMangoDia4 = precioJugoMango * contadorJugoMangoGananciasDia4;
                                                    contadorJugoMangoGananciasDia4++;
                                                    contadorJugoMangoDia4++;

                                                case 4:
                                                    sumaJugoPiñaDia4 = precioJugoPiña * contadorJugoPiñaGananciasDia4;
                                                    contadorJugoPiñaGananciasDia4++;
                                                    contadorJugoMangoDia4++;


                                            }


                                            if (menuDeBebidas < 1 || menuDeBebidas >= 6) {
                                                System.out.println("ERROR");
                                                break;
                                            }

                                            System.out.println("deseas agregar otra bebida? s/n");
                                            AgregarBebidas = input.next();

                                            while (!AgregarBebidas.equalsIgnoreCase("s") && !AgregarBebidas.equalsIgnoreCase("n")) {
                                                System.out.println("debes elegir una opcion");
                                                AgregarBebidas = input.next();
                                            }

                                            if (AgregarBebidas.equalsIgnoreCase("n")) {
                                                break;
                                            }


                                        }


                                    }


                                }
                                //empanada de jamon y queso dia 4
                                if (Empanadas == 3) {

                                    do {
                                        //venta de empanada de jamon y queso dia 4
                                        System.out.println("cuantas empanadas de jamon y queso se venderan?");
                                        ventasJamonQuesoDia4 = input.nextInt();


                                        System.out.println("quiere agregar mas empanadas de jamon y queso? s/n");
                                        AgregarEmpanadas = input.next();

                                        while (!AgregarEmpanadas.equalsIgnoreCase("s") && !AgregarEmpanadas.equalsIgnoreCase("n")) {
                                            System.out.println("debes decir s/n para seguir");
                                            AgregarEmpanadas = input.next();
                                        }
                                        sumaJamonQuesoDia4 = empanadaJamonQueso * ventasJamonQuesoDia4;
                                        GanaciasEmpanadaJamonQuesoDia4+= sumaJamonQuesoDia4;
                                        contadorJamonQuesoDia4 += ventasJamonQuesoDia4;


                                    } while (AgregarEmpanadas.equalsIgnoreCase("s"));

                                    System.out.println("deseas agregar una bebida a tu empanada? s/n");
                                    DeseasBebida = input.next();

                                    while (DeseasBebida.equalsIgnoreCase("s") && DeseasBebida.equalsIgnoreCase("n")) {
                                        System.out.println("debes elejir s/n para seguir con la accion");
                                        DeseasBebida = input.next();
                                    }


                                    if (DeseasBebida.equalsIgnoreCase("s")) {

                                        for (int menuDeBebidas = 0; menuDeBebidas != 5; ) {


                                            //menu de bebidas
                                            System.out.println("===BEBIDAS===");
                                            System.out.println("1. AGUA=10$");
                                            System.out.println("2. REFRESCO=20$");
                                            System.out.println("3. JUGO DE MANGO=25$");
                                            System.out.println("4. JUGO DE PIÑA=25$");
                                            System.out.println("5 salir");
                                            menuDeBebidas = input.nextInt();


                                            switch (menuDeBebidas) {

                                                case 1:
                                                    sumaAguaDia4 = precioAgua * contadorAguaGananciaDia4;
                                                    contadorAguaGananciaDia4++;
                                                    contadorAguaDia4++;

                                                case 2:
                                                    sumaRefrescoDia4 = precioRefresco * contadorRefrescoGanaciasDia4;
                                                    contadorRefrescoGanaciasDia4++;
                                                    contadorRefrescoDia4++;

                                                case 3:
                                                    sumaJugoMangoDia4 = precioJugoMango * contadorJugoMangoGananciasDia4;
                                                    contadorJugoMangoGananciasDia4++;
                                                    contadorJugoMangoDia4++;

                                                case 4:
                                                    sumaJugoPiñaDia4 = precioJugoPiña * contadorJugoPiñaGananciasDia4;
                                                    contadorJugoPiñaGananciasDia4++;
                                                    contadorJugoPiñaDia4++;


                                            }
                                            if (menuDeBebidas < 1 || menuDeBebidas >= 6) {
                                                System.out.println("ERROR");
                                                break;
                                            }

                                            System.out.println("deseas agregar otra bebida? s/n");
                                            AgregarBebidas = input.next();

                                            while (!AgregarBebidas.equalsIgnoreCase("s") && !AgregarBebidas.equalsIgnoreCase("n")) {
                                                System.out.println("debes elegir una opcion");
                                                AgregarBebidas = input.next();
                                            }

                                            if (AgregarBebidas.equalsIgnoreCase("n")) {
                                                break;
                                            }


                                        }


                                    }


                                }


                            }
                            if (dia==5){
                                if (Empanadas == 1) {

                                    do {
                                        //venta de empanada de queso dia 5
                                        System.out.println("cuantas empanadas de queso se venderan?");
                                        ventasQuesoDia5 = input.nextInt();


                                        System.out.println("quiere agregar mas empanadas de queso? s/n");
                                        AgregarEmpanadas = input.next();

                                        while (!AgregarEmpanadas.equalsIgnoreCase("s") && !AgregarEmpanadas.equalsIgnoreCase("n")) {
                                            System.out.println("debes decir s/n para seguir");
                                            AgregarEmpanadas = input.next();
                                        }
                                        sumaQuesoDia5 = empanadaQueso * ventasQuesoDia5;
                                        GanaciasEmpanadaQuesoDia5 += sumaQuesoDia5;
                                        contadorQuesoDia5 += ventasQuesoDia5;


                                    } while (AgregarEmpanadas.equalsIgnoreCase("s"));

                                    System.out.println("deseas agregar una bebida a tu empanada? s/n");
                                    DeseasBebida = input.next();

                                    while (DeseasBebida.equalsIgnoreCase("s") && DeseasBebida.equalsIgnoreCase("n")) {
                                        System.out.println("debes elejir s/n para seguir con la accion");
                                        DeseasBebida = input.next();
                                    }


                                    if (DeseasBebida.equalsIgnoreCase("s")) {

                                        for (int menuDeBebidas = 0; menuDeBebidas != 5; ) {


                                            //menu de bebidas
                                            System.out.println("===BEBIDAS===");
                                            System.out.println("1. AGUA=10$");
                                            System.out.println("2. REFRESCO=20$");
                                            System.out.println("3. JUGO DE MANGO=25$");
                                            System.out.println("4. JUGO DE PIÑA=25$");
                                            System.out.println("5 salir");
                                            menuDeBebidas = input.nextInt();


                                            switch (menuDeBebidas) {

                                                case 1:
                                                    sumaAguaDia5= precioAgua * contadorAguaGananciaDia5;
                                                    contadorAguaGananciaDia5++;
                                                    contadorAguaDia5++;

                                                case 2:
                                                    sumaRefrescoDia5 = precioRefresco * contadorRefrescoGanaciasDia5;
                                                    contadorRefrescoGanaciasDia5++;
                                                    contadorRefrescoDia5++;

                                                case 3:
                                                    sumaJugoMangoDia5 = precioJugoMango * contadorJugoMangoGananciasDia5;
                                                    contadorJugoMangoGananciasDia5++;
                                                    contadorJugoMangoDia5++;

                                                case 4:
                                                    sumaJugoPiñaDia5 = precioJugoPiña * contadorJugoPiñaGananciasDia5;
                                                    contadorJugoPiñaGananciasDia5++;
                                                    contadorJugoMangoDia5++;


                                            }


                                            if (menuDeBebidas < 1 || menuDeBebidas >= 6) {
                                                System.out.println("ERROR");
                                                break;
                                            }

                                            System.out.println("deseas agregar otra bebida? s/n");
                                            AgregarBebidas = input.next();

                                            while (!AgregarBebidas.equalsIgnoreCase("s") && !AgregarBebidas.equalsIgnoreCase("n")) {
                                                System.out.println("debes elegir una opcion");
                                                AgregarBebidas = input.next();
                                            }

                                            if (AgregarBebidas.equalsIgnoreCase("n")) {
                                                break;
                                            }


                                        }


                                    }
                                }
                                if (Empanadas == 2) {

                                    do {
                                        //venta de empanada de empanada de jamon dia 4
                                        System.out.println("cuantas empanadas de jamon se venderan?");
                                        ventasJamonDia5 = input.nextInt();

                                        sumaJamonDia5 = empanadaJamon * ventasJamonDia5;
                                        GanaciasEmpanadaJamonDia5 += sumaJamonDia5;
                                        contadorJamonDia5 += ventasJamonDia5;


                                        System.out.println("quiere agregar mas empanadas de jamon? s/n");
                                        AgregarEmpanadas = input.next();

                                        while (!AgregarEmpanadas.equalsIgnoreCase("s") && !AgregarEmpanadas.equalsIgnoreCase("n")) {
                                            System.out.println("debes decir s/n para seguir");
                                            AgregarEmpanadas = input.next();
                                        }


                                    } while (AgregarEmpanadas.equalsIgnoreCase("s"));

                                    System.out.println("deseas agregar una bebida a tu empanada? s/n");
                                    DeseasBebida = input.next();

                                    while (DeseasBebida.equalsIgnoreCase("s") && DeseasBebida.equalsIgnoreCase("n")) {
                                        System.out.println("debes elejir s/n para seguir con la accion");
                                        DeseasBebida = input.next();
                                    }


                                    if (DeseasBebida.equalsIgnoreCase("s")) {

                                        for (int menuDeBebidas = 0; menuDeBebidas != 5; ) {


                                            //menu de bebidas
                                            System.out.println("===BEBIDAS===");
                                            System.out.println("1. AGUA=10$");
                                            System.out.println("2. REFRESCO=20$");
                                            System.out.println("3. JUGO DE MANGO=25$");
                                            System.out.println("4. JUGO DE PIÑA=25$");
                                            System.out.println("5 salir");
                                            menuDeBebidas = input.nextInt();
                                            switch (menuDeBebidas) {

                                                case 1:
                                                    sumaAguaDia5 = precioAgua * contadorAguaGananciaDia5;
                                                    contadorAguaGananciaDia5++;
                                                    contadorAguaDia5++;

                                                case 2:
                                                    sumaRefrescoDia5 = precioRefresco * contadorRefrescoGanaciasDia5;
                                                    contadorRefrescoGanaciasDia5++;
                                                    contadorRefrescoDia5++;

                                                case 3:
                                                    sumaJugoMangoDia5 = precioJugoMango * contadorJugoMangoGananciasDia5;
                                                    contadorJugoMangoGananciasDia5++;
                                                    contadorJugoMangoDia5++;

                                                case 4:
                                                    sumaJugoPiñaDia5 = precioJugoPiña * contadorJugoPiñaGananciasDia5;
                                                    contadorJugoPiñaGananciasDia5++;
                                                    contadorJugoMangoDia5++;


                                            }


                                            if (menuDeBebidas < 1 || menuDeBebidas >= 6) {
                                                System.out.println("ERROR");
                                                break;
                                            }

                                            System.out.println("deseas agregar otra bebida? s/n");
                                            AgregarBebidas = input.next();

                                            while (!AgregarBebidas.equalsIgnoreCase("s") && !AgregarBebidas.equalsIgnoreCase("n")) {
                                                System.out.println("debes elegir una opcion");
                                                AgregarBebidas = input.next();
                                            }

                                            if (AgregarBebidas.equalsIgnoreCase("n")) {
                                                break;
                                            }


                                        }


                                    }


                                }
                                //empanada de jamon y queso dia 5
                                if (Empanadas == 3) {

                                    do {
                                        //venta de empanada de jamon y queso dia 5
                                        System.out.println("cuantas empanadas de jamon y queso se venderan?");
                                        ventasJamonQuesoDia5 = input.nextInt();


                                        System.out.println("quiere agregar mas empanadas de jamon y queso? s/n");
                                        AgregarEmpanadas = input.next();

                                        while (!AgregarEmpanadas.equalsIgnoreCase("s") && !AgregarEmpanadas.equalsIgnoreCase("n")) {
                                            System.out.println("debes decir s/n para seguir");
                                            AgregarEmpanadas = input.next();
                                        }
                                        sumaJamonQuesoDia5 = empanadaJamonQueso * ventasJamonQuesoDia5;
                                        GanaciasEmpanadaJamonQuesoDia5+= sumaJamonQuesoDia5;
                                        contadorJamonQuesoDia4 += ventasJamonQuesoDia5;


                                    } while (AgregarEmpanadas.equalsIgnoreCase("s"));

                                    System.out.println("deseas agregar una bebida a tu empanada? s/n");
                                    DeseasBebida = input.next();

                                    while (DeseasBebida.equalsIgnoreCase("s") && DeseasBebida.equalsIgnoreCase("n")) {
                                        System.out.println("debes elejir s/n para seguir con la accion");
                                        DeseasBebida = input.next();
                                    }


                                    if (DeseasBebida.equalsIgnoreCase("s")) {

                                        for (int menuDeBebidas = 0; menuDeBebidas != 5; ) {


                                            //menu de bebidas
                                            System.out.println("===BEBIDAS===");
                                            System.out.println("1. AGUA=10$");
                                            System.out.println("2. REFRESCO=20$");
                                            System.out.println("3. JUGO DE MANGO=25$");
                                            System.out.println("4. JUGO DE PIÑA=25$");
                                            System.out.println("5 salir");
                                            menuDeBebidas = input.nextInt();


                                            switch (menuDeBebidas) {

                                                case 1:
                                                    sumaAguaDia5 = precioAgua * contadorAguaGananciaDia5;
                                                    contadorAguaGananciaDia5++;
                                                    contadorAguaDia5++;

                                                case 2:
                                                    sumaRefrescoDia5 = precioRefresco * contadorRefrescoGanaciasDia5;
                                                    contadorRefrescoGanaciasDia5++;
                                                    contadorRefrescoDia5++;

                                                case 3:
                                                    sumaJugoMangoDia5 = precioJugoMango * contadorJugoMangoGananciasDia5;
                                                    contadorJugoMangoGananciasDia5++;
                                                    contadorJugoMangoDia5++;

                                                case 4:
                                                    sumaJugoPiñaDia5 = precioJugoPiña * contadorJugoPiñaGananciasDia5;
                                                    contadorJugoPiñaGananciasDia5++;
                                                    contadorJugoPiñaDia5++;


                                            }
                                            if (menuDeBebidas < 1 || menuDeBebidas >= 6) {
                                                System.out.println("ERROR");
                                                break;
                                            }

                                            System.out.println("deseas agregar otra bebida? s/n");
                                            AgregarBebidas = input.next();

                                            while (!AgregarBebidas.equalsIgnoreCase("s") && !AgregarBebidas.equalsIgnoreCase("n")) {
                                                System.out.println("debes elegir una opcion");
                                                AgregarBebidas = input.next();
                                            }

                                            if (AgregarBebidas.equalsIgnoreCase("n")) {
                                                break;
                                            }


                                        }


                                    }


                                }


                            }


                        }

                        menu = 0;
                        break;

                    // ventas del dia
                    case 2:
                        if (dia == 1) {
                            System.out.println("===Ventas del dia de hoy lunes===");
                            System.out.println("que ventas quieres ver?");
                            System.out.println("1. EMPANADAS");
                            System.out.println("2. BEBIDAS");
                            ventasAver = input.nextInt();

                            if (ventasAver == 1) {
                                System.out.println("cual empanada deseas ver sus ventas?");
                                System.out.println("1. EMPANADA DE QUESO");
                                System.out.println("2. EMPANADA DE JAMON");
                                System.out.println("3. EMPANADA DE JAMON Y QUESO");
                                EmpanadasAver = input.nextInt();

                                //VER VENTAS DE EMPANADA DIA 1

                                switch (EmpanadasAver) {
                                    case 1:
                                        //empanada de queso
                                        System.out.println("===EMPANADA DE QUESO===");
                                        System.out.println("ventas en el dia de hoy=" + contadorQuesoDia1);
                                        System.out.println("ganancias=" + GanaciasEmpanadaQuesoDia1 + "\n");
                                        System.out.println("porfavor precione 'n' para salir");
                                        Salir = input.next();
                                        while (!Salir.equalsIgnoreCase("n")) {
                                            System.out.println("===EMPANADA DE QUESO===");
                                            System.out.println("ventas en el dia de hoy=" + contadorQuesoDia1);
                                            System.out.println("ganancias=" + GanaciasEmpanadaQuesoDia1 + "\n");
                                            System.out.println("porfavor precione 'n' para salir");
                                            Salir = input.next();

                                        }
                                        if (Salir.equalsIgnoreCase("n")) {
                                            break;
                                        }

                                    case 2:
                                        //empanada de jamon
                                        System.out.println("===EMPANADA DE JAMON===");
                                        System.out.println("ventas en el dia de hoy=" + contadorJamonDia1);
                                        System.out.println("ganancias=" + GanaciasEmpanadaJamonDia1 + "\n");
                                        System.out.println("porfavor precione 'n' para salir");
                                        Salir = input.next();
                                        while (!Salir.equalsIgnoreCase("n")) {
                                            System.out.println("===EMPANADA DE JAMON===");
                                            System.out.println("ventas en el dia de hoy=" + contadorJamonDia1);
                                            System.out.println("ganancias=" + GanaciasEmpanadaJamonDia1 + "\n");
                                            System.out.println("porfavor precione 'n' para salir");
                                            Salir = input.next();

                                        }
                                        if (Salir.equalsIgnoreCase("n")) {
                                            break;
                                        }
                                    case 3:
                                        //empanada de jamon y queso
                                        System.out.println("===EMPANADA DE JAMON Y QUESO===");
                                        System.out.println("ventas en el dia de hoy=" + contadorJamonQuesoDia1);
                                        System.out.println("ganancias=" + GanaciasEmpanadaJamonQuesoDia1 + "\n");
                                        System.out.println("porfavor precione 'n' para salir");
                                        Salir = input.next();
                                        while (!Salir.equalsIgnoreCase("n")) {
                                            System.out.println("===EMPANADA  JAMON Y QUESO===");
                                            System.out.println("ventas en el dia de hoy=" + contadorJamonQuesoDia1);
                                            System.out.println("ganancias=" + GanaciasEmpanadaJamonQuesoDia1 + "\n");
                                            System.out.println("porfavor precione 'n' para salir");
                                            Salir = input.next();

                                        }
                                        if (Salir.equalsIgnoreCase("n")) {
                                            break;
                                        }


                                }


                            }
                            //VER VENTAS DE BEBIDAS DIA 1

                            if (ventasAver == 2) {
                                System.out.println("===BEBIDAS===");
                                System.out.println("cual bebida deseas ver sus ventas");
                                System.out.println("1. AGUA");
                                System.out.println("2. REFRESCO");
                                System.out.println("3. JUGO DE MANGO");
                                System.out.println("4. JUGO DE PIÑA");
                                BebidasAver = input.nextInt();


                                switch (BebidasAver) {
                                    case 1:
                                        System.out.println("===BEBIDA AGUA===");
                                        System.out.println("ventas en el dia de hoy=" + contadorAguaDia1);
                                        System.out.println("ganancias=" + sumaAguaDia1);
                                        System.out.println("presione 'n' para salir");
                                        Salir = input.next();

                                        while (!Salir.equalsIgnoreCase("n")) {
                                            System.out.println("===BEBIDA AGUA===");
                                            System.out.println("ventas en el dia de hoy=" + contadorAguaDia1);
                                            System.out.println("ganancias=" + sumaAguaDia1);
                                            System.out.println("presione 'n' para salir");
                                            Salir = input.next();
                                        }

                                        if (Salir.equalsIgnoreCase("n")) {
                                            break;
                                        }

                                    case 2:
                                        System.out.println("===BEBIDA REFRESCO===");
                                        System.out.println("ventas en el dia de hoy=" + contadorRefrescoDia1);
                                        System.out.println("ganancias=" + sumaRefrescoDia1);
                                        System.out.println("presione 'n' para salir");
                                        Salir = input.next();

                                        while (!Salir.equalsIgnoreCase("n")) {
                                            System.out.println("===BEBIDA REFRESCO===");
                                            System.out.println("ventas en el dia de hoy=" + contadorRefrescoDia1);
                                            System.out.println("ganancias=" + sumaRefrescoDia1);
                                            System.out.println("presione 'n' para salir");
                                            Salir = input.next();
                                        }

                                        if (Salir.equalsIgnoreCase("n")) {
                                            break;
                                        }

                                    case 3:

                                        System.out.println("===BEBIDA JUGO MANGO===");
                                        System.out.println("ventas en el dia de hoy=" + contadorJugoMangoDia1);
                                        System.out.println("ganancias=" + sumaJugoMangoDia1);
                                        System.out.println("presione 'n' para salir");
                                        Salir = input.next();

                                        while (!Salir.equalsIgnoreCase("n")) {
                                            System.out.println("===BEBIDA REFRESCO===");
                                            System.out.println("ventas en el dia de hoy=" + contadorJugoMangoDia1);
                                            System.out.println("ganancias=" + sumaJugoMangoDia1);
                                            System.out.println("presione 'n' para salir");
                                            Salir = input.next();
                                        }

                                        if (Salir.equalsIgnoreCase("n")) {
                                            break;
                                        }
                                    case 4:

                                        System.out.println("===BEBIDA JUGO PIÑA===");
                                        System.out.println("ventas en el dia de hoy=" + contadorJugoPiñaGananciasDia1);
                                        System.out.println("ganancias=" + sumaJugoPiñaDia1);
                                        System.out.println("presione 'n' para salir");
                                        Salir = input.next();

                                        while (!Salir.equalsIgnoreCase("n")) {
                                            System.out.println("===BEBIDA JUGO PIÑA===");
                                            System.out.println("ventas en el dia de hoy=" + contadorJugoPiñaDia1);
                                            System.out.println("ganancias=" + sumaJugoPiñaDia1);
                                            System.out.println("presione 'n' para salir");
                                            Salir = input.next();
                                        }

                                        if (Salir.equalsIgnoreCase("n")) {
                                            break;
                                        }

                                }

                            }
                        }
                        if (dia == 2) {
                            System.out.println("===Ventas del dia de hoy lunes===");
                            System.out.println("que ventas quieres ver?");
                            System.out.println("1. EMPANADAS");
                            System.out.println("2. BEBIDAS");
                            ventasAver = input.nextInt();

                            if (ventasAver == 1) {
                                System.out.println("cual empanada deseas ver sus ventas?");
                                System.out.println("1. EMPANADA DE QUESO");
                                System.out.println("2. EMPANADA DE JAMON");
                                System.out.println("3. EMPANADA DE JAMON Y QUESO");
                                EmpanadasAver = input.nextInt();

                                //VER VENTAS DE EMPANADA DIA 2

                                switch (EmpanadasAver) {
                                    case 1:
                                        //empanada de queso
                                        System.out.println("===EMPANADA DE QUESO===");
                                        System.out.println("ventas en el dia de hoy=" + contadorQuesoDia2);
                                        System.out.println("ganancias=" + GanaciasEmpanadaQuesoDia2 + "\n");
                                        System.out.println("porfavor precione 'n' para salir");
                                        Salir = input.next();
                                        while (!Salir.equalsIgnoreCase("n")) {
                                            System.out.println("===EMPANADA DE QUESO===");
                                            System.out.println("ventas en el dia de hoy=" + contadorQuesoDia2);
                                            System.out.println("ganancias=" + GanaciasEmpanadaQuesoDia2 + "\n");
                                            System.out.println("porfavor precione 'n' para salir");
                                            Salir = input.next();

                                        }
                                        if (Salir.equalsIgnoreCase("n")) {
                                            break;
                                        }

                                    case 2:
                                        //empanada de jamon
                                        System.out.println("===EMPANADA DE JAMON===");
                                        System.out.println("ventas en el dia de hoy=" + contadorJamonDia2);
                                        System.out.println("ganancias=" + GanaciasEmpanadaJamonDia2 + "\n");
                                        System.out.println("porfavor precione 'n' para salir");
                                        Salir = input.next();
                                        while (!Salir.equalsIgnoreCase("n")) {
                                            System.out.println("===EMPANADA DE JAMON===");
                                            System.out.println("ventas en el dia de hoy=" + contadorJamonDia2);
                                            System.out.println("ganancias=" + GanaciasEmpanadaJamonDia2 + "\n");
                                            System.out.println("porfavor precione 'n' para salir");
                                            Salir = input.next();

                                        }
                                        if (Salir.equalsIgnoreCase("n")) {
                                            break;
                                        }
                                    case 3:
                                        //empanada de jamon y queso
                                        System.out.println("===EMPANADA DE JAMON Y QUESO===");
                                        System.out.println("ventas en el dia de hoy=" + contadorJamonQuesoDia2);
                                        System.out.println("ganancias=" + GanaciasEmpanadaJamonQuesoDia2 + "\n");
                                        System.out.println("porfavor precione 'n' para salir");
                                        Salir = input.next();
                                        while (!Salir.equalsIgnoreCase("n")) {
                                            System.out.println("===EMPANADA  JAMON Y QUESO===");
                                            System.out.println("ventas en el dia de hoy=" + contadorJamonQuesoDia2);
                                            System.out.println("ganancias=" + GanaciasEmpanadaJamonQuesoDia2 + "\n");
                                            System.out.println("porfavor precione 'n' para salir");
                                            Salir = input.next();

                                        }
                                        if (Salir.equalsIgnoreCase("n")) {
                                            break;
                                        }


                                }


                            }
                            //VER VENTAS DE BEBIDAS DIA 2

                            if (ventasAver == 2) {
                                System.out.println("===BEBIDAS===");
                                System.out.println("cual bebida deseas ver sus ventas");
                                System.out.println("1. AGUA");
                                System.out.println("2. REFRESCO");
                                System.out.println("3. JUGO DE MANGO");
                                System.out.println("4. JUGO DE PIÑA");
                                BebidasAver = input.nextInt();


                                switch (BebidasAver) {
                                    case 1:
                                        System.out.println("===BEBIDA AGUA===");
                                        System.out.println("ventas en el dia de hoy=" + contadorAguaDia2);
                                        System.out.println("ganancias=" + sumaAguaDia2);
                                        System.out.println("presione 'n' para salir");
                                        Salir = input.next();

                                        while (!Salir.equalsIgnoreCase("n")) {
                                            System.out.println("===BEBIDA AGUA===");
                                            System.out.println("ventas en el dia de hoy=" + contadorAguaDia2);
                                            System.out.println("ganancias=" + sumaAguaDia2);
                                            System.out.println("presione 'n' para salir");
                                            Salir = input.next();
                                        }

                                        if (Salir.equalsIgnoreCase("n")) {
                                            break;
                                        }

                                    case 2:
                                        System.out.println("===BEBIDA REFRESCO===");
                                        System.out.println("ventas en el dia de hoy=" + contadorRefrescoDia2);
                                        System.out.println("ganancias=" + sumaRefrescoDia2);
                                        System.out.println("presione 'n' para salir");
                                        Salir = input.next();

                                        while (!Salir.equalsIgnoreCase("n")) {
                                            System.out.println("===BEBIDA REFRESCO===");
                                            System.out.println("ventas en el dia de hoy=" + contadorRefrescoDia2);
                                            System.out.println("ganancias=" + sumaRefrescoDia2);
                                            System.out.println("presione 'n' para salir");
                                            Salir = input.next();
                                        }

                                        if (Salir.equalsIgnoreCase("n")) {
                                            break;
                                        }

                                    case 3:

                                        System.out.println("===BEBIDA JUGO MANGO===");
                                        System.out.println("ventas en el dia de hoy=" + contadorJugoMangoDia2);
                                        System.out.println("ganancias=" + sumaJugoMangoDia2);
                                        System.out.println("presione 'n' para salir");
                                        Salir = input.next();

                                        while (!Salir.equalsIgnoreCase("n")) {
                                            System.out.println("===BEBIDA REFRESCO===");
                                            System.out.println("ventas en el dia de hoy=" + contadorJugoMangoDia2);
                                            System.out.println("ganancias=" + sumaJugoMangoDia2);
                                            System.out.println("presione 'n' para salir");
                                            Salir = input.next();
                                        }

                                        if (Salir.equalsIgnoreCase("n")) {
                                            break;
                                        }
                                    case 4:

                                        System.out.println("===BEBIDA JUGO PIÑA===");
                                        System.out.println("ventas en el dia de hoy=" + contadorJugoPiñaGananciasDia2);
                                        System.out.println("ganancias=" + sumaJugoPiñaDia2);
                                        System.out.println("presione 'n' para salir");
                                        Salir = input.next();

                                        while (!Salir.equalsIgnoreCase("n")) {
                                            System.out.println("===BEBIDA JUGO PIÑA===");
                                            System.out.println("ventas en el dia de hoy=" + contadorJugoPiñaDia2);
                                            System.out.println("ganancias=" + sumaJugoPiñaDia2);
                                            System.out.println("presione 'n' para salir");
                                            Salir = input.next();
                                        }

                                        if (Salir.equalsIgnoreCase("n")) {
                                            break;
                                        }

                                }

                            }

                        }
                        if (dia==3){
                            System.out.println("===Ventas del dia de hoy lunes===");
                            System.out.println("que ventas quieres ver?");
                            System.out.println("1. EMPANADAS");
                            System.out.println("2. BEBIDAS");
                            ventasAver = input.nextInt();

                            if (ventasAver == 1) {
                                System.out.println("cual empanada deseas ver sus ventas?");
                                System.out.println("1. EMPANADA DE QUESO");
                                System.out.println("2. EMPANADA DE JAMON");
                                System.out.println("3. EMPANADA DE JAMON Y QUESO");
                                EmpanadasAver = input.nextInt();

                                //VER VENTAS DE EMPANADA DIA 3

                                switch (EmpanadasAver) {
                                    case 1:
                                        //empanada de queso
                                        System.out.println("===EMPANADA DE QUESO===");
                                        System.out.println("ventas en el dia de hoy=" + contadorQuesoDia3);
                                        System.out.println("ganancias=" + GanaciasEmpanadaQuesoDia3 + "\n");
                                        System.out.println("porfavor precione 'n' para salir");
                                        Salir = input.next();
                                        while (!Salir.equalsIgnoreCase("n")) {
                                            System.out.println("===EMPANADA DE QUESO===");
                                            System.out.println("ventas en el dia de hoy=" + contadorQuesoDia3);
                                            System.out.println("ganancias=" + GanaciasEmpanadaQuesoDia3 + "\n");
                                            System.out.println("porfavor precione 'n' para salir");
                                            Salir = input.next();

                                        }
                                        if (Salir.equalsIgnoreCase("n")) {
                                            break;
                                        }

                                    case 2:
                                        //empanada de jamon
                                        System.out.println("===EMPANADA DE JAMON===");
                                        System.out.println("ventas en el dia de hoy=" + contadorJamonDia3);
                                        System.out.println("ganancias=" + GanaciasEmpanadaJamonDia3 + "\n");
                                        System.out.println("porfavor precione 'n' para salir");
                                        Salir = input.next();
                                        while (!Salir.equalsIgnoreCase("n")) {
                                            System.out.println("===EMPANADA DE JAMON===");
                                            System.out.println("ventas en el dia de hoy=" + contadorJamonDia3);
                                            System.out.println("ganancias=" + GanaciasEmpanadaJamonDia3 + "\n");
                                            System.out.println("porfavor precione 'n' para salir");
                                            Salir = input.next();

                                        }
                                        if (Salir.equalsIgnoreCase("n")) {
                                            break;
                                        }
                                    case 3:
                                        //empanada de jamon y queso
                                        System.out.println("===EMPANADA DE JAMON Y QUESO===");
                                        System.out.println("ventas en el dia de hoy=" + contadorJamonQuesoDia3);
                                        System.out.println("ganancias=" + GanaciasEmpanadaJamonQuesoDia3 + "\n");
                                        System.out.println("porfavor precione 'n' para salir");
                                        Salir = input.next();
                                        while (!Salir.equalsIgnoreCase("n")) {
                                            System.out.println("===EMPANADA  JAMON Y QUESO===");
                                            System.out.println("ventas en el dia de hoy=" + contadorJamonQuesoDia3);
                                            System.out.println("ganancias=" + GanaciasEmpanadaJamonQuesoDia3 + "\n");
                                            System.out.println("porfavor precione 'n' para salir");
                                            Salir = input.next();

                                        }
                                        if (Salir.equalsIgnoreCase("n")) {
                                            break;
                                        }


                                }


                            }
                            //VER VENTAS DE BEBIDAS DIA 3

                            if (ventasAver == 2) {
                                System.out.println("===BEBIDAS===");
                                System.out.println("cual bebida deseas ver sus ventas");
                                System.out.println("1. AGUA");
                                System.out.println("2. REFRESCO");
                                System.out.println("3. JUGO DE MANGO");
                                System.out.println("4. JUGO DE PIÑA");
                                BebidasAver = input.nextInt();


                                switch (BebidasAver) {
                                    case 1:
                                        System.out.println("===BEBIDA AGUA===");
                                        System.out.println("ventas en el dia de hoy=" + contadorAguaDia3);
                                        System.out.println("ganancias=" + sumaAguaDia3);
                                        System.out.println("presione 'n' para salir");
                                        Salir = input.next();

                                        while (!Salir.equalsIgnoreCase("n")) {
                                            System.out.println("===BEBIDA AGUA===");
                                            System.out.println("ventas en el dia de hoy=" + contadorAguaDia3);
                                            System.out.println("ganancias=" + sumaAguaDia3);
                                            System.out.println("presione 'n' para salir");
                                            Salir = input.next();
                                        }

                                        if (Salir.equalsIgnoreCase("n")) {
                                            break;
                                        }

                                    case 2:
                                        System.out.println("===BEBIDA REFRESCO===");
                                        System.out.println("ventas en el dia de hoy=" + contadorRefrescoDia3);
                                        System.out.println("ganancias=" + sumaRefrescoDia3);
                                        System.out.println("presione 'n' para salir");
                                        Salir = input.next();

                                        while (!Salir.equalsIgnoreCase("n")) {
                                            System.out.println("===BEBIDA REFRESCO===");
                                            System.out.println("ventas en el dia de hoy=" + contadorRefrescoDia3);
                                            System.out.println("ganancias=" + sumaRefrescoDia3);
                                            System.out.println("presione 'n' para salir");
                                            Salir = input.next();
                                        }

                                        if (Salir.equalsIgnoreCase("n")) {
                                            break;
                                        }

                                    case 3:

                                        System.out.println("===BEBIDA JUGO MANGO===");
                                        System.out.println("ventas en el dia de hoy=" + contadorJugoMangoDia3);
                                        System.out.println("ganancias=" + sumaJugoMangoDia3);
                                        System.out.println("presione 'n' para salir");
                                        Salir = input.next();

                                        while (!Salir.equalsIgnoreCase("n")) {
                                            System.out.println("===BEBIDA REFRESCO===");
                                            System.out.println("ventas en el dia de hoy=" + contadorJugoMangoDia3);
                                            System.out.println("ganancias=" + sumaJugoMangoDia3);
                                            System.out.println("presione 'n' para salir");
                                            Salir = input.next();
                                        }

                                        if (Salir.equalsIgnoreCase("n")) {
                                            break;
                                        }
                                    case 4:

                                        System.out.println("===BEBIDA JUGO PIÑA===");
                                        System.out.println("ventas en el dia de hoy=" + contadorJugoPiñaGananciasDia3);
                                        System.out.println("ganancias=" + sumaJugoPiñaDia3);
                                        System.out.println("presione 'n' para salir");
                                        Salir = input.next();

                                        while (!Salir.equalsIgnoreCase("n")) {
                                            System.out.println("===BEBIDA JUGO PIÑA===");
                                            System.out.println("ventas en el dia de hoy=" + contadorJugoPiñaDia3);
                                            System.out.println("ganancias=" + sumaJugoPiñaDia3);
                                            System.out.println("presione 'n' para salir");
                                            Salir = input.next();
                                        }

                                        if (Salir.equalsIgnoreCase("n")) {
                                            break;
                                        }

                                }

                            }

                        }
                        if (dia==4){
                            System.out.println("===Ventas del dia de hoy lunes===");
                            System.out.println("que ventas quieres ver?");
                            System.out.println("1. EMPANADAS");
                            System.out.println("2. BEBIDAS");
                            ventasAver = input.nextInt();

                            if (ventasAver == 1) {
                                System.out.println("cual empanada deseas ver sus ventas?");
                                System.out.println("1. EMPANADA DE QUESO");
                                System.out.println("2. EMPANADA DE JAMON");
                                System.out.println("3. EMPANADA DE JAMON Y QUESO");
                                EmpanadasAver = input.nextInt();

                                //VER VENTAS DE EMPANADA DIA 4

                                switch (EmpanadasAver) {
                                    case 1:
                                        //empanada de queso
                                        System.out.println("===EMPANADA DE QUESO===");
                                        System.out.println("ventas en el dia de hoy=" + contadorQuesoDia4);
                                        System.out.println("ganancias=" + GanaciasEmpanadaQuesoDia4 + "\n");
                                        System.out.println("porfavor precione 'n' para salir");
                                        Salir = input.next();
                                        while (!Salir.equalsIgnoreCase("n")) {
                                            System.out.println("===EMPANADA DE QUESO===");
                                            System.out.println("ventas en el dia de hoy=" + contadorQuesoDia4);
                                            System.out.println("ganancias=" + GanaciasEmpanadaQuesoDia4 + "\n");
                                            System.out.println("porfavor precione 'n' para salir");
                                            Salir = input.next();

                                        }
                                        if (Salir.equalsIgnoreCase("n")) {
                                            break;
                                        }

                                    case 2:
                                        //empanada de jamon
                                        System.out.println("===EMPANADA DE JAMON===");
                                        System.out.println("ventas en el dia de hoy=" + contadorJamonDia4);
                                        System.out.println("ganancias=" + GanaciasEmpanadaJamonDia4 + "\n");
                                        System.out.println("porfavor precione 'n' para salir");
                                        Salir = input.next();
                                        while (!Salir.equalsIgnoreCase("n")) {
                                            System.out.println("===EMPANADA DE JAMON===");
                                            System.out.println("ventas en el dia de hoy=" + contadorJamonDia4);
                                            System.out.println("ganancias=" + GanaciasEmpanadaJamonDia4 + "\n");
                                            System.out.println("porfavor precione 'n' para salir");
                                            Salir = input.next();

                                        }
                                        if (Salir.equalsIgnoreCase("n")) {
                                            break;
                                        }
                                    case 3:
                                        //empanada de jamon y queso
                                        System.out.println("===EMPANADA DE JAMON Y QUESO===");
                                        System.out.println("ventas en el dia de hoy=" + contadorJamonQuesoDia4);
                                        System.out.println("ganancias=" + GanaciasEmpanadaJamonQuesoDia4 + "\n");
                                        System.out.println("porfavor precione 'n' para salir");
                                        Salir = input.next();
                                        while (!Salir.equalsIgnoreCase("n")) {
                                            System.out.println("===EMPANADA  JAMON Y QUESO===");
                                            System.out.println("ventas en el dia de hoy=" + contadorJamonQuesoDia4);
                                            System.out.println("ganancias=" + GanaciasEmpanadaJamonQuesoDia4 + "\n");
                                            System.out.println("porfavor precione 'n' para salir");
                                            Salir = input.next();

                                        }
                                        if (Salir.equalsIgnoreCase("n")) {
                                            break;
                                        }


                                }


                            }
                            //VER VENTAS DE BEBIDAS DIA 4

                            if (ventasAver == 2) {
                                System.out.println("===BEBIDAS===");
                                System.out.println("cual bebida deseas ver sus ventas");
                                System.out.println("1. AGUA");
                                System.out.println("2. REFRESCO");
                                System.out.println("3. JUGO DE MANGO");
                                System.out.println("4. JUGO DE PIÑA");
                                BebidasAver = input.nextInt();


                                switch (BebidasAver) {
                                    case 1:
                                        System.out.println("===BEBIDA AGUA===");
                                        System.out.println("ventas en el dia de hoy=" + contadorAguaDia4);
                                        System.out.println("ganancias=" + sumaAguaDia4);
                                        System.out.println("presione 'n' para salir");
                                        Salir = input.next();

                                        while (!Salir.equalsIgnoreCase("n")) {
                                            System.out.println("===BEBIDA AGUA===");
                                            System.out.println("ventas en el dia de hoy=" + contadorAguaDia4);
                                            System.out.println("ganancias=" + sumaAguaDia4);
                                            System.out.println("presione 'n' para salir");
                                            Salir = input.next();
                                        }

                                        if (Salir.equalsIgnoreCase("n")) {
                                            break;
                                        }

                                    case 2:
                                        System.out.println("===BEBIDA REFRESCO===");
                                        System.out.println("ventas en el dia de hoy=" + contadorRefrescoDia4);
                                        System.out.println("ganancias=" + sumaRefrescoDia4);
                                        System.out.println("presione 'n' para salir");
                                        Salir = input.next();

                                        while (!Salir.equalsIgnoreCase("n")) {
                                            System.out.println("===BEBIDA REFRESCO===");
                                            System.out.println("ventas en el dia de hoy=" + contadorRefrescoDia4);
                                            System.out.println("ganancias=" + sumaRefrescoDia4);
                                            System.out.println("presione 'n' para salir");
                                            Salir = input.next();
                                        }

                                        if (Salir.equalsIgnoreCase("n")) {
                                            break;
                                        }

                                    case 3:

                                        System.out.println("===BEBIDA JUGO MANGO===");
                                        System.out.println("ventas en el dia de hoy=" + contadorJugoMangoDia4);
                                        System.out.println("ganancias=" + sumaJugoMangoDia4);
                                        System.out.println("presione 'n' para salir");
                                        Salir = input.next();

                                        while (!Salir.equalsIgnoreCase("n")) {
                                            System.out.println("===BEBIDA REFRESCO===");
                                            System.out.println("ventas en el dia de hoy=" + contadorJugoMangoDia4);
                                            System.out.println("ganancias=" + sumaJugoMangoDia4);
                                            System.out.println("presione 'n' para salir");
                                            Salir = input.next();
                                        }

                                        if (Salir.equalsIgnoreCase("n")) {
                                            break;
                                        }
                                    case 4:

                                        System.out.println("===BEBIDA JUGO PIÑA===");
                                        System.out.println("ventas en el dia de hoy=" + contadorJugoPiñaGananciasDia4);
                                        System.out.println("ganancias=" + sumaJugoPiñaDia4);
                                        System.out.println("presione 'n' para salir");
                                        Salir = input.next();

                                        while (!Salir.equalsIgnoreCase("n")) {
                                            System.out.println("===BEBIDA JUGO PIÑA===");
                                            System.out.println("ventas en el dia de hoy=" + contadorJugoPiñaDia4);
                                            System.out.println("ganancias=" + sumaJugoPiñaDia4);
                                            System.out.println("presione 'n' para salir");
                                            Salir = input.next();
                                        }

                                        if (Salir.equalsIgnoreCase("n")) {
                                            break;
                                        }

                                }

                            }

                        }

                        if (dia==5){

                            System.out.println("===Ventas del dia de hoy lunes===");
                            System.out.println("que ventas quieres ver?");
                            System.out.println("1. EMPANADAS");
                            System.out.println("2. BEBIDAS");
                            ventasAver = input.nextInt();

                            if (ventasAver == 1) {
                                System.out.println("cual empanada deseas ver sus ventas?");
                                System.out.println("1. EMPANADA DE QUESO");
                                System.out.println("2. EMPANADA DE JAMON");
                                System.out.println("3. EMPANADA DE JAMON Y QUESO");
                                EmpanadasAver = input.nextInt();

                                //VER VENTAS DE EMPANADA DIA 5

                                switch (EmpanadasAver) {
                                    case 1:
                                        //empanada de queso
                                        System.out.println("===EMPANADA DE QUESO===");
                                        System.out.println("ventas en el dia de hoy=" + contadorQuesoDia5);
                                        System.out.println("ganancias=" + GanaciasEmpanadaQuesoDia5 + "\n");
                                        System.out.println("porfavor precione 'n' para salir");
                                        Salir = input.next();
                                        while (!Salir.equalsIgnoreCase("n")) {
                                            System.out.println("===EMPANADA DE QUESO===");
                                            System.out.println("ventas en el dia de hoy=" + contadorQuesoDia5);
                                            System.out.println("ganancias=" + GanaciasEmpanadaQuesoDia5 + "\n");
                                            System.out.println("porfavor precione 'n' para salir");
                                            Salir = input.next();

                                        }
                                        if (Salir.equalsIgnoreCase("n")) {
                                            break;
                                        }

                                    case 2:
                                        //empanada de jamon
                                        System.out.println("===EMPANADA DE JAMON===");
                                        System.out.println("ventas en el dia de hoy=" + contadorJamonDia5);
                                        System.out.println("ganancias=" + GanaciasEmpanadaJamonDia5 + "\n");
                                        System.out.println("porfavor precione 'n' para salir");
                                        Salir = input.next();
                                        while (!Salir.equalsIgnoreCase("n")) {
                                            System.out.println("===EMPANADA DE JAMON===");
                                            System.out.println("ventas en el dia de hoy=" + contadorJamonDia5);
                                            System.out.println("ganancias=" + GanaciasEmpanadaJamonDia5 + "\n");
                                            System.out.println("porfavor precione 'n' para salir");
                                            Salir = input.next();

                                        }
                                        if (Salir.equalsIgnoreCase("n")) {
                                            break;
                                        }
                                    case 3:
                                        //empanada de jamon y queso
                                        System.out.println("===EMPANADA DE JAMON Y QUESO===");
                                        System.out.println("ventas en el dia de hoy=" + contadorJamonQuesoDia5);
                                        System.out.println("ganancias=" + GanaciasEmpanadaJamonQuesoDia5 + "\n");
                                        System.out.println("porfavor precione 'n' para salir");
                                        Salir = input.next();
                                        while (!Salir.equalsIgnoreCase("n")) {
                                            System.out.println("===EMPANADA  JAMON Y QUESO===");
                                            System.out.println("ventas en el dia de hoy=" + contadorJamonQuesoDia5);
                                            System.out.println("ganancias=" + GanaciasEmpanadaJamonQuesoDia5 + "\n");
                                            System.out.println("porfavor precione 'n' para salir");
                                            Salir = input.next();

                                        }
                                        if (Salir.equalsIgnoreCase("n")) {
                                            break;
                                        }


                                }


                            }
                            //VER VENTAS DE BEBIDAS DIA 5

                            if (ventasAver == 2) {
                                System.out.println("===BEBIDAS===");
                                System.out.println("cual bebida deseas ver sus ventas");
                                System.out.println("1. AGUA");
                                System.out.println("2. REFRESCO");
                                System.out.println("3. JUGO DE MANGO");
                                System.out.println("4. JUGO DE PIÑA");
                                BebidasAver = input.nextInt();


                                switch (BebidasAver) {
                                    case 1:
                                        System.out.println("===BEBIDA AGUA===");
                                        System.out.println("ventas en el dia de hoy=" + contadorAguaDia5);
                                        System.out.println("ganancias=" + sumaAguaDia5);
                                        System.out.println("presione 'n' para salir");
                                        Salir = input.next();

                                        while (!Salir.equalsIgnoreCase("n")) {
                                            System.out.println("===BEBIDA AGUA===");
                                            System.out.println("ventas en el dia de hoy=" + contadorAguaDia5);
                                            System.out.println("ganancias=" + sumaAguaDia5);
                                            System.out.println("presione 'n' para salir");
                                            Salir = input.next();
                                        }

                                        if (Salir.equalsIgnoreCase("n")) {
                                            break;
                                        }

                                    case 2:
                                        System.out.println("===BEBIDA REFRESCO===");
                                        System.out.println("ventas en el dia de hoy=" + contadorRefrescoDia5);
                                        System.out.println("ganancias=" + sumaRefrescoDia5);
                                        System.out.println("presione 'n' para salir");
                                        Salir = input.next();

                                        while (!Salir.equalsIgnoreCase("n")) {
                                            System.out.println("===BEBIDA REFRESCO===");
                                            System.out.println("ventas en el dia de hoy=" + contadorRefrescoDia5);
                                            System.out.println("ganancias=" + sumaRefrescoDia5);
                                            System.out.println("presione 'n' para salir");
                                            Salir = input.next();
                                        }

                                        if (Salir.equalsIgnoreCase("n")) {
                                            break;
                                        }

                                    case 3:

                                        System.out.println("===BEBIDA JUGO MANGO===");
                                        System.out.println("ventas en el dia de hoy=" + contadorJugoMangoDia5);
                                        System.out.println("ganancias=" + sumaJugoMangoDia5);
                                        System.out.println("presione 'n' para salir");
                                        Salir = input.next();

                                        while (!Salir.equalsIgnoreCase("n")) {
                                            System.out.println("===BEBIDA REFRESCO===");
                                            System.out.println("ventas en el dia de hoy=" + contadorJugoMangoDia5);
                                            System.out.println("ganancias=" + sumaJugoMangoDia5);
                                            System.out.println("presione 'n' para salir");
                                            Salir = input.next();
                                        }

                                        if (Salir.equalsIgnoreCase("n")) {
                                            break;
                                        }
                                    case 4:

                                        System.out.println("===BEBIDA JUGO PIÑA===");
                                        System.out.println("ventas en el dia de hoy=" + contadorJugoPiñaGananciasDia5);
                                        System.out.println("ganancias=" + sumaJugoPiñaDia5);
                                        System.out.println("presione 'n' para salir");
                                        Salir = input.next();

                                        while (!Salir.equalsIgnoreCase("n")) {
                                            System.out.println("===BEBIDA JUGO PIÑA===");
                                            System.out.println("ventas en el dia de hoy=" + contadorJugoPiñaDia5);
                                            System.out.println("ganancias=" + sumaJugoPiñaDia5);
                                            System.out.println("presione 'n' para salir");
                                            Salir = input.next();
                                        }

                                        if (Salir.equalsIgnoreCase("n")) {
                                            break;
                                        }

                                }

                            }


                        }

                }


            }
            dia++;
        }
        System.out.println("===RESUMEN DE VENTAS DE LOS 7 DIAS==="+"\n");
        System.out.println("///EMPANADAS///");
        System.out.println("DIA LUNES"+"\n");
        System.out.println("EMPANADA DE QUESO");
        System.out.println("ventas= "+contadorQuesoDia1+" empandas vendidas");
        System.out.println("ganancias= " +GanaciasEmpanadaJamonDia1);
        System.out.println("EMPANADA DE JAMON");
        System.out.println("ventas= "+contadorJamonDia1+" empanada vendidas");
        System.out.println("ganancias="+GanaciasEmpanadaJamonDia1);
        System.out.println("EMPANADA DE JAMON Y QUESO");
        System.out.println("ventas= "+contadorJamonQuesoDia1+" empanadas vendida");
        System.out.println("Ganancias= "+GanaciasEmpanadaJamonQuesoDia1+"\n");
        System.out.println("///BEBIDAS///");
        System.out.println("AGUA");
        System.out.println("ventas="+contadorAguaDia1+" aguas vendidas");
        System.out.println("ganancias= "+sumaAguaDia1);
        System.out.println("REFRESCO");
        System.out.println("ventas= "+contadorRefrescoDia1+" refrescos vendidos");
        System.out.println("ganancias= "+sumaRefrescoDia1);
        System.out.println("JUGO DE MANGO");
        System.out.println("ventas= "+contadorJugoMangoDia1+" jugos de mango vendidos");
        System.out.println("ganancias="+sumaJugoMangoDia1);
        System.out.println("JUGO DE PIÑA");
        System.out.println("ventas= "+contadorJugoPiñaDia1+" Jugos de piña vendidos");
        System.out.println("ganancias= "+sumaJugoPiñaDia1+"\n"+"\n");

        System.out.println("///EMPANADAS///");
        System.out.println("DIA MARTES"+"\n");
        System.out.println("EMPANADA DE QUESO");
        System.out.println("ventas= "+contadorQuesoDia2+" empandas vendidas");
        System.out.println("ganancias= " +GanaciasEmpanadaJamonDia2);
        System.out.println("EMPANADA DE JAMON");
        System.out.println("ventas= "+contadorJamonDia2+" empanada vendidas");
        System.out.println("ganancias="+GanaciasEmpanadaJamonDia2);
        System.out.println("EMPANADA DE JAMON Y QUESO");
        System.out.println("ventas= "+contadorJamonQuesoDia2+" empanadas vendida");
        System.out.println("Ganancias= "+GanaciasEmpanadaJamonQuesoDia2+"\n");
        System.out.println("///BEBIDAS///");
        System.out.println("AGUA");
        System.out.println("ventas="+contadorAguaDia2+" aguas vendidas");
        System.out.println("ganancias= "+sumaAguaDia2);
        System.out.println("REFRESCO");
        System.out.println("ventas= "+contadorRefrescoDia2+" refrescos vendidos");
        System.out.println("ganancias= "+sumaRefrescoDia2);
        System.out.println("JUGO DE MANGO");
        System.out.println("ventas= "+contadorJugoMangoDia2+" jugos de mango vendidos");
        System.out.println("ganancias="+sumaJugoMangoDia2);
        System.out.println("JUGO DE PIÑA");
        System.out.println("ventas= "+contadorJugoPiñaDia2+" Jugos de piña vendidos");
        System.out.println("ganancias= "+sumaJugoPiñaDia2+"\n"+"\n");

        System.out.println("///EMPANADAS///");
        System.out.println("DIA MIERCOLES"+"\n");
        System.out.println("EMPANADA DE QUESO");
        System.out.println("ventas= "+contadorQuesoDia3+" empandas vendidas");
        System.out.println("ganancias= " +GanaciasEmpanadaJamonDia3);
        System.out.println("EMPANADA DE JAMON");
        System.out.println("ventas= "+contadorJamonDia3+" empanada vendidas");
        System.out.println("ganancias="+GanaciasEmpanadaJamonDia3);
        System.out.println("EMPANADA DE JAMON Y QUESO");
        System.out.println("ventas= "+contadorJamonQuesoDia3+" empanadas vendida");
        System.out.println("Ganancias= "+GanaciasEmpanadaJamonQuesoDia3+"\n");
        System.out.println("///BEBIDAS///");
        System.out.println("AGUA");
        System.out.println("ventas="+contadorAguaDia3+" aguas vendidas");
        System.out.println("ganancias= "+sumaAguaDia3);
        System.out.println("REFRESCO");
        System.out.println("ventas= "+contadorRefrescoDia3+" refrescos vendidos");
        System.out.println("ganancias= "+sumaRefrescoDia3);
        System.out.println("JUGO DE MANGO");
        System.out.println("ventas= "+contadorJugoMangoDia3+" jugos de mango vendidos");
        System.out.println("ganancias="+sumaJugoMangoDia3);
        System.out.println("JUGO DE PIÑA");
        System.out.println("ventas= "+contadorJugoPiñaDia3+" Jugos de piña vendidos");
        System.out.println("ganancias= "+sumaJugoPiñaDia3+"\n"+"\n");

        System.out.println("///EMPANADAS///");
        System.out.println("DIA JUEVES"+"\n");
        System.out.println("EMPANADA DE QUESO");
        System.out.println("ventas= "+contadorQuesoDia4+" empandas vendidas");
        System.out.println("ganancias= " +GanaciasEmpanadaJamonDia4);
        System.out.println("EMPANADA DE JAMON");
        System.out.println("ventas= "+contadorJamonDia4+" empanada vendidas");
        System.out.println("ganancias="+GanaciasEmpanadaJamonDia4);
        System.out.println("EMPANADA DE JAMON Y QUESO");
        System.out.println("ventas= "+contadorJamonQuesoDia4+" empanadas vendida");
        System.out.println("Ganancias= "+GanaciasEmpanadaJamonQuesoDia4+"\n");
        System.out.println("///BEBIDAS///");
        System.out.println("AGUA");
        System.out.println("ventas="+contadorAguaDia4+" aguas vendidas");
        System.out.println("ganancias= "+sumaAguaDia4);
        System.out.println("REFRESCO");
        System.out.println("ventas= "+contadorRefrescoDia4+" refrescos vendidos");
        System.out.println("ganancias= "+sumaRefrescoDia4);
        System.out.println("JUGO DE MANGO");
        System.out.println("ventas= "+contadorJugoMangoDia4+" jugos de mango vendidos");
        System.out.println("ganancias="+sumaJugoMangoDia4);
        System.out.println("JUGO DE PIÑA");
        System.out.println("ventas= "+contadorJugoPiñaDia4+" Jugos de piña vendidos");
        System.out.println("ganancias= "+sumaJugoPiñaDia4+"\n"+"\n");


        System.out.println("///EMPANADAS///");
        System.out.println("DIA VIERNES"+"\n");
        System.out.println("EMPANADA DE QUESO");
        System.out.println("ventas= "+contadorQuesoDia5+" empandas vendidas");
        System.out.println("ganancias= " +GanaciasEmpanadaJamonDia5);
        System.out.println("EMPANADA DE JAMON");
        System.out.println("ventas= "+contadorJamonDia5+" empanada vendidas");
        System.out.println("ganancias="+GanaciasEmpanadaJamonDia5);
        System.out.println("EMPANADA DE JAMON Y QUESO");
        System.out.println("ventas= "+contadorJamonQuesoDia5+" empanadas vendida");
        System.out.println("Ganancias= "+GanaciasEmpanadaJamonQuesoDia5+"\n");
        System.out.println("///BEBIDAS///");
        System.out.println("AGUA");
        System.out.println("ventas="+contadorAguaDia5+" aguas vendidas");
        System.out.println("ganancias= "+sumaAguaDia5);
        System.out.println("REFRESCO");
        System.out.println("ventas= "+contadorRefrescoDia5+" refrescos vendidos");
        System.out.println("ganancias= "+sumaRefrescoDia5);
        System.out.println("JUGO DE MANGO");
        System.out.println("ventas= "+contadorJugoMangoDia5+" jugos de mango vendidos");
        System.out.println("ganancias="+sumaJugoMangoDia5);
        System.out.println("JUGO DE PIÑA");
        System.out.println("ventas= "+contadorJugoPiñaDia5+" Jugos de piña vendidos");
        System.out.println("ganancias= "+sumaJugoPiñaDia5+"\n"+"\n");
        //TOTALES EMPANADAS
        empanadasTotalesQueso+=contadorQuesoDia1+contadorQuesoDia2+contadorQuesoDia3+contadorQuesoDia4+contadorQuesoDia5;
        empanadasTotalesJamon+=contadorJamonDia1+contadorJamonDia2+contadorJamonDia3+contadorJamonDia4+contadorJamonDia5;
        empanadasTotalesJamonQueso+=contadorJamonQuesoDia1+contadorJamonQuesoDia2+contadorJamonQuesoDia3+contadorJamonQuesoDia4+contadorJamonQuesoDia5;
        TotalGeneralEmpanadas+=empanadasTotalesQueso+empanadasTotalesJamonQueso+empanadasTotalesJamon;
        GananciasEmpanadasTotales+=GanaciasEmpanadaQuesoDia1+GanaciasEmpanadaQuesoDia2+GanaciasEmpanadaQuesoDia3+GanaciasEmpanadaQuesoDia4+GanaciasEmpanadaQuesoDia5+GanaciasEmpanadaJamonDia1+GanaciasEmpanadaJamonDia2+GanaciasEmpanadaJamonDia3+GanaciasEmpanadaJamonDia4+GanaciasEmpanadaJamonDia5+GanaciasEmpanadaJamonQuesoDia1+GanaciasEmpanadaJamonQuesoDia2+GanaciasEmpanadaJamonQuesoDia3+GanaciasEmpanadaJamonQuesoDia4+GanaciasEmpanadaJamonQuesoDia5;

        //TOTALES BEBIDAS
        aguaTotales+=contadorAguaDia1+contadorAguaDia2+contadorAguaDia3+contadorAguaDia4+contadorAguaDia5;
        refrescoTotales+=contadorRefrescoDia1+contadorRefrescoDia2+sumaRefrescoDia3+sumaRefrescoDia4+sumaRefrescoDia5;
        jugoMangoTotales+=contadorJugoMangoDia1+contadorAguaDia2+contadorAguaDia3+contadorAguaDia4+contadorAguaDia5;
        jugoPiñaTotales+=contadorJugoPiñaDia1+contadorJugoPiñaDia2+contadorJugoPiñaDia3+contadorJugoPiñaGananciasDia4+contadorJugoPiñaGananciasDia5;
        GananciasBebidaTotales+=sumaAguaDia1+sumaAguaDia2+sumaAguaDia3+sumaAguaDia4+sumaAguaDia5+sumaRefrescoDia1+sumaRefrescoDia2+sumaRefrescoDia3+sumaRefrescoDia4+sumaRefrescoDia5+sumaJugoMangoDia1+sumaJugoMangoDia2+sumaJugoMangoDia3+sumaJugoMangoDia4+sumaJugoMangoDia5+sumaJugoPiñaDia1+sumaJugoPiñaDia2+sumaJugoPiñaDia3+sumaJugoPiñaDia4+sumaJugoPiñaDia5;


        System.out.println("REPORTE TOTAL");
        System.out.println("///EMPANADAS///");
        System.out.println("total de empanadas compradas de queso"+empanadasTotalesQueso);
        System.out.println("total de empanadas compradas de jamon"+empanadasTotalesJamon);
        System.out.println("total de empanadas compradas de jamon y queso"+empanadasTotalesJamonQueso);
        System.out.println("total de empanadas compradas por todas "+TotalGeneralEmpanadas+"\n");
        System.out.println("GANANCIAS TOTALES="+GananciasEmpanadasTotales);
        System.out.println("///BEBIDAS///");
        System.out.println("total de agua comprada"+aguaTotales);
        System.out.println("total de agua comprada"+refrescoTotales);
        System.out.println("total de agua comprada"+jugoMangoTotales);
        System.out.println("total de agua comprada"+jugoPiñaTotales);;
        System.out.println("GANANCIAS TOTALES="+GananciasBebidaTotales);





    }
}
