package com.poo;

public class mainTienda {
    public static void main(String[] args) {
        // Crear una instancia de la tienda de armas
        Tienda espada = new Tienda("Espada del Destino", "Espada", 150, 10);
        
        // Mostrar información del arma en la tienda
        System.out.println("Arma: " + espada.getNombreArma());
        System.out.println("Tipo: " + espada.getTipoArma());
        System.out.println("Precio: $" + espada.getPrecio());
        System.out.println("Cantidad Disponible: " + espada.getCantidadDisponible());
    }
}