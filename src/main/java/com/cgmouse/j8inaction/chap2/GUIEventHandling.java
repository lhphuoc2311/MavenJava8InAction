package com.cgmouse.j8inaction.chap2;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.control.Button;

public class GUIEventHandling {
    public static void main(String[] args) {

        //Using anonymous class
        Button button = new Button("Send");

        button.setOnAction(new EventHandler<ActionEvent>(){

            @Override
            public void handle(ActionEvent event) {
                System.out.println("Hello World");
            }
            
        });

        //using lambda expression
        button.setOnAction((arg0)-> System.out.println("Hello World"));
       

        
    }
    
}
