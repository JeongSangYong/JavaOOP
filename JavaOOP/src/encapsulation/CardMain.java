package encapsulation;

import java.util.Scanner;

/*
 * @ Date : 2015. 07. 15
 * @ Author : JSY
 * @ Story : 카드 번호비교 프로그램
 * */

public class CardMain {
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
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("이름을 입력하세요");
		CardBean hong = new CardBean(scanner.next());
		System.out.println("이름을 입력하세요");
		CardBean kim = new CardBean(scanner.next());	
			
		CardGameMe game = new CardGameMe(hong, kim);
		
		//System.out.println(game.getWinner());
		System.out.println(game.toString());
	}
}
