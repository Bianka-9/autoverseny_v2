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
    Rectangle rec = new Rectangle(50, 30);


    public Car (String name, Color color, int y){
        this.name = name;
        this.rec.setFill(color);
        
        this.text.setText(name);
        this.rec.setY(0);
        this.rec.setX(0); //20 volt eredetileg
        this.getChildren().add(rec);

        this.setLayoutX(20);
        this.setLayoutY(y);


        this.setHeight(30);
        this.setWidth(50);

    }

    public void move(){
        double x = this.getLayoutX() + ran.nextInt(8);
        this.setLayoutX(x);
    }
}
