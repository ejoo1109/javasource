package shopping;

public class ShopLauncher {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyShop shop = new MyShop();
		
		//상점이름 지정
		shop.setTitle("MyShop");
		
		//User 생성
		shop.genUser();
		
		
		//제품 생성
		shop.genProduct();
		
		//상점 시작
		shop.start();
	}

}
