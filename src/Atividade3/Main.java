/*
 * Faca um programa Java que envia interrupcoes para as threads dos exercıcios
 * anteriores. As threads devem fazer o tratamento dessas interrupcoes e realizar
 * uma finalizacao limpa.
 */
package Atividade3;

/**
 *
 * @author rafael
 */
public class Main {

    public static void main(String[] args) {
        Thread t1 = new Thread(new Ativ1());
        Thread t2 = new Thread(new Ativ2());

        t1.start();
        t2.start();

        t1.interrupt();
        t2.interrupt();

        if (t1.isInterrupted()) {
            System.out.println("t1 interrompida");
        }
        if (t1.isInterrupted()) {
            System.out.println("t2 interrompida");
        }

    }
}
