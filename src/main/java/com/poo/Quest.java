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
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getDescription() {
        return description;
    }
    public void setDescription(String description) {
        this.description = description;
    }
    public String getActor() {
        return actor;
    }
    public void setActor(String actor) {
        this.actor = actor;
    }
    public String getReward() {
        return reward;
    }
    public void setReward(String reward) {
        this.reward = reward;
    }
    public boolean isStatus() {
        return status;
    }
    public void setStatus(boolean status) {
        this.status = status;
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
    public void viewActor(){
        System.out.println("Actor: "+actor);
    }
    public void viewReward(){
        System.out.println("Reward: "+reward);
    }
}

