package model;

import java.util.ArrayList;
import java.util.List;

public class SolicitudTramite {

    private int folio;
    private TipoTramite tipo;
    private EstadoTramite estado;
    private List<Requisito> requisitos;
    private Pago pago;

    public SolicitudTramite(int folio, TipoTramite tipo) {
        this.folio = folio;
        this.tipo = tipo;
        this.estado = EstadoTramite.REGISTRADO;
        this.requisitos = new ArrayList<>();
    }

    public void agregarRequisito(Requisito requisito) {
        requisitos.add(requisito);
    }

    public void asignarPago(Pago pago) {
        this.pago = pago;
    }

    public void cambiarEstado(EstadoTramite estado) {
        this.estado = estado;
    }

    public EstadoTramite getEstado() {
        return estado;
    }

    public int getFolio() {
        return folio;
    }
    
    public TipoTramite getTipo() {
    return tipo;
}

public Pago getPago() {
    return pago;
}
}
