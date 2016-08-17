package com.cardinalfuse.yahtzee.dataobjects;

import com.cardinalfuse.yahtzee.enums.DiceValue;

public class CategoryYahtzee extends Category {

	public int calculateScore() {
		int score = 0;
		int count1 = 0;
		int count2 = 0;
		int count3 = 0;
		int count4 = 0;
		int count5 = 0;
		int count6 = 0;
		
		for (DiceValue dice : getRoll()) {
			switch(dice.getValue()) {
			case 1:
				count1++;
				break;
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
		
		if (count1 == 5 ||
				count2 == 5 ||
				count3 == 5 ||
				count4 == 5 ||
				count5 == 5 ||
				count5 == 5) {
			score = 50;
		}
		return score;
	}

}
