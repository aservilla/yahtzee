package com.cardinalfuse.yahtzee.dataobjects;

import com.cardinalfuse.yahtzee.enums.DiceValue;

public class CategoryChance extends Category {

	public int calculateScore() {
		int score = 0;
		for (DiceValue dice : getRoll()) {
			score += dice.getValue();
		}
		return score;
	}

}
