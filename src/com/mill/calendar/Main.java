package com.mill.calendar;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.time.YearMonth;

import com.mill.calendar.view.FullCalendarView;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception {
        primaryStage.setTitle("Full Calendar Example");
        primaryStage.setScene(new Scene(new FullCalendarView(YearMonth.now()).getView()));
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
