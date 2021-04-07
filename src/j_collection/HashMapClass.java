package j_collection;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.Set;

public class HashMapClass {

	public static void main(String[] args) {
		/*
		 * Object put(Object key, Object value) : 지정된 키와 값을 저장한다.
		 * Object remove(Object key) : 지정된 키로 지정된 값을 제거한다.
		 * Object get(Object key) : 지정된 키의 값(없으면 null)을 반환한다.
		 * Set keySet() : 지정된 키의 모든 키를 Set 으로 반환한다.
		 */
		
		
		HashMap<String, Object> map = new HashMap<>();
		
		map.put("age", 10);
		map.put("name", "홍길동");
		map.put("date", new Date());
		
		System.out.println(map);
		
		map.put("name", "이순신");
		
		System.out.println(map);
		
		map.remove("age");
		
		System.out.println(map);
		
		String str = (String)map.get("name");
		Object value = map.get(str);
		
		Set<String> keys = map.keySet();
		//set은 중복값을 허용하지 않고 set에서 값을 꺼내올수 있는 메서드가 존재하지 않음
		
		for(String key : keys){
			System.out.println(key + map.get(key));
		}
		
		HashMap<String, Object> row = new HashMap<>();
		row.put("id", "admin");
		row.put("password", "admin123");
		row.put("name", "관리자");
		row.put("tel", "010-1234-5678");
		
		ArrayList<HashMap<String, Object>> table = new ArrayList<>();
		table.add(row);
		System.out.println(table);
		
		row = new HashMap<>();
		row.put("id", "user");
		row.put("password", "user123");
		row.put("name", "유저");
		row.put("tel", "010-1234-5678");
		
		table.add(row);
		System.out.println(table);
		
		//-----------------------------------------------
		table = new ArrayList<>();
		
		row = new HashMap<>();
		row.put("LPROD_ID", 1);
		row.put("LPROD_GU", "P101");
		row.put("LPROD_NM", "컴퓨터제품");
		table.add(row);
		
		row = new HashMap<>();
		row.put("LPROD_ID", 2);
		row.put("LPROD_GU", "P102");
		row.put("LPROD_NM", "전자제품");
		table.add(row);
		
		row = new HashMap<>();
		row.put("LPROD_ID", 3);
		row.put("LPROD_GU", "P201");
		row.put("LPROD_NM", "여성캐주얼");
		table.add(row);
		
		row = new HashMap<>();
		row.put("LPROD_ID", 4);
		row.put("LPROD_GU", "P202");
		row.put("LPROD_NM", "남성캐주얼");
		table.add(row);
		
		row = new HashMap<>();
		row.put("LPROD_ID", 5);
		row.put("LPROD_GU", "P301");
		row.put("LPROD_NM", "피혁잡화");
		table.add(row);
		
		System.out.println("LPROD_ID\tLPROD_GU\tLPROD_NM");
		for(int i = 0 ; i < table.size(); i++){
			HashMap<String, Object> _row = table.get(i);
			System.out.println(_row.get("LPROD_ID") + "\t\t"
					+ _row.get("LPROD_GU") + "\t\t" + _row.get("LPROD_NM"));
		}
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
