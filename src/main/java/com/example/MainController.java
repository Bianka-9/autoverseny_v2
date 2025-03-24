package com.example;

import java.util.ArrayList;

import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.ListView;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.util.Duration;

public class MainController {

    @FXML
    private Pane boardPane;

    @FXML
    private ListView<String> resultList;

    Timeline timeline;

    ArrayList<Car>carList = new ArrayList<>();
    final int TARGET = 538;

    @FXML
    void initialize(){
        System.out.println("Indul...");
        carList.add(new Car("kék", Color.BLUE, 120));
        carList.add(new Car("piros", Color.RED, 160));
        carList.add(new Car("zöld", Color.GREEN, 200));
        carList.add(new Car("lila", Color.VIOLET, 240));
        // Car car1 = new Car("kék", Color.BLUE, 120);
        // Car car2 = new Car("piros", Color.RED, 160);
        this.boardPane.getChildren().addAll(carList);

        this.timeline = new Timeline();
        timeline.setCycleCount(Timeline.INDEFINITE);
        KeyFrame frame = new KeyFrame(Duration.seconds(0.09),e->{
            for (Car car: carList){
                if(car.getLayoutX()+ car.getWidth()>TARGET){
                    if(!resultList.getItems().contains(car.name)){
                        resultList.getItems().add(car.name);
                    }    
                }
            

            if (car.getLayoutX()<538) {
                car.move();
            }
            
            
        }
        
        });
        
        timeline.getKeyFrames().add(frame);
    }

    @FXML
    void onClickBackButton(ActionEvent event) {
        for (Car car: carList){
            
                car.setScaleX(20);

            }
            this.timeline.stop();
            resultList.getItems().clear();
        }
        
        

    

    @FXML
    void onClickStartButton(ActionEvent event) {
        this.timeline.play();

    }

    @FXML
    void onClickStopButton(ActionEvent event) {
        this.timeline.pause();

    }

    @FXML
    void onClickPreviousButton(ActionEvent event) {
        App.setRoot("startScene");   
    }
}


