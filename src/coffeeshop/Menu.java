package coffeeshop;

////å�� : �޴� ����
import java.util.ArrayList;

import lombok.Data;
@Data
public class Menu {
	// static Menu instance = new Menu();
	
	//�޴� �����۵� (�÷���)
	public ArrayList<MenuItem> menuitems;
	
	public Menu(ArrayList<MenuItem> menuitems) {
		super();
		this.menuitems = menuitems;
	}



	public MenuItem �޴�����(String menuName) {
		for (MenuItem menuItem : menuitems) {
			if(menuItem.getName().equals(menuName)) {
				return menuItem;
			}
		}
		return null;
		
		
	}
}
