package bank;

public class BankBook {

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
	
	public String getMsg() {
		return msg;
	}


	public void setName(String name) {
		this.name = name;
	}


	public void setMoney(int money) {
		this.money = money;
	}


	public void setBankbookNo(int bankbookNo) {
		this.bankbookNo = bankbookNo;
	}


	public void setMsg(String msg) {
		this.msg = msg;
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
	public String showAccount() {
		
		return "=================\n"
				+ "["+BANK+"]\n"
				+ "계좌번호 : "+bankbookNo+"\n"
				+ "이름 : "+name+	"\n"
				+ "잔액 : "+this.money+"원\n"
				+ "=================";
	}

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

	public void deposit(int money) {
		if(money <= 0)
			msg = "입금액은 0보다 커야합니다.";
		else
			this.money += money;
	}

}
