package Quiz01;

import java.sql.Date;

public class Book {

	String name;
	String write;
	int price;
	int num;
	Date out_date;//자바에서 쓸거면 calender가 좋고 , DB로 보낼거면 DATE가 좋음
	boolean best;
}
