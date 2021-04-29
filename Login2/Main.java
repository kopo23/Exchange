package Login2;

import java.io.IOException;

public class Main {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		MenuProcess Menu = new MenuProcess();
		DataConsole.CSV_Header();
		while (true) {
			int MenuType = Menu.ShowMenu();
			Menu.MenuSelect(MenuType);
		}
	}

}
