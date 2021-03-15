package ex01_random;

public class Quiz03 {

	public static void main(String[] args) {
		//도개걸 123 
		//윷개 6칸 
		//모모도 11칸
		
		String []n= {"도","개","걸","윷","모"};
		int move=0;
		
		while(true) {
			//프로그램이 윷 던짐
			
			int index=(int)(Math.random()*5)+0;
			System.out.print("\""+n[index]+"\"");
			
			move+=(index+1);
			
			//도개걸은 나감
			if(index<3) {
				System.out.println("\n====>"+move+"칸 이동 함");
				break;
			}//윷모는 한번더 던짐
			else {
				System.out.println(",");
			}
		}
		
	}

}
