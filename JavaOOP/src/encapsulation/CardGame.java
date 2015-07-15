package encapsulation;

public class CardGame {
	private String winner;
	
	public CardGame() {
		//디폴트 생성자
	}

	public CardGame(CardBean bean1, CardBean bean2) {
		
		String winner = "";		
		if( bean1.getCardnum1() > bean2.getCardnum1() ){
			winner = bean1.getName1();
		}
		else
			winner = bean2.getName1();
		
		this.winner = winner;
		
	}	
}
