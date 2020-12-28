package member.service;

import java.sql.Connection;

import member.domain.MemberVO;
import member.persistence.MemberDAO;

import static member.persistence.JDBCUtil.*;


public class MemberAddService {
	public boolean MemberaddMember(MemberVO vo) {
		boolean isAddSuccess = false;
		
		//member를 입력하는 DAO를 호출 하여 DB작업하기
		//작업완료후 결과를 Action에 리턴
		Connection con = getConnection();
		MemberDAO dao= new MemberDAO(con);
	 
		int addResult= dao.memberInsert(vo);
		if(addResult>0) {
			isAddSuccess=true;
		commit(con);
			isAddSuccess = true;
		} else {
			rollback(con);
		}
		close(con);
	
		return isAddSuccess;
		
	}

	}

