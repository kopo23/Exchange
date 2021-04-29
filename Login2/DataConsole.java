package Login2;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;

public class DataConsole {
	public static File file = new File("Login3.csv");
	private static FileWriter fw;
	private static BufferedWriter bw;
	private static FileOutputStream fo;
	private static OutputStreamWriter ow;
	private static FileReader fr;
	private static BufferedReader br;
	private static int UserCount;
	public static int WrongCount;
	
	public static void CSV_Header() throws IOException {
		if (file.exists() == false) {
			fw = new FileWriter(file,true);
			bw = new BufferedWriter(fw);
			String n = "User_num,ID,PassWD,Question,Answer,Reservation";
			bw.write(n);
			bw.newLine();
			bw.flush();
		}
	}
	
	public static boolean Scan (String ID) throws IOException {
		fr = new FileReader(file);
		br = new BufferedReader(fr);
		String Line; 
		UserCount = 0;
		boolean ID_exist = false;
		while((Line =br.readLine())!= null) {
			UserCount ++;
			String[] field = Line.split(",");
			if(field[1].equals(ID)) {
				ID_exist = true;
				return ID_exist;
			} else {
				ID_exist = false;
			}
		}
		return ID_exist;
	}
	
	public static boolean Scan (String ID, String PassWD) throws IOException {
		fr = new FileReader(file);
		br = new BufferedReader(fr);
		String Line; 
		boolean ID_exist = false;
		while((Line =br.readLine())!= null) {
			UserCount ++;
			String[] field = Line.split(",");
			if(field[1].equals(ID) && field[2].equals(PassWD)) {
				ID_exist = true;
				return ID_exist;
			} else {
				ID_exist = false;
			}
		}
		return ID_exist;
	}

	public static void AddUser(String ID, String Pass) throws IOException {
			fw = new FileWriter(file,true);
			bw = new BufferedWriter(fw);
			String n = String.format("%d,%s,%s", UserCount, ID, Pass);  //질문
			bw.write(n);
			bw.newLine();
			bw.flush();
	}
	
	public static void AddUser(String ID, String Pass, String Q, String A) throws IOException {
			fw = new FileWriter(file,true);
			bw = new BufferedWriter(fw);
			String n = String.format("%d,%s,%s,%s,%s", UserCount, ID, Pass,Q,A);  //질문
			bw.write(n);
			bw.newLine();
			bw.flush();
	}
}
