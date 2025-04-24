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
