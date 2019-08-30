package com.Revature.WeekB_Project;
import java.util.ArrayList;
import java.util.Scanner;

import com.sun.tools.javac.util.List;

public class PenDriver extends CollectionsOfPens
{

	private static Scanner sc = new Scanner(System.in);
	private static ArrayList<FountainType> fountainList = new ArrayList<FountainType>();
	
	public static void main(String[] args) 
	{
		System.out.println(new BallPoint());
		
		System.out.println(new FountainType());
		
		System.out.println();
		
		System.out.println(new BallPoint("Cyan", "Sea Green", false, 0));
		System.out.println(new FountainType("Salmon", "Grape", true, 4));
		
		System.out.println();
		BallPoint a = new BallPoint();
		a.tryWrite();
		System.out.println("");
		a.tryRefill();
		System.out.println("");
		a.isThisFountain();
		System.out.println("");
		Notes n = new Notes();
		System.out.println("");
		Refill r = new Refill();
		System.out.println("");
		a.tryWrite(n);
		System.out.println("");
		a.tryRefill(r);
		System.out.println();
		System.out.println();
		
		FountainType b = new FountainType();
		b.tryWrite();
		System.out.println("");
		b.tryRefill();
		System.out.println("");
		b.isThisFountain();
		System.out.println("");
		b.tryWrite(n);
		System.out.println("");
		b.tryRefill(r);
		System.out.println();
		System.out.println();
		
		penCollection();
		
		menu();
	}
	
	private static void menu() 
	{
		System.out.println("");
		System.out.println("");
		System.out.println("Please make a selection: ");
		System.out.println("1. ErRoR, 2. eRoRor, 3. EXIT");
		System.out.println("");
		int userOption = sc.nextInt();
		switch(userOption) 
		{
		case 1:
			numberException() ;
			break;
		case 2:
			ToInfinity();
			break;
		case 3:
			System.exit(1);
			break;
		
			
		
		}
		menu();
	}
		
		private static void numberException() 
		{
			try{System.out.println("Enter a number:");
			int exampleNumber = sc.nextInt();
			
			fountainList.add(new FountainType("red", "blue", true, exampleNumber));
			}catch(OuncesCantBeZero e)
			{
				System.out.println("can't be zero && || negative");
				System.exit(1);
			}
		}
		
		private static void ToInfinity() 
		{
			try {
				System.out.println("enter a number");
				short negativeNumber = sc.nextShort();
				short x = negativeNumber;
				
					System.out.println("OVERLFOW");
					System.exit(1);
				}catch(Exception e) {System.out.println(e);}
		};
		
	
}
