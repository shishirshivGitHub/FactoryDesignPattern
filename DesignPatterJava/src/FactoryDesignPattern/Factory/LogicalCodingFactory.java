package FactoryDesignPattern.Factory;

import FactoryDesignPattern.Concrete.LexicographOrder;
import FactoryDesignPattern.Interface.LogicalCoding;

public class LogicalCodingFactory{
	
	public LogicalCoding getLogicalCoding(String concepts){
				
		if(concepts == null)
			return null;
		
		if(concepts.equalsIgnoreCase("LexicographOrder")){
									
			return new LexicographOrder();
			
		}
		
		return new LexicographOrder();
		
	}
	
}