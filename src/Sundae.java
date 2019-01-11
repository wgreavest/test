
interface Sundae{
	ISundae (Topping topping, Scoop flavor){
	  this.topping = topping;
	  this.flavor = flavor;
	}
}

public class Topping implements Sundae{
	Sundae sundae;
	String topping;
	
}

public class Scoop implements Sundae{
	String flavor;
	
	Scoop(String flavor){
		this.flavor=flavor;
	}
}

new topping( (new topping ( (new topping()  )), "whipped cream")