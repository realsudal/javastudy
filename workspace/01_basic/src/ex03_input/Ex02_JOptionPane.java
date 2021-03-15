package ex03_input;

import javax.swing.JOptionPane;

public class Ex02_JOptionPane {

	public static void main(String[] args) {
		/*
		 * JOptionPane 클래스
		 * 	특징 : 별도의 창을 이용해서 출력함
		 * 	패키지 : javax.swing
		 * 	메소드 
		 * 		showInputDialog() : 입력 대화상자
		 * 		showCofirmDialog() : 확인 대화상자
		 * 		showMessageDialog() : 출력 대화상자
		 * 
		 * - 주의사항 : showInputDialog()는 String만 반환한다!!!
		 * 
		 * jop <- ctrl+space
		 */
		
		String name =JOptionPane.showInputDialog("이름 : ");
		String sAge = JOptionPane.showInputDialog("나이 : ");
		String sH = JOptionPane.showInputDialog("키 : ");
		String sG = JOptionPane.showInputDialog("성별 : ");
		
		//string이 아닌타입을 본래 타입으로 변환
		int age = Integer.parseInt(sAge);
		double h=Double.parseDouble(sH);
		char g=sG.charAt(0);
		
		String message="\n이름:"+name+", 나이:"+age+", 키:"+h+"cm, 성별:"+g;
		JOptionPane.showMessageDialog(null, message);
		
		
	}

}
