package com.Revature.WeekB_Project;
import java.util.ArrayList;
import java.util.List;
import java.util.SortedSet;
import java.util.TreeSet;

public class CollectionsOfPens 
{
	public static void main(String[] args) 
	{
		penCollection();
	}

	public static void penCollection() 
	{
		List<BallPoint> ballpointList = new ArrayList<BallPoint>();
		ballpointList.add(new BallPoint());
		ballpointList.add(new BallPoint("", "", false, 8 ));
		ballpointList.add(new BallPoint("", "", false, 3 ));
		ballpointList.add(new BallPoint("", "", false, 1 ));
		ballpointList.add(new BallPoint("", "", false, 7 ));
		ballpointList.add(new BallPoint("", "", false, 1 ));
		ballpointList.add(new BallPoint("", "", false, 2 ));
		
		List<FountainType> fountainList = new ArrayList<FountainType>();
		fountainList.add(new FountainType("blue", "blue",true, 3));
		fountainList.add(new FountainType("Grey", "red", true, 2));
		fountainList.add(new FountainType("black", "red", true, 6));
		fountainList.add(new FountainType("red", "pink" , true, 4));
		fountainList.add(new FountainType("orange", "indigo", true, 1));
		
		
		System.out.println(ballpointList);
		System.out.println("");
		System.out.println(fountainList);
		
		System.out.println("Sorting by Ounces");
		System.out.println("");
		System.out.println("Tree Sort, learning to branch out");
		
		
		
		SortedSet<FountainType> sortedFountainType = new TreeSet<FountainType>(fountainList);
		
		System.out.println(sortedFountainType);
		System.out.println("");
		System.out.println("Compare things but never people");
		System.out.println("");
		
		SortedSet<FountainType> weighedSortedFountainSet = new TreeSet<FountainType>(new InkCompare());
		
		System.out.println(weighedSortedFountainSet);
		
		
		
		
		
	}

}
