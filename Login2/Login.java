package Login2;

import java.io.IOException;
import java.util.Scanner;

public class Login {
	public Scanner scanner = new Scanner(System.in);
	Main main = new Main();
	
	void User_Login() throws IOException {
		
		System.out.println("#Input ID");
		String ID = scanner.next();
		while (DataConsole.Scan(ID) == false) {
			System.out.println("!Wrong ID!");
			ID = scanner.next();
		}
		System.out.println("#Input PassWD");
		String PassWD = scanner.next();
		DataConsole.WrongCount = 0;
		while (DataConsole.Scan(ID,PassWD) == false) {
			System.out.printf("!Wrong PassWD for '%s'\n",ID);
			DataConsole.WrongCount ++;
			PassWD = scanner.next();
			if (DataConsole.WrongCount > 3) {
				System.out.println("!!Acess Denied: Wrong PassWD more than 3 Times!!"); 
				main.main(null); // 다시메인으로 복귀... 이렇게해도되나?..
			}
		}
		UserInfo.ID = ID; UserInfo.PassWD = PassWD;  // 아이디와 패스워드를 지정. -> 로그아웃시 초기화
		System.out.printf("Access Permit! Welcome '%s'\n",ID);
		
	
	}
}
