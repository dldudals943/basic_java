package d_array;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class RandomStudents {

	public static void main(String[] args) {

		//입력한 숫자만큼 우리반 학생들 중 랜덤으로 뽑아서 출력하는 프로그램을 만들어주세요.
		Scanner s = new Scanner(System.in);
		//1에서 25
		System.out.println("1에서 25사이의 숫자를 입력해주세요.");
		int n = Integer.parseInt(s.nextLine());
		String[] name = new String[25];
		name[0]="강유진";
		name[1]="강지수";
		name[2]="곽재우";
		name[3]="구본성";
		name[4]="권수연";
		name[5]="김보영";
		name[6]="김소희";
		name[7]="김지수";
		name[8]="백지혜";
		name[9]="송유경";
		name[10]="신희철";
		name[11]="심선주";
		name[12]="오수연";
		name[13]="윤희중";
		name[14]="이경준";
		name[15]="이석호";
		name[16]="이승구";
		name[17]="이여강";
		name[18]="이영민";
		name[19]="이영우";
		name[20]="이용석";
		name[21]="이정범";
		name[22]="최기문";
		name[23]="최소은";
		name[24]="최윤지";
		
		Random rand = new Random();
		rand.setSeed(System.nanoTime());
		int bound = 25;
		int ran = rand.nextInt(bound);
		
		
		for(int i = 0; i < n; i++){
			String temp = name[i];
			
			name[i] = name[ran];
			name[ran] = temp;
		}
		String[] name2 = new String[n];
		for(int i = 0 ; i < n; i++){
			name2[i]=name[i];
		}
		
		
		System.out.println(Arrays.toString(name2));
		
		
	}
}
