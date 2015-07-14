package encapsulation;

/*
 * @ Date : 2015. 07. 14
 * @ Author : JSY
 * @ Story : 카우푸지수 프로그램을 객체화 하는 예제
 * */

public class KaupBean5 {
	private String name, msg;
	private double height, weight;
	private int idx;
	
	/*
	 멤버필드에 값을 저장하는 메소드가 setter이라면
	 값을 읽어 오는 메소드는 getter이다.
	 getter은 read의 의미이다.
	 getter의 특징은 리턴타입이 존재한다.
	 특별한 상황이 아니라면 파라미터가 존재하지 않는다.
	 * */
	public int getIdx() {
		return idx;
	}
	
	public String getMsg() {
		idx = (int) ((weight/(height * height))*10000);
		
		if (idx > 30) {
			msg = "비만";
		}else if( idx > 24 ){
			msg = "과체중";
		}else if( idx > 20 ){
			msg = "정상";
		}else if( idx > 15 ){
			msg = "저체중";
		}else if( idx > 13 ){
			msg = "마름";
		}else{
			msg = "영양실조";
		}		
		return msg;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	public void setHeight(double height) {
		this.height = height;
	}
	public void setWeight(double weight) {
		this.weight = weight;
	}
	

	@Override
	public String toString() {	
		//선언부
		String str = "";	//지역변수는 무조건 초기화
		
		//연산부
		str = "["+name+"] 키 : "+height+"cm, "
				+ "몸무게 :"+weight+"kg, 결과 : "+msg+ "카우푸지수"+getMsg();
		
		//출력부		
		return str;
	}
}
