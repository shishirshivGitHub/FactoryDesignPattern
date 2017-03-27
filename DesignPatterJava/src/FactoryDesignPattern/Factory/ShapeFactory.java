package FactoryDesignPattern.Factory;

import FactoryDesignPattern.Concrete.Circle;
import FactoryDesignPattern.Concrete.Rectange;
import FactoryDesignPattern.Interface.Shape;

public class ShapeFactory{
	
	public Shape getShape(String shapeType){
		
		if(shapeType == null){
			return null;
		}
		if(shapeType.equalsIgnoreCase("Circle")){
			
			return new Circle();
		}else if(shapeType.equalsIgnoreCase("Rectangle")){
			
			return new Rectange();
		}
		
		
		return null;
		
	}
	
}