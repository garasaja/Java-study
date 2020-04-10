package coffeeshop;

////책임 : 메뉴 선택
import java.util.ArrayList;

import lombok.Data;
@Data
public class Menu {
	// static Menu instance = new Menu();
	
	//메뉴 아이템들 (컬렉션)
	public ArrayList<MenuItem> menuitems;
	
	public Menu(ArrayList<MenuItem> menuitems) {
		super();
		this.menuitems = menuitems;
	}



	public MenuItem 메뉴선택(String menuName) {
		for (MenuItem menuItem : menuitems) {
			if(menuItem.getName().equals(menuName)) {
				return menuItem;
			}
		}
		return null;
		
		
	}
}
