package basic;

public class CheckingAccountEx {

	public static void main(String[] args) {
		// CheckingAccount 객체 생성후 메소드 테스트
		 
		CheckingAccount check1 = new CheckingAccount("110-111-1234", "홍길동", 1000000, "1234-1234-1234");
		
		//예금한다.
		check1.deposit(150000);
		//출금한다.
		try {
			System.out.println("현재잔액 : "+check1.withdraw(400000));
		} catch (Exception e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		//직불카드 사용액을 지불한다.
		try {
			System.out.println("직불카드 사용 후 잔액 : " + check1.pay("1234-1234-1234", 500000));
		} catch (Exception e) {
			e.printStackTrace();
		}  

		
	}

}
