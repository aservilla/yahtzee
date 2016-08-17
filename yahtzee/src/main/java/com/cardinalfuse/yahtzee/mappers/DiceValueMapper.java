package com.cardinalfuse.yahtzee.mappers;

import com.cardinalfuse.yahtzee.enums.DiceValue;

public class DiceValueMapper {

	public static DiceValue getDiceValue(int dice) {
		DiceValue diceValue = null;
		switch(dice) {
		case 1:
			diceValue = DiceValue.ONE;
			break;
		case 2:
			diceValue = DiceValue.TWO;
			break;
		case 3:
			diceValue = DiceValue.THREE;
			break;
		case 4:
			diceValue = DiceValue.FOUR;
			break;
		case 5:
			diceValue = DiceValue.FIVE;
			break;
		case 6:
			diceValue = DiceValue.SIX;
			break;
		}
		return diceValue;
	}
}
