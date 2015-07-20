package inhebitance;
/*
     객체지향 프로그래밍 언어 4대특징 (2)상속
 - extends라는 키워드로 부모역할을 하는 클래스를 선언하면
 - 자식클래스는 부모클래스의 자산(필드,메소드)를 따로 선언하지 않아도 사용사게 된다.
 * */
public class CelPhone extends Phone{
	private boolean portable;	//이동이 가능한지 여부
	private String move; //가지고 다니는 상황을 표시

	public boolean isPortable() {
		
		return portable;
	}
	
	//if-else로 참,거짓을 판별하는 알고리즘을 구현하려면
	//파라미터로 들어오는 값이 있어야 그 값에 대한 판별을 한 것이므로
	//이 상황에서는 set에 구현한다.
	public void setPortable(boolean portable) {
		//boolean 타입의 getter 는 is*()방식으로 자동 생성된다.
		//이경우는 반드시 리턴타입의 지변을 선언하고 if-else 아록리즘을 구현해야한다.
		
		if (portable) { //protable 이 true 라면
			this.setMove("핸드폰을 가지고 다닐수 있음");
		} else {
			this.setMove("핸드폰을 가지고 다닐수 없음");
		}
		this.portable = portable;
	}

	public String getMove() {
		return move;
	}

	public void setMove(String move) {
		this.move = move;
	}
	
	
	
}
