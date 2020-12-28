package service;

import java.sql.Connection;

import domain.UserVO;
import persistence.UserDAO;
import static persistence.JDBCUtil.*;
public class UserAddService {
	public boolean addUser(UserVO vo) throws Exception {
		boolean isInsertSuccess = false;
		// DAO 작업
		Connection con = getConnection();
		UserDAO dao= new UserDAO(con);
		
//		if(dao.insertUser(vo)) {
//			commit(con);
//			isInsertSuccess = true;
//		} else {
//			rollback(con);
//		}
		//프로시저 사용
		if(dao.insertNewUser(vo)) {
			isInsertSuccess = true;
		}
				
		close(con);
		return isInsertSuccess;
	}
	
}
