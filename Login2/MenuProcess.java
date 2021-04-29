package Login2;

import java.io.IOException;
import java.util.Scanner;

public class MenuProcess {
	public static Scanner scanner = new Scanner(System.in);
	MSG msg = new MSG();
	UserInfo user = new UserInfo();
	Signup sign = new Signup();
	Login login = new Login();
	
	int ShowMenu() {
		while (true) {
			msg.Showmenu(user.ID);
			int Type = scanner.nextInt();
			if ( Type > 5 || Type < 1) {
				System.out.println("Wrong Menu Choice!");
			} else {
				return Type;
			}
		}
	}
	
	void MenuSelect(int MenuType) throws IOException {

		if (MenuType == 1) {
			login.User_Login();
			
		} else if (MenuType == 2) {
			sign.SignUp();
			System.out.println("Data Saved!");
		} else if (MenuType == 3) {
			
		} else if (MenuType == 4) {
			
		} else if (MenuType == 5) {
			
		}
	}
}
