package FactoryDesignPattern;

import java.util.Scanner;

import FactoryDesignPattern.Factory.LogicalCodingFactory;
import FactoryDesignPattern.Interface.LogicalCoding;

public class LogicalCodingFactoryPattern{
	
	public static void main(String args[]){
		
		LogicalCodingFactory logCodFac = new LogicalCodingFactory();
		
		LogicalCoding logCoding = logCodFac.getLogicalCoding(takeInput());
		
		logCoding.getOutPut();
		
	}
	
	static String takeInput(){
		
		System.out.println("Choose the String to get the Output...!");

		System.out.println("LexicographOrder");
		
		Scanner takeInput = new Scanner(System.in);
		
	    return takeInput.nextLine();
		
	}
	
}