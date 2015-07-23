package bank;

import java.util.Scanner;

public class KBbank {
	public static void main(String[] args) {
		BankRole bank = new Bank(100);
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("이름 : ");
		String name = scanner.next();
		System.out.println("비밀번호 4자리 입력 : ");
		int password = scanner.nextInt();
		System.out.println("입금금액 : ");
		int money = scanner.nextInt();		
		bank.openAccount(name, password, money);
		
		System.out.println("====== 계좌번호 조회(계좌번호) ======");
		System.out.println("검색하려는 고객명");
		String searchName = scanner.next();
		int searchCount = bank.searchCountByName(searchName);
		BankBook[] searchArr = new BankBook[searchCount];
		searchArr = bank.searchAccountByName(searchName);
		for(BankBook bankbook : searchArr){
			bankbook.showAccount();
		}
		System.out.println("검색하려는 계좌번호 ?");
		
		
		bank.searchAccountByAccountNo(scanner.next()).showAccount();
	}	
}
