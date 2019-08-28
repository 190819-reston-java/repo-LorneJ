package MainBug;

import java.util.ArrayList; //Import for Array List


public class VirusCollection extends ArrayList 
{
	
	
	
	public static void main(String[] args) 
	{
		ArrayList<Insect> insectList = new ArrayList<Insect>();
		insectList.add(new Insect("Malaria" , "fever"));
		insectList.add(new Insect("Yellow Fever" , "Loss of appetite"));
		
		System.out.println(insectList);
		
		ArrayList<Mammal> mammalList = new ArrayList<Mammal>();
		mammalList.add(new Mammal("Homo Homo Sapien" , "sneezing"));
		System.out.println(mammalList);
		
	}
}
