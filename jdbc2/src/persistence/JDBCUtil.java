package persistence;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class JDBCUtil {
	// 연결 클래스
	
	// 드라이버 로드
	static {
		try {
			Class.forName("oracle.jdbc.OracleDriver");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	// DB와 연결
	public static Connection getConnection() {
		Connection con = null;

		try {
			String url = "jdbc:oracle:thin:@localhost:1522:orcl";
			String user = "javadb";
			String password = "12345";
			con = DriverManager.getConnection(url, user, password);
			// auto commit 중지
			con.setAutoCommit(false);

		} catch (Exception e) {
			e.printStackTrace();
		}
		return con;
	}

	// 연결 종료 메소드
	public static void close(Connection con) {
		try {
			con.close();

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void close(PreparedStatement pstmt) {
		try {
			pstmt.close();

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	public static void close(ResultSet rs) {
		try {
			rs.close();

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	public static void commit(Connection con) {
		try {
			con.commit();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	public static void rollback(Connection con) {
		try {
			con.rollback();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	
}

