package CreationOfLivingBeings.SkyBeings;

import CreationOfLivingBeings.Common.LivingBeing;

public class Bird extends LivingBeing implements SkyBeing {

    @Override
    public void fly() {
        System.out.println("Bird flying naturally *-*");
    }

    @Override
    public void land() {
        System.out.println("Bird landing B)");
    }

    @Override
    public void changeDimension() {}

    @Override
    public void respawn() {}

    @Override
    public void born() {
        System.out.println("Bird was born!!!");
    }

    @Override
    public void reproduce() {
        System.out.println("Bird reproducing °-°");
    }

    @Override
    public void die() {
        System.out.println("Bird died x_x");
    }

    @Override
    public void grow() {
        System.out.println("Bird is growing!!!");
    }
    
}
