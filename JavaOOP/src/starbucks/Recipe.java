package starbucks;

//추상클래스 학습

public interface Recipe {
	/*
	 커피 끓이는 순서
	 1. 물을 끓인다
	 2. 커피를 내린다
	 3. 물을 컵에 붓는다
	 4. 설탕 첨가 여부를 손님에게 묻는다
	 	-무설탕 : 블랙, 설탕 : 밀크
	 5. 커피를 제공한다
	 	-고객님 []커피가 나왔습니다
	 * */
	public void boilWater();
	public void brew();
	public void pourInCup();
	public void select(int option);
	public void serve();
	
	/*추상클래스 -> 갑자기 메뉴를 추가하는 경우
	 홍차(tea) 끓이는 순서
	 1. 물을 끓인다
	 2. 태백을 내린다
	 3. 물을 컵에 붓는다
	 4. 레몬, 자몽 첨가 여부를 손님에게 묻는다
	 	-레몬 : 레몬티, 자몽 : 자몽티
	 5. 홍차를 제공한다
	 	-고객님 레몬티가 나왔습니다
	 * */
}
