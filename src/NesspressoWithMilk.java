/**
 * Created by xavi on 27/11/17.
 */
public class NesspressoWithMilk implements CoffeeMakerDecorator {

    private CoffeeMaker coffeeMakerDecorated;

    @Override
    public void doCoffee() {

        System.out.println("I'm warming up the milk");

        coffeeMakerDecorated.doCoffee();

        System.out.println("I'm mixing the coffee with the milk");

    }

    public void setCoffeeMakerDecorated(CoffeeMaker coffeeMakerDecorated) {
        this.coffeeMakerDecorated = coffeeMakerDecorated;
    }
}
