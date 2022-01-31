
/*Question 1
Write a program of Balancing Brackets, use a suitable data structure to print whether the string 
entered is a Balanced Brackets or Unbalanced String*/

package com.greatlearning.dsa3;

import java.util.Scanner;
import java.util.Stack;

public class BalancingBrackets{
	
	 static boolean checkingBalancedBrackets(String bracketExpression) {
			
			boolean result = false;
			Stack<Character> stack  = new Stack<Character>();
			
			for(int i = 0; i < bracketExpression.length(); i++) {
				
			
				char character = bracketExpression.charAt(i);
				
				if (character == '(' || character == '[' || character == '{') {
					stack.push(character);
					continue;
				}
				if (stack.isEmpty()) {
					return false;
				}
				char c;
				switch (character) {
				case '}':{
					c = stack.pop();
					if (c == '(' || c == '[') {
						return false;
					}
						break;
				}
				
				case ')':{
					c = stack.pop();
					if (c == '[' || c == '{') {
						return false;
					}
						break;
				}
				case ']':{
					c = stack.pop();
					if (c == '(' || c == '{') {
						return false;
					}break;
				  }
				}
						
				
				}
			return stack.isEmpty();	
	 }
		
		public static void main(String[] args) {
			String bracketExpression;
			Scanner sc=new Scanner(System.in);
			System.out.println(" Enter string is containing brackets");
			bracketExpression=sc.nextLine();
			// String bracketExpression = "[{()}]";
			
		   boolean result;
		   
		result = checkingBalancedBrackets(bracketExpression);
	     if(result) {
	    	 System.out.println(" Entered string is containing balanced brackets");
	     }else {
	    	 System.out.println(" Entered string does not contain balanced brackets");
	    	 
	        }
		

		   }
		}
	