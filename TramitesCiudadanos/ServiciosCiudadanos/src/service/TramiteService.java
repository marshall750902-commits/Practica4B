package service;

public class TramiteService {

    private static TramiteService instancia;

    private TramiteService() {
    }

    public static TramiteService getInstancia() {

        if(instancia == null) {
            instancia = new TramiteService();
        }

        return instancia;
    }

    public void registrarTramite() {
        System.out.println("Trámite registrado.");
    }
}