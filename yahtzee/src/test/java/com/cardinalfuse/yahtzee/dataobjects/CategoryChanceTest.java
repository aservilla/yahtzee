package com.cardinalfuse.yahtzee.dataobjects;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

import com.cardinalfuse.yahtzee.enums.DiceValue;

import junit.framework.TestCase;

public class CategoryChanceTest extends TestCase {

	@Test
	public void testScore() {
		List<DiceValue> roll = new ArrayList<DiceValue>(5);
		roll.add(DiceValue.ONE);
		roll.add(DiceValue.TWO);
		roll.add(DiceValue.TWO);
		roll.add(DiceValue.SIX);
		roll.add(DiceValue.TWO);
		
		CategoryChance category = new CategoryChance();
		category.setRoll(roll);
		assertEquals(13, category.calculateScore());
	}
	
}
