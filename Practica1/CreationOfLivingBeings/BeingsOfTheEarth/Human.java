package CreationOfLivingBeings.BeingsOfTheEarth;

import CreationOfLivingBeings.Common.LivingBeing;
import CreationOfLivingBeings.SkyBeings.SkyBeing;

public class Human extends LivingBeing implements EarthBeing, SkyBeing {

    @Override
    public void fly() {
        System.out.println("Human is flying with a plane XD");
    }

    @Override
    public void changeDimension() {
        System.out.println("Humans can't change dimensions :O");
    }

    @Override
    public void land() {
        System.out.println("Human landing a plane XD");
    }

    @Override
    public void walk() {
        System.out.println("Human walking :3");
    }

    @Override
    public void run() {
        System.out.println("Human running ;)");
    }

    @Override
    public void jump() {
        System.out.println("Human jumping o_o");
    }

    @Override
    public void born() {
        System.out.println("Human was born!!!");
    }

    @Override
    public void reproduce() {
        System.out.println("Human is reproducing °-°");
    }

    @Override
    public void die() {
        System.out.println("Human died x_x");
    }

    @Override
    public void grow() {
        System.out.println("Human is growing!!!");
    }

    @Override
    public void respawn() {
        System.out.println("Humans don't respawn :/");
    }
}
