package quiz04;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data //게터,세터, 생성자, 투스르팅,이퀄즈,해시코드 등 다 ~~~~다들어감 - allargscon~~이거는 안들어감
@AllArgsConstructor
public class Book {

	private int bNo;
	private String bTitle;
	private String bWriter;
	

}
