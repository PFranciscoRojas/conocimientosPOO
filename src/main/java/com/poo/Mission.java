package com.poo;

import java.util.ArrayList;
import java.util.List;

import com.poo.Character.Character;

public class Mission {
    private String missionName;
    private String description;
    private int difficulty;
    private List<Character> charactersRequired;

    public Mission(String missionName, String description, int difficulty) {
        this.missionName = missionName;
        this.description = description;
        this.difficulty = difficulty;
        this.charactersRequired = new ArrayList<>();
    }

    public String getMissionName() {
        return missionName;
    }

    public void setMissionName(String missionName) {
        this.missionName = missionName;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getDifficulty() {
        return difficulty;
    }

    public void setDifficulty(int difficulty) {
        this.difficulty = difficulty;
    }

    public List<Character> getCharactersRequired() {
        return charactersRequired;
    }

    public void setCharactersRequired(List<Character> charactersRequired) {
        this.charactersRequired = charactersRequired;
    }

    public void addCharacterRequired(Character character) {
        this.charactersRequired.add(character);
    }

    public void removeCharacterRequired(Character character) {
        this.charactersRequired.remove(character);
    }

    public boolean isMissionComplete() {
        if (charactersRequired.isEmpty()) {
            return false;
        }

        for (Character character : charactersRequired) {
            if (character.getLife() <= 0) {
                return false;
            }
        }

        int totalForce = 0;
        for (Character character : charactersRequired) {
            totalForce += character.getForce();
        }
        int averageForce = totalForce / charactersRequired.size();
        int totalDifficulty = averageForce * charactersRequired.size();
        if (totalDifficulty < difficulty) {
            return false;
        }

        return true;
    }
}