package quiz04;

public class Main {

	public static void main(String[] args) {

		Book book1=new Book(1000, "어린왕자", "쌩찌");
		Book book2=new Book(1001, "김태풍의 일기", "수달 ");
		Book book3=new Book(1002, "김태풍의 일기2", "수달 ");
		Book book4=new Book(1003, "김태풍의 일기3", "수달 ");
		
		Library library=new Library("뿡이 도서관");
		library.addBook(book1);
		library.addBook(book2);
		library.addBook(book3);
		
		library.booksInfo();
		
		library.removeBook(1002);
		library.booksInfo();
		
	}

}
