package com.cardinalfuse.yahtzee.mappers;

import com.cardinalfuse.yahtzee.enums.CategoryType;

public class CategoryMapper {

	public static CategoryType getCategory(int type) {
		CategoryType catType = null;
		switch(type) {
		case 1:
			catType = CategoryType.ONES;
			break;
		case 2:
			catType = CategoryType.TWOS;
			break;
		case 3:
			catType = CategoryType.THREES;
			break;
		case 4:
			catType = CategoryType.FOURS;
			break;
		case 5:
			catType = CategoryType.FIVES;
			break;
		case 6:
			catType = CategoryType.SIXES;
			break;
		case 7:
			catType = CategoryType.PAIR;
			break;
		case 8:
			catType = CategoryType.TWO_PAIR;
			break;
		case 9:
			catType = CategoryType.THREE_OF_A_KIND;
			break;
		case 10:
			catType = CategoryType.FOUR_OF_A_KIND;
			break;
		case 11:
			catType = CategoryType.SMALL_STRAIGHT;
			break;
		case 12:
			catType = CategoryType.LARGE_STRAIGHT;
			break;
		case 13:
			catType = CategoryType.FULL_HOUSE;
			break;
		case 14:
			catType = CategoryType.YAHTZEE;
			break;
		case 15:
			catType = CategoryType.CHANCE;
			break;
		}
		return catType;
	}
}
