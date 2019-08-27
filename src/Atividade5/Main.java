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

    public static boolean isNumeric(String strNum) {
        return strNum.matches("-?\\d+(\\.\\d+)?");
    }

    @Override
    public void run() {
        while(true){
            System.out.println("Starting thread...");
            String a = JOptionPane.showInputDialog("Informe uma sequencia numerica arbitraria: ");
            if(isNumeric(a)){
                int soma = 0;
                for(int i = 0; i < a.length(); i++){
                    soma += Character.getNumericValue(a.charAt(i));
                }
                JOptionPane.showMessageDialog(null, "Soma = " + soma);
                System.out.println("Ending thread...");
                break;
            } else{
                JOptionPane.showMessageDialog(null, "Sequencia não é numérica!!");
            }
        }
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
