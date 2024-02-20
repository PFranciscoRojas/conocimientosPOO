package com.poo.Monster;

public class Monster {
    Integer id;
    String name;
    Integer level;
    String typeMonster;
    Integer lives;
    Double force;
    String experience;

    public Integer getId()
    {
        return id;
    }

    public void setId(Integer id)
    {
        this.id = id;
    }

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public Integer getLevel()
    {
        return level;
    }

    public void setLevel(Integer level)
    {
        this.level = level;
    }

    public String getTypeMonster()
    {
        return typeMonster;
    }

    public void setTypeMonster(String typeMonster)
    {
        this.typeMonster = typeMonster;
    }

    public Integer getLives()
    {
        return lives;
    }

    public void setLives(Integer lives)
    {
        this.lives = lives;
    }

    public Double getForce()
    {
        return force;
    }

    public void setForce(Double force)
    {
        this.force = force;
    }

    public String getExperience()
    {
        return experience;
    }

    public void setExperience(String experience)
    {
        this.experience = experience;
    }

    public Monster() 
    {

    }
     
    public void fly()
    {
        System.out.println("I am flying!");
    }

    public void isLive()
    {
        if (this.lives > 0) 
        {
            System.out.println("I am living, I have! " + this.lives + " lives");
        }else
        {
            System.out.println("I'm dead, I have " + this.lives + " lives");
        }
    }
}
