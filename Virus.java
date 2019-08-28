package myOopProject;

public abstract class Virus {

	private String name;
	private String symptom;
	private boolean infected;
	
	public Virus(String name, String symptom, boolean infected) 
	{
		super();
		this.name = name;
		this.symptom = symptom;
		this.infected = infected;
	}
	
	public Virus(String name, String symptom) 
	{
		this(name, symptom, true);
	}
	
	public Virus(String name) 
	{
		this(name, "coughing");
	}
	
	public Virus() 
	{
		this("Eve ");
	}
	
	public String getName()
	{
		return name;
	}
	
	public void setName(String name) 
	{
		this.name = name;
	}
	
	public String getSymptom()
	{
		return symptom;
	}
	
	public void setSymptom(String symptom)
	{
		this.symptom = symptom;
	}
	
	public boolean isInfected()
	{
		return infected;
	}
	
	public void setInfected(boolean infected)
	{
		this.infected = infected;
	}
	
	@Override
	public String toString()
	{
		return "Virus [name = " + name + ", symptom = " + symptom + ", infected = " + infected + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + (infected ? 1231 : 1237);
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + ((symptom == null) ? 0 : symptom.hashCode());
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
		Virus other = (Virus) obj;
		if (infected != other.infected)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (symptom == null) {
			if (other.symptom != null)
				return false;
		} else if (!symptom.equals(other.symptom))
			return false;
		return true;
	}

}
