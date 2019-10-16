package com.mill.calendar;

import java.time.YearMonth;

import com.mill.calendar.controller.Controller;
import com.mill.calendar.view.FullCalendarView;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;;

public class FXMLMain extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("view/CalendarPane.fxml"));
        primaryStage.setTitle("Full Calendar FXML Example");
        primaryStage.setScene(new Scene(loader.load()));

        Controller controller = loader.getController();
        controller.getCalendarPane().getChildren().add(new FullCalendarView(YearMonth.now()).getView());
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
