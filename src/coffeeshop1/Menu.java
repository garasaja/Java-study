package coffeeshop1;

import java.util.ArrayList;


import lombok.Data;

@Data
public class Menu {
	
	public ArrayList<MenuItem> menuitems;
	
	public Menu(ArrayList<MenuItem> menuitems) {
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