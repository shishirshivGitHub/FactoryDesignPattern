package FactoryDesignPattern;

import FactoryDesignPattern.Factory.ShapeFactory;
import FactoryDesignPattern.Interface.Shape;

class ShapeFactoryPattern{
	
	public static void main(String args[]){
		
		ShapeFactory shapeFactory = new ShapeFactory();
		
		Shape shape1 = shapeFactory.getShape("Circle");
		
		shape1.draw();
		
		Shape shape2 = shapeFactory.getShape("Rectangle");
		
		shape2.draw();
		
	}
	
}