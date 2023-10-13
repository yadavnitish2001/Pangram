package com.pangram.java;

public class Pangram {
	public void checksPangram(String str) {

		//remove duplicate from a string
		String newStr="";
		for (int i = 0; i < str.length();i++) {
			if(! newStr.contains(str.charAt(i)+"")) {
				newStr+=str.charAt(i)+"";
			}
		}
		//converting string to lowerCase 
		newStr.toLowerCase();
		//converting new String into char type array
		char arr[]=newStr.toCharArray();
		//checks count of alphabets in a string 
		int count=0;
		for (int i = 0; i < arr.length; i++) {
			if(newStr.charAt(i)>='a' && newStr.charAt(i)<='z' ) {
				count++;
			}	
		}
		//if count=26 then string contains all the alphabets,hence it is pangram
		if(count==26) {
			System.out.println("String is a Pangram");
		}else {
			System.out.println("String is not a Pangram");
		}


	}
}
