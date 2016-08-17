package com.cardinalfuse.yahtzee;

import java.util.ArrayList;
import java.util.List;

import com.cardinalfuse.yahtzee.dataobjects.Category;
import com.cardinalfuse.yahtzee.dataobjects.CategoryFactory;
import com.cardinalfuse.yahtzee.enums.CategoryType;
import com.cardinalfuse.yahtzee.enums.DiceValue;
import com.cardinalfuse.yahtzee.mappers.CategoryMapper;
import com.cardinalfuse.yahtzee.mappers.DiceValueMapper;

public class YahtzeeGame {
    public static void main( String[] args )
    {
    	try {
        	if (args.length < 6) {
        		System.out.println("Invalid number of arguments");
        	} else {
        		int type = new Integer(args[0]);
        		CategoryType catType = CategoryMapper.getCategory(type);

        		List<DiceValue> roll = populateRoll(args);
        		
        		Category category = CategoryFactory.createCategory(catType, roll);
        		int score = category.calculateScore();
        		
        		System.out.println("The score is: " + score + " points.");
        	}
    	} catch (Exception e) {
    		System.out.println("Error occurred: " + e.getMessage());
    	}
    }
    
    public static List<DiceValue> populateRoll(String[] args) {
		List<DiceValue> roll = new ArrayList<DiceValue>(5);
		int roll1 = new Integer(args[1]);
		int roll2 = new Integer(args[2]);
		int roll3 = new Integer(args[3]);
		int roll4 = new Integer(args[4]);
		int roll5 = new Integer(args[5]);
		roll.add(DiceValueMapper.getDiceValue(roll1));
		roll.add(DiceValueMapper.getDiceValue(roll2));
		roll.add(DiceValueMapper.getDiceValue(roll3));
		roll.add(DiceValueMapper.getDiceValue(roll4));
		roll.add(DiceValueMapper.getDiceValue(roll5));
		return roll;
    }
}
