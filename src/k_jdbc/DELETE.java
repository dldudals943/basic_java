package k_jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class DELETE {

	public static void main(String[] args) {
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		String user = "Lee";
		String password = "java";
		
		Connection con = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		
		try {
			con = DriverManager.getConnection(url,user,password);
			String sql = "DELETE FROM emp WHERE empno = 7777";
			//emp 테이블에서 ename이 normal인 행의 empno를 9999로 만든다.
			ps = con.prepareStatement(sql);
			int result = ps.executeUpdate();
			System.out.println(result + "개의 행을 삭제했습니다.");
		} catch (SQLException e) {
			
			e.printStackTrace();
		}finally{
			if(rs!=null) try{rs.close();} catch(Exception e){}
			if(ps!=null) try{ps.close();} catch(Exception e){}
			if(con!=null) try{con.close();} catch(Exception e){}
		}


	}

}
