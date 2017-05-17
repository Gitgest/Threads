/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package threads;

/**
 *
 * @author Ejer
 */
public class TestThreadTwice1 extends Thread {
    public void run(){
        System.out.println("Running...");
    }
    
    public static void main(String args[]){
        TestThreadTwice1 t1 = new TestThreadTwice1();
        
        // Should give a IllegalThreadStateException
        t1.start();
        t1.start();
        // It does.
    }
}
