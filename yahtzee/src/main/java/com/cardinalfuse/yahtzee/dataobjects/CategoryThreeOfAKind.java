package com.cardinalfuse.yahtzee.dataobjects;

import com.cardinalfuse.yahtzee.enums.DiceValue;

public class CategoryThreeOfAKind extends Category {

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
		
		if (count6 >= 3) {
			score = count6 * DiceValue.SIX.getValue();
		} else if (count5 >= 3) {
			score = count5 * DiceValue.FIVE.getValue();
		} else if (count4 >= 3) {
			score = count4 * DiceValue.FOUR.getValue();
		} else if (count3 >= 3) {
			score = count3 * DiceValue.THREE.getValue();
		} else if (count2 >= 3) {
			score = count2 * DiceValue.TWO.getValue();
		} else if (count1 >= 3) {
			score = count1 * DiceValue.ONE.getValue();
		}
		return score;
	}

}
