import java.util.Comparator;

public class Animal implements Comparator<Animal>{
	
	int legs;
	String name;
	
	public String toString(){
		return name + legs;
	}
	
	public String getName() {
		return name;
	}
	
	public int getLegs() {
		return legs;
	}

	@Override
	public int compare(Animal a, Animal b) {
		return a.legs - b.legs;
	}

	
}



