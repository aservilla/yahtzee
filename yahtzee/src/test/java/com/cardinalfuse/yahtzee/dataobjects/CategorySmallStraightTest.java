package com.cardinalfuse.yahtzee.dataobjects;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

import com.cardinalfuse.yahtzee.enums.DiceValue;

import junit.framework.TestCase;

public class CategorySmallStraightTest extends TestCase {

	@Test
	public void testScore() {
		List<DiceValue> roll = new ArrayList<DiceValue>(5);
		roll.add(DiceValue.ONE);
		roll.add(DiceValue.TWO);
		roll.add(DiceValue.THREE);
		roll.add(DiceValue.FOUR);
		roll.add(DiceValue.FIVE);
		
		CategorySmallStraight category = new CategorySmallStraight();
		category.setRoll(roll);
		assertEquals(15, category.calculateScore());
	}
	
	@Test
	public void testScore0() {
		List<DiceValue> roll = new ArrayList<DiceValue>(5);
		roll.add(DiceValue.ONE);
		roll.add(DiceValue.TWO);
		roll.add(DiceValue.THREE);
		roll.add(DiceValue.FOUR);
		roll.add(DiceValue.SIX);
		
		CategoryPair category = new CategoryPair();
		category.setRoll(roll);
		assertEquals(0, category.calculateScore());
	}
}
