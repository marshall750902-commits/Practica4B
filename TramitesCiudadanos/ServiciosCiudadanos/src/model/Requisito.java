package model;

public class Requisito {

    private String nombre;
    private boolean cumplido;

    public Requisito(String nombre) {
        this.nombre = nombre;
        this.cumplido = false;
    }

    public void cumplir() {
        cumplido = true;
    }

    public boolean isCumplido() {
        return cumplido;
    }

    public String getNombre() {
        return nombre;
    }
}