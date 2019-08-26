/*
 * Faca uma thread Java que fica aguardando uma sequencia numerica de tamanho
 * arbitrario digitado por usuario para realizar uma soma. Use o join().
 */
package Atividade5;

import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author rafael
 */
public class Main implements Runnable {

    @Override
    public void run() {
        float a = Float.parseFloat(JOptionPane.showInputDialog("Informe um numero: "));
        float b = Float.parseFloat(JOptionPane.showInputDialog("Informe outro numero: "));
        float c = a + b;
        JOptionPane.showMessageDialog(null, a + " + " + b + " = " + c);
    }
    
    public static void main(String[] args) {
        System.out.println("Start main ... ");
        Thread t1 = new Thread(new Main());
        t1.start();
        try {
            t1.join();
        } catch (InterruptedException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }
        System.out.println("Continue main ... ");
        System.out.println("Stop main. ");
    }
    
}
