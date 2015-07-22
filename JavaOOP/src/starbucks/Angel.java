package starbucks;

import java.util.Scanner;

public class Angel {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		AngelCoffee kim = new AngelCoffee();
		System.out.println("주문한 커피가 무설탕일경우 1, 설탕일경우 2번을 입력하세요");
		kim.prepare(scanner.nextInt());
		
		AngelTea lee = new AngelTea();
		System.out.println("주문한 홍차가 레몬일경우 3, 자몽일경우 4번을 입력하세요");
		lee.prepare(scanner.nextInt());
	}
}