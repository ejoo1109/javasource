package member.action;

import java.util.Scanner;

import member.domain.*;
import member.persistence.JDBCUtil;
import member.service.MemberAddService;
import member.service.*;
import member.ui.*;

public class MemberAddAction implements Action {

	@Override
	public void execute(Scanner sc) throws Exception {
		//사용자로부터 입력받기 - MemberConsoleUtil의 getAddMember()
		MemberConsoleUtil console = new MemberConsoleUtil();
		MemberVO vo = console.getAddMember(sc);

		//입력받은 객체를 Service로 넘겨서 DB처리를 한 후 결과를 전송받아
		MemberAddService service = new MemberAddService();
		
		if (service.MemberaddMember(vo)) {
			//성공한 경우 메세지 출력 -MemberConsoleUtil의 printAddSuccessMessage()
			console.printAddSuccessMessage(vo.getName());
//		} else {
//			console.printAddFailMessage("sc.member()");
		}
	}
		

	}

