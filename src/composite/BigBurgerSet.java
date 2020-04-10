package composite;

import lombok.Data;

@Data
//자바는 다중상속이 안됨
public class BigBurgerSet {
	private BigBurger bigBurger;
	private Coke coke;
	private FrenchFried frenchFried;
	
	
	public BigBurgerSet() {
		this(
			new BigBurger(),	
			new Coke(),
			new FrenchFried()
			);
	}
	
	public BigBurgerSet(BigBurger bigBurger) {
		this.bigBurger = bigBurger;
		
	}
	
	public BigBurgerSet(BigBurger bigBurger, Coke coke, FrenchFried frenchFried) {
		super();
		this.bigBurger = bigBurger;
		this.coke = coke;
		this.frenchFried = frenchFried;
	}
	
	
}
