import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class OutFile_Class { 
	File file =  new File("C:\\Users\\안찬혁\\Desktop\\EX_Result.csv");
	private FileWriter fw;
	private BufferedWriter bw;
	private FileOutputStream fo;
	private OutputStreamWriter ow;
	public static int count;
		
	
	public void Header() throws IOException { // 헤더를 찍는데 최초 1회만찍어준다.
		if (file.exists() == false) { // 파일이 존재 안하면 찍고 하면 안찍음
			fo = new FileOutputStream(file,true);
			ow = new OutputStreamWriter(fo, "MS949");
			bw = new BufferedWriter(ow);
			bw.write(String.format("%s, %s, %s, %s, %s, %s, %s, %s","거래번호","날짜","환전대상","환전금액(원)","환전결과","실제 거스름돈(원)","준 거스름돈(원)","(은행)수익"));
			bw.newLine();
			bw.flush();
		}
	}
	public void WriteF(ExchangeType ex) throws IOException {
		FileC();
		fo = new FileOutputStream(file,true);
		ow = new OutputStreamWriter(fo, "MS949"); //인코딩땜시...
		bw = new BufferedWriter(ow);
		
		SimpleDateFormat sdf = new SimpleDateFormat("YYYY-MM-dd HH:mm:ss");
		Calendar cal = Calendar.getInstance();
		String r = String.format("%s, %s, %s, %d, %s, %d, %d, %d(원)",count, sdf.format(cal.getTime()) ,ex.Type, ex.Val,
				ex.Result_Val+" ("+ex.Type+")" , ex.Change, ex.i_Change, ex.Change-ex.i_Change );
		bw.write(r);
		bw.newLine();
		bw.flush();
		
	}
	
	public void FileClose(){ // 파일 닫기
		try {
			bw.close();
		} catch (Exception e){
			System.out.println();
		}
	}
	
	public void FileC() throws IOException { // 파일을 읽고, 읽은 데이터만큼 거래번호 / 대기번호를 정해줌.
		if (file.exists() == true) {
		FileReader fr = new FileReader(file);
		BufferedReader br = new BufferedReader(fr);
		String line;
		count = 0;
		while ((line=br.readLine())!= null) {
			count ++;
		}
			
		} else {
			count = 1;
		}
	}
}