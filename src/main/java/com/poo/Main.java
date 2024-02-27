package com.poo;

import com.poo.Character.Character;
import com.poo.Monster.Monster;

import java.util.Scanner;

import com.poo.menu.Fight;
import com.poo.menu.Inventory;
import com.poo.menu.Quest;
import com.poo.menu.Store;

public class Main {
    private static Fight fight;
    private static Quest quest;
    private static Inventory inventory;
    private static Store store;

    public static void main(String[] args) {

        System.out.println("Hello world desde Java!");
        
        Monster monster = new Monster();
        monster.setName("Casper");
        monster.setLevel(2);
        monster.setTypeMonster("Ghosts");
        monster.setLives(0);
        monster.setForce(122.1);
        monster.setExperience("2 años");
        
        monster.fly();
        monster.isLive();
        
        Character character = new Character("El ferxxito", 1, 10, 100, 20);
        
        Fight peleaFight = new Fight();

        peleaFight.combat(character, monster);

         // Crear una instancia de la tienda de armas
         Tienda espada = new Tienda("Espada del Destino", "Espada", 150, 10);
	        
         // Mostrar información del arma en la tienda
         System.out.println("Arma: " + espada.getNombreArma());
         System.out.println("Tipo: " + espada.getTipoArma());
         System.out.println("Precio: $" + espada.getPrecio());
         System.out.println("Cantidad Disponible: " + espada.getCantidadDisponible());
     

        // Inicializa instancias
        fight = new Fight();
        quest = new Quest();
        inventory = new Inventory();
        store = new Store();

        // ver menu
        showMenu();
    }

    public static void showMenu() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to the game!");
        System.out.println("1. Fight");
        System.out.println("2. Perform quest");
        System.out.println("3. View inventory");
        System.out.println("4. Visit the store");
        System.out.println("5. Exit");

        System.out.print("Select an option: ");
        int option = scanner.nextInt();

        // opciones
        switch (option) {
            case 1:
                //start a fight
                System.out.println("start fight");
                break;
            case 2:
                //perform a quest
                quest.performQuest();
                break;
            case 3:
                //view the inventory
                inventory.showInventory();
                break;
            case 4:
                //visit the store
                store.visitStore();
                break;
            case 5:
                System.out.println("Exiting the game. Goodbye!");
                System.exit(0);
                break;
            default:
                System.out.println("Invalid option. Try again.");
        }

        // muestra las opciones del menu nuevamente
        showMenu();

        scanner.close();
    }
}