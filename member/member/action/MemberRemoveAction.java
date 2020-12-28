package member.action;

import java.util.Scanner;

import member.service.MemberRemoveService;
import member.ui.MemberConsoleUtil;


public class MemberRemoveAction implements Action {
 
	@Override
	public void execute(Scanner sc) throws Exception {
		//사용자에게 "삭제할 회원 id를 입력하세요" 출력하는 메소드 호출 ->ConsoleUtil에 작성
		MemberConsoleUtil util = new MemberConsoleUtil();
		int id = util.printRemoveMessage(sc);
		//리턴 받은 아이디를 service에게 넘겨서 삭제한 결과 전송받기
		MemberRemoveService service = new MemberRemoveService();
		
		//삭제결과에 따라 메시지->ConsoleUtil에 만들고 출력하기
		if(service.member_Remove(id)) {
			util.printRemoveSuccessMessage();
		}else {
			util.printRemoveFailMessage();

	}

}
}