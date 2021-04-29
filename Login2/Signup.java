package Login2;

import java.io.IOException;
import java.util.Scanner;

public class Signup {
	Scanner scanner = new Scanner(System.in);
	
	void SignUp() throws IOException {
		while (true) {
			System.out.println("#Please Input New ID");
			String ID = scanner.next();
			if (DataConsole.Scan(ID) == true) { // 데이터스캔해서 아이디원래있으면 컨티뉴문으로 다시진행
				System.out.println("!ID Already Exist! Please Try again!");
				continue; 
				
			} else { // 없으면 진행
				System.out.printf("#Please Set New PassWord for '%s'\n",ID);
				String PassWD = scanner.next(); //비밀번호 받고 <- 나중에 비밀번호 길이, 특수문자포함..
				System.out.println("Data Saved! You can Login now");
				System.out.println("#Do you want to Add Question for ID/Pass find?\n 1. Yes\n 2. No");
				// ID/Pass 분실시 질문 추가여부 물어봄.
				while (true) {
					int choice = scanner.nextInt();
					if (choice == 1) {
						System.out.println("-Input Question\n->");
						String Q = scanner.next();
						System.out.println("-Input Answer for Question\n->");
						String A = scanner.next();
						DataConsole.AddUser(ID, PassWD,Q,A);
						break;
					} else if (choice == 2){
						DataConsole.AddUser(ID,PassWD); // 유저를 csv파일에 더해서 추가.
						break;
					} 
					System.out.println("Please Choose Between 1 or 2");
				}
				break; // break; 문으로 처음 메뉴로 돌아감.
			}
		}
	}
	
	
	
}
