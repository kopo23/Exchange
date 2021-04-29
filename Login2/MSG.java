package Login2;

import java.util.Scanner;

public class MSG {
	
	void Showmenu(String ID) {
		System.out.println("================welcome=============");
		System.out.printf("\t\tUser: %s\n\n",ID);
		System.out.println("1. Login\n2. Sign up\n3. Forgot ID/PassWd\n4. LogOut\n5. Reservation");
	}

	void SignUpID() {
		System.out.println("Please input new ID");
		
	}
	
	void SingUpPasswd() {
		System.out.println("Please input Passwd");
	}
	
	
	void Error() {
		System.out.println("check ID\n (ID Wrong or Aleady exist.)");
	}
	
	void Error(int i) {
		System.out.println("Check Passwd again");
	}
	
	void Save() {
		System.out.println("--Saved!--");
	}
	
	void Login(String ID) {
		System.out.printf("Login Acepted! Welcome '%s'!\n",ID);
	}
}