package org.oobook.microwavev2fx.states;

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
 * Super class for all states
 * 
 *
 */
public abstract class MicrowaveState {

  /**
   * Initializes the state
   */
  public abstract void enter();

  /**
   * Performs any necessary clean up while leaving the state
   */
  public abstract void leave();

  /**
   * Specifies the actions to be taken when the Cook button is pressed.
   */
  public void onCookRequest() {

  }
  
  public void onReadyRequest() {
	  
  }

  /**
   * Process door open request
   */
  public void onDoorOpen() {

  }

  /**
   * Process door close request
   */
  public void onDoorClose() {

  }

  /**
   * Process clock tick Generates the timer runs out event
   */
  public void onTimerTick(int timerValue) {

  }

  /**
   * Process clock ticks Generates the timer runs out event
   */
  public void onTimerRunsOut() {

  }

}