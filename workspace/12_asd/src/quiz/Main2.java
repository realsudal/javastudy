package quiz;

import java.io.BufferedOutputStream;
import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class Main2 {
// 확인
	public static void main(String[] args) {
		try(DataInputStream dis=new DataInputStream(new FileInputStream("score.dat"))){
			String name=dis.readUTF();
			int[] scores=new int[4];
			for(int i=0;i<scores.length;i++) {
				scores[i]=dis.readInt();
				System.out.println(scores[i]+"");
				
			}
			System.out.println();
			double ave=dis.readDouble();
			System.out.println("평균 : "+avg);
		}catch (Exception e) {
			e.printStackTrace();
		}
	}

}
