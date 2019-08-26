/*
 * Faca uma Thread que monitora um conjunto de threads e exiba quais threads 
 * receberam sinais de interrupcao.
 */
package Atividade4;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author rafael
 */
public class Main implements Runnable {

    @Override
    public void run() {
        while (true) {
            try {
                System.out.println("to vivo " + Thread.currentThread().getId());
                Thread.sleep(1000);
            } catch (InterruptedException ex) {
                Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }

    public static void main(String[] args) {
        Thread t1 = new Thread(new Main());
        Thread t2 = new Thread(new Main());
        Thread t3 = new Thread(new Main());

        t1.start();
        t2.start();
        t3.start();

        Thread monitor = new Thread(() -> {
            while (true) {
                if (t1.isInterrupted()) {
                    System.out.println("t1 recebeu sinal de interrupcao");
                }
                if (t2.isInterrupted()) {
                    System.out.println("t2 recebeu sinal de interrupcao");
                }
                if (t3.isInterrupted()) {
                    System.out.println("t3 recebeu sinal de interrupcao");
                }
            }
        });
        monitor.start();

        t1.interrupt();
        t3.interrupt();

    }
}
