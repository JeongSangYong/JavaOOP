package starbucks;

public class Coffee implements Recipe{
	private String msg;

	public void boilWater() {
		System.out.println("물을 끓인다");
	}

	public void brew() {		
		System.out.println("커피를 내린다");
	}

	public void pourInCup() {
		System.out.println("물을 컵에 붓는다");
	}

	public void select(int option) {
		if(option == 1)
			this.msg = "블랙";			
		else
			this.msg = "밀크";
	}

	public void serve() {
		System.out.println("고객님 ["+this.msg+"]커피가 나왔습니다");
	}

}
