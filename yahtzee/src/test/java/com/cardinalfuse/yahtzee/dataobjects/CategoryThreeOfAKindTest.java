package com.cardinalfuse.yahtzee.dataobjects;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

import com.cardinalfuse.yahtzee.enums.DiceValue;

import junit.framework.TestCase;

public class CategoryThreeOfAKindTest extends TestCase {

	@Test
	public void testScore() {
		List<DiceValue> roll = new ArrayList<DiceValue>(5);
		roll.add(DiceValue.ONE);
		roll.add(DiceValue.THREE);
		roll.add(DiceValue.THREE);
		roll.add(DiceValue.THREE);
		roll.add(DiceValue.TWO);
		
		CategoryThreeOfAKind category = new CategoryThreeOfAKind();
		category.setRoll(roll);
		assertEquals(9, category.calculateScore());
	}
	
	@Test
	public void testScore0() {
		List<DiceValue> roll = new ArrayList<DiceValue>(5);
		roll.add(DiceValue.ONE);
		roll.add(DiceValue.SIX);
		roll.add(DiceValue.THREE);
		roll.add(DiceValue.THREE);
		roll.add(DiceValue.TWO);
		
		CategoryThreeOfAKind category = new CategoryThreeOfAKind();
		category.setRoll(roll);
		assertEquals(0, category.calculateScore());
	}
}