package j_collection;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Date;

import e_oop.ScanUtil;

public class Board {

	static ArrayList<HashMap<String, Object>> table = new ArrayList<>();
	static HashMap<String, Object> row = new HashMap<>();
	static int number = 1;
	
	public static void main(String[] args) {
		/*
		 * ArrayList와 HashMap을 사용해 게시판 테이블을 만들고
		 * 조회, 등록, 수정, 삭제가 가능한 게시판을 만들어주세요.
		 * 
		 * 번호(PK), 제목, 내용, 작성자, 작성일
		 * 
		 * 
		 * ------------------------------------
		 * 번호		제목		작성자		작성일
		 * ------------------------------------
		 * 4		안녕하세요	홍길동		4/7
		 * 3		안녕하세요	홍길동		4/7
		 * 2		안녕하세요	홍길동		4/7
		 * 1		안녕하세요	홍길동		4/7
		 * ------------------------------------
		 * 1. 조회	2.등록	0.종료
		 * 
		 * - 조회 후 수정 및 삭제 가능
		 */
		
		while(true){
			entire();
			System.out.println("1. 조회	2.등록	0.종료");
			int n = ScanUtil.nextInt();
			switch(n){
			case 1 :
				System.out.println("조회하고 싶은 글의 번호를 입력해주세요");
				int m = ScanUtil.nextInt();
				if(0 < m && m < number) inquiry(m);
				System.out.println("1. 수정    2.삭제");
				int l = ScanUtil.nextInt();
				switch(l){
				case 1 : modify(m); break;
				case 2 : delete(m); break;
				}
				break;
			case 2 :
				resist();
				break;
			case 0 :
				System.exit(0);
				break;
			}
		}

		
	}
	
	static void entire(){ //조회
		System.out.println("--------------------------------------------------");
		System.out.println("번호\t제목\t\t작성자\t\t작성일");
		System.out.println("--------------------------------------------------");
		
		for(int i = 0 ; i < table.size(); i++){
			HashMap<String, Object> _row = table.get(table.size()-i-1);
			
			System.out.println(_row.get("number") + "\t"
					+ _row.get("title") + "\t\t" + _row.get("user") + "\t\t" +_row.get("date"));

			
		}
	}
	
	static void resist(){
		System.out.println("제목을 입력해주세요.");
		String str1=ScanUtil.nextLine();
		System.out.println("작성자 이름을 입력해주세요.");
		String str2=ScanUtil.nextLine();
		System.out.println("내용을 입력해주세요.");
		String str3=ScanUtil.nextLine();
		
		row = new HashMap<>();
		row.put("number", number++);
		row.put("title", str1);
		row.put("user", str2);
		row.put("contents", str3);
		row.put("date", new Date());
		table.add(row);
	}
	
	static void inquiry(Object number){
		for(int i = 0 ; i < table.size() ; i ++){
			HashMap<String, Object> _row = table.get(i);
			Object n = _row.get("number");
			if(n == number){
				System.out.println("--------------------------------------------------");
				System.out.println(_row.get("number") + "\t"
						+ _row.get("title") + "\t\t" + _row.get("user") + "\t\t" +_row.get("date"));
				System.out.println("--------------------------------------------------");
				System.out.println(_row.get("contents"));
				
			}
		
	}
	}
	static void delete(Object number){
		
		for(int i = 0 ; i < table.size() ; i ++){
			HashMap<String, Object> _row = table.get(i);
			Object n = _row.get("number");
			if(n == number){
				table.remove(i);
			}
		}
	}
	
	static void modify(Object number){
		System.out.println("제목을 입력해주세요.");
		String str1=ScanUtil.nextLine();
		System.out.println("작성자 이름을 입력해주세요.");
		String str2=ScanUtil.nextLine();
		System.out.println("내용을 입력해주세요.");
		String str3=ScanUtil.nextLine();
		row = new HashMap<>();
		row.put("number", number);
		row.put("title", str1);
		row.put("user", str2);
		row.put("contents", str3);
		row.put("date", new Date());
		for(int i = 0 ; i < table.size() ; i ++){
			HashMap<String, Object> _row = table.get(i);
			Object n = _row.get("number");
			if(n == number){
				table.set(i, row);
			}
		}
	}
}
