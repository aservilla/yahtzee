package com.cardinalfuse.yahtzee.dataobjects;

import com.cardinalfuse.yahtzee.enums.DiceValue;

public class CategoryLargeStraight extends Category {

	public int calculateScore() {
		int score = 0;
		if (isStraight()) {
			score = 20;
		}
		return score;
	}
	
	private boolean isStraight() {
		boolean valid = false;
		int count2 = 0;
		int count3 = 0;
		int count4 = 0;
		int count5 = 0;
		int count6 = 0;
		
		for (DiceValue dice : getRoll()) {
			switch(dice.getValue()) {
			case 2:
				count2++;
				break;
			case 3:
				count3++;
				break;
			case 4:
				count4++;
				break;
			case 5:
				count5++;
				break;
			case 6:
				count6++;
				break;
			}
		}
		if (count2 >= 1 && 
				count3 >= 1 && 
				count4 >= 1 && 
				count5 >= 1 && 
				count6 >= 1) {
			valid = true;
		}
		
		return valid;
	}

}
