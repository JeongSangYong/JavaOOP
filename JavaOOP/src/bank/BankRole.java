package bank;

public interface BankRole {
	
	//계좌 개설 기능
	public void openAccount(String accountNo, String ownerName, 
			String password, int resMoney);
	
	//계좌 번호를 입력하면 계좌 내용이 출력
	public abstract Account searchAccountByAccountNo(String accountNo);
	
	//계좌주 이름을 입력하면 그 사람 소유의 계좌가 전부 검색(단, 동일인이 다수의 계좌를 가질 수 있다.)
	public Account[] searchAccountByName(String ownerName);
	
	//계좌주 이름을 입력하면 그 사람 소유의 계좌 갯수를 알려줌
	public int searchCountByName(String name);
	
	//계좌번호로 특정계좌를 폐기하는 기능
	public boolean closeAccount(String accountNo);
}