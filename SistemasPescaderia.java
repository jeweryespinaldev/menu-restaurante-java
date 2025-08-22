import java.util.Scanner;

public class SistemasPescaderia {

    public static void main(String[] args) {
        String mensaje = "";
        int hora;
        int cliente;
        int dia;
        double kg;
        boolean cupon;
        boolean envios;
        boolean hielo;
        boolean servicioExtraLimpieza;
        double tilapia = 280;
        double salmon = 750;
        double camaron = 620;
        double pulpo = 540;
        double bacalao = 390;
        int producto;
        //descuentos generales
        double descuentoFrescotilapia, descuentoCuponTilapia, descuentoVolumen15kgtilapia, descuentoVolumen8kgtilapia;
        double descuentoFrescoSalmon, descuentoCuponSalmon, descuentoVolumen15kgsalmon, descuentoVolumen8kgsalmon;
        double descuentoFrescoCamaron, descuentoCuponCamaron, descuentoVolumen15Camaron, descuentoVolumen8kgCamaron;
        double descuentoFrescoPulpo, descuentoCuponPulpo, descuentoVolumen15kgPulpo, descuentoVolumen8kgPulpo;
        double descuentoFrescoBacalao, descuentoCuponBacalao, descuentoVolumen15kgBacalao, descuentoVolumen8kgBacalao;

        //descuentos totales de cada producto
        double descTotalTilapia = 0;
        double descTotalSalmon = 0;
        double desctotalCamaron = 0;
        double desctotalPulpo = 0;
        double descTotalBacalao = 0;
        //los subtotales de cada producto
        double subtotalTilapia, subtotalSalmon, subtotalCamaron, subtotalPulpo, subtotalBacalao;
        double serviciosTotalTilapia = 0;
        double serviciosTotalSalmon = 0;
        double serviciosTotalCamaron = 0;
        double serviciosTotalPulpo = 0;
        double serviciosTotalBacalao = 0;
        //los servicios extras
        double limpiezaTilapia, limpiezaBacalao;
        double servicioHieloTilapia, servicioDomicilioTilapia, recargoFinSemanaTilapia;
        double servicioHieloSalmon, servicioDomicilioSalmon, recargoFinSemanaSalmon;
        double servicioHieloCamaron, servicioDomicilioCamaron, recargoFinSemanaCamaron;
        double servicioHieloPulpo, servicioDomicilioPulpo, recargoFinSemanaPulpo;
        double servicioHieloBacalao, servicioDomicilioBacalao, recargoFinSemanaBacalao;
        //los recargos de fin de semana
        double recargoTotalTilapia = 0;
        double recargoTotalSalmon = 0;
        double recargoTotalCamaron = 0;
        double recargoTotalPulpo = 0;
        double recargoTotalBacalao = 0;
        // el total a pagar de cada producto
        double totalPagarTilapia;
        double totalPagarSalmon;
        double totalPagarCamaron;
        double totalPagarPulpo;
        double totalPagarBacalao;
        //los itbis de los prouctos camaron y pulpo
        double itbisCamaron, itbisPulpo;
        //los descuentos especiales
        double socioBasicoTilapia, socioBasicoSalmon, socioBasicoCamaron, socioBasicoPulpo, socioBasicoBacalao;
        double socioPremiumTilapia, socioPremiumSalmon, socioPremiumCamaron, socioPremiumPulpo, socioPremiumBacalao;

        //entrada de datos

        Scanner sc = new Scanner(System.in);
        System.out.println("que hora es?");
        hora = sc.nextInt();
        System.out.println("que tipo de cliente eres? " + "\n" +
                "1 normal " + "\n" +
                "2 basico " + "\n" +
                "3 premium " + "\n");
        cliente = sc.nextInt();
        System.out.println("que dia es hoy?" + "\n" +
                "1 lunes " + "\n" +
                "2 martes " + "\n" +
                "3 miercoles " + "\n" +
                "4 jueves " + "\n" +
                "5 viernes " + "\n" +
                "6 sabado" + "\n" +
                "7 domingo ");
        dia = sc.nextInt();
        System.out.println("que producto querras? " + "\n" +
                "1 tilapia=280" + "\n" +
                "2 salmon=750 " + "\n" +
                "3 camaron=620" + "\n" +
                "4 pulpo = 540 " + "\n" +
                "5 bacalao= 390" + "\n");
        producto = sc.nextInt();
        System.out.println("cuantos kilogramos quieres?");
        kg = sc.nextDouble();
        System.out.println(" tienes cupon?");
        cupon = sc.nextBoolean();
        System.out.println("quieres envio?");
        envios = sc.nextBoolean();
        System.out.println("quieres hielo?");
        hielo = sc.nextBoolean();
        System.out.println("quieres que te limpiemos el pescado (solo para tilapia y bacalao)?");
        servicioExtraLimpieza = sc.nextBoolean();

        //calculos

        //tilapia
        subtotalTilapia = kg * tilapia;
        descuentoFrescotilapia = subtotalTilapia * 0.12;
        descuentoCuponTilapia = subtotalTilapia * 0.06;
        descuentoVolumen8kgtilapia = subtotalTilapia * 0.07;
        descuentoVolumen15kgtilapia = subtotalTilapia * 0.12;
        limpiezaTilapia = subtotalTilapia * 0.03;
        servicioHieloTilapia = subtotalTilapia * 0.07;
        servicioDomicilioTilapia = subtotalTilapia * 0.07;
        recargoFinSemanaTilapia = subtotalTilapia * 0.05;

        //salmon
        subtotalSalmon = kg * salmon;
        descuentoFrescoSalmon = subtotalSalmon * 0.12;
        descuentoCuponSalmon = subtotalSalmon * 0.06;
        descuentoVolumen8kgsalmon = subtotalSalmon * 0.07;
        descuentoVolumen15kgsalmon = subtotalSalmon * 0.12;
        servicioHieloSalmon = subtotalSalmon * 0.07;
        servicioDomicilioSalmon = subtotalSalmon * 0.07;
        recargoFinSemanaSalmon = subtotalSalmon * 0.05;

        //camaron
        subtotalCamaron = kg * camaron;
        descuentoFrescoCamaron = subtotalCamaron * 0.12;
        descuentoCuponCamaron = subtotalCamaron * 0.06;
        descuentoVolumen8kgCamaron = subtotalCamaron * 0.07;
        descuentoVolumen15Camaron = subtotalCamaron * 0.12;
        servicioHieloCamaron = subtotalCamaron * 0.07;
        servicioDomicilioCamaron = subtotalCamaron * 0.07;
        recargoFinSemanaCamaron = subtotalCamaron * 0.05;
        itbisCamaron = subtotalCamaron * 0.18;

        //pulpo
        subtotalPulpo = kg * pulpo;
        descuentoFrescoPulpo = subtotalPulpo * 0.12;
        descuentoCuponPulpo = subtotalPulpo * 0.06;
        descuentoVolumen8kgPulpo = subtotalPulpo * 0.07;
        descuentoVolumen15kgPulpo = subtotalPulpo * 0.12;
        servicioHieloPulpo = subtotalPulpo * 0.07;
        servicioDomicilioPulpo = subtotalPulpo * 0.07;
        recargoFinSemanaPulpo = subtotalPulpo * 0.05;
        itbisPulpo = subtotalPulpo * 0.18;

        //bacalao
        subtotalBacalao = kg * bacalao;
        descuentoFrescoBacalao = subtotalBacalao * 0.12;
        descuentoCuponBacalao = subtotalBacalao * 0.06;
        descuentoVolumen8kgBacalao = subtotalBacalao * 0.07;
        descuentoVolumen15kgBacalao = subtotalBacalao * 0.12;
        descuentoVolumen8kgBacalao = subtotalBacalao * 0.07;
        limpiezaBacalao = subtotalBacalao * 0.03;
        servicioHieloBacalao = subtotalBacalao * 0.07;
        servicioDomicilioBacalao = subtotalBacalao * 0.07;
        recargoFinSemanaBacalao = subtotalBacalao * 0.05;

        //socio basico
        socioBasicoTilapia = subtotalTilapia * 0.10;
        socioBasicoSalmon = subtotalSalmon * 0.10;
        socioBasicoCamaron = subtotalCamaron * 0.10;
        socioBasicoPulpo = subtotalPulpo * 0.10;
        socioBasicoBacalao = subtotalBacalao * 0.10;

        //socio premium
        socioPremiumTilapia = subtotalTilapia * 0.18;
        socioPremiumSalmon = subtotalSalmon * 0.18;
        socioPremiumCamaron = subtotalCamaron * 0.18;
        socioPremiumPulpo = subtotalPulpo * 0.18;
        socioPremiumBacalao = subtotalBacalao * 0.18;

        //amalisis de datos


        if (hora < 8 || hora > 20) {
            System.out.println("cerrado");

        } else if (kg <= 0) {
            System.out.println("kilogramos invalidos");


        } else if (cliente == 1 && producto == 1) {
            if (dia >= 1 && dia <= 7) {
                descTotalTilapia += descuentoFrescotilapia;
                mensaje += "descuento aplicado por fresco 12%" + "\n";


            }
            if (cupon && dia <= 5) {
                descTotalTilapia += descuentoCuponTilapia;
                mensaje += "descuento aplicado por cupon 6%" + "\n";


            }
            if (kg >= 8 && kg < 15) {
                descTotalTilapia += descuentoVolumen8kgtilapia;
                mensaje += "descuento aplicado por volumen mas de 8 kg 7%" + "\n";

            }
            if (kg >= 15) {
                descTotalTilapia += descuentoVolumen15kgtilapia;
                mensaje += "descuento aplicado por volumen mas de 15 kg 12%" + "\n";

            }
            if (servicioExtraLimpieza) {
                serviciosTotalTilapia += limpiezaTilapia;
                mensaje += "limpieza extra mas 7%" + "\n";


            }
            if (hielo) {
                serviciosTotalTilapia += servicioHieloTilapia;
                mensaje += "hielo extra mas 3%" + "\n";


            }
            if (envios) {
                serviciosTotalTilapia += servicioDomicilioTilapia;
                mensaje += "domicilio extra mas 7%" + "\n";


            }
            if (dia >= 6 && dia < 7) {
                recargoTotalTilapia += recargoFinSemanaTilapia;
                mensaje += "recargo extra por fin de semana" + "\n";


            }
            if (mensaje.isEmpty())
                mensaje += "no hay descuentos ni servicios extra";
            totalPagarTilapia = subtotalTilapia - descTotalTilapia + serviciosTotalTilapia + recargoTotalTilapia;

            System.out.println(mensaje);
            System.out.printf("subtotal %.2f%n", subtotalTilapia);
            System.out.printf("descuentos %.2f%n", descTotalTilapia);
            System.out.printf("servicios extras %.2f%n ", serviciosTotalTilapia);
            System.out.printf("recargos extras %.2f%n ", recargoTotalTilapia);
            System.out.printf("total a pagar %.2f%n", totalPagarTilapia);


        } else if (cliente == 1 && producto == 2) {
            if (dia >= 1 && dia <= 7) {
                descTotalSalmon += descuentoFrescoSalmon;
                mensaje += "descuento aplicado por fresco 12%" + "\n";

            }
            if (cupon && dia <= 5) {
                descTotalSalmon += descuentoCuponSalmon;
                mensaje += "descuento aplicado por cupon 6%" + "\n";

            }
            if (kg >= 8 && kg < 15) {
                descTotalSalmon += descuentoVolumen8kgsalmon;
                mensaje += "descuento aplicado por volumen mas de 8 kg 7%" + "\n";

            }
            if (kg >= 15) {
                descTotalSalmon += descuentoVolumen15kgsalmon;
                mensaje += "descuento aplicado por vulomen mas de 15 kg 12%" + "\n";


            }
            if (hielo) {
                serviciosTotalSalmon += servicioHieloSalmon;
                mensaje += "hielo extra mas 7%" + "\n";

            }
            if (envios) {
                serviciosTotalSalmon += servicioDomicilioSalmon;
                mensaje += "domicilio extra mas 7%" + "\n";

            }
            if (dia >= 6 && dia < 7) {
                recargoTotalSalmon += recargoFinSemanaSalmon;
                mensaje += "recargo extra de 5% por semana" + "\n";

            }
            if (mensaje.isEmpty())
                mensaje += "sin descuentos aplicados,servicios extras ni recargos";
            totalPagarSalmon = subtotalSalmon - descTotalSalmon + serviciosTotalSalmon + recargoTotalSalmon;
            System.out.println(mensaje);
            System.out.printf("subtotal %.2f%n" + subtotalSalmon);
            System.out.printf("descuentos  %.2f%n" + descTotalSalmon);
            System.out.printf("servicios extras  %.2f%n" + serviciosTotalSalmon);
            System.out.println("recargo extras %.2f%n" + recargoTotalSalmon);
            System.out.printf("total a pagar  %.2f%n" + totalPagarSalmon);

        } else if (cliente == 1 && producto == 3) {
            if (dia >= 1 && dia <= 7) {
                desctotalCamaron = descuentoFrescoCamaron;
                mensaje += "descuento aplicado por fresco 12%" + "\n";


            }
            if (cupon && dia <= 5) {
                desctotalCamaron += descuentoCuponCamaron;
                mensaje += "descuento aplicado por cupon 6%" + "\n";

            }
            if (kg >= 8 && kg < 15) {
                desctotalCamaron += descuentoVolumen8kgCamaron;
                mensaje += "descuento volumen mas de 8kg 7%" + "\n";

            }
            if (kg >= 15) {
                desctotalCamaron += descuentoVolumen15Camaron;
                mensaje += "descuento volumen mas de 15kg 12%" + "\n";

            }
            if (hielo) {
                serviciosTotalCamaron += servicioHieloCamaron;
                mensaje += "hielo extra mas 7%" + "\n";

            }
            if (envios) {
                serviciosTotalCamaron += servicioDomicilioCamaron;
                mensaje += "domicilio extra mas 7%" + "\n";

            }
            if (dia >= 6 && dia < 7) {
                recargoTotalCamaron += recargoFinSemanaCamaron;
                mensaje += "recargo extra por fin de semana mas 5%" + "\n";
            }
            if (mensaje.isEmpty()) {
                mensaje += "sin descuentos ni servicios extras";
            }
            totalPagarCamaron = subtotalCamaron - desctotalCamaron + serviciosTotalCamaron + recargoTotalCamaron + itbisCamaron;
            System.out.println(mensaje);
            System.out.printf("subtotal %.2f%n", subtotalCamaron);
            System.out.printf("descuentos  %.2f%n", desctotalCamaron);
            System.out.printf("servicios extras  %.2f%n", serviciosTotalCamaron);
            System.out.printf("recargo extras %.2f%n", recargoTotalCamaron);
            System.out.printf("itbis por camaron %.2f%n", itbisCamaron);
            System.out.printf("total a pagar %.2f%n", totalPagarCamaron);

        } else if (cliente == 1 && producto == 4) {
            if (dia >= 1 && dia <= 7) {
                desctotalPulpo = descuentoFrescoPulpo;
                mensaje += "descuento aplicado por fresco 12%" + "\n";

            }
            if (cupon && dia <= 5) {
                desctotalPulpo += descuentoCuponPulpo;
                mensaje += "descuento aplica por cupon 6%" + "\n";

            }
            if (kg >= 8 && kg < 15) {
                desctotalPulpo += descuentoVolumen8kgPulpo;
                mensaje += "descuento aplicado por volumen mas de 8kg 7%" + "\n";

            }
            if (kg >= 15) {
                desctotalPulpo += descuentoVolumen15kgPulpo;
                mensaje += "descuento aplicado por volumen mas de 15kg 12%" + "\n";
            }
            if (hielo) {
                serviciosTotalPulpo += servicioHieloPulpo;
                mensaje += "hielo extra mas 7%" + "\n";

            }
            if (envios) {
                serviciosTotalPulpo += servicioDomicilioPulpo;
                mensaje += "domicilio extra mas 7%" + "\n";

            }
            if (dia >= 6 && dia <= 7) {
                recargoTotalPulpo += recargoFinSemanaPulpo;
                mensaje += "recargo por fin de semana mas 5%" + "\n";


            }
            if (mensaje.isEmpty()) {
                mensaje += "sin descuentos aplicados y tampocos servicios extras" + "\n";

            }
            totalPagarPulpo = subtotalPulpo - desctotalPulpo + serviciosTotalPulpo + recargoTotalPulpo + itbisPulpo;
            System.out.println(mensaje);
            System.out.printf("subtotal  %.2f%n", subtotalPulpo);
            System.out.printf("descuentos aplicados  %.2f%n ", desctotalPulpo);
            System.out.printf("servicios extras  %.2f%n ", serviciosTotalPulpo);
            System.out.printf("itbis  %.2f%n ", itbisPulpo);
            System.out.printf("total a pagar  %.2f%n ", totalPagarPulpo);

        } else if (cliente == 1 && producto == 5) {
            if (dia >= 1 && dia <= 7) {
                desctotalPulpo = descuentoFrescoPulpo;
                mensaje += "descuento por fresco 12%" + "\n";

            }
            if (cupon && dia <= 5) {
                descTotalBacalao = descuentoCuponBacalao;
                mensaje += "descuento por cupon y no ser fin de semana 6% " + "\n";

            }
            if (kg >= 8 && kg < 15) {
                descTotalBacalao += descuentoVolumen8kgBacalao;
                mensaje += "descuento por volumen de mas de 8kg 7%" + "\n";

            }
            if (kg >= 15) {
                descTotalBacalao += descuentoVolumen15kgBacalao;
                mensaje += "descuento por volumen de mas de 8kg 12 %" + "\n";

            }
            if (servicioExtraLimpieza) {
                serviciosTotalBacalao += limpiezaBacalao;
                mensaje += "limpieza extra 3%" + "\n";

            }
            if (hielo) {
                serviciosTotalBacalao += servicioHieloBacalao;
                mensaje += "hielo extra mas 7%" + "\n";

            }
            if (envios) {
                serviciosTotalBacalao += servicioDomicilioBacalao;
                mensaje += "envio a domicilio extra mas 7%" + "\n";

            }
            if (dia >= 6 && dia <= 7) {
                recargoTotalBacalao += recargoFinSemanaBacalao;
                mensaje = "recargo extra por ser fin de semana 5%+" + "\n";

            }
            if (mensaje.isEmpty()) {
                mensaje += "no se aplicaron descuentos,servicios extras ni recargos ";

            }
            totalPagarBacalao = subtotalBacalao - descTotalBacalao + serviciosTotalBacalao + recargoTotalBacalao;
            System.out.println(mensaje);
            System.out.printf("subtotal %.2f%n", subtotalBacalao);
            System.out.printf("descuentos aplicados %.2f%n ", descTotalBacalao);
            System.out.printf("servicios extras %.2f%n ", serviciosTotalBacalao);
            System.out.printf("recargos extras %.2f%n ", recargoTotalBacalao);
            System.out.printf("total a pagar %.2f%n ", totalPagarBacalao);

        } else if (cliente == 2 && producto == 1) {
            descTotalTilapia += socioBasicoTilapia;
            mensaje += "descuento aplica por socio basisco 10%" + "\n";

            if (dia >= 1 && dia <= 7) {
                descTotalTilapia += descuentoFrescotilapia;
                mensaje += "descuento aplicado por fresco 12%" + "\n";


            }
            if (cupon && dia <= 5) {
                descTotalTilapia += descuentoCuponTilapia;
                mensaje += "descuento aplicado por cupon 6%" + "\n";


            }
            if (kg >= 8 && kg < 15) {
                descTotalTilapia += descuentoVolumen8kgtilapia;
                mensaje += "descuento aplicado por volumen mas de 8 kg 7%" + "\n";

            }
            if (kg >= 15) {
                descTotalTilapia += descuentoVolumen15kgtilapia;
                mensaje += "descuento aplicado por volumen mas de 15 kg 12%" + "\n";

            }
            if (servicioExtraLimpieza) {
                serviciosTotalTilapia += limpiezaTilapia;
                mensaje += "limpieza extra mas 7%" + "\n";


            }
            if (hielo) {
                serviciosTotalTilapia += servicioHieloTilapia;

                mensaje += "hielo extra mas 3%" + "\n";


            }
            if (envios) {
                serviciosTotalTilapia += servicioDomicilioTilapia;
                mensaje += "domicilio extra mas 7%" + "\n";


            }
            if (dia >= 6 && dia < 7) {
                recargoTotalTilapia += recargoFinSemanaTilapia;
                mensaje += "recargo extra por fin de semana" + "\n";


            }
            if (mensaje.isEmpty())
                mensaje += "no hay descuentos,servicios extra ni recargos";
            totalPagarTilapia = subtotalTilapia - descTotalTilapia + serviciosTotalTilapia + recargoTotalTilapia;

            System.out.println(mensaje);
            System.out.printf("subtotal %.2f%n", subtotalTilapia);
            System.out.printf("descuentos %.2f%n", descTotalTilapia);
            System.out.printf("servicios extras %.2f%n ", serviciosTotalTilapia);
            System.out.printf("recargos extras %.2f%n ", recargoTotalTilapia);
            System.out.printf("descuento por socio basico %.2f%n ", socioBasicoTilapia);
            System.out.printf("total a pagar %.2f%n", totalPagarTilapia);


        } else if (cliente == 2 && producto == 2) {
            descTotalSalmon += socioBasicoSalmon;
            mensaje += "descuento  aplicado por socio basico 10%" + "\n";

            if (dia >= 1 && dia <= 7) {
                descTotalSalmon += descuentoFrescoSalmon;
                mensaje += "descuento aplicado por fresco 12%" + "\n";

            }
            if (cupon && dia <= 5) {
                descTotalSalmon += descuentoCuponSalmon;
                mensaje += "descuento aplicado por cupon 6%" + "\n";

            }
            if (kg >= 8 && kg < 15) {
                descTotalSalmon += descuentoVolumen8kgsalmon;
                mensaje += "descuento aplicado por volumen mas de 8 kg" + "\n";

            }
            if (kg >= 15) {
                descTotalSalmon += descuentoVolumen15kgsalmon;
                mensaje += "descuento aplicado por vulomen mas de 15 kg" + "\n";


            }
            if (hielo) {
                serviciosTotalSalmon += servicioHieloSalmon;
                mensaje += "hielo extra mas 7%" + "\n";

            }
            if (envios) {
                serviciosTotalSalmon += servicioDomicilioSalmon;
                mensaje += "domicilio extra mas 7%" + "\n";

            }
            if (dia >= 6 && dia < 7) {
                recargoTotalSalmon += recargoFinSemanaSalmon;
                mensaje += "recargo extra de 5% por semana" + "\n";

            }
            if (mensaje.isEmpty())
                mensaje += "sin descuentos aplicados,servicios extras ni recargos";
            totalPagarSalmon = subtotalSalmon - descTotalSalmon + serviciosTotalSalmon + recargoTotalSalmon;
            System.out.println(mensaje);
            System.out.printf("subtotal %.2f%n", subtotalSalmon);
            System.out.printf("descuentos  %.2f%n", descTotalSalmon);
            System.out.printf("servicios extras  %.2f%n", serviciosTotalSalmon);
            System.out.println("recargo extras %.2f%n" + recargoTotalSalmon);
            System.out.printf("descuento por socios basico %.2f%n", socioBasicoSalmon);
            System.out.printf("total a pagar  %.2f%n", totalPagarSalmon);


        } else if (cliente == 2 && producto == 3) {
            desctotalCamaron += socioBasicoCamaron;
            mensaje += "descuento aplicado por socio basico 10%" + "\n";

            if (dia >= 1 && dia <= 7) {
                desctotalCamaron = descuentoFrescoCamaron;
                mensaje += "descuento aplicado por fresco 12%" + "\n";


            }
            if (cupon && dia <= 5) {
                desctotalCamaron += descuentoCuponCamaron;
                mensaje += "descuento aplicado por cupon 6%" + "\n";

            }
            if (kg >= 8 && kg < 15) {
                desctotalCamaron += descuentoVolumen8kgCamaron;
                mensaje += "descuento volumen mas de 8kg 7%" + "\n";

            }
            if (kg >= 15) {
                desctotalCamaron += descuentoVolumen15Camaron;
                mensaje += "descuento volumen mas de 15kg 12%" + "\n";

            }
            if (hielo) {
                serviciosTotalCamaron += servicioHieloCamaron;
                mensaje += "hielo extra mas 7%" + "\n";

            }
            if (envios) {
                serviciosTotalCamaron += servicioDomicilioCamaron;
                mensaje += "domicilio extra mas 7%" + "\n";

            }
            if (dia >= 6 && dia < 7) {
                recargoTotalCamaron += recargoFinSemanaCamaron;
                mensaje += "recargo extra por fin de semana mas 5%" + "\n";
            }
            if (mensaje.isEmpty()) {
                mensaje += "sin descuentos ni servicios extras";
            }
            totalPagarCamaron = subtotalCamaron - desctotalCamaron + serviciosTotalCamaron + recargoTotalCamaron + itbisCamaron;
            System.out.println(mensaje);
            System.out.printf("subtotal %.2f%n", subtotalCamaron);
            System.out.printf("descuentos  %.2f%n", desctotalCamaron);
            System.out.printf("servicios extras  %.2f%n", serviciosTotalCamaron);
            System.out.printf("recargo extras %.2f%n", recargoTotalCamaron);
            System.out.printf("descuento  por socio basico %.2f%n", socioBasicoCamaron);
            System.out.printf("itbis por camaron %.2f%n", itbisCamaron);
            System.out.printf("total a pagar %.2f%n", totalPagarCamaron);


        } else if (cliente == 2 && producto == 4) {
            desctotalPulpo += socioBasicoPulpo;
            mensaje += "descuento aplicado por socio basico 10%" + "\n";

            if (dia >= 1 && dia <= 7) {
                desctotalPulpo = descuentoFrescoPulpo;
                mensaje += "descuento aplicado por fresco 12%" + "\n";

            }
            if (cupon && dia <= 5) {
                desctotalPulpo += descuentoCuponPulpo;
                mensaje += "descuento aplica por cupon 6%" + "\n";

            }
            if (kg >= 8 && kg < 15) {
                desctotalPulpo += descuentoVolumen8kgPulpo;
                mensaje += "descuento aplicado por volumen mas de 8kg 7%" + "\n";

            }
            if (kg >= 15) {
                desctotalPulpo += descuentoVolumen15kgPulpo;
                mensaje += "descuento aplicado por volumen mas de 15kg 12%" + "\n";
            }
            if (hielo) {
                serviciosTotalPulpo += servicioHieloPulpo;
                mensaje += "hielo extra mas 7%" + "\n";

            }
            if (envios) {
                serviciosTotalPulpo += servicioDomicilioPulpo;
                mensaje += "domicilio extra mas 7%" + "\n";

            }
            if (dia >= 6 && dia <= 7) {
                recargoTotalPulpo += recargoFinSemanaPulpo;
                mensaje += "recargo por fin de semana mas 5%" + "\n";


            }
            if (mensaje.isEmpty()) {
                mensaje += "sin descuentos aplicados y tampocos servicios extras" + "\n";

            }
            totalPagarPulpo = subtotalPulpo - desctotalPulpo + serviciosTotalPulpo + recargoTotalPulpo + itbisPulpo;
            System.out.println(mensaje);
            System.out.printf("subtotal  %.2f%n", subtotalPulpo);
            System.out.printf("descuentos aplicados  %.2f%n ", desctotalPulpo);
            System.out.printf("servicios extras  %.2f%n ", serviciosTotalPulpo);
            System.out.printf("descuento por socio basico %.2f%n", socioBasicoPulpo);
            System.out.printf("itbis  %.2f%n ", itbisPulpo);
            System.out.printf("total a pagar  %.2f%n ", totalPagarPulpo);

        } else if (cliente == 2 && producto == 5) {
            descTotalBacalao += socioBasicoBacalao;
            mensaje += "descuento aplicado socio  basico 10%" + "\n";

            if (dia >= 1 && dia <= 7) {
                descTotalBacalao = descuentoFrescoBacalao;
                mensaje += "descuento por fresco 12%" + "\n";

            }
            if (cupon && dia <= 5) {
                descTotalBacalao = descuentoCuponBacalao;
                mensaje += "descuento por cupon y no ser fin de semana 6% " + "\n";

            }
            if (kg >= 8 && kg < 15) {
                descTotalBacalao += descuentoVolumen8kgBacalao;
                mensaje += "descuento por volumen de mas de 8kg 7%" + "\n";

            }
            if (kg >= 15) {
                descTotalBacalao += descuentoVolumen15kgBacalao;
                mensaje += "descuento por volumen de mas de 8kg 12 %" + "\n";

            }
            if (servicioExtraLimpieza) {
                serviciosTotalBacalao += limpiezaBacalao;
                mensaje += "limpieza extra 3%" + "\n";

            }
            if (hielo) {
                serviciosTotalBacalao += servicioHieloBacalao;
                mensaje += "hielo extra mas 7%" + "\n";

            }
            if (envios) {
                serviciosTotalBacalao += servicioDomicilioBacalao;
                mensaje += "envio a domicilio extra mas 7%" + "\n";

            }
            if (dia >= 6 && dia <= 7) {
                recargoTotalBacalao += recargoFinSemanaBacalao;
                mensaje = "recargo extra por ser fin de semana 5%+" + "\n";

            }
            if (mensaje.isEmpty()) {
                mensaje += "no se aplicaron descuentos,servicios extras ni recargos ";

            }
            totalPagarBacalao = subtotalBacalao - descTotalBacalao + serviciosTotalBacalao + recargoTotalBacalao;
            System.out.println(mensaje);
            System.out.printf("subtotal %.2f%n", subtotalBacalao);
            System.out.printf("descuentos aplicados %.2f%n ", descTotalBacalao);
            System.out.printf("servicios extras %.2f%n ", serviciosTotalBacalao);
            System.out.printf("recargos extras %.2f%n ", recargoTotalBacalao);
            System.out.printf("descuento por socio basico %.2f%n", socioBasicoBacalao);
            System.out.printf("total a pagar %.2f%n ", totalPagarBacalao);

        } else if (cliente == 3 && producto == 1) {
            descTotalTilapia += socioPremiumTilapia;
            mensaje += "descuento aplicado por socio premium 18%" + "\n";


            if (dia >= 1 && dia <= 7) {
                descTotalTilapia += descuentoFrescotilapia;
                mensaje += "descuento aplicado por fresco 12%" + "\n";


            }
            if (cupon && dia <= 5) {
                descTotalTilapia += descuentoCuponTilapia;
                mensaje += "descuento aplicado por cupon 6%" + "\n";


            }
            if (kg >= 8 && kg < 15) {
                descTotalTilapia += descuentoVolumen8kgtilapia;
                mensaje += "descuento aplicado por volumen mas de 8 kg 7%" + "\n";

            }
            if (kg >= 15) {
                descTotalTilapia += descuentoVolumen15kgtilapia;
                mensaje += "descuento aplicado por volumen mas de 15 kg 12%" + "\n";

            }
            if (servicioExtraLimpieza) {
                serviciosTotalTilapia += limpiezaTilapia;
                mensaje += "limpieza extra mas 7%" + "\n";


            }
            if (hielo) {
                serviciosTotalTilapia += servicioHieloTilapia;

                mensaje += "hielo extra mas 3%" + "\n";


            }
            if (envios) {
                serviciosTotalTilapia += servicioDomicilioTilapia;
                mensaje += "domicilio extra mas 7%" + "\n";


            }
            if (dia >= 6 && dia < 7) {
                recargoTotalTilapia += recargoFinSemanaTilapia;
                mensaje += "recargo extra por fin de semana" + "\n";


            }
            if (mensaje.isEmpty())
                mensaje += "no hay descuentos,servicios extra ni recargos";
            totalPagarTilapia = subtotalTilapia - descTotalTilapia + serviciosTotalTilapia + recargoTotalTilapia;

            System.out.println(mensaje);
            System.out.printf("subtotal %.2f%n", subtotalTilapia);
            System.out.printf("descuentos %.2f%n", descTotalTilapia);
            System.out.printf("servicios extras %.2f%n ", serviciosTotalTilapia);
            System.out.printf("recargos extras %.2f%n ", recargoTotalTilapia);
            System.out.printf("descuento por socio premium %.2f%n ", socioPremiumTilapia);
            System.out.printf("total a pagar %.2f%n", totalPagarTilapia);


        } else if (cliente == 3 && producto == 2) {
            descTotalSalmon += socioPremiumSalmon;
            mensaje += "descuento  aplicado por socio premium 18%" + "\n";

            if (dia >= 1 && dia <= 7) {
                descTotalSalmon += descuentoFrescoSalmon;
                mensaje += "descuento aplicado por fresco 12%" + "\n";

            }
            if (cupon && dia <= 5) {
                descTotalSalmon += descuentoCuponSalmon;
                mensaje += "descuento aplicado por cupon 6%" + "\n";

            }
            if (kg >= 8 && kg < 15) {
                descTotalSalmon += descuentoVolumen8kgsalmon;
                mensaje += "descuento aplicado por volumen mas de 8 kg" + "\n";

            }
            if (kg >= 15) {
                descTotalSalmon += descuentoVolumen15kgsalmon;
                mensaje += "descuento aplicado por vulomen mas de 15 kg" + "\n";


            }
            if (hielo) {
                serviciosTotalSalmon += servicioHieloSalmon;
                mensaje += "hielo extra mas 7%" + "\n";

            }
            if (envios) {
                serviciosTotalSalmon += servicioDomicilioSalmon;
                mensaje += "domicilio extra mas 7%" + "\n";

            }
            if (dia >= 6 && dia < 7) {
                recargoTotalSalmon += recargoFinSemanaSalmon;
                mensaje += "recargo extra de 5% por semana" + "\n";

            }
            if (mensaje.isEmpty())
                mensaje += "sin descuentos aplicados,servicios extras ni recargos";
            totalPagarSalmon = subtotalSalmon - descTotalSalmon + serviciosTotalSalmon + recargoTotalSalmon;
            System.out.println(mensaje);
            System.out.printf("subtotal %.2f%n", subtotalSalmon);
            System.out.printf("descuentos  %.2f%n", descTotalSalmon);
            System.out.printf("servicios extras  %.2f%n", serviciosTotalSalmon);
            System.out.println("recargo extras %.2f%n" + recargoTotalSalmon);
            System.out.printf("descuento por socio premium %.2f%n", socioPremiumSalmon);
            System.out.printf("total a pagar  %.2f%n", totalPagarSalmon);


        } else if (cliente == 3 && producto == 3) {
            desctotalCamaron += socioPremiumCamaron;
            mensaje += "descuento aplicado por socio premium 18%" + "\n";

            if (dia >= 1 && dia <= 7) {
                desctotalCamaron = descuentoFrescoCamaron;
                mensaje += "descuento aplicado por fresco 12%" + "\n";


            }
            if (cupon && dia <= 5) {
                desctotalCamaron += descuentoCuponCamaron;
                mensaje += "descuento aplicado por cupon 6%" + "\n";

            }
            if (kg >= 8 && kg < 15) {
                desctotalCamaron += descuentoVolumen8kgCamaron;
                mensaje += "descuento volumen mas de 8kg 7%" + "\n";

            }
            if (kg >= 15) {
                desctotalCamaron += descuentoVolumen15Camaron;
                mensaje += "descuento volumen mas de 15kg 12%" + "\n";

            }
            if (hielo) {
                serviciosTotalCamaron += servicioHieloCamaron;
                mensaje += "hielo extra mas 7%" + "\n";

            }
            if (envios) {
                serviciosTotalCamaron += servicioDomicilioCamaron;
                mensaje += "domicilio extra mas 7%" + "\n";

            }
            if (dia >= 6 && dia < 7) {
                recargoTotalCamaron += recargoFinSemanaCamaron;
                mensaje += "recargo extra por fin de semana mas 5%" + "\n";
            }
            if (mensaje.isEmpty()) {
                mensaje += "sin descuentos ni servicios extras";
            }
            totalPagarCamaron = subtotalCamaron - desctotalCamaron + serviciosTotalCamaron + recargoTotalCamaron + itbisCamaron;
            System.out.println(mensaje);
            System.out.printf("subtotal %.2f%n", subtotalCamaron);
            System.out.printf("descuentos  %.2f%n", desctotalCamaron);
            System.out.printf("servicios extras  %.2f%n", serviciosTotalCamaron);
            System.out.printf("recargo extras %.2f%n", recargoTotalCamaron);
            System.out.printf("descuento  por socio premuim %.2f%n", socioPremiumCamaron);
            System.out.printf("itbis por camaron %.2f%n", itbisCamaron);
            System.out.printf("total a pagar %.2f%n", totalPagarCamaron);

        }else if (cliente==3 && producto==4) {
            desctotalPulpo+=socioPremiumPulpo;
            mensaje+="descuento aplicado por socio premium 18%"+"\n";

            if(dia>=1 && dia<=7){
                desctotalPulpo=descuentoFrescoPulpo;
                mensaje+="descuento aplicado por fresco 12%"+"\n";

            }
            if(cupon && dia<=5){
                desctotalPulpo+=descuentoCuponPulpo;
                mensaje+="descuento aplica por cupon 6%"+"\n";

            }
            if(kg>=8 && kg<15){
                desctotalPulpo+=descuentoVolumen8kgPulpo;
                mensaje+="descuento aplicado por volumen mas de 8kg 7%"+"\n";

            }
            if(kg>=15){
                desctotalPulpo+=descuentoVolumen15kgPulpo;
                mensaje+="descuento aplicado por volumen mas de 15kg 12%"+"\n";
            }
            if(hielo){
                serviciosTotalPulpo+=servicioHieloPulpo;
                mensaje+="hielo extra mas 7%"+"\n";

            }
            if(envios){
                serviciosTotalPulpo+=servicioDomicilioPulpo;
                mensaje+="domicilio extra mas 7%"+"\n";

            }
            if(dia>=6 && dia<=7){
                recargoTotalPulpo+=recargoFinSemanaPulpo;
                mensaje+="recargo por fin de semana mas 5%"+"\n";


            }
            if(mensaje.isEmpty()){
                mensaje+="sin descuentos aplicados y tampocos servicios extras"+"\n";

            }
            totalPagarPulpo=subtotalPulpo-desctotalPulpo+serviciosTotalPulpo+recargoTotalPulpo+itbisPulpo;
            System.out.println(mensaje);
            System.out.printf("subtotal  %.2f%n",subtotalPulpo);
            System.out.printf("descuentos aplicados  %.2f%n ",desctotalPulpo);
            System.out.printf("servicios extras  %.2f%n ",serviciosTotalPulpo);
            System.out.printf("descuento por socio basixo %.2f%n",socioBasicoPulpo);
            System.out.printf("itbis  %.2f%n ",itbisPulpo);
            System.out.printf("total a pagar  %.2f%n ",totalPagarPulpo);


        } else if (cliente == 3 && producto == 5) {
            descTotalBacalao += socioPremiumBacalao;
            mensaje += "descuento aplicado socio  premium 18%" + "\n";

            if (dia >= 1 && dia <= 7) {
                descTotalBacalao = descuentoFrescoBacalao;
                mensaje += "descuento por fresco 12%" + "\n";

            }
            if (cupon && dia <= 5) {
                descTotalBacalao = descuentoCuponBacalao;
                mensaje += "descuento por cupon y no ser fin de semana 6% " + "\n";

            }
            if (kg >= 8 && kg < 15) {
                descTotalBacalao += descuentoVolumen8kgBacalao;
                mensaje += "descuento por volumen de mas de 8kg 7%" + "\n";

            }
            if (kg >= 15) {
                descTotalBacalao += descuentoVolumen15kgBacalao;
                mensaje += "descuento por volumen de mas de 8kg 12 %" + "\n";

            }
            if (servicioExtraLimpieza) {
                serviciosTotalBacalao += limpiezaBacalao;
                mensaje += "limpieza extra 3%" + "\n";

            }
            if (hielo) {
                serviciosTotalBacalao += servicioHieloBacalao;
                mensaje += "hielo extra mas 7%" + "\n";

            }
            if (envios) {
                serviciosTotalBacalao += servicioDomicilioBacalao;
                mensaje += "envio a domicilio extra mas 7%" + "\n";

            }
            if (dia >= 6 && dia <= 7) {
                recargoTotalBacalao += recargoFinSemanaBacalao;
                mensaje = "recargo extra por ser fin de semana 5%+" + "\n";

            }
            if (mensaje.isEmpty()) {
                mensaje += "no se aplicaron descuentos,servicios extras ni recargos ";

            }
            totalPagarBacalao = subtotalBacalao - descTotalBacalao + serviciosTotalBacalao + recargoTotalBacalao;
            System.out.println(mensaje);
            System.out.printf("subtotal %.2f%n", subtotalBacalao);
            System.out.printf("descuentos aplicados %.2f%n ", descTotalBacalao);
            System.out.printf("servicios extras %.2f%n ", serviciosTotalBacalao);
            System.out.printf("recargos extras %.2f%n ", recargoTotalBacalao);
            System.out.printf("descuento por socio premium %.2f%n", socioPremiumBacalao);
            System.out.printf("total a pagar %.2f%n ", totalPagarBacalao);


        }

        }

    }
