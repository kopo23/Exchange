public class ExchangeType {
	
	Integer_Class I = new Integer_Class();
	String Type; // 환전 종류
	int Val; // 처음받은금액
	int Result_Val; // 환전 결과 금액
	int Change; // 원래 잔금
	int i_Change; // 실제 받는 돈
	int [] Type_Money = null; // 환전하는 종류에 돈 단위
	int [] Money_change = null; // 돈 거슬러줄때 돈 갯수
	
	
	ExchangeType( int Type, int Val, int Result_Val, int Change,int i_Change){ 
		// 거래번호, 환전타입, 금액 받아 생성자로 받음. 생성자가 생성시에 전역변수들 대입.
		this.Val = Val;
		if (Type == 1) {
			this.Type = "USD";
			Type_Money = I.USD_Money;
			Money_change = new int [I.USD_Money.length];
			
		} else if (Type == 2) {
			this.Type = "EUR";
			Type_Money = I.EUR_Money;
			Money_change = new int [I.EUR_Money.length];
			
		} else if(Type == 3) {
			this.Type = "YEN";
			Type_Money = I.YEN_Money;
			Money_change = new int [I.YEN_Money.length];
			
		}
		
		this.Result_Val = Result_Val;
		this.i_Change = i_Change;
		this.Change = Change;
		
	}
	
	
	
}