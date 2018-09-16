
public class Dog extends Animal{
	int legs = 4;
	String name = "void";
	
	Dog() {	}
	
	Dog (String name){
		name = this.name;
		
	}
	
	Dog (int legs){
		legs = this.legs;
		
	}

	Dog (int legs, String name){
		legs = this.legs;
		name = this.name;	
	}
	
	Dog (String name, int legs){
		legs = this.legs;
		name = this.name;	
	}
	
	
}
