package bank;

import java.util.Scanner;

public class HanaBank {
	public static void main(String[] args) {
		Bank bank = new Bank(100);
		Scanner scanner = new Scanner(System.in);
		int input = 0, key =0;
		while(true){
			System.out.println("1.계좌개설 2.계좌조회(번호) 3.계좌조회(이름) 4.전체계좌 0.종료");
			input = scanner.nextInt();
			key = inputCheck(input,0,5);
			if(input !=0 ){
				switch(key){
				case 1:
					System.out.println("이름 : ");
					String name = scanner.next();
					System.out.println("비밀번호 4자리 입력 : ");
					int password = scanner.nextInt();
					System.out.println("입금금액 : ");
					int money = scanner.nextInt();		
					bank.openAccount(name, password, money);
					break;
				case 2:
					System.out.println("검색하려는 계좌번호 ?");
					BankBook bankBook = bank.searchAccountByAccountNo(scanner.next());
					System.out.println(bankBook.showAccount());
					break;
				case 3:
					System.out.println("검색하려는 고객명");
					String searchName = scanner.next();
					int searchCount = bank.searchCountByName(searchName);
					BankBook[] searchArr = new BankBook[searchCount];
					searchArr = bank.searchAccountByName(searchName);
					for(BankBook bankbook : searchArr){
						System.out.println(bankbook.showAccount());
					}
					break;
				case 4:
					System.out.println("전체계좌 조회");
					BankBook[] list = bank.getBankBookList();
					break;
				case 5:
					System.out.println("삭제하려는 계좌번호 ?");
					
					String delet = scanner.next();
					String deletAccount = String.valueOf(delet);
					boolean closeOk = bank.closeAccount(deletAccount);
					
					if(closeOk==true){
						System.out.println("삭제되었습니다.");
					}else{
						System.out.println("해당 계좌가 없습니다.");
					}
					break;
				}
				
				
				
			}else{
				System.out.println("시스템 종료!");
				break;
			}
		}
	}

	private static int inputCheck(int input, int i, int j) {
		if(input < 1 || input > j){
			System.out.println("선택메뉴에서 범위값 외의 수를 입력했습니다.");
			return 0; //시스템 종료
		}
		else{
			return input; //input에대한 숫자 검증
		}
		
	}
}
