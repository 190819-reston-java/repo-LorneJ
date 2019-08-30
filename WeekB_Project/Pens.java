package com.Revature.WeekB_Project;

public abstract class Pens {
	String color;
	String ink;
	Boolean fountain;
	int ounces;
	
	public Pens(String color, String ink, Boolean fountain, int ounces) 
	{
		super();
		this.color = color;
		this.ink = ink;
		this.fountain = fountain;
		this.ounces = ounces;
	}
	
	public Pens(String color, String ink, int ounces) 
	{
		this(color, ink, false, 1);
	}
	
	public Pens(String color, String ink) 
	{
		this(color, ink, false, 1);
	}
	
	public Pens(String color) 
	{
		this(color, "black");
	}
	
	public Pens() 
	{
		this("Yellow");
	}
	
	public abstract void tryWrite();
	
	public abstract void tryRefill();
	
	public abstract void tryWrite(Notes n);
	
	public abstract void tryRefill(Refill r);
		
	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getInk() {
		return ink;
	}

	public void setInk(String ink) {
		this.ink = ink;
	}

	public Boolean getFountain() {
		return fountain;
	}

	public void setFountain(Boolean fountain) {
		this.fountain = fountain;
	}
	
	public void setOunces(int ounces) 
	{
		if(ounces <= 0) 
		{
			throw new OuncesCantBeZero();
		}
		this.ounces = ounces;
	}
	
	public int getOunces() 
	{
		return ounces;
	}
	
	@Override
	public String toString() {
		return "Pens [color = " + color + ", ink = " + ink + ", fountain = " + fountain + " ounces = " + ounces + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((color == null) ? 0 : color.hashCode());
		result = prime * result + ((fountain == null) ? 0 : fountain.hashCode());
		result = prime * result + ((ink == null) ? 0 : ink.hashCode());
		result = prime * result + ounces;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Pens other = (Pens) obj;
		if (color == null) {
			if (other.color != null)
				return false;
		} else if (!color.equals(other.color))
			return false;
		if (fountain == null) {
			if (other.fountain != null)
				return false;
		} else if (!fountain.equals(other.fountain))
			return false;
		if (ink == null) {
			if (other.ink != null)
				return false;
		} else if (!ink.equals(other.ink))
			return false;
		if (ounces != other.ounces)
			return false;
		return true;
	}


	

}
