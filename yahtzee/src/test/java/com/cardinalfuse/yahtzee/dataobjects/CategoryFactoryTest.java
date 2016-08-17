package com.cardinalfuse.yahtzee.dataobjects;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

import com.cardinalfuse.yahtzee.enums.CategoryType;
import com.cardinalfuse.yahtzee.enums.DiceValue;

import junit.framework.TestCase;

public class CategoryFactoryTest extends TestCase {

	@Test
	public void testOnes() {
		List<DiceValue> roll = new ArrayList<DiceValue>(5);
		Category category = CategoryFactory.createCategory(CategoryType.ONES, roll);
		boolean actual = (category instanceof CategorySingles); 
		assertEquals(true, actual);

		DiceValue dice = ((CategorySingles) category).getSingleType();
		assertEquals(DiceValue.ONE, dice);
	}
	@Test
	public void testTwos() {
		List<DiceValue> roll = new ArrayList<DiceValue>(5);
		Category category = CategoryFactory.createCategory(CategoryType.TWOS, roll);
		boolean actual = (category instanceof CategorySingles); 
		assertEquals(true, actual);

		DiceValue dice = ((CategorySingles) category).getSingleType();
		assertEquals(DiceValue.TWO, dice);
	}
	@Test
	public void testThrees() {
		List<DiceValue> roll = new ArrayList<DiceValue>(5);
		Category category = CategoryFactory.createCategory(CategoryType.THREES, roll);
		boolean actual = (category instanceof CategorySingles); 
		assertEquals(true, actual);

		DiceValue dice = ((CategorySingles) category).getSingleType();
		assertEquals(DiceValue.THREE, dice);
	}
	@Test
	public void testFours() {
		List<DiceValue> roll = new ArrayList<DiceValue>(5);
		Category category = CategoryFactory.createCategory(CategoryType.FOURS, roll);
		boolean actual = (category instanceof CategorySingles); 
		assertEquals(true, actual);

		DiceValue dice = ((CategorySingles) category).getSingleType();
		assertEquals(DiceValue.FOUR, dice);
	}
	@Test
	public void testFives() {
		List<DiceValue> roll = new ArrayList<DiceValue>(5);
		Category category = CategoryFactory.createCategory(CategoryType.FIVES, roll);
		boolean actual = (category instanceof CategorySingles); 
		assertEquals(true, actual);

		DiceValue dice = ((CategorySingles) category).getSingleType();
		assertEquals(DiceValue.FIVE, dice);
	}
	@Test
	public void testSixes() {
		List<DiceValue> roll = new ArrayList<DiceValue>(5);
		Category category = CategoryFactory.createCategory(CategoryType.SIXES, roll);
		boolean actual = (category instanceof CategorySingles); 
		assertEquals(true, actual);

		DiceValue dice = ((CategorySingles) category).getSingleType();
		assertEquals(DiceValue.SIX, dice);
	}
	@Test
	public void testPair() {
		List<DiceValue> roll = new ArrayList<DiceValue>(5);
		Category category = CategoryFactory.createCategory(CategoryType.PAIR, roll);
		boolean actual = (category instanceof CategoryPair); 
		assertEquals(true, actual);
	}
	@Test
	public void testTwoPairs() {
		List<DiceValue> roll = new ArrayList<DiceValue>(5);
		Category category = CategoryFactory.createCategory(CategoryType.TWO_PAIR, roll);
		boolean actual = (category instanceof CategoryTwoPair); 
		assertEquals(true, actual);
	}
	@Test
	public void testThreeOfAKind() {
		List<DiceValue> roll = new ArrayList<DiceValue>(5);
		Category category = CategoryFactory.createCategory(CategoryType.THREE_OF_A_KIND, roll);
		boolean actual = (category instanceof CategoryThreeOfAKind); 
		assertEquals(true, actual);
	}
	@Test
	public void testFourOfAKind() {
		List<DiceValue> roll = new ArrayList<DiceValue>(5);
		Category category = CategoryFactory.createCategory(CategoryType.FOUR_OF_A_KIND, roll);
		boolean actual = (category instanceof CategoryFourOfAKind); 
		assertEquals(true, actual);
	}
	@Test
	public void testSmallStraight() {
		List<DiceValue> roll = new ArrayList<DiceValue>(5);
		Category category = CategoryFactory.createCategory(CategoryType.SMALL_STRAIGHT, roll);
		boolean actual = (category instanceof CategorySmallStraight); 
		assertEquals(true, actual);
	}
	@Test
	public void testLargeStraight() {
		List<DiceValue> roll = new ArrayList<DiceValue>(5);
		Category category = CategoryFactory.createCategory(CategoryType.LARGE_STRAIGHT, roll);
		boolean actual = (category instanceof CategoryLargeStraight); 
		assertEquals(true, actual);
	}
	@Test
	public void testFullHouse() {
		List<DiceValue> roll = new ArrayList<DiceValue>(5);
		Category category = CategoryFactory.createCategory(CategoryType.FULL_HOUSE, roll);
		boolean actual = (category instanceof CategoryFullHouse); 
		assertEquals(true, actual);
	}
	@Test
	public void testYahtzee() {
		List<DiceValue> roll = new ArrayList<DiceValue>(5);
		Category category = CategoryFactory.createCategory(CategoryType.YAHTZEE, roll);
		boolean actual = (category instanceof CategoryYahtzee); 
		assertEquals(true, actual);
	}
	@Test
	public void testChance() {
		List<DiceValue> roll = new ArrayList<DiceValue>(5);
		Category category = CategoryFactory.createCategory(CategoryType.CHANCE, roll);
		boolean actual = (category instanceof CategoryChance); 
		assertEquals(true, actual);
	}
	
}