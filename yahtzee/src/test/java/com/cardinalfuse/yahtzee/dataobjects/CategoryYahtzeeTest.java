package com.cardinalfuse.yahtzee.dataobjects;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

import com.cardinalfuse.yahtzee.enums.DiceValue;

import junit.framework.TestCase;

public class CategoryYahtzeeTest extends TestCase {

	@Test
	public void testScore() {
		List<DiceValue> roll = new ArrayList<DiceValue>(5);
		roll.add(DiceValue.THREE);
		roll.add(DiceValue.THREE);
		roll.add(DiceValue.THREE);
		roll.add(DiceValue.THREE);
		roll.add(DiceValue.THREE);
		
		CategoryYahtzee category = new CategoryYahtzee();
		category.setRoll(roll);
		assertEquals(50, category.calculateScore());
	}
	
	@Test
	public void testScore0() {
		List<DiceValue> roll = new ArrayList<DiceValue>(5);
		roll.add(DiceValue.ONE);
		roll.add(DiceValue.ONE);
		roll.add(DiceValue.THREE);
		roll.add(DiceValue.THREE);
		roll.add(DiceValue.TWO);
		
		CategoryYahtzee category = new CategoryYahtzee();
		category.setRoll(roll);
		assertEquals(0, category.calculateScore());
	}
}
