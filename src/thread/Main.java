package thread;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;


/**
 * Created by xavi on 29/11/17.
 */
public class Main {
    public static void main(String[] args) {
        Integer[] numbers = new Integer[1000];
        //Rellenamos lista

        for (int i=0; i < 1000 ; i++){
            numbers[i] = i;
        }

        long tiempoInicial = new Date().getTime();


        ProcesarNumero runnable = new ProcesarNumero();
        runnable.setIntegers(numbers);

        Thread t1 = new Thread(runnable);
        Thread t2 = new Thread(runnable);
        Thread t3 = new Thread(runnable);
        Thread t4 = new Thread(runnable);

        t1.start(); t2.start(); t3.start(); t4.start();



        System.out.println("Ha tardado " + (new Date().getTime() -
                tiempoInicial)/1000 + " segundos");
    }
    public static void procesarNumero(Integer i){
        //Simulamos proceso
        try {
            Thread.sleep(100);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Hemos procesado numero " + i);
    }
}
