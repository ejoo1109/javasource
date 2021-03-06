package member.domain;

public class MemberVO {
//	id number primary key,
//	name varchar2(10) unique not null,
//	addr varchar2(50) not null,
//	nation varchar2(12) not null,
//	email varchar2(30) not null,
//	age 
		
	private int id;
	private String name;
	private String addr;
	private String nation;
	private String email;
	private int age;

	//생성자 오버로딩
	public MemberVO() {
		super();
	}

	public MemberVO(String name, String addr, String nation, String email, int age) {
		super();
		this.name = name;
		this.addr = addr;
		this.nation = nation;
		this.email = email;
		this.age = age;
	}


	public MemberVO(int id, String name, String addr, String nation, String email, int age) {
		super();
		this.id = id;
		this.name = name;
		this.addr = addr;
		this.nation = nation;
		this.email = email;
		this.age = age;
	}


	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddr() {
		return addr;
	}

	public void setAddr(String addr) {
		this.addr = addr;
	}

	public String getNation() {
		return nation;
	}

	public void setNation(String nation) {
		this.nation = nation;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	} 

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	
}

	

