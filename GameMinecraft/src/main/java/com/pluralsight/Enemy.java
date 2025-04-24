package com.pluralsight;

public class Enemy {

    int health;
    String name;
    int damage;

    public Enemy()
    {
        health = 20;
        name = "Blank";
        damage = 10;
    }
    public Enemy(int _health, String _name, int _damage)
    {
        health = _health;
        name = _name;
        damage = _damage;
    }


    //Getter Methods
    public int getHealth()
    {
        return health;
    }
    public String getName()
    {
        return name;
    }

    //Setter Methods
    public void setHealth(int newHealth)
    {
        health = newHealth;
    }
}
