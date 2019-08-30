package com.Revature.WeekB_Project;

import java.io.Serializable;

public class BallPoint extends Pens implements IsFountain, Serializable
{

	public BallPoint(String color, String ink, boolean fountain, int ounces) 
	{
		super(color, ink, fountain, 2);
	}
	
	public BallPoint(String color, String ink) 
	{
		super(color, ink, false, 2);
	}
	
	public BallPoint(String color) 
	{
		super(color, "Black");
	}
	public BallPoint() 
	{
		super("blue");
	}
	
	public void isThisFountain() 
	{
		System.out.println("This " + this.getColor() + " ballpoint is not a fountain pen");
	}
	
	@Override
	public void tryWrite() 
	{
		System.out.println("can't write without thought");
		System.out.println("Have you tried doodling?");
	}
	
	public void tryWrite(Notes n)
	{
		System.out.println(this.getColor() + " doesn't write until you apply pressre");
		
		try { Thread.sleep(4000);}catch(InterruptedException e)
		{
			e.printStackTrace();
			}
		System.out.println("You put too much pressure on the pen, it rips through the paper");
	}
	
	@Override
	public void tryRefill() 
	{
		System.out.println("Can't refill without cartridge");
		System.out.println("Check manufactor directions");
	}
	
	public void tryRefill(Refill r) 
	{
		System.out.println("Throw away and get a fountain pen");
		System.out.println("Think of the ENVIRONMENT");
	}
}
