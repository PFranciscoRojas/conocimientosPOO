package com.poo.Character;

class heroe {
    String name;
    int level;
    int force;
    int life;
    int shield;

    // caracter
    public heroe(String name, int level, int force, int life, int shield) {
        this.name = name;
        this.level = level;
        this.force = force;
        this.life = life;
        this.shield = shield;
    }


    public String getName() {
        return name;
    }


    public int getLevel() {
        return level;
    }


    public int getForce() {
        return force;
    }


    public int getLife() {
        return life;
    }


    public int getShield() {
        return shield;
    }


    public void setName(String name) {
        this.name = name;
    }


    public void setLevel(int level) {
        this.level = level;
    }


    public void setForce(int force) {
        this.force = force;
    }


    public void setLife(int life) {
        this.life = life;
    }


    public void setShield(int shield) {
        this.shield = shield;
    }


}
