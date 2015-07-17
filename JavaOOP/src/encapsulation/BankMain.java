package encapsulation;

import java.util.Scanner;

public class BankMain {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		/*
		 * 생성자가 가지는 기능
		 * 1. 객체를 만드는 기능
		 * 2. setter 기능
		 * 3. 객체가 만들어지는 데 필수적인 요소가 주어지지 않으면 아에 생성을 막는 기능
		 * */
		System.out.println("통장주 이름을 입력하세요 : ");
		BankBook bankBook = new BankBook(scanner.next());
		System.out.println("입금할 금액을 입력하세요 : ");
		bankBook.deposit(scanner.nextInt());
		System.out.println("출금할 금액을 입력하세요 : ");
		bankBook.withdraw(scanner.nextInt());
		System.out.println("입금할 금액을 입력하세요 : ");
		bankBook.deposit(scanner.nextInt());
		System.out.println(bankBook.toString());
	}
}
