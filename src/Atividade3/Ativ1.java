package Atividade3;

public class Ativ1 implements Runnable {

    @Override
    public void run() {
        System.out.println("thread id: " + Thread.currentThread().getId());
        while (true) {
            try {
                long x = (long) (Math.random() * 9000);
                Thread.sleep(x);
                System.out.println(" After " + x + " seconds , I am here " + Thread.currentThread().getId());
                break;

            } catch (InterruptedException ex) {
                java.util.logging.Logger.getLogger(Ativ1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
            }
        }
    }
}
