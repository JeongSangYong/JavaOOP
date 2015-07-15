package encapsulation;

public class CardBean3 {
	
	private String name1, name2;
	private int cardnum1, cardnum2, msg;
	
	public void setName1(String name1) {
		this.name1 = name1;
	}
	public void setName2(String name2) {
		this.name2 = name2;
	}	
	public void setCardnum1() {	
		//외부에서 받는 숫자가 없으므로 파라미터가 필요 없다.
		this.cardnum1 = (int) ((Math.random()*13)+1);
		//1부터 13까지의 정수중에서 랜덤숫자를 리턴
	}
	public void setCardnum2() {
		this.cardnum2 = (int) ((Math.random()*13)+1);
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
