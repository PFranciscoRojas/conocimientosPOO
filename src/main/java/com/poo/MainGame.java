package com.poo;

import java.util.Scanner;

public class MainGame {
    private static Fight fight;
    private static Quest quest;
    private static Inventory inventory;
    private static Store store;

    public static void main(String[] args) {
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
                fight.startFight();
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
