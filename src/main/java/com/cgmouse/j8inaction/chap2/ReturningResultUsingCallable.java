package com.cgmouse.j8inaction.chap2;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class ReturningResultUsingCallable {
    public static void main(String[] args) throws InterruptedException, ExecutionException {

        ExecutorService executorService = Executors.newCachedThreadPool();

       Future<String> future =  executorService.submit(new Callable<String>(){

            @Override
            public String call() throws Exception {
                return Thread.currentThread().getName();
            }
            
        });

        executorService.shutdown();

        System.out.println(future.get());
        
    }
    
}
