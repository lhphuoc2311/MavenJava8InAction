package com.cgmouse.j8inaction.chap2;

public class ExecutingBlockCodeWithRunnable {

    

    public static void main(String[] args) {

        //using anonymous class containing a run method
        //using interface Runnable to represent a block code to be executed
        Thread t = new Thread(new Runnable(){

            @Override
            public void run() {
                System.out.println("Hello World");                
            }
            
        });
        t.run();

        
        //using lambda expression in Java 8
        Thread t1 = new Thread(() -> System.out.println("Hello World"));
        t1.run();

    }

    
}
