package abstraction;

public class Orange implements FruitsInterface{

	@Override
	public void display(String str) {
		System.out.println(str +"오렌지입니다.");
		
	}
	public int count(){
		int count = 100;
		return count;
	}
}
