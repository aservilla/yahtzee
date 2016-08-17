package com.cardinalfuse.yahtzee.mappers;

import org.junit.Test;

import com.cardinalfuse.yahtzee.enums.CategoryType;

import junit.framework.TestCase;

public class CategoryMapperTest extends TestCase {

	@Test
	public void test() {
		assertEquals(CategoryType.ONES, CategoryMapper.getCategory(1));
		assertEquals(CategoryType.TWOS, CategoryMapper.getCategory(2));
		assertEquals(CategoryType.THREES, CategoryMapper.getCategory(3));
		assertEquals(CategoryType.FOURS, CategoryMapper.getCategory(4));
		assertEquals(CategoryType.FIVES, CategoryMapper.getCategory(5));
		assertEquals(CategoryType.SIXES, CategoryMapper.getCategory(6));
		assertEquals(CategoryType.PAIR, CategoryMapper.getCategory(7));
		assertEquals(CategoryType.TWO_PAIR, CategoryMapper.getCategory(8));
		assertEquals(CategoryType.THREE_OF_A_KIND, CategoryMapper.getCategory(9));
		assertEquals(CategoryType.FOUR_OF_A_KIND, CategoryMapper.getCategory(10));
		assertEquals(CategoryType.SMALL_STRAIGHT, CategoryMapper.getCategory(11));
		assertEquals(CategoryType.LARGE_STRAIGHT, CategoryMapper.getCategory(12));
		assertEquals(CategoryType.FULL_HOUSE, CategoryMapper.getCategory(13));
		assertEquals(CategoryType.YAHTZEE, CategoryMapper.getCategory(14));
		assertEquals(CategoryType.CHANCE, CategoryMapper.getCategory(15));
	}
}	
