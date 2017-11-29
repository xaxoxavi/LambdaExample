package thread;

import java.util.List;

/**
 * Created by xavi on 29/11/17.
 */
public class ProcesarNumero implements Runnable {

    private Integer[] integers;

    @Override
    public void run() {

        int i = 0;

        while (i < integers.length) {
            Integer number = null;
            synchronized (this){
                while (integers[i] == null && i < 1000) i++;
                number = integers[i];
                integers[i] = null;
                try {
                    Thread.sleep(200);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }

            if (i == 1000) break;

            Main.procesarNumero(number);
        }

    }

    public void setIntegers(Integer[] integers) {
        this.integers = integers;
    }
}
