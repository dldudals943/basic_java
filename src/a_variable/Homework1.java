package a_variable;

import java.util.Scanner;

public class Homework1 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in) ;
		System.out.println("========== 회원가입 ==========");
		System.out.print("아이디>");
		String id = sc.nextLine();
		System.out.print("비밀번호>");
		int password = Integer.parseInt(sc.nextLine());
		System.out.print("이름>");
		String name = sc.nextLine();
		System.out.print("나이>");
		int age = Integer.parseInt(sc.nextLine());
		System.out.print("키>");
		float height = Float.parseFloat(sc.nextLine());
		System.out.println("회원가입 완료!!");
		System.out.println("========== 내 정보 ==========");
		System.out.println("아이디 : " + id);
		System.out.println("비밀번호 : " + password);
		System.out.println("이름 : " + name);
		System.out.println("나이 : " + age);
		System.out.println("키 : " + height);
		System.out.println("==========================");
	}

}
