
package test.mypac;


public class Member {
		//번호를 저장할 필드
		public int num;
		//이름을 저장할 필드
		public String name;
		//주소를 저장할 필드
		public String addr;

//생성자를 하나라도 정의하면 기본 생성자는 없다고 간주되기 때문에
//기본 생성자도 필요하면 명시적으로 정의해야한다.

		
		//3개의 인자를 전달받을 준비가 된 생성자
	//public Member(int num, String name, String addr) {//생성자에게도 매개 변수를 선언할 수 있다.
			//생성자의 인자로 전달받은 값을 필드에 저장하기
		public class Member {	
			this.num=num;
			this.name=name;
			this.addr=addr;
		
		}
		
		//메소드
		public void showInfo() {
			//필드에 저장된 내용을 활용해서 정보를 출력하기
			System.out.println("번호:"+this.num+", 이름:"+this.name+", 주소:"+this.addr);
			
		}

		}
//this때문에 1시간 애먹고 결국 해냄 인간승리