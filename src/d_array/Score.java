package d_array;

import java.util.Arrays;

public class Score {

	public static void main(String[] args) {
	/*
	 * 우리반 모두의 국어, 영어, 수학, 사회, 과학, Oracle, Java 점수를
	 * 0~100 사이의 랜덤값으로 생성해주시고, 아래와 같이 출력해주세요.
	 * 
	 * 이름		국어		영어		수학		사회		과학		Oracle		Java		합계		평균		석차
	 * 홍길동		90		90		90		90		90		90			90			630		90.0	1
	 * 홍길동		90		90		90		90		90		90			90			630		90.0	1
	 * 홍길동		90		90		90		90		90		90			90			630		90.0	1
	 * 홍길동		90		90		90		90		90		90			90			630		90.0	1
	 * 홍길동		90		90		90		90		90		90			90			630		90.0	1
	 * 홍길동		90		90		90		90		90		90			90			630		90.0	1
	 * 과목합계	450		450		450		450		450		450			450
	 * 과목평균	90.0	90.0	90.0	90.0	90.0	90.0		90.0
	 * 
	 */

		//우리반의 인원수 25 명 과목수 7개
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
		int[][] scores = new int[25][7];
		int[] sum = new int[25]; // 각 학생의 점수 총합
		double[] avg = new double[25]; // 각 학생의 평균
		int[] rank = new int[25]; // 각 학생의 석차
		int[] subsum = new int[7]; // 과목별 총합
		double[] subavg = new double[7]; // 과목별 평균 
		
		
		
		
		for(int i = 0; i < scores.length;i++){
			for(int j =0; j < scores[i].length ; j++){
				scores[i][j] = (int)(Math.random()*101); //랜덤 생성
				sum[i] += scores[i][j]; //바로 더하기
			}
			avg[i] = (double)(100*sum[i]/scores[i].length)/100; //바로 나눠서 평균내기 그리고 소수점 둘째자리까지 표현하기
		}
		
		//일단 25명의 7개의 과목의 점수를 랜덤생성하면서 총합과 평균을 구했다.
		
		for(int i = 0 ; i < scores.length; i++){
			for(int j = 0 ; j < scores.length ; j++){
				if (sum[i]<sum[j]){
					rank[i]++;
				}
			}
			rank[i]++;
		}
		//sum 값을 비교하여 석차를 구했다.
		
		for(int i = 0; i < scores[0].length ; i++){
			for(int j = 0; j < scores.length ; j++){
				subsum[i] += scores[j][i];
			}
			subavg[i] = (double)(100*subsum[i]/scores.length)/100 ;
		}
		//과목별 총합과 평균 구하기
		
		int[][] new_scores = new int[25][7]; //석차대로 정렬하기 위한 새로운 2차원 배열
		String[] new_name = new String[25]; //석차정렬을 위한 새로운 이름 배열
		int[] new_sum = new int[25]; //석차정렬을 위한 새로운 학생당 합계 배열
		double[] new_avg = new double[25]; //석차 정렬을 위한 새로운 학생당 평균 배열
		int[] new_rank = new int[25]; // 석차 정렬을 위한 새로운 석차
		
		for(int i = 0; i < scores.length ; i ++){
			for(int j=0; j < scores[i].length; j++){
				new_scores[i][j] = -1;
			}
		}
		
		
		
		
		
		for(int i = 0; i < scores.length ; i++){
			int j = 0;
			if(new_scores[rank[i]-1][j]==-1){
			new_name[rank[i]-1] = name[i];
			new_avg[rank[i]-1] = avg[i];
			new_sum[rank[i]-1] = sum[i];
			new_rank[rank[i]-1] = rank[i];}
			else{
				new_name[rank[i]] = name[i];
				new_avg[rank[i]] = avg[i];
				new_sum[rank[i]] = sum[i];
				new_rank[rank[i]] = rank[i];
			}
			for(j = 0; j < scores[i].length; j++){
				if(new_scores[rank[i]-1][j]==-1){
				new_scores[rank[i]-1][j] = scores[i][j];
				}
				else{
					new_scores[rank[i]][j] = scores[i][j];
				}
			}
		}
		//새 배열에 석차대로 이름과 점수를 입력했다.
		//동일 석차의 경우를 신경썼다. 코드가 길어졌다.
		
		
		System.out.println(" 이름		국어		영어		수학		사회		과학		Oracle		Java		합계		평균		석차");
		for(int i = 0; i < scores.length ; i++){
			System.out.print(new_name[i]);
			System.out.print("\t\t");
			for(int j=0; j < scores[i].length ; j++){
				System.out.print(new_scores[i][j]);
				System.out.print("\t\t");
			}
			System.out.println(new_sum[i] +"\t\t" + new_avg[i] + "\t\t" + new_rank[i]);
		}
		System.out.print("과목합계");
		for(int i = 0 ; i < scores[0].length ; i++){
			System.out.print("\t\t"+subsum[i]);
		}
		System.out.println();
		System.out.print("과목평균");
		for(int i = 0 ; i < scores[0].length ; i++){
			System.out.print("\t\t"+subavg[i]);
		}
		
		//출력하기
		System.out.println();
		//System.out.println(Arrays.toString(rank));
		
		//내일 시험에 나옵니다.
		//공동 등수가 있을 경우를 어떻게 해야겠다.
		//15문제로 쪼개서 볼건데 compile에러가 없어야함
		//선생님 코딩과 비교해봤을때 나의 경우 석차 정렬이 rank값이 있어서 새로 넣는게 편하다고 판단했는데
		//동일 등수 문제도 있고 더 복잡해지는 것 같다.
		//그냥 sum이나 rank비교를 통해서 같은 변수 내에서 정렬을 시켜버리는게 더 나은 것 같다.
		/*
		 * 그래서 내일 문제는
		 * 우리반 모두의 국어, 영어, 수학, 사회, 과학, Oracle, Java 점수를
		 * 0~100 사이의 랜덤값으로 생성해주시고, 아래와 같이 출력해주세요.
		 * 
		 * 석차 정렬 없이 출력만 하자.
		*/
	}

}
