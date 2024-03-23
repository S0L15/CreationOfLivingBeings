package CreationOfLivingBeings.BeingsOfTheEarth;

import CreationOfLivingBeings.Common.LivingBeing;

public class Horse extends LivingBeing implements EarthBeing{
    @Override
    public void walk() {
        System.out.println("Horse walking :3");
    }

    @Override
    public void run() {
        System.out.println("Horse running ;)");
    }

    @Override
    public void jump() {
        System.out.println("Horse jumping o_o");
    }

    @Override
    public void born() {
        System.out.println("Horse was born!!!");
    }

    @Override
    public void reproduce() {
        System.out.println("Horse is reproducing °-°");
    }

    @Override
    public void die() {
        System.out.println("Horse just died x_x");
    }

    @Override
    public void grow() {
        System.out.println("Horse is growing!!!");
    }
    
}
