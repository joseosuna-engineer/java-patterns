
package org.study.example.thread;

import java.util.logging.Level;
import java.util.logging.Logger;


public class MyThread extends Thread{

    @Override
    public void run() {
        try {
            System.out.println("Ejecutando Hilo");
            sleep(3000);
        } catch (InterruptedException ex) {
            Logger.getLogger(MyThread.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    
}
