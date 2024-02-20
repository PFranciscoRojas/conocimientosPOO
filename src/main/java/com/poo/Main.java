package com.poo;

import com.poo.Monster.Monster;

public class Main {
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

    }
}