package k_jdbc;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class JDBCTest {
	public static void main(String[] args) {
		
		JDBCUtil jdbc = JDBCUtil.getInstance();
		
		String sql = "select * from cart where cart_member = ?";
		List<Object> param = new ArrayList<>();
		param.add("a001");
		
		List<Map<String, Object>> List = jdbc.selectList(sql, param);
		
		System.out.println(List);
		
		String sql1 = "select * from cart where cart_member = 'a001'";
		List<Map<String, Object>> List1 = jdbc.selectList(sql1);
		
		System.out.println(List1);
		
		String sql2 = "update cart set cart_qty = 6 where CART_PROD='P101000001' and CART_NO=2005040100001 and CART_MEMBER='a001'";
		int result = jdbc.update(sql2);
		
		System.out.println(result);
	}
}
