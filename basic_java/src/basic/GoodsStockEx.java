package basic;

public class GoodsStockEx {

	public static void main(String[] args) {
		//GoodsStock 5개 생성하기
		GoodsStock goodsStock1 = new GoodsStock("a12345",5);
		GoodsStock goodsStock2 = new GoodsStock("b12345",10);
		GoodsStock goodsStock3 = new GoodsStock("c12345",15);
		GoodsStock goodsStock4 = new GoodsStock("d12345",20);
		GoodsStock goodsStock5 = new GoodsStock("e12345",25);
				
		//재고수량 증가, 감소 실행 시키기
		goodsStock1.addStock(5);
		System.out.println("현재 재고 수량 : "+ goodsStock1.subtractStock(10));
		
		//
		goodsStock2.addStock(5);
		System.out.println("현재 재고 수량 : "+ goodsStock2.subtractStock(7));
	} 

}
