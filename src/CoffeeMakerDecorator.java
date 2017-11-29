import java.net.CookieHandler;

/**
 * Created by xavi on 27/11/17.
 */
public interface CoffeeMakerDecorator extends CoffeeMaker {

    void setCoffeeMakerDecorated(CoffeeMaker coffeMakerToDecorate);
}
