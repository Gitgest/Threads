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
public class TestJoinMethod3 extends Thread{
    public void run(){
        System.out.println("Running...");
    }
    public static void main(String[] args) {
        TestJoinMethod3 t1 = new TestJoinMethod3();
        TestJoinMethod3 t2 = new TestJoinMethod3();
        
        System.out.println("name of t1: " + t1.getName());
        System.out.println("nane of t2: " + t2.getName());
        System.out.println("id of t1: " + t1.getId());
        
        t1.start();
        t2.start();
        
        t1.setName("Sonoo Jaiswal");
        System.out.println("After changing name of t1: " + t1.getName());
    }
    
}
