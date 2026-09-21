import java.util.Scanner;

import model.*;
import service.*;
import excepcion.*;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        try {

            System.out.println("=== SISTEMA DE TRÁMITES CIUDADANOS ===");

            System.out.print("Nombre: ");
            String nombre = sc.nextLine();

            System.out.print("CURP: ");
            String curp = sc.nextLine();

            ValidacionService.validarCURP(curp);

            Ciudadano ciudadano =
                    new Ciudadano(nombre, curp);

            SolicitudTramite solicitud =
                    new SolicitudTramite(
                            1001,
                            TipoTramite.PRIMERA_VEZ);

            ciudadano.agregarSolicitud(solicitud);

            Pago pago = new Pago(1200);
            pago.registrarPago();

            solicitud.asignarPago(pago);

            System.out.println("\n=== RESUMEN ===");
            System.out.println("Ciudadano: " + nombre);
            System.out.println("CURP: " + curp);
            System.out.println("Folio: " + solicitud.getFolio());
            System.out.println("Monto: $" + pago.getMonto());

        } catch (DatosInvalidosException e) {

            System.out.println(
                    "Error: " + e.getMessage());

        } finally {
            sc.close();
        }
    }
}