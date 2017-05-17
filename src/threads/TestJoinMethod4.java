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
public class TestJoinMethod4 extends Thread{
    public void run(){
        //currentThread()returns a reference to the currently running thread.
        System.out.println(Thread.currentThread().getName());
    }
    
    public static void main(String[] args) {
        TestJoinMethod4 t1 = new TestJoinMethod4();
        TestJoinMethod4 t2 = new TestJoinMethod4();
        
        t1.start();
        t2.start();
    }
}
