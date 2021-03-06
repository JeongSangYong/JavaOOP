package encapsulation;
/*
 * 홍길동 승리 라고 나오는것을
 * 홍길동 : 7 
 * 김유신 : 4
 * 홍길동 승리
 * */
public class CardGame {
	private String winner, looser;
	private int winScore, looseScore;
	
	public CardGame() {
		//디폴트 생성자
	}

	public CardGame(CardBean bean1, CardBean bean2) {
			
		if( bean1.getCardnum1() > bean2.getCardnum1() ){
			winner = bean1.getName1();
			looser = bean2.getName1();
			winScore = bean1.getCardnum1();
			looseScore = bean2.getCardnum1();
		}
		else if(bean1.getCardnum1() < bean2.getCardnum1()){
			winner = bean2.getName1();
			looser = bean1.getName1();
			winScore = bean2.getCardnum1();
			looseScore = bean1.getCardnum1();
		}
		else
			winner = "비김";
		this.winner = winner;
		this.looser = looser;
		this.winScore = winScore;
		this.looseScore = looseScore;
		
	}

	
	@Override
	public String toString() {
		return this.winner + ":" + this.winScore +"\n"+this.looser +":"+this.looseScore+"\n"+this.winner+"승리";
	}
	
}
