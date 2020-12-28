package member.action;

import java.util.Scanner;

import member.domain.MemberVO;
import member.service.MemberUpdateService;
import member.ui.MemberConsoleUtil;

public class MemberUpdateAction implements Action {

	@Override
	public void execute(Scanner sc) throws Exception {
		MemberConsoleUtil util = new MemberConsoleUtil();
		MemberVO updateMember=util.printUpdateMessage(sc);
		
		
		// MemberUpdateService 객체 생성후 메소드 호출
		MemberUpdateService service = new MemberUpdateService();
		
		// boolean update(MemberVO updateMember)
		boolean updateFlag = service.update(updateMember);
		
		//수정결과 출력하기
		util.printUpdateSuccessFail(updateFlag);
		 
	}	

}
