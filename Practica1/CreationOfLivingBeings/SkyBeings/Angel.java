package CreationOfLivingBeings.SkyBeings;

import CreationOfLivingBeings.Common.LivingBeing;

public class Angel extends LivingBeing implements SkyBeing{

    @Override
    public void fly() {
        System.out.println("Angel is celestially flying *-*");
    }

    @Override
    public void changeDimension() {
        System.out.println("Angel changing dimension °~°");
    }

    @Override
    public void land() {
        System.out.println("Angel landing B)");
    }

    @Override
    public void born() {
        System.out.println("Angel was born!!!");
    }

    @Override
    public void reproduce() {
        System.out.println("Angel reproducing °-°");
    }

    @Override
    public void die() {
        System.out.println("Angel just died x_x");
    }

    @Override
    public void grow() {
        System.out.println("Angel is growing!!!");
    }

    @Override
    public void respawn() {
        System.out.println("Angel just respawned!!!");
    }
    
}
