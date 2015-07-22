package starbucks;

public class AngelCoffee extends DrinkRecipe{
	private String msg;
	@Override
	void brew() {
		System.out.println("커피를 내린다.");
	}

	@Override
	void select(int option) {
		if(option == 1)
			this.msg = "블랙";			
		else
			this.msg = "밀크";
	}

	@Override
	void serve() {
		System.out.println("고객님 ["+this.msg+"]커피가 나왔습니다");
	}

}
