package com.singtel.assignment.butterfly;

import com.singtel.assignment.Animal;
import com.singtel.assignment.util.InsectState;

public class Butterfly extends Animal {
	private InsectState state;
	private Butterfly currentState;

	public Butterfly getCurrentState() {
		return currentState;
	}

	public void setCurrentState(Butterfly currentState) {
		this.currentState = currentState;
	}

	public Butterfly() {

	}

	public Butterfly(InsectState state) {
		this.setState(state);
		this.setCurrentState(new CatterpillarState());
	}

	public InsectState getState() {
		return state;
	}

	public void setState(InsectState state) {
		this.state = state;
	}

	public void transform() {
		this.setCurrentState(new ButterFlyState());
	}

}
