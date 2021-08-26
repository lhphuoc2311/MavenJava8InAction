package com.cgmouse.j8inaction.chap2;

public class ExecutingBlockCodeWithRunnable {

    

    public static void main(String[] args) {

        //using anonymous class containing a run method
        Thread t = new Thread(new Runnable(){

            @Override
            public void run() {
                System.out.println("Hello World");                
            }
            
        });
        t.run();
        
    }

    
}
