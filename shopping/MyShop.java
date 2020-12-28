package shopping;

import java.util.ArrayList;
import java.util.Scanner;

public class MyShop implements Ishop {
	private String title; //쇼핑몰 이름
	Product[] products = new Product[10]; //등록상품 정보
	ArrayList<Product> carts = new ArrayList<Product>(); //장바구니
	User user[]=new User[2]; //사용자
	Scanner scan = new Scanner(System.in);//사용자로부터 키보드 입력
	
	int selUser;

	@Override
	public void setTitle(String title) {
		this.title = title;	
	}

	@Override
	public void genUser() {
		//쇼핑몰 사용자 생성후 배열에 담기
		//User 객체를 이용
//		User user1 = new User("홍길동", PayType.CARD);
//		User user2 = new User("김일이", PayType.CASH);	
//		
//		user[0] = user1;
//		user[1] = user2;
		
		user[0] = new User("홍길동", PayType.CARD);
		user[1] = new User("김일이", PayType.CASH);
	}

	@Override
	public void genProduct() { //쇼핑몰에서 판매하는 제품 생성
		//CellPhone, SmartTv로 각 5개씩 생성
		products[0] = new CellPhone("갤럭시s20",1000000,"SK");
		products[1] = new CellPhone("VELVET",100000,"LG");
		products[2] = new CellPhone("갤럭시Z flip",20000000,"SK");
		products[3] = new CellPhone("갤럭시s10",800000,"SK");
		products[4] = new CellPhone("갤럭시s10e",900000,"SK");
		products[5] = new SmartTV("SmartTV1",5000000,"4K");
		products[6] = new SmartTV("SmartTV2",4000000,"8K");
		products[7] = new SmartTV("SmartTV3",2500000,"4K");
		products[8] = new SmartTV("SmartTV4",3000000,"8K");
		products[9] = new SmartTV("SmartTV5",2800000,"4K");
	}

	@Override
	public void start() {//시작하는 메서드
		System.out.println(title+"  :  메인화면 - 계정선택 ");
		System.out.println("============================");

		int i = 0;
		for(User u:user) {
			System.out.printf("[%d] %s(%s)\n",i++,u.getName(),u.getpayType());
		}
		System.out.println("[X]종  료");
		System.out.print("선택 : ");
		
		//사용자한테 user 번호를 입력받은 후 제품 목록 출력하기
		String input = scan.next();
		switch (input) {
		case "0": case "1":
			System.out.println("### " + input + " 선택 ###");
			selUser = Integer.parseInt(input);
			productList();
			break;
			
		case "X" : case "x" :
			System.out.println("shop을 종료합니다.");
		default:
			System.out.println("\n입력값을 확인해 주세요\n");
			start();
			break;
		}
	}


	public void productList() {
		//제품 목록 출력하기
		System.out.println(title+"  :  상품목록 - 상품선택 ");
		System.out.println("============================");
		
		int i=0;
		for(Product p:products) {
			System.out.printf("[%d]",i++);
			p.printDetail();
		}
		System.out.println("[h] 메인화면");
		System.out.println("[c] 체크아웃");
		System.out.print("선택 : ");
		
		//0~9, h, c 입력받기
		String input = scan.next();
		
		//입력값에 의해 처리하기
		switch (input) {
		case "h":
			start();
			break;
		case "c":
			checkout();
			break;
		case "0" : case "1" : case "2" : case "3" : 
		case "4" : case "5" : case "6" : case "7" :    
		case "8" : case "9" :
			//카트에 담기
			carts.add(products[Integer.parseInt(input)]);
			//다시 상품 목록 보여주기
			productList();
			break;
		default:
			System.out.println("입력값을 확인해 주세요");
			productList();
			break;
		}
	}
	public void checkout() {
		System.out.println(title+"  :  체크아웃 ");
		System.out.println("============================");
		
		int i=0;
		int total=0; //장바구니 금액 합계
		for(Product p:carts) {
			System.out.printf("[%d]%s(%s)\n",i++,p.getPname(),p.getPrice() );
			total += p.getPrice(); //장바구니 물건값 합계 구하기
		}
		
		System.out.println("============================");
		System.out.println("결제 방법:  "+user[selUser].getpayType());
		System.out.println("합계:  "+total+"원 입니다.");
		System.out.println("[p] 이전 , [q] 결제완료 ");
		System.out.print("선택 : ");
		
		//p : checkout() q: 프로그램 종료
		
		String input = scan.next();
		switch (input) {
		case "p":
			productList();
			break;
		case "q":
			System.out.println("결제가 완료되었습니다.");
			break;
		default:
				System.out.println("입력값을 확인해 주세요");
				checkout();
				break;
		}
	}
}



