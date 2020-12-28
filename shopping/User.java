package shopping;

public class User {
	private String name;
	private PayType payType;
		
	public User(String name, PayType payType) {
		super();
		this.name = name;
		this.payType = payType;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public PayType getpayType() {
		return payType;
	}
	public void setPaytype(PayType payType) {
		this.payType = payType;
	}
	
	
}
