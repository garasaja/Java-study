package composite;

public class LotteriaApp extends BigBurgerSet{

	public static void main(String[] args) {
		BigBurgerSet set1 = new BigBurgerSet();
		System.out.println("----------------------------------------");
		Burger burger1 = new Burger();
		System.out.println("----------------------------------------");
		Coke coke1 = new Coke();
		System.out.println("----------------------------------------");
		BigBurgerSet set2 = new BigBurgerSet
				(
						new BigBurger(3000,"���������"),
						new Coke() , 
						new FrenchFried()
						);
		System.out.println("----------------------------------------");
		System.out.println(set1.getBigBurger().getPrice());
		System.out.println("����ż�Ʈ ���� "+set2.getBigBurger().getPrice());
		System.out.println("----------------------------------------");
		BigBurgerSet set3 = new BigBurgerSet
				(
						new BigBurger(2000,"���������")					
				);
		System.out.println(set3.getBigBurger().getPrice());
		System.out.println("----------------------------------------");
		ShrimpBurgerSet set4 = new ShrimpBurgerSet();
		System.out.println("������ż�Ʈ ���� " + set4.getShrimpBurger().getPrice());
	}
}
