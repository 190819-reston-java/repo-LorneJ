package myOopProject;

import java.io.Serializable;

public class Insect extends Virus implements Inactive, Serializable {

	public Insect(String name, String symptom, boolean infected) {
		super(name, symptom, infected);
		// TODO Auto-generated constructor stub
	}

	public Insect(String name, String symptom) {
		super(name, symptom);
		// TODO Auto-generated constructor stub
	}

	public Insect(String name) {
		super(name, "biting");
		// TODO Auto-generated constructor stub
	}

	public Insect() {
		// TODO Auto-generated constructor stub
	}

	public void inactive() {
		// TODO Auto-generated method stub

	}

}
