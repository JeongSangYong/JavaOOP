package encapsulation;

public class CardBean2 {
	
	private String name1, name2;
	private int cardnum1, cardnum2, msg;
	
	public void setName1(String name1) {
		this.name1 = name1;
	}
	public void setName2(String name2) {
		this.name2 = name2;
	}	
	public void setCardnum1(int cardnum1) {
		this.cardnum1 = cardnum1;
	}
	public void setCardnum2(int cardnum2) {
		this.cardnum2 = cardnum2;
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
