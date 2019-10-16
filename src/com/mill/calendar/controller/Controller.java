package com.mill.calendar.controller;

import javafx.fxml.FXML;
import javafx.scene.layout.Pane;

public class Controller {
	private @FXML Pane calendarPane;

	public Pane getCalendarPane() {
		return calendarPane;
	}

	public void setCalendarPane(Pane calendarPane) {
		this.calendarPane = calendarPane;
	}

}
