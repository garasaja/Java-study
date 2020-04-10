package coffeeshop;

import lombok.Data;

@Data
//책임 : 커피생성
public class Coffee {
	private String name;
	private int price;
	
	public Coffee(MenuItem menuItem) {
		this.name = menuItem.getName();
		this.price = menuItem.getPrice();
	}
}
