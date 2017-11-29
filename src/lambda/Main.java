package lambda;

/**
 * Created by xavi on 29/11/17.
 */
public class Main {

    public static void main(String[] args) {

        doGreeting(Main::printHola);



    }

    public static void doGreeting(Greeting greeting){

        greeting.greet("Xavi");

    }


    public static void printHola(String name){

        System.out.println("Hola " + name);

    }
}
