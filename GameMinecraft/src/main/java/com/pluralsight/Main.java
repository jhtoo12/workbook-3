package com.pluralsight;

public class Main {
    public static void main(String[] args)
        {
            Enemy zombie = new Enemy();
            Enemy skeleton = new Enemy(25, "Bob", 10);
            Enemy creeper = new Enemy();



            zombie.setHealth(20);

            int oldZombieHealth = zombie.getHealth();

            zombie.setHealth(15);

            int newZombieHealth = zombie.getHealth();

            System.out.print("Old Zombie Health: " + oldZombieHealth +
                             "\nNew Zombie Health: " + newZombieHealth + "\n\n");

            int skeletonHealth = skeleton.getHealth();
            System.out.print("Skeleton Health: " + skeletonHealth);
        }
}