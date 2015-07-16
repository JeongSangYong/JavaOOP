package encapsulation;

public class Blue {
	private int sum;
	
	public Blue(){
	}
	
	public Blue(Dice dice1, Dice dice2)
	{		
		this.sum = dice1.getNum()+ dice2.getNum();
	}

	@Override
	public String toString() {		
		
		return"두 주사위의 합이 "+this.sum+"입니다."+this.sum+"칸 전진하세요";
	}
}
