package quiz;
/*
 * 사용자로 부터 국,영,수 점수를 입력받은 뒤 
 * int[]배열에 저장
 * score.dat 파일에 이름,입력받은 점수,평균을 저장하시오.
 * 저장이 끝나면 score.dat 파일을 읽어서 저장을 확인하시오.
 */

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

//저장
public class Main {

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		
		String[] sub= {"국","영","수"};
		int[] score=
		for(int i=0;i<sub.length;i++) {
			System.out.println(sub[i]+">>");
			score[i]=sc,nextInt();
			total+=score[i];
		}
		avg+=scores[i];
	}
	try(BufferedInputStream bis=new BufferedInputStream(new FileInputStream("byte2.txt"))){
		byte[] bytes=new byte[5];
		while(true) {
			int readByte=bis.read(bytes); //'읽은 데이터는 bytes 배열'에 저장됨. 실제'읽은 바이트 수가 readByte'에 저장됨
			if(readByte==-1)break;
			else {
				return 0;
		}
		System.out.println(new String(bytes));//string 으로 변환
	}catch (IOException e) {
		e.printStackTrace();
	}
		
		
	}

}
