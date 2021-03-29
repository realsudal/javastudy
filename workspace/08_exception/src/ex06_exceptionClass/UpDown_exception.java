package ex06_exceptionClass;
/*
 * 예외 클래스는 "직렬화"를 대비해서
 * serial version id를 생성하라고 항상 경고를 띄운다.
 * 
 * "직렬화"를 처리할 필요가 없다면, 경고메시지를 무시하라는 @SuppressWarnings 애너테이션을 추가한다.
 * 
 */

@SuppressWarnings("seral")
public class UpDown_exception extends Exception {

	/*예외 클래스는 주로 어떤일을 수행할까?
	 * 		-예외메시지(예외가 발생한 이유)를 저장한다
	 */
	
	public UpDown_exception() {
		super("이걸 왜틀려. 1~100 사이 "); //예외 메시지를 exceptiom에게 전달하면된다.
	}
}
