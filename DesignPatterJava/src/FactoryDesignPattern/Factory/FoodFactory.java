package FactoryDesignPattern.Factory;

import FactoryDesignPattern.Concrete.Dosa;
import FactoryDesignPattern.Concrete.Pullao;
import FactoryDesignPattern.Interface.Food;

public class FoodFactory{
	
	public Food getFoodToEat(String foodType){   
		
		if(foodType == null)
		   return null;
		
		if(foodType.equalsIgnoreCase("Dosa")){
			
			return new Dosa();
		}
		
		if(foodType.equalsIgnoreCase("Pullao")){
			
			return new Pullao();
		}
		
		return null;
		
	}
}