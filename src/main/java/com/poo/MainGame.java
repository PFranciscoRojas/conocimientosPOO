package com.poo;

import java.util.Scanner;

public class MainGame {
    private static Fight fight;
    private static Quest quest;
    private static Inventory inventory;
    private static Store store;

    public static void main(String[] args) {
        // Initialize instances of the necessary classes
        fight = new Fight();
        quest = new Quest();
        inventory = new Inventory();
        store = new Store();

        // Show the menu
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

        // Implement logic based on the selected option
        switch (option) {
            case 1:
                // Logic to start a fight
                fight.startFight();
                break;
            case 2:
                // Logic to perform a quest
                quest.performQuest();
                break;
            case 3:
                // Logic to view the inventory
                inventory.showInventory();
                break;
            case 4:
                // Logic to visit the store
                store.visitStore();
                break;
            case 5:
                System.out.println("Exiting the game. Goodbye!");
                System.exit(0);
                break;
            default:
                System.out.println("Invalid option. Try again.");
        }

        // Show the menu again after executing the option
        showMenu();

        scanner.close();
    }
}