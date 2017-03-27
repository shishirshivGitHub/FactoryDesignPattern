package FactoryDesignPattern;

import FactoryDesignPattern.Factory.FoodFactory;
import FactoryDesignPattern.Interface.Food;

class FoodFactoryPattern{
	
	public static void main(String args[]){
		
		FoodFactory foodFactory = new FoodFactory();
		
		Food food1 = foodFactory.getFoodToEat("Dosa");
		
		food1.feed();
		
		Food food2 = foodFactory.getFoodToEat("Pullao");
		
		food2.feed();
			
	}
	
}