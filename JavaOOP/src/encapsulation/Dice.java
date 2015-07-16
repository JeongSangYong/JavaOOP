package encapsulation;

public class Dice {
	//Field
	private int num;
	
	//Constructor
	public Dice(){		
		this.num = (int) ((Math.random()*6)+1);		
	}		
	
	//MemberMethod
	public int getNum(){
		return num;
	}
}
