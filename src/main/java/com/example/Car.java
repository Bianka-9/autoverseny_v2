package com.example;

import java.util.Random;

import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Text;



public class Car extends StackPane {
    String name;
    Color color;
    Random ran = new Random();
    Text text = new Text();
    Rectangle rec = new Rectangle(50, 30);


    public Car (String name, Color color, int y){
        this.name = name;
        this.rec.setFill(color);
        
        this.text.setText(name);

        if (color.getHue()>200){
            text.setFill(Color.WHITE);
        }else{
            text.setFill(Color.BLACK);
        }



        this.getChildren().addAll(rec, text);

        this.setLayoutX(20);
        this.setLayoutY(y);


    }

    public void move(){
        double x = this.getLayoutX() + ran.nextInt(8);
        this.setLayoutX(x);
    }
}
