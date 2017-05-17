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
public class TestMultiNaming2 extends Thread{
    public void run(){
        System.out.println(Thread.currentThread().getName());
    }
    
    public static void main(String[] args) {
        TestMultiNaming2 t1 = new TestMultiNaming2();
        TestMultiNaming2 t2 = new TestMultiNaming2();
        
        t1.start();
        t2.start();
    }
}
