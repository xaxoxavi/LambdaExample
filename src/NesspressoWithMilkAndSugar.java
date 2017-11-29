/**
 * Created by xavi on 27/11/17.
 */
public class NesspressoWithMilkAndSugar implements CoffeeMakerDecorator {

    private CoffeeMaker coffeeMaker;

    private static String doCoffee;

    @Override
    public void doCoffee() {

        coffeeMaker.doCoffee();
        System.out.println("Adding sugar...");

    }

    @Override
    public void setCoffeeMakerDecorated(CoffeeMaker coffeMakerToDecorate) {
        this.coffeeMaker = coffeMakerToDecorate;
    }
}
