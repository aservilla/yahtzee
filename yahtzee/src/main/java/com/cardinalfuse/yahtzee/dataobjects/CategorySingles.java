package com.cardinalfuse.yahtzee.dataobjects;

import com.cardinalfuse.yahtzee.enums.DiceValue;

public class CategorySingles extends Category {
	private DiceValue singleType;

	public CategorySingles(DiceValue singleType) {
		this.singleType = singleType;
	}
	
	public DiceValue getSingleType() {
		return singleType;
	}

	public void setSingleType(DiceValue singleType) {
		this.singleType = singleType;
	}

	public int calculateScore() {
		int score = 0;
		for (DiceValue dice : getRoll()) {
			if (singleType.equals(dice)) {
				score = score + dice.getValue();
			}
		}
		return score;
	}

}
