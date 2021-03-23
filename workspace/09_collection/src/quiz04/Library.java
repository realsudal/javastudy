package quiz04;

import java.util.ArrayList;
import java.util.List;

public class Library {
	
	private String  name;
	private List<Book> books=new ArrayList<Book>();
	
	public Library(String name) { //List<Book> books은 길이가 지맘대로라 안써도댐
		this.name = name;
	}
	
	public void addBook(Book book) {
		books.add(book);
		
	}
	public void removeBook(int bNo) {//책 번호로 지움
		
		for(Book book:books) {
			if(book.getBNo()==bNo) {
				books.remove(book);
				break;
			}
		}
		/*
		 * int removeInx=-1;
		 
		for(int i=0,length=books.size();i<length;i++) {
			if(books.get(i).getBNo()==bNo) {//저장된 책 한권 = books.get(i)
				removeInx=i;
				break;
			}	
			}
		if(removeInx==-1) {
			System.out.println(bNo+"번 책 없음");
		}else {
			books.remove(removeInx);
			System.out.println(bNo+"번 책 삭제");
		}*/
		
	}
	
	

}
