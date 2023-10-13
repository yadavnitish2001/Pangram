package com.pangram.java;

import java.util.Scanner;

public class PangramApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String str=sc.nextLine();
		Pangram p=new Pangram();
		p.checksPangram(str);
		
	}

}
