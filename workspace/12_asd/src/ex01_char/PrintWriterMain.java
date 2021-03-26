package ex01_char;
/*
 * Printwriter 클래스
 * 1. FileWriter 클래스와 같은 목적으로 사용합니다.
 * 2. 출력메소드 :writer(),print(),println()
 * 3.println() 메소드를 사용하면 자동으로 줄바꿈이 처리된다.
 */

import java.io.PrintWriter;

public class PrintWriterMain {

	public static void main(String[] args) {

		PrintWriter out=null;
		
		try {
			out=new PrintWriter("index.html");
			out.println("<script>");
			out.println("alrt('hello java!')");
				out.println("<script>");
		}catch (Exception e) {
			e.printStackTrace();
		}finally {
			try {
				if(out!=null)out.close();
			}catch (Exception e) {
				e.printStackTrace();
			}
		}
		
	}

}
