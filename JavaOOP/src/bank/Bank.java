package bank;

public class Bank implements BankRole{
	//필드
	//은행은 통장을 여러개를 관리한다.
	//따라서 필드에 인스턴스변수 하나를 지정하지 않고 
	//여러개를 담을 수 있는 배열을 지정 한다.
	//아래 배열은 은행의 입장에서 보면 계좌를 관리하는 디비
	private BankBook[] bankBookList;
	private int count; //은행에서 관리하는 통장 갯수
	
	
	//배열,자료구조(컬렉션)을 보유하는 
	//객체를 만들고자 할 때는 그 객체의 생상저아에 배열,자료구조의 객체를 생성해준다.
	//생성자
	public Bank(int count){
		bankBookList = new BankBook[count];
	}
	/*
	 * getter/setter
	 * */	
	public BankBook[] getBankBookList() {
		return bankBookList;
	}

	public int getCount() {
		return count;
	}

	public void setBankBookList(BankBook[] bankBookList) {
		this.bankBookList = bankBookList;
	}

	public void setCount(int count) {
		this.count = count;
	}
	
	//계좌개설
	/*
	 * 계좌번호,계좌주,비번,잔액 만 입려가면 통장을 만들어준다는 조건
	 * */
	
	@Override
	public void openAccount(String ownerName, int password, int restMoney) {
		BankBook bankBook = new BankBook(ownerName);
		bankBook.setPass(password);
		bankBook.deposit(restMoney);
		//통장을 개설하자마자 은생전산 db에 통장정보 저장 개념
		bankBookList[count] = (BankBook) bankBook;
		this.count++;	//전체 은행에 개설된 통장 갯수 1증가
		System.out.println(bankBook.showAccount());
	}

	//계좌검색(계좌번호) -> 리턴결과 : 계좌 1개
	@Override
	public BankBook searchAccountByAccountNo(String accountNo) {
		BankBook account = null;
		//String -> int로 변경해야할경우
		int serarchAccountNo = Integer.parseInt(accountNo);
		for (int i = 0; i < this.count; i++) {
			/*
			 * 문자타입(String)이 서로 같은지 여부는 .equals()
			 * 숫자타입(int)가 서로 같은지 여부는 ==
			 * */
			if (bankBookList[i].getBankbookNo()==serarchAccountNo) {
				account = bankBookList[i];
			}
		}
		return account;
	}
	
	//계좌검색(이름으로검색) -> 리턴결과 : 1개이상
	@Override
	public BankBook[] searchAccountByName(String ownerName) {
		//BankBook[] accounts = null;
		//searchAccountByName()메소드를 호출하면
		//자동으로 searchCountByName()메소드를 먼서 호출하라
		int tempCount = this.searchCountByName(ownerName);
		if(tempCount == 0){
			return null;
		}
		BankBook[] accounts = new BankBook[tempCount];
		tempCount = 0;
		
		for(int i = 0; i < accounts.length; i++){
			if (bankBookList[i].getName().equals(ownerName)){
				accounts[tempCount] = bankBookList[i];
				tempCount++;				
			}
		}
		return accounts;		
	}
	
	//계좌검색(이름으로검색) -> 리턴결과 : 숫자
	@Override
	public int searchCountByName(String name) {
		//for문을 돌면서 파라미터로 받은 이름과 동일한 계좌가 있다면
		//count를 0에서 1씩 증가시켜라
		int count = 0;
		for (int i = 0; i < this.getCount(); i++) {
			if (bankBookList[i].getName().equals(name)) {
				count++;
			}
		}
		return count;
	}
	
	//계좌해지 -> 리턴결과 : true of false
	@Override
	public boolean closeAccount(String accountNo) {
		//flag은 삭제가 성공적으로 이뤄주면 true를 리턴하고
		//삭제할게 없으면 false를 리턴
		boolean closeOk = false;
		
		//String(a문자열)로 들어온 값을 숫자로 바꿔서 비교
		BankBook bankBook = this.searchAccountByAccountNo(accountNo);
		if(bankBook == null){
			System.out.println("해당 계좌가 존재하지 않습니다.");
			return closeOk;			
		}
		int searchAccountNo = Integer.parseInt(accountNo);
				
		for (int i = 0; i < this.count; i++) {
			if(bankBookList[i].getBankbookNo()==searchAccountNo){
				
				/*
				 * j = 1 인 이유는 홍길동의 걔좌가 은행 전체계와의 50번째라면
				 * 내부 for문에서 다시 처음 0부터 회전하지 않고 
				 * 홍길동의 계좌가 있는 인덱스 번호부터 뒤에있는 계좌를 덮어쓰는 방식으로
				 * 진행한뒤 맨 마지막 인덱스 번호를 제거하면 은행에서 전체 계좌가
				 * 100개가 있는상황이라면 홍길동이 삭제된후 전체계좌수는 99개가 될것이다.
				 * 그래서 this.count -1을 해준다.
				 * */
				for (int j = i; j < this.count-1; j++) {
					bankBookList[i] = bankBookList[j+1];
				}
				count--;
				closeOk = true;
			}
		}
		return closeOk;
	}
}
