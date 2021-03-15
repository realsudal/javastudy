package ex02_2d_array;

import java.util.Scanner;

// 4. 성적 관리 프로그램
// 각 점수는 입력 받아서 학생별 총점과 과목별 총점을 구해서 출력하기
// 스폰지밥의 국어 점수 >>> 10
// 스폰지밥의 영어 점수 >>> 10
// 스폰지밥의 수학 점수 >>> 10
// ...
//          국어  영어  수학  학생합계
// 스폰지밥 10    10    10    30
// 타요     10    10    10    30
// 브레드   10    10    10    30
// 과목합계 30    30    30    90

public class Quiz04 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String[] names = { "짱구", "뽀로로", "타요", "브레드", "과목합" };
		String[] subjects = { "국어", "영어", "수학", "학생합" };
		int[][] scores = new int[names.length][subjects.length];
		
		// 입력 및 계산하기
		for (int i = 0; i < names.length - 1; i++) {
			for (int j = 0; j < subjects.length - 1; j++) {
				System.out.print(names[i] + "의 " + subjects[j] + "점수 입력 >>> ");
				scores[i][j] = sc.nextInt();
				// 각각의 점수: scores[i][j]
				// 과목의 합계: scores[names.length - 1][j]
				// 학생의 합계: scores[i][subjects.length - 1]
				// 전체의 합계: scores[names.length - 1][subjects.length - 1]
				scores[names.length - 1][j] += scores[i][j];
				scores[i][subjects.length - 1] += scores[i][j];
				scores[names.length - 1][subjects.length - 1] += scores[i][j];
			}
		}
		
		// 제목 출력
		System.out.print("\t");
		for (String subject : subjects) {
			System.out.print(subject + "\t");
		}
		System.out.println();
		
		// 본문 출력
		for (int i = 0; i < scores.length; i++) {
			System.out.print(names[i] + "\t");
			for (int j = 0; j < scores[i].length; j++) {
				System.out.print(scores[i][j] + "\t");
			}
			System.out.println();
		}
		
		sc.close();
		
	}

}