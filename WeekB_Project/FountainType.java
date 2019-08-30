package com.Revature.WeekB_Project;

import java.io.Serializable;

public class FountainType extends Pens implements IsFountain, Serializable, Comparable<FountainType>
{
	
	
	public FountainType(String color, String ink, Boolean fountain, int ounces)
	{
		super(color, ink, true, ounces);
	}

	public FountainType(String color, String ink) 
	{
		super(color, ink);
		
	}

	public FountainType(String color) 
	{
		super(color, "Green", true, 1);
	}

	public FountainType() {
		super("Indigo");
	}
	
	public void isThisFountain() 
	{
		System.out.println("This " + this.getColor() + " pen is a fountain pen");
	}
	
	@Override
	public void tryWrite() 
	{
		System.out.println("can't write without thought");
		System.out.println("Have you tried doodling?");
	}
	
	public void tryWrite(Notes n)
	{
		System.out.println(this.getColor() + " doesn't write until you apply presure");
		
		try { Thread.sleep(3000);}catch(InterruptedException e)
		{
			e.printStackTrace();
			}
		System.out.println("You put too much pressure on the pen, ink soaks the paper, roll a d12");
	}
	
	@Override
	public void tryRefill() 
	{
		System.out.println("Can't refill without cartridge");
		System.out.println("Check manufactor directions");
	}
	
	public void tryRefill(Refill r) 
	{
		System.out.println("Remove cartridge and refill");
	}
	
	public int compareTo(FountainType o) 
	{	
		return this.getInk().compareTo(o.getInk());
	}
}
