package model;

import java.util.ArrayList;
import java.util.List;

public class Ciudadano {

    private String nombre;
    private String curp;
    private List<SolicitudTramite> solicitudes;

    public Ciudadano(String nombre, String curp) {
        this.nombre = nombre;
        this.curp = curp;
        this.solicitudes = new ArrayList<>();
    }

    public void agregarSolicitud(SolicitudTramite solicitud) {
        solicitudes.add(solicitud);
    }

    public String getNombre() {
        return nombre;
    }

    public String getCurp() {
        return curp;
    }

    public List<SolicitudTramite> getSolicitudes() {
        return solicitudes;
    }
}