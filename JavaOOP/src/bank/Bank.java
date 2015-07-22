package bank;

public class Bank implements BankRole{
	
	//생성자
	public Bank(){
		
	}
	//계좌개설
	@Override
	public void openAccount(String accountNo, String ownerName, String password, int resMoney) {
		
	}
	
	//계좌검색(계좌번호) -> 리턴결과 : 계좌 1개
	@Override
	public Account searchAccountByAccountNo(String accountNo) {
		Account account = null;
		return account;
	}
	
	//계좌검색(이름으로검색) -> 리턴결과 : 1개이상
	@Override
	public Account[] searchAccountByName(String ownerName) {
		Account[] accounts = null;
		return accounts;
	}
	
	//계좌검색(이름으로검색) -> 리턴결과 : 숫자
	@Override
	public int searchCountByName(String name) {
		int count = 0;
		return count;
	}
	
	//계좌해지 -> 리턴결과 : true of false
	@Override
	public boolean closeAccount(String accountNo) {
		boolean flag = false;
		if (flag) {
			
		}else{
			
		}
		return flag;
	}

}
