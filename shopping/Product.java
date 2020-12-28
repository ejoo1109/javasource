package shopping;

public abstract class Product {
	private String pname;
	private int price;
	
	public Product(String pname, int price) {
		super();
		this.pname = pname;
		this.price = price;
	}
	void printDetail() {
		System.out.println("상품이름 : " + pname);
		System.out.println("가격 : "+ price);
		printExtra();
	}
	abstract void printExtra();
	
	public String getPname() {
		return pname;
	}
	public void setPname(String pname) {
		this.pname = pname;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	

	
}
