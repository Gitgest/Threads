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
public class TestDaemonThread1 extends Thread{
    public void run(){
        if (Thread.currentThread().isDaemon()) {
            System.out.println("Daemon thread work");
        }
        else{
            System.out.println("user thread work");
        }
    }
    
    public static void main(String[] args) {
        TestDaemonThread1 t1 = new TestDaemonThread1();
        TestDaemonThread1 t2 = new TestDaemonThread1();
        TestDaemonThread1 t3 = new TestDaemonThread1();
        
        t1.setDaemon(true);
        
        t1.start();
        t2.start();
        t3.start();
    }
}
