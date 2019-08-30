package com.Revature.WeekB_Project;
import java.util.Comparator;

public class InkCompare implements Comparator<FountainType>
{
	public int compare(FountainType o1, FountainType o2) 
	{
		int out = 0;
		int inkPaletteOne = o1.getOunces();
		int inkPaletteTwo = o2.getOunces();
		out = (int) (inkPaletteOne - inkPaletteTwo);
		if(out == 0) 
		{
			out = o1.compareTo(o2);
		}
		
		return out;
	}
}
