package inheritance;

import java.util.Scanner;

public class PhoneMain {
	public static void main(String[] args) {
		Phone phone = new Phone();
		
		phone.setCompany("삼성 가정용 전화기");
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("전화걸 사람 : ");
		phone.setCall(scanner.next());
		System.out.println(phone.getCompany()+"를 사용해서...");
		
		System.out.println(phone.getCall()+"에게 전화를 검");
	}
}
