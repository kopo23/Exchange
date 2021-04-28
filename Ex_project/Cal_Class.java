

import java.util.Scanner;

public class Cal_Class {
	public Scanner scanner = new Scanner(System.in);
	static double rate; // 환율 -> ex. 로 받아와서 씀
	static int exchangeResult;//환전 결과
	static int change; // 남은 잔돈
	static int i_change; //  받을 잔돈
	
	
	public void Cal_M(int a, int TypeN, int Val) {
		if (TypeN == 1) { // 스캐너값을 받아와서 조건문으로 Integer_C 의 환율을 받아옴.
			rate = Integer_Class.EX_RATE_USD;
		} else if (TypeN == 2) {
			rate = Integer_Class.EX_RATE_EUR;
		} else if (TypeN == 3) {
			rate = Integer_Class.EX_RATE_YEN;
		}
		
		exchangeResult = (int) (Val/rate); //환전계산
		change = (int) (((Val/rate) - exchangeResult)*rate); // 잔돈계산 
		i_change = (int) (change/10)*10; // 거스름돈계산
		
	}
	
	public void Cal_EX(ExchangeType ex) { // 환전후 환급받는 돈 계산
		int Current = ex.Result_Val; //환급 결과
		for (int i = 0; i < ex.Type_Money.length; i++) {
			int Amount = Current / ex.Type_Money[i];  // 단위돈으로 나눠서 출력
			ex.Money_change[i] = Amount; //ExchangeType 의 배열에 저장.
			Current -= (ex.Type_Money[i]*Amount);
		}
		
		
	}
	
	public void Cal_Change(ExchangeType ex) {
		int Current = ex.Change;
		for (int i = 0; i < Integer_Class.KOR_Money.length; i++) {
			int Amount = Current / Integer_Class.KOR_Money[i];
			Integer_Class.KOR_Change[i] = Amount; // 인티저 클래스의 배열에 저장
			Current -= (Integer_Class.KOR_Money[i]*Amount);
		}
	}
}