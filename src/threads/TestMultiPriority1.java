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
public class TestMultiPriority1 extends Thread{
    public void run(){
        System.out.println("Running thread name is: " + Thread.currentThread().getName());
        System.out.println("running thread priority is: " + Thread.currentThread().getPriority());
    }
    
    public static void main(String[] args) {
        TestMultiPriority1 m1 = new TestMultiPriority1();
        TestMultiPriority1 m2 = new TestMultiPriority1();
        m1.setPriority(Thread.MIN_PRIORITY);
        m1.setPriority(Thread.MAX_PRIORITY);
        m1.start();
        m2.start();
        
    }
}
