
import java.io.IOException;

public class Main_Class {
	
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		Process_Class P = new Process_Class();
		OutFile_Class O = new OutFile_Class();
		
		P.Process(); //프로세스 클래스 -프로세스 메소드
		O.FileClose(); //파일아웃 클래스 - 파일클로스 메소드 (파일닫기)
		
	}

}