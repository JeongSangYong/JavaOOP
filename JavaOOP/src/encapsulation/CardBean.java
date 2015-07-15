package encapsulation;
/*
 * @ Date : 2015. 07. 15
 * @ Author : JSY
 * @ Story : 생성자 문법
 * 생성자는 setter를 통해 값을 할당하는
 * 기능을 보강하여, 객체가 만들어짐과
 * 동시에 값을 할당하도록 특수하게 만들어진 ★★★메소드이다.
 * */

public class CardBean {
/*===== Field =====*/
	private String name1, name2;
	private int cardnum1, cardnum2, msg;

/*===== Constructor =====*/
	//생성자 위치는 (멤버)필드와 메소드 영역사이에 위치
	//생성자 모양
	//public 클래스이름(){}
	//public CardBean(){}	//디폴트 생성자
	//디폴트 생성자는 개발자가 직접 만들지 않아도
	//프로그램 내부에서는 생성되 있는 것으로 인식한다.
	//하지만 이것들 만든 이유는 new키워드를 통한 객체생성 역할뿐 아니라
	//생성과 동시에 값을 할당하는 기능을 추구 시키기 위해서
	
	public CardBean(){	//디폴트생성자
	}
	public CardBean(String name) {	//파라미터를 가진 생성자
		//setter 역할을 겸용하는 생성자
		this.name1 = name;
		this.cardnum1 = (int) ((Math.random()*13)+1);;
	}
	
/*===== Method =====*/
	public String getName1() {
		return name1;
	}
	public int getCardnum1() {
		return cardnum1;
	}
	public String getWinner() {
		String winner = "";
		
		if( this.cardnum1 > this.cardnum2){
			winner = this.name1;
		}
		else
			winner = this.name2;
		return winner;
	}
	
	public String toString() {
		return "["+name1+" : "+cardnum1+"] vs ["+name2+" : "+cardnum2+"]\n"
				+this.getWinner()+ "승리";
	}

}
