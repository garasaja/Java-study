package coffeeshop1;

public class Customer {
	
	public void �ֹ� (String menuName, Menu menu , Barista barista) {
		
		MenuItem menuItem = menu.�޴�����(menuName);
		
		if(menuItem == null) {
			System.out.println(menuName + "�� �츮 Ŀ�Ǽ� �����ϴ�.");
		}
		else {
			Coffee coffee = barista.Ŀ�ǻ���(menuItem);
			System.out.println("Ŀ�� ���Խ��ϴ�.");
			System.out.println(coffee.getName());
			System.out.println(coffee.getPrice());
		}
	}
	
}
