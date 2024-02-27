package com.poo.menu;

import com.poo.Character.Character;
import com.poo.Monster.Monster;

public class Fight {

    Monster monster;
    Character character;

    public void combat(Character character, Monster monster) {

        System.out.println(character.getName() + " está peleando contra " + monster.getName());

        double damage = character.getForce() * (Math.random() + 0.5);

        monster.setLives(monster.getLives() - (int) damage);

        System.out.println(character.getName() + " ha inflingido " + (int) damage + " puntos de daño a " + monster.getName());

        monster.isLive();

        if (monster.getLives() <= 0) {
            System.out.println(monster.getName() + " ha muerto.");
        }
    }
}