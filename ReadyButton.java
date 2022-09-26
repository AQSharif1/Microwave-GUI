package org.oobook.microwavev2fx.buttons;

import org.oobook.microwavev2fx.states.MicrowaveContext;

import javafx.event.ActionEvent;

public class ReadyButton extends GUIButton {
	
	public ReadyButton(String string) {
		super(string);
	}

	@Override
	public void handle(ActionEvent arg0) {
		MicrowaveContext.getInstance().onReadyRequest();
		
	}

}
