package ch13;

interface Dog {
	void sound();
}



/*class Test implements Dog {
	public void sound() {
		
	}
}*/

public class AnomyEx02 {

	static void start(Dog d) {
		d.sound();
	}
	
	public static void main(String[] args) {
		Dog d = new Dog() {
			
			@Override
			public void sound() {
				System.out.println("¸Û¸Û");
				
			}
		};
		
		start(d);
		
		
		
		/*new Dog() {
			
			@Override
			public void sound() {
				System.out.println("¿Ð¿Ð");
				
			}
		};*/
		
	}

}
