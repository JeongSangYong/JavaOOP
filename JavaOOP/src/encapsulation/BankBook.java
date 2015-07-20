package encapsulation;

import abstraction.Account;

/*
 객체지향 프로그래미에서 클ㄹ래스는 현실 세계를 그대로 카피하려고 한다.
 그 대상이 구체적 물질이든 개념적 추상이든 그대로 재현하려고 해야 한다.
 통장을 이루는 요소를 생각해 봅시당.
 ㄱ그 요소가 인스턴스 변수를 구성하게 된다.
 1.은행이름 =>아이티뱅크 bank
 2.통장번호 =>5자리의 랜덤숫자 bankbookNo
 3.소유자 이름 => 생성자에 스캐너 입력받는 값 name
 4. 날짜 / 예금 / 출금 / 잔액 => 돈 => 스캐너로 입력받는 값 숫자타입 money
 5. 비밀번호 => 스캐너로 입력받는 값, 숫자타입 => pass
 
 [출력문]
 =================
 [아이티뱅크]
 계좌번호 : 12345
 이름 : 홍길동
 잔액 : 1000원
 ================
 * */
public class BankBook implements Account{
	
	public static String BANK;
	private String name;
	private int money, bankbookNo;
	private int pass;
	private String msg;	//유효성체크 결과를 알려줘서 고객이 실수로 입력한거를 공지해주는 기능


	public BankBook(String name) {
		this.BANK = "아이티뱅크";
		this.bankbookNo = (int) ((Math.random()*99999)+10000);
		this.name = name;
	}
	
	
	public String getName() {
		return name;
	}


	public int getMoney() {
		return money;
	}


	public int getBankbookNo() {
		return bankbookNo;
	}

	public int getPass() {
		return pass;
	}

	public void setPass(int pass) {
		this.pass = pass;
	}
	/*
	public void withdraw(int money){
		
	}
	public void deposit(int money){
		
	}*/

	//getter setter 단축키 : alt + shitf + s
	public String toString() {
		
		return "=================\n"
				+ "["+BANK+"]\n"
				+ "계좌번호 : "+bankbookNo+"\n"
				+ "이름 : "+name+	"\n"
				+ "잔액 : "+this.money+"원\n"
				+ "=================";
	}


	@Override
	public void withdraw(int money) {
		// 파라미터 값이 정상값이 아닌 상태를 추적해서
		// 필터링 하는 로직이 필요
		// =>유효성 체크
		if (money <= 0)
			msg = "출금액은 0보다 커야합니다.";
		else if (this.money < money)
			msg = "출금액이 잔액보다 큽니다.";

		else
			this.money -= money;
	}

	@Override
	public void deposit(int money) {
		if(money <= 0)
			msg = "입금액은 0보다 커야합니다.";
		else
			this.money += money;
	}
}
