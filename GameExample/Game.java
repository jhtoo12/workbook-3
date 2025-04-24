public class Game {
    public static void Main(String[] args)
    {
        Enemy zombie = new Enemy();
        Enemy skeleton = new Enemy();
        Enemy creeper = new Enemy();

        zombie.setHealth(20);

        int oldZombieHealth = zombie.getHealth();

        System.out.print("Old Zombie Health: " + oldZombieHealth);
    }
}