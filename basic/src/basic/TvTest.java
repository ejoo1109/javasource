package basic;

public class TvTest {

	public static void main(String[] args) {
		//인스턴스(객체) 생성 => 생성자
		//객체를 생성할 때 아무런 인자도 넣지 않는다면 default 생성자 호출
		TV t1 = new TV();
		TV t2 = new TV(true,11,153);
		
//		System.out.println("t1 채널 값 : "+ t1.channel);
//		
//		t1.channel = 8;
//		System.out.println("t1 채널 값 : "+t1.channel);
//TV클래스에 private를 붙여서 참조변수로 바로 부를수 없음
		 
		t1.channelUp();
		
		//리턴 타입이 있는 메소드를 호출 한다면 
		
		//처리방법1) 출력문에서 확인하기 
		System.out.println(t1.getChannel());
	
		//처리방법2) 넘어오는 값 받기
		int channel_no = t1.getChannel();
		//받아서 다른 처리가 가능함
		
		//리턴 타입이 없는 메소드= void 처리는 호출만 가능.출력도 안됨
		t1.channelUp();
		//System.out.println(t1.channelDown());
		
		
	}

}
