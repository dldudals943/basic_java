package k_jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.Date;

import e_oop.ScanUtil;

public class JDBCBoard {

	public static void main(String[] args) {
		//오라클 데이터베이스에 생성한 게시판 테이블을 이용해 게시판 프로그램을 만들어주세요.
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		String user = "Lee";
		String password = "java";
		
		
		
		Connection con = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		
		
		while(true){
			int number = lastNumber(con, ps, rs, url, user, password)+1;
			entire(con, ps, rs, url, user, password);
			System.out.println("1. 조회	2.등록	0.종료");
			int n = ScanUtil.nextInt();
			switch(n){
			case 1 :
				System.out.println("조회하고 싶은 글의 번호를 입력해주세요");
				int m = ScanUtil.nextInt();
				if(0 < m && m < number) inquiry(m, con, ps, rs, url, user, password);
				else {System.out.println("테이블 범위를 벗어났습니다. 처음으로 돌아갑니다."); continue;}
				System.out.println("1. 수정    2.삭제    0.뒤로");
				int l = ScanUtil.nextInt();
				switch(l){
				case 1 : modify(m, con, ps, rs, url, user, password); break;
				case 2 : delete(m, con, ps, rs, url, user, password); break;
				case 0 : break;
				}
				break;
			case 2 :
				number = resist(number, con, ps, rs, url, user, password);
				break;
			case 0 :
				System.out.println("시스템이 종료됩니다.");
				System.exit(0);
				break;
			}
		}
	}

	private static int resist(int number, Connection con, PreparedStatement ps,
		ResultSet rs, String url, String user, String password) {
		System.out.println("제목을 입력해주세요.");
		String str1=ScanUtil.nextLine();
		System.out.println("작성자 이름을 입력해주세요.");
		String str2=ScanUtil.nextLine();
		System.out.println("내용을 입력해주세요.");
		String str3=ScanUtil.nextLine();
		SimpleDateFormat format1 = new SimpleDateFormat ("yyyy-MM-dd HH:mm:ss");
		Date time = new Date();
		String time1 = format1.format(time);
		
		String sql = "INSERT INTO TB_JDBC_BOARD (BOARD_NO, USER_ID, TITLE, CONTENTS, REG_DATE)"
				+ "VALUES ("+ number +", '" + str2 + "', '"+ str1 +"', '"+str3+"', TO_DATE('"+ time1 +"','YYYY-MM-DD HH24-MI-SS'))";
		
		int result = sqlu(con, ps, rs, sql, url, user, password);
		System.out.println(result + "개의 행이 등록되었습니다.");
		return ++number;
	}

	private static void delete(int m, Connection con, PreparedStatement ps,
			ResultSet rs, String url, String user, String password) {
			String sql = "DELETE FROM TB_JDBC_BOARD WHERE BOARD_NO = " + m;
			int result = sqlu(con, ps, rs, sql, url, user, password);
			System.out.println(result + "개의 행이 삭제되었습니다.");
		
	}

	private static void modify(int m, Connection con, PreparedStatement ps,
			ResultSet rs, String url, String user, String password) {
			System.out.println("제목을 입력해주세요.");
			String str1=ScanUtil.nextLine();
			System.out.println("작성자 이름을 입력해주세요.");
			String str2=ScanUtil.nextLine();
			System.out.println("변경할 내용을 입력해주세요.");
			String contents = ScanUtil.nextLine();
			SimpleDateFormat format1 = new SimpleDateFormat ("yyyy-MM-dd HH:mm:ss");
			Date time = new Date();
			String time1 = format1.format(time);
			String sql = "UPDATE TB_JDBC_BOARD SET TITLE = '"+ str1 +"',USER_ID = '"+ str2 + "', CONTENTS = '"+ contents +"', REG_DATE = TO_DATE('"+ time1 +"','YYYY-MM-DD HH24-MI-SS') WHERE BOARD_NO = " + m ;
			int result = sqlu(con, ps, rs, sql, url, user, password);
			System.out.println(result + "개의 행이 변경되었습니다.");
	}

	private static void inquiry(int m, Connection con, PreparedStatement ps,
			ResultSet rs, String url, String user, String password) {
			String sql = "SELECT * FROM TB_JDBC_BOARD WHERE BOARD_NO=";
			sql = sql + m;
			System.out.println("BOARD_NO\tUSER_ID\tTITLE\tREG_DATE");
			sqls(con, ps, rs, sql, url, user, password);
	
	}

	private static void entire(Connection con, PreparedStatement ps,
			ResultSet rs, String url, String user, String password) {
		String sql = "SELECT BOARD_NO, USER_ID, TITLE, REG_DATE FROM TB_JDBC_BOARD ORDER BY BOARD_NO DESC";
		System.out.println("BOARD_NO\tUSER_ID\t\tTITLE\t\tREG_DATE");
		sqls(con, ps, rs, sql, url, user, password);
		
	}
	
	private static void sqls(Connection con, PreparedStatement ps,
			ResultSet rs, String sql, String url, String user, String password) {
		try {
			con = DriverManager.getConnection(url,user,password);
			ps = con.prepareStatement(sql);
			rs = ps.executeQuery();
			ResultSetMetaData metaData = rs.getMetaData();
			int columnCount = metaData.getColumnCount();
			while (rs.next()) {
				for (int i = 1; i <= columnCount; i++) {
					Object obj = rs.getObject(i);
					System.out.print(obj + "\t\t");
				}
				System.out.println();
			}	
		} catch (SQLException e) {
			
			e.printStackTrace();
		}finally{
			if(rs!=null) try{rs.close();} catch(Exception e){}
			if(ps!=null) try{ps.close();} catch(Exception e){}
			if(con!=null) try{con.close();} catch(Exception e){}
		}
	
	}
	
	private static int sqlu(Connection con, PreparedStatement ps,
			ResultSet rs, String sql, String url, String user, String password){
		
		int result = 0;
		try {
			con = DriverManager.getConnection(url,user,password);
			ps = con.prepareStatement(sql);
			result = ps.executeUpdate();
		} catch (SQLException e) {
			
			e.printStackTrace();
		}finally{
			if(rs!=null) try{rs.close();} catch(Exception e){}
			if(ps!=null) try{ps.close();} catch(Exception e){}
			if(con!=null) try{con.close();} catch(Exception e){}
		}
		
		return result;
	}
	
	private static int lastNumber(Connection con, PreparedStatement ps,
			ResultSet rs, String url, String user, String password){
		int number = 0;
		String sql = "SELECT * FROM (SELECT BOARD_NO FROM TB_JDBC_BOARD ORDER BY BOARD_NO DESC) WHERE ROWNUM = 1";
		try {
			con = DriverManager.getConnection(url,user,password);
			ps = con.prepareStatement(sql);
			rs = ps.executeQuery();
			ResultSetMetaData metaData = rs.getMetaData();
			int columnCount = metaData.getColumnCount();
			while (rs.next()) {
				for (int i = 1; i <= columnCount; i++) {
					number = rs.getInt(i);
				}
			}	
		} catch (SQLException e) {
			
			e.printStackTrace();
		}finally{
			if(rs!=null) try{rs.close();} catch(Exception e){}
			if(ps!=null) try{ps.close();} catch(Exception e){}
			if(con!=null) try{con.close();} catch(Exception e){}
		}
		return number;
	}
	
}


