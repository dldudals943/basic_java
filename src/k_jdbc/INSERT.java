package k_jdbc;

import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class INSERT {

	public static void main(String[] args) {
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		String user = "Lee";
		String password = "java";
		
		Connection con = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		
		try {
			con = DriverManager.getConnection(url,user,password);
			String sql = "INSERT INTO emp (empno, ename, hiredate) VALUES (?, ?, ?)";
			
			ps = con.prepareStatement(sql);
			ps.setObject(1, 7777);
			ps.setObject(2, "normal");
			
			//날짜
			java.util.Date date = new java.util.Date();
			date.setYear(2021);
			date.setMonth(3);
			//심지어 월은 0부터 시작을해서 3을 넣으면 4월이다.
			date.setDate(9);
			date.setHours(16);
			date.setMinutes(42);
			date.setSeconds(30);
			//사용을 권장하지 않음
			ps.setDate(3, new Date(date.getTime()));
			ps.setDate(3,  Date.valueOf("2021-04-09"));
			//setObject를 기억해두자
			
			int result = ps.executeUpdate();
			System.out.println(result + "개의 행을 인서트했습니다.");
		} catch (SQLException e) {
			
			e.printStackTrace();
		}finally{
			if(rs!=null) try{rs.close();} catch(Exception e){}
			if(ps!=null) try{ps.close();} catch(Exception e){}
			if(con!=null) try{con.close();} catch(Exception e){}
		}

	}

}
