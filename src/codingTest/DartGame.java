package codingTest;

import java.util.Scanner;


public class DartGame {

	public static void main(String[] args) {

		System.out.println("다트게임의 결과를 입력해주세요.");
		Scanner s = new Scanner(System.in);
		String num = s.nextLine();
		String regExp = "\\D+";
		String[] number = num.split(regExp);
		regExp="\\d+";
		String[] special = num.split(regExp);
		int[] score = new int[3]; 

		for (int i = 0; i < 3; i++) {
			if (special[i + 1].contains("S")) {
				score[i] = (int)Math.pow((Integer.parseInt(number[i])),1);
			}
			if (special[i + 1].contains("D")) {
				score[i] = (int)Math.pow((Integer.parseInt(number[i])),2);
			}
			if (special[i + 1].contains("T")) {
				score[i] = (int)Math.pow((Integer.parseInt(number[i])),3);
			}
		}		
		
		for (int i = 0; i < 3; i++) {
			if (special[i + 1].contains("*")) {
				score[i] = score[i]*2;
				if (i>=1) score[i-1] = score[i-1]*2;
			}
			if (special[i + 1].contains("#")) {
				score[i] = score[i]*(-1);
			}
		}	
		int sum = 0;
		for (int i = 0; i < 3 ; i++){
			sum += score[i];
			System.out.println(score[i]);
		}
		System.out.println(sum);
		
		//나에겐 좀 어려운 문제였지만 어찌어찌 인터넷을 참고해가며 풀었다.
		
	}

}
