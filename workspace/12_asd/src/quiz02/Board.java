package quiz02;

import java.io.Serializable;

/*objextoutoprudsad
 * 에의해서 메소드로 호출되는 클래스이다.
 * 반드시 직렬화를 해야된다.
 * 
 * 직렬화 방법 : serializable 인터페이스를 구현한다. serial 버전 id를 구현한다.
 */
public class Board implements Serializable {

	/**
	 * javadoc
	 */
	private static final long serialVersionUID = -57911694112102511L;
	private String title;
	private String content;
	private String writer;
	
	
	public Board(String title, String content, String writer) {
		this.title = title;
		this.content = content;
		this.writer = writer;
	}


	@Override
	public String toString() {
		return "Board [title=" + title + ", content=" + content + ", writer=" + writer + "]";
	}
	
	
}
