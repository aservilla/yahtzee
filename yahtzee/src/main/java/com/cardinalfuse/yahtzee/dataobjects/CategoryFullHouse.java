package com.cardinalfuse.yahtzee.dataobjects;

import com.cardinalfuse.yahtzee.enums.DiceValue;

public class CategoryFullHouse extends Category {

	public int calculateScore() {
		int score = 0;
		if(hasPair() && hasThreeOfAKind()) {
			for (DiceValue dice : getRoll()) {
				score += dice.getValue();
			}
		}
		return score;
	}

	private boolean hasPair() {
		boolean valid = false;
		int[] counter = {0, 0, 0, 0, 0, 0};
		int cnt = 0;
		for (DiceValue dice : getRoll()) {
			cnt = counter[dice.getValue() - 1];
			cnt++;
			counter[dice.getValue() - 1] = cnt;
		}

		int numberOfPairs = 0;
		for(int i = 0; i < counter.length; i++) {
			if (counter[i] == 2) {
				numberOfPairs++;
			}
		}
		if (numberOfPairs >= 1) {
			valid = true;
		}
		return valid;
	}
	
	private boolean hasThreeOfAKind() {
		boolean valid = false;
		int[] counter = {0, 0, 0, 0, 0, 0};
		int cnt = 0;
		for (DiceValue dice : getRoll()) {
			cnt = counter[dice.getValue() - 1];
			cnt++;
			counter[dice.getValue() - 1] = cnt;
		}

		int numberOfPairs = 0;
		for(int i = 0; i < counter.length; i++) {
			if (counter[i] == 3) {
				numberOfPairs++;
			}
		}
		if (numberOfPairs >= 1) {
			valid = true;
		}
		return valid;
	}
	
}
