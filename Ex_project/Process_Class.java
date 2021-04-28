import java.io.IOException;
import java.util.Scanner;

public class Process_Class {
	public Scanner scanner = new Scanner(System.in);
	Cal_Class Cal = new Cal_Class();
	ExchangeType Ex;
	OutPrint_Class Prt = new OutPrint_Class();
	OutFile_Class OutF = new OutFile_Class();

	public void Process() throws IOException {
		while (true) {
			OutF.FileC(); // 거래번호 세는것
			Prt.Header1();  // 헤더 출력
			int n2 = scanner.nextInt(); // 타입선택 (1. 달러 / 2. 유로 / 3. 옌 /4. 종료
			if (n2 == 4) break; // 4번이면 프로세스 메소드 종료
			
			Prt.Header2();
			int n1 = scanner.nextInt(); // val 금액
			 // 환전 타입
			Cal.Cal_M(1,n2,n1); // 금액 계산하고  Exchange생성사 생성
			Ex = new ExchangeType(n2,n1,Cal.exchangeResult, Cal.change, Cal.i_change); //생성자 Ex
			
			Cal.Cal_EX(Ex);  Prt.Print_EX(Ex); // 환전하고 돈 단위별로 출력
			Cal.Cal_Change(Ex); Prt.Print_Change(Ex); // 환전하고 잔돈 출력
	
			try {
				OutF.Header(); // 헤더쓰기(최초1회만)
				OutF.WriteF(Ex); // 파일 쓰기
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		
	}
	
}