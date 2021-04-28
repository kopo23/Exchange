import java.util.Scanner;

public class OutPrint_Class {
	Scanner scanner = new Scanner(System.in);

	public void Header1() { //헤더1
		System.out.printf("%19s 대기번호: %03d\n","",OutFile_Class.count);
		System.out.println("============어서오세요============");
		System.out.printf("%4s환전하실 타입을 선택해주세요.\n","");
		System.out.println("==============================");
		System.out.println("1.USD\n2.EUR\n3.YEN\n4.종료");
	}
	
	public void Header2() {// 헤더2
		System.out.println("==============================");
		System.out.printf("%4s환전하실 금액을 입력해주세요.\n","");
		System.out.println("==============================");
		System.out.println();
	}
	
	public void Print_EX(ExchangeType ex) {// 환전 결과를 출력
		System.out.println("==============================");
		System.out.printf("환전 결과: %d원 -> %d (%s) \n수령 내역\n",ex.Val, ex.Result_Val,ex.Type);
		System.out.println("==============================");
		for (int i = 0; i < ex.Type_Money.length; i++) {
			System.out.printf("%5d %s :  %d 개\n",ex.Type_Money[i],ex.Type,ex.Money_change[i]);
		}
		System.out.println("==============================");

	}
	
	public void Print_Change(ExchangeType ex) {// 거스름돈을 출력
		System.out.println("==============================");
		System.out.println("거스름돈을 받으시겠습니까?\n1. 예\n2. 아니오");
		System.out.println("==============================");
		int n = scanner.nextInt();
		if (n==1) {
			System.out.printf("%8s [%d원]\n","거스름돈 ",ex.Change);
			System.out.printf("%6s [%d원]\n","(실)수령금액 ",ex.i_Change);
			System.out.println("==============================");
			for (int i = 0; i <ex.I.KOR_Change.length; i++) {
				System.out.printf("%7d 원 : %2d개\n",ex.I.KOR_Money[i],ex.I.KOR_Change[i]);
			}
			
		} else {
			System.out.println("============감사합니다============");
		}
		
	}
}