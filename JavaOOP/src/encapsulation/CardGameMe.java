package encapsulation;
/*
 * 홍길동 승리 라고 나오는것을
 * 홍길동 : 7 
 * 김유신 : 4
 * 홍길동 승리
 * */
public class CardGameMe {
	private String winner, looser;
	private int winScore, looseScore;
	
	public CardGameMe() {
		//디폴트 생성자
	}

	public CardGameMe(CardBean bean1, CardBean bean2) {
		
		String winner = "";		
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
		
	}
	public String getWinner(){
		return winner+"승리";
	}
	
	@Override
	public String toString() {
		String str = this.winner + ":" + this.winScore +"\n"+this.looser +":"+this.looseScore+"\n"+this.getWinner();
		
		return str;
	}
	
}
