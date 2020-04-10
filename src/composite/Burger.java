package composite;

import lombok.Data;

@Data
public class Burger {
	private int price;
	private String desc;
	
	public Burger() {
		this(1500, "�⺻����");
	}
	
	
	public Burger(int price, String desc) {
		super();
		this.price = price;
		this.desc = desc;
		System.out.println(desc + "�� ����� �����ϴ�.");
		
		
	}
	
	
	
	
}
