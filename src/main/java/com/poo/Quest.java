package com.poo;

public class Quest {
    //atributos:
    public String name;
    public String description;
    public String actor;
    public String reward;
    public boolean status;
    //métodos:
    public Quest(String name, String description, String actor, String reward){
        this.name = name;
        this.description = description;
        this.actor = actor;
        this.reward = reward;
        this.status = false;
    }
    public void detailsQuest(){
        System.out.println("Quest: "+name);
        System.out.println("Description: "+description);
        System.out.println("Status Quest: "+status);
    }
    public void viewStatus(){
        this.status = true;
        System.out.println("Quest Completed!");
    }
}

