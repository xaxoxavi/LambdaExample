public class Main {

    public static void main(String[] args) {

        // Ho fa l'injector //
        CoffeeMaker coffeeMaker = new Nesspresso();
        CoffeeMakerDecorator coffeeMakerDecorator = new NesspressoWithMilk();
        coffeeMakerDecorator.setCoffeeMakerDecorated(coffeeMaker);

        CoffeeMakerDecorator coffeeMakeDecoratorSugar = new NesspressoWithMilkAndSugar();
        coffeeMakeDecoratorSugar.setCoffeeMakerDecorated(coffeeMakerDecorator);

        coffeeMakeDecoratorSugar.doCoffee();



    }
}
