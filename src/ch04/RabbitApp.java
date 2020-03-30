package ch04;

class Rabbit {
	private String name;
	private int power;
	
	public Rabbit(String name, int power) {		
		this.name = name;
		this.power = power;
	}
	boolean drink() {			
		if(power ==100) 
		{
			return false;
		}		
			power++;
			return true;				
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getPower() {
		return power;
	}
	public void setPower(int power) {
		this.power = power;
	}			
}

public class RabbitApp {

	public static void main(String[] args) {
		Rabbit r1 = new Rabbit("≈‰≥¢",20);
		while(r1.drink()) {}
		System.out.println(r1.getPower());
		r1.setName("ªÍ≈‰≥¢");
		System.out.println(r1.getName());	
	}
}
