package org.oobook.microwavev2fx.start;

import org.oobook.microwavev2fx.display.GUIDisplay;
import org.oobook.microwavev2fx.timer.Clock;

import javafx.application.Application;

public class Main {
	public static void main(String[] args) {
		Clock.getInstance();
		new Thread() {
			@Override
			public void run() {
				Application.launch(GUIDisplay.class, null);
			}
		}.start();
	}
}
