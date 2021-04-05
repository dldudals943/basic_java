package i_api;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegularExpression {
	public static void main(String[] args) {
		/*
		 * 정규표현식 : 문자열의 패턴을 검사하는 표현식
		 * 
		 * ^ 	뒷 문자로 시작
		 * $ 	앞 문자로 종료
		 * . 	임의의 문자(줄바꿈 제외)
		 * * 	앞 문자가 0개 이상
		 * + 	앞 문자가 1개 이상
		 * ? 	앞 문자가 없거나 1개
		 * [] 	문자의 집합이나 범위([a-z] : a부터 z까지, [^a-z]:a부터 z가 아닌 것)
		 * {} 	앞 문자의 개수({2}:2개, {2,4}:2개 이상 4개 이하 //주의사항 띄어쓰기 넣지 말 것
		 * () 	그룹화(1개의 문자처럼 인식)
		 * | 	OR 연산
		 * \s 	공백, 탭, 줄바꿈
		 * \S 	공백, 탭, 줄바꿈이 아닌 문자
		 * \w 	알파벳이나 숫자
		 * \W 	알파벳이나 숫자가 아닌 문자
		 * \d 	숫자
		 * \D 	숫자가 아닌 문자
		 * (?i) 뒷 문자의 대소문자 구분 안 함
		 * \ 	정규표현식에서 사용되는 특수문자표현
		 */
		
		String str = "abc123";
		//String regex = "abc123";
		//String regex = "[a-z]{3}[0-9]{1,3}";
//		String regex = "[a-z0-9]+";
//		String regex = "\\w*"; //java 에서 문자열안에 역슬래시를 넣고 싶으면 두 개를 넣어야한다.
		//String regex = ".*";
		
//		Pattern p = Pattern.compile(regex);
//		Matcher m = p.matcher(str);
//		System.out.println(m.matches());
		
		/*
		 * 아이디, 전화번호, 이메일주소의 유효성을 검사하는 정규표현식을 만들어주세요.
		 * 아이디 : [a-z0-9_-]{5,20};
		 * 전화번호 : ^0\\d{1,3}-\\d{3,4}-\\d{4}
		 * 이메일주소 : [a-z0-9_-]{5,20}@[a-zA-z]+\\.(?i)(com|net|org|([a-z]{2}\\.kr))$
		 * 
		 */
		
		
		String str1 = "dldudals943";
		
		String str2 = "password123";
		
		String str3 = "dldudals943@naver.com";
		
		String regex1 = "[a-z0-9-_]{5,20}";
		
		Pattern p1 = Pattern.compile(regex1);
		Matcher m1 = p1.matcher(str1);
		System.out.println(m1.matches());
		
		String regex2 = "[a-zA-Z0-9\\W]{8,16}";
		
		Pattern p2 = Pattern.compile(regex2);
		Matcher m2 = p2.matcher(str2);
		System.out.println(m2.matches());
		
		String regex3 = "[a-z0-9_-]{5,20}@[a-zA-z]+\\.(?i)(com|net|org|([a-z]{2}\\.kr))$";
		Pattern p3 = Pattern.compile(regex3);
		Matcher m3 = p3.matcher(str3);
		System.out.println(m3.matches());
		
		
		
		
	}
}
