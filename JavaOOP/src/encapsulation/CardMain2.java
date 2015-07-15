package encapsulation;

import java.util.Scanner;

/*
 * @ Date : 2015. 07. 15
 * @ Author : JSY
 * @ Story : 카드 번호비교 프로그램
 * */

public class CardMain2 {
	public static void main(String[] args) {
		/*
		 * 카드 두장을 비교해서 카드번호가
		 * 더 큰 수가 이기는 게임프로그램을 만드시오
		 * 일단, 프로토타임(시제품) 프로그램으로 개발자가 임의의
		 * 숫자를 입력하면 
		 * [출력]
		 * [홍길동 : 7] vs [김유신 : 3]
		 * 홍길동 승리
		 * */
		
		String name1, name2 = "";
		int cardnum1, cardnum2 = 0, msg=0;
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("이름을 입력하세요");
		name1 = scanner.next();
		System.out.println("이름을 입력하세요");
		name2 = scanner.next();
		//위에까진 스캐너가 받아놓은 값은 지변에 있지만
		//연란로직은 객체에 있기때문에 객체로 보내야함
		
		CardBean3 cardbean = new CardBean3();
		cardbean.setName1(name1);
		cardbean.setCardnum1();	//스캐너로 받지않는다고 cardbean.setCarddnum1을 
								//사용(호출)하지 않는다면 랜덤숫자가 발생x
		cardbean.setName2(name2);
		cardbean.setCardnum2();
		

		
		System.out.println(cardbean.toString());
	}
}
