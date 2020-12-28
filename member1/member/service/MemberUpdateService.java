package member.service;

import java.sql.Connection;

import member.domain.MemberVO;
import static member.persistence.JDBCUtil.*;

import member.persistence.JDBCUtil;
import member.persistence.MemberDAO;

public class MemberUpdateService {
	//DAO에서 memberUpdate(MemberVO updateMember)를 호출하여 작업결과를 돌려받기
	
	public boolean update(MemberVO updateMember) {
		Connection con = getConnection();
		MemberDAO dao = new MemberDAO(con); //멤버 객채 생성
		
		//DAO에서 memberUpdate(MemberVO updateMember)를 호출 =>1(성공),0(실패)
		int result = dao.memberUpdate(updateMember); 
		
		//DB작업결과를 담을 변수 선언 
		boolean updateFlag = false;
		
		if(result>0) {
			//커밋
			JDBCUtil.commit(con);
			//리턴값 true
			updateFlag = true;
		}else {
			//롤백
			JDBCUtil.rollback(con);
		}
		return updateFlag;
	}
	
}
