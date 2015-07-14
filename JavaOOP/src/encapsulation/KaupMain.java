package encapsulation;

import java.util.Scanner;

public class KaupMain {
	public static void main(String[] args) {
		
		String name = "", msg = "";
		double height = 0.0d, weight = 0.0d;
		int idx = 0; //카우푸 인덱스
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("이릅을 입력하세요");
		name = scanner.next();
		System.out.println("키를 입력하세요");
		height = scanner.nextInt();
		System.out.println("몸무게를 입력하세요");
		weight = scanner.nextInt();
		
//		KaupBean2 kaupbean = new KaupBean2();
//		kaupbean.getIndex();
		
		KaupBean4 kaupbean = new KaupBean4();
		kaupbean.setName(name);
		kaupbean.setHeight(height);
		kaupbean.setWeight(weight);
		kaupbean.getIndex();
		
		//출력부
		System.out.println(kaupbean.toString());
	}
}
