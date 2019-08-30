package com.Revature.WeekB_Project;

public class OuncesCantBeZero extends RuntimeException 
{
	public OuncesCantBeZero() 
	{
		this("A pen can't have zero ounces");
	}
	
	public OuncesCantBeZero(String message) 
	{
		super(message);
	}
}
