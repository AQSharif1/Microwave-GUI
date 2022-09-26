package org.oobook.microwavev2fx.states;

import org.oobook.microwavev2fx.display.MicrowaveDisplay;

/**
 * 
 * @author Brahma Dathan and Sarnath Ramnath
 * @Copyright (c) 2010
 
 * Redistribution and use with or without
 * modification, are permitted provided that the following conditions
 * are met:
 *
 *   - the use is for academic purpose only
 *   - Redistributions of source code must retain the above copyright
 *     notice, this list of conditions and the following disclaimer.
 *   - Neither the name of Brahma Dathan or Sarnath Ramnath
 *     may be used to endorse or promote products derived
 *     from this software without specific prior written permission.
 *
 * The authors do not make any claims regarding the correctness of the code in this module
 * and are not responsible for any loss or damage resulting from its use.  
 */

/**
 * The context is an observer for the clock and stores the context info for
 * states
 *
 */
public class MicrowaveContext {
	private MicrowaveDisplay display;
	private MicrowaveState currentState;
	private static MicrowaveContext instance;

	/**
	 * Make it a singleton
	 */
	private MicrowaveContext() {
		instance = this;
		currentState = DoorClosedState.getInstance();
	}

	/**
	 * Return the instance
	 * 
	 * @return the object
	 */
	public static MicrowaveContext getInstance() {
		if (instance == null) {
			instance = new MicrowaveContext();
		}
		return instance;
	}

	/**
	 * The display could change. So we have to get its refrence.
	 * 
	 * @param display The current display object
	 */
	public void setDisplay(MicrowaveDisplay display) {
		this.display = display;
	}

	/**
	 * Lets door closed state be the starting state adds the object as an observable
	 * for clock
	 */
	public void initialize() {
		instance.changeState(DoorClosedState.getInstance());
	}

	/**
	 * Called from the states to change the current state
	 * 
	 * @param nextState the next state
	 */
	public void changeState(MicrowaveState nextState) {
		currentState.leave();
		currentState = nextState;
		currentState.enter();
	}
	
	public void onReadyRequest() {
		currentState.onReadyRequest();
	}

	public void onCookRequest() {
		currentState.onCookRequest();
	}

	/**
	 * Process door open request
	 */
	public void onDoorOpen() {
		currentState.onDoorOpen();
	}

	/**
	 * Process door close request
	 */
	public void onDoorClose() {
		currentState.onDoorClose();
	}

	/**
	 * This invokes the right method of the display. This helps protect the states
	 * from changes to the way the system utilizes the state changes.
	 * 
	 * @param time time left for cooking
	 */
	public void showTimeLeft(int time) {
		display.showTimeLeft(time);
	}

	/**
	 * This invokes the right method of the display. This helps protect the states
	 * from changes to the way the system utilizes the state changes.
	 * 
	 */
	public void showLightOn() {
		display.showLightOn();
	}

	/**
	 * This invokes the right method of the display. This helps protect the states
	 * from changes to the way the system utilizes the state changes.
	 * 
	 */
	public void showLightOff() {
		display.showLightOff();
	}

	/**
	 * This invokes the right method of the display. This helps protect the states
	 * from changes to the way the system utilizes the state changes.
	 * 
	 */
	public void showCooking() {
		display.showCooking();
	}

	/**
	 * This invokes the right method of the display. This helps protect the states
	 * from changes to the way the system utilizes the state changes.
	 * 
	 */
	public void showNotCooking() {
		display.showNotCooking();
	}

	/**
	 * This invokes the right method of the display. This helps protect the states
	 * from changes to the way the system utilizes the state changes.
	 * 
	 */
	public void showDoorOpened() {
		display.showDoorOpened();
	}

	/**
	 * This invokes the right method of the display. This helps protect the states
	 * from changes to the way the system utilizes the state changes.
	 * 
	 */
	public void showDoorClosed() {
		display.showDoorClosed();
	}
}