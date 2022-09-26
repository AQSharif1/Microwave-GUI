package org.oobook.microwavev2fx.states;

import org.oobook.microwavev2fx.timer.Timer;

public class ReadyState extends MicrowaveState{
	private static ReadyState instance;
	 private Timer timer;

	
	private ReadyState() {
		instance = this;
	}
	
	public static ReadyState getInstance() {
		if (instance == null) {
			instance = new ReadyState();
		}
		return instance;
	}
	
	@Override
	public void onReadyRequest() {
		timer.stop();
	}

	@Override
	public void enter() {
		MicrowaveContext.getInstance().showDoorOpened();
		
	}

	@Override
	public void leave() {
		MicrowaveContext.getInstance().showDoorClosed();
		
	}

}
