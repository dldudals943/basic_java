package k_jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;

public class CREATE {

	public static void main(String[] args) {
		
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		String user = "Lee";
		String password = "java";
		
		Connection con = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		
		try {
			con = DriverManager.getConnection(url,user,password);
			String sql = "CREATE OR REPLACE FUNCTION FN_CART_QAVG1(P_CODE IN PROD.PROD_ID%TYPE,P_YEAR CHAR) RETURN NUMBER IS V_RES NUMBER:=0;  V_QTY NUMBER:=0;  V_YEAR CHAR(5):=P_YEAR||'%';  BEGIN SELECT NVL(AVG(CART_QTY),0) INTO V_QTY FROM CART WHERE CART_PROD = P_CODE AND CART_NO LIKE V_YEAR; V_RES := V_QTY; RETURN V_RES; END;";
			ps = con.prepareStatement(sql);
			rs = ps.executeQuery();
			
				
		} catch (SQLException e) {
			
			e.printStackTrace();
		}finally{
			if(rs!=null) try{rs.close();} catch(Exception e){}
			if(ps!=null) try{ps.close();} catch(Exception e){}
			if(con!=null) try{con.close();} catch(Exception e){}
		}

	}

}
