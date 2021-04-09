package k_jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;

public class SELECT {

	public static void main(String[] args) {
		
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		String user = "Lee";
		String password = "java";
		
		Connection con = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		
		try {
			con = DriverManager.getConnection(url,user,password);
			String sql = "SELECT * FROM EMP";
			ps = con.prepareStatement(sql);
			rs = ps.executeQuery();
			ResultSetMetaData metaData = rs.getMetaData();
			int columnCount = metaData.getColumnCount();
			while (rs.next()) {
				for (int i = 1; i <= columnCount; i++) {
					Object obj = rs.getObject(i);
					System.out.print(obj + "\t");
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

}
