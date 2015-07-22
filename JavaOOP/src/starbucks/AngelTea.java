package starbucks;

public class AngelTea extends DrinkRecipe{
	private String msg;
	
	@Override
	void brew() {
		System.out.println("티백을 내린다");
	}

	@Override
	void select(int option) {
		switch (option) {
		case 3: this.msg="레몬";
		break;
		case 4: this.msg="자몽";
		break;
		default: this.msg="잘못설정";
		break;
		}
	}

	@Override
	void serve() {
		System.out.println("고객님 ["+this.msg+"]커피가 나왔습니다");
	}

}
