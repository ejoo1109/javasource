package basic;

public class GoodsStock {
	//속성 - 상품코드(g1536), 재고수량(숫자)
	private String goodsCode;
	private int stockNum;

	public GoodsStock(String goodsCode, int stockNum) {
		super();
		this.goodsCode = goodsCode;
		this.stockNum = stockNum;
	}

	//기능 - 재고를 추가한다, 재고를 감소한다.
	
	public void addStock(int amount) {
		stockNum += amount;
	}
	public int subtractStock(int amount) {
		return stockNum = amount;
	}

	}

