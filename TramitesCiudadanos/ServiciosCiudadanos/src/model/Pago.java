package model;

public class Pago {

    private double monto;
    private boolean realizado;

    public Pago(double monto) {
        this.monto = monto;
    }

    public void registrarPago() {
        realizado = true;
    }

    public boolean isRealizado() {
    return realizado;
}

    public double getMonto() {
    return monto;
}

    
    }
