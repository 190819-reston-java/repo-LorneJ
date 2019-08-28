package myOopProject;

import java.io.Serializable;

public class Mammal extends Virus implements Inactive, Serializable {

	public Mammal(String name, String symptom, boolean infected) {
		super(name, symptom, infected);
		// TODO Auto-generated constructor stub
	}

	public Mammal(String name, String symptom) {
		super(name, symptom);
		// TODO Auto-generated constructor stub
	}

	public Mammal(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}

	public Mammal() {
		// TODO Auto-generated constructor stub
	}

	public void inactive() {
		// TODO Auto-generated method stub

	}

}
