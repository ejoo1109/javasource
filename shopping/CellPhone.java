package shopping;

public class CellPhone extends Product {
	private String carrier; //통신사
	
	
	public CellPhone(String pname, int price, String carrier) {
		super(pname, price);
		this.carrier = carrier;
	}


	@Override
	void printExtra() {
		System.out.println("통신사 정보 : "+ carrier);

	}

}
