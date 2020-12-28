package member.service;

import static member.persistence.JDBCUtil.*;

import java.sql.Connection;
import java.util.List;

import member.domain.MemberVO;
import member.persistence.MemberDAO;

public class MemberListSevice {
	//DAO의 memberList() 호출해서 ListAction으로 넘기기
	//return dao.memberList();
	public List<MemberVO> getList() {
 
		Connection con=getConnection(); //Connection con =JDBCUtil.getConnection();로 넣어도 된다.
		MemberDAO dao = new MemberDAO(con);
		List<MemberVO> list =dao.memberList();
		
		close(con);
		
		return list;

	}

}
