package Atividade3;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Ativ2 implements Runnable {

    @Override
    public void run() {
        FileReader arq;
        BufferedReader lerArq = null;
        try {
            arq = new FileReader("src/Resources/frases.txt");
            lerArq = new BufferedReader(arq);
            while (lerArq.readLine() != null) {
                System.out.println(lerArq.readLine());
                Thread.sleep(10000);
            }
        } catch (FileNotFoundException ex) {
            java.util.logging.Logger.getLogger(Ativ2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IOException ex) {
            java.util.logging.Logger.getLogger(Ativ2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InterruptedException ex) {
            java.util.logging.Logger.getLogger(Ativ2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
    }

}
