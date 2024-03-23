package CreationOfLivingBeings.Common;

import CreationOfLivingBeings.BeingsOfTheEarth.Horse;
import CreationOfLivingBeings.BeingsOfTheEarth.Human;
import CreationOfLivingBeings.SkyBeings.Angel;
import CreationOfLivingBeings.SkyBeings.Bird;

public class Main {
    public static void main(String[] args) {
        LivingBeingCreator creator = new LivingBeingCreator();
        
        // LivingBeing human = creator.createLivingBeing("Human");
        // LivingBeing horse = creator.createLivingBeing("Animal");
        // LivingBeing Angel = creator.createLivingBeing("Angel");

        Human human = (Human) creator.createLivingBeing("Human");
        Horse horse = (Horse) creator.createLivingBeing("Horse");
        Angel Angel = (Angel) creator.createLivingBeing("Angel");
        Bird bird = (Bird) creator.createLivingBeing("Bird");

        human.born();
        human.grow();
        human.fly();
        human.changeDimension();
        human.land();
        human.run();
        human.walk();
        human.jump();
        human.reproduce();
        human.die();
        human.respawn();

        System.out.println("----------------------------------------------------------------------------");
        
        horse.born();
        horse.grow();
        // horse.fly();
        // horse.changeDimension();
        // horse.land();
        horse.run();
        horse.walk();
        horse.jump();
        horse.reproduce();
        horse.die();
        // horse.respawn();

        System.out.println("----------------------------------------------------------------------------");

        Angel.born();
        Angel.grow();
        Angel.fly();
        Angel.changeDimension();
        Angel.land();
        // Angel.run();
        // Angel.walk();
        // Angel.jump();
        Angel.reproduce();
        Angel.die();
        Angel.respawn();

        System.out.println("----------------------------------------------------------------------------");

        bird.born();
        bird.grow();
        bird.fly();
        bird.land();
        bird.die();
    }
}