package CreationOfLivingBeings.Common;

import CreationOfLivingBeings.BeingsOfTheEarth.Horse;
import CreationOfLivingBeings.BeingsOfTheEarth.Human;
import CreationOfLivingBeings.SkyBeings.Angel;
import CreationOfLivingBeings.SkyBeings.Bird;

public class LivingBeingCreator implements Creator {

    @Override
    public LivingBeing createLivingBeing(String type) {
        switch (type) {
            case "Human":
                return new Human();
            case "Horse":
                return new Horse();
            case "Angel":
                return new Angel();
            case "Bird":
                return new Bird();
            default:
                throw new IllegalArgumentException("Invalid living being type: " + type);
        }
    }
}
