package org.oobook.microwavev2fx.buttons;

import org.oobook.microwavev2fx.states.MicrowaveContext;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;

/**
 * The button for cook request
 * 
 * @author Brahma Dathan
 *
 */
public class CookButton extends GUIButton implements EventHandler<ActionEvent> {
	/**
	 * The button for cooking
	 * 
	 * @param string
	 */
	public CookButton(String string) {
		super(string);
	}

	@Override
	public void handle(ActionEvent event) {
		MicrowaveContext.getInstance().onCookRequest();
	}
}