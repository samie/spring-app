package org.vaadin.example.springapp;

import com.vaadin.flow.component.html.Div;
import com.vaadin.flow.component.ClickEvent;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.notification.Notification;
import com.vaadin.flow.router.Route;

@Route("/")
public class HelloWorld  extends Div {

    public HelloWorld() {
        add(new Button("Click to say hello", this::sayHello));
    }

    public void sayHello(ClickEvent<Button> e) {
        Notification.show("Hello stranger");        
    }
}
