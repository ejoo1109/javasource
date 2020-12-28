package member.action;

import java.util.List;
import java.util.Scanner;

import member.domain.MemberVO;
import member.service.MemberListSevice;
import member.ui.MemberConsoleUtil;

public class MemberListAction implements Action {
 
	@Override
	public void execute(Scanner sc) throws Exception {
		//ListService 메소드 호출해서 결과받기
		
		MemberListSevice service = new MemberListSevice();
		List<MemberVO> memlist = service.getList();
		
		//결과로 받은 list를 화면에 출력하기
		MemberConsoleUtil console = new MemberConsoleUtil();
		console.printMemberList(memlist);
	}

}
