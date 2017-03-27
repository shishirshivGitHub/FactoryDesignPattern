package FactoryDesignPattern.Concrete;

import java.util.Iterator;
import java.util.Scanner;
import java.util.SortedSet;
import java.util.TreeSet;

import FactoryDesignPattern.Interface.LogicalCoding;

public class LexicographOrder implements LogicalCoding{

	@Override
	public void getOutPut() {
		// TODO Auto-generated method stub
		System.out.println("Enter the String :");						
		logical(getString());
		
	}
	
	static String getString(){
				
		Scanner input = new Scanner(System.in);
		
		return input.nextLine();
		
	}
	
	static void logical(String str){
		
		SortedSet<String> takeInput = new TreeSet<String>();  // SortedSet is used sort the input in asceding order //
		
		for(int i=0;i<str.length()-3;i++){
			
			takeInput.add(str.substring(i,i+3));
			
		}
		
		Iterator<String> iterate = takeInput.iterator();
		
		while(iterate.hasNext()){
			
		System.out.println(iterate.next());
			
		}
		
	}

}