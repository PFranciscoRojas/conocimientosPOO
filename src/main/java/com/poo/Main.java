package com.poo;

import com.poo.Character.Character;
import com.poo.Monster.Monster;

public class Main {
    public static void main(String[] args) {

        System.out.println("Hello world desde Java!");

        Character character = new Character("El ferxxito", 1, 10, 100, 20);

        Monster monster = new Monster();
        monster.setName("Casper");
        monster.setLevel(2);
        monster.setTypeMonster("Ghosts");
        monster.setLives(0);
        monster.setForce(122.1);
        monster.setExperience("2 años");

        monster.fly();
        monster.isLive();

        Fight pelea = new Fight();

        pelea.combat(character, monster);

         // Crear una instancia de la tienda de armas
        Tienda espada = new Tienda("Espada del Destino", "Espada", 150, 10);

         // Mostrar información del arma en la tienda
        System.out.println("Arma: " + espada.getNombreArma());
        System.out.println("Tipo: " + espada.getTipoArma());
        System.out.println("Precio: $" + espada.getPrecio());
        System.out.println("Cantidad Disponible: " + espada.getCantidadDisponible());

    }
}