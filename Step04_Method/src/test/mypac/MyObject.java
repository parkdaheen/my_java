package test.mypac;
/*
 * [메소드를 만들때 고려해야 하는것]
 * 
 * 1. 접근 지정자
 * 2. static or not static
 * 3. return type
 * 4. 메소드명
 * 5. 메소드에 전달하는 인자의 갯수와 데이터type
 */

public class MyObject {
	public void walk() {
		System.out.println("걸음을 걸어요");
		
	}
	public int getNumber() {
		return 10;
	}
	public String getGreeting() {
		return "안녕하세요";
	}

}