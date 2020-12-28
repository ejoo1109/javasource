package basic;

public class Account {
	//속성: 계좌번호 (011-10-1000), 이름, 잔액(정수)

	private String accountNo;
	private String owner;
	private int balance;
	
	public int getBalance() {
		return balance;
	}
		   
	public Account(String accountNo, String owner, int balance) {
		super();
		this.accountNo = accountNo;
		this.owner = owner;
		this.balance = balance;
	}
 

	//기능: 입금한다, 출금한다 => 금액을 받아서 처리
	void deposit(int amount) {
		balance += amount;
	}
	
	int withdraw(int amount) throws Exception {
		if (balance < amount)
			throw new Exception("�옍�븸�씠 遺�議깊빀�땲�떎");
		
		return balance -= amount;
		
	}
}
