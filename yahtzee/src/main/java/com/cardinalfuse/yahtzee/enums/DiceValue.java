package com.cardinalfuse.yahtzee.enums;

public enum DiceValue {
	ONE(1), TWO(2), THREE(3), FOUR(4), FIVE(5), SIX(6);
	
	private int value;
	
	private DiceValue(int value) {
		this.value = value;
	}

	public int getValue() {
		return value;
	}

}