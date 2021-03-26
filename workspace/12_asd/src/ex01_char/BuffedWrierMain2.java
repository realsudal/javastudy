package ex01_char;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class BuffedWrierMain2 {

	public static void main(String[] args) {

		try(BufferedWriter bw=new BufferedWriter(new FileWriter("text4.txt"))) { //작은 괄호부터 먼저 실행됨 (fw -> bw)
			bw.write("안녕하세요");
			bw.newLine();
			bw.write("방가");
			
		}catch (IOException e) {
			e.printStackTrace();
		}
	}

}
