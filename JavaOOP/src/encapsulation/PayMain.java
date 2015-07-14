package encapsulation;

import java.util.Scanner;

public class PayMain {
	public static void main(String[] args) {
		/*
		 [오더]
		 pay프로그램은 월급을 입력받아서 세금을 떼고 실급여를 고객에게 알려주는 프로그램이다.
		 세율은 10%
		 
		 출력문
		 [홍길동 실급여]
		 월급 : 100만원
		 세금 : 10만원
		 실급여 : 90만원
		 * */
		
		String name = "";
		int pay = 0, tax = 0 , realpay=0;
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("이릅을 입력하세요");
		name = scanner.next();
		System.out.println("월급을 입력하세요");
		pay = scanner.nextInt();
		
		PayBean payBean = new PayBean();
		payBean.setName(name);
		payBean.setPay(pay);

		
		System.out.println(payBean.toString());
	}
}
