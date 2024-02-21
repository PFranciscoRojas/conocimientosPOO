package com.poo;

public class Items {
    private String nombre;
    private int peso;
    private int valor;
    private String descripcion;
    private boolean esConsumible;

    // Constructor
    public Items(String nombre, int peso, int valor, String descripcion, boolean esConsumible) {
        this.nombre = nombre;
        this.peso = peso;
        this.valor = valor;
        this.descripcion = descripcion;
        this.esConsumible = esConsumible;
    }

    // Métodos de acceso (getters y setters)
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }

    public int getValor() {
        return valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public boolean esConsumible() {
        return esConsumible;
    }

    public void setEsConsumible(boolean esConsumible) {
        this.esConsumible = esConsumible;
    }
}
