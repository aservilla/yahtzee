package com.cardinalfuse.yahtzee.dataobjects;

import java.util.List;

import com.cardinalfuse.yahtzee.enums.DiceValue;

public abstract class Category {
	List<DiceValue> roll;
	
	public List<DiceValue> getRoll() {
		return roll;
	}

	public void setRoll(List<DiceValue> roll) {
		this.roll = roll;
	}

	public abstract int calculateScore();
}
