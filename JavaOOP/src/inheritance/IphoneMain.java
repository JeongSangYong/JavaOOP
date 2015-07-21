package inheritance;

import java.util.Scanner;

public class IphoneMain {
	public static void main(String[] args) {
		/*
		 * 아이폰을 사용해서
		 * 폰을 가지고 다닐 수 있음
		 * 홍길동에게 데이터를 전달
		 * */
		//아이폰이 출력되게 하려면 클래스변수는
		//클래스 이름.BRAND로 가져오면 된다.
		
		Iphone iphone = new Iphone();
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("통화 상대 입력 : ");
		iphone.setCall(scanner.next());
		iphone.setCompany(iphone.BRAND);		
		System.out.println("보내는 메시지 입력 : ");
		iphone.setData(iphone.getCall(), scanner.next());
		System.out.println(iphone.getCompany()+"을 사용해서");
		iphone.setPortable(iphone.TRUE);
		System.out.println(iphone.getMove());
		System.out.println(iphone.getData());
	}
}
