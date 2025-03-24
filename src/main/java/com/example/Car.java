package com.example;

import java.util.Random;

import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Text;


//Rectangle
public class Car extends StackPane {
    String name;
    Color color;
    Random ran = new Random(); //kocsiknak a sebességének a változtatásához kell majd
    Text text = new Text();
    Rectangle rec = new Rectangle();


    public Car (String name, Color color, int y){
        this.name = name;
        this.setFill(color);
        
        this.text.setText(name);
        this.setY(y);
        this.setX(20);
        this.setHeight(30);
        this.setWidth(50);

    }

    public void move(){
        double x = this.getX() + ran.nextInt(8);
        this.setX(x);
    }
}
