package e_oop.score;

public class Score {

	public static void main(String[] args) {
		Student[] students = new Student[10];

		
		for(int i =0; i<students.length;i++){
			Student student = new Student();
			student.name = "학생" + (i+1);
			student.rank = 1;
			student.kor = (int)(Math.random()*101);
			student.eng = (int)(Math.random()*101);
			student.math = (int)(Math.random()*101);
			
			students[i] = student;
			}
		
		//성적처리 프로그램을 완성해주세요.
		int[] nameSum = new int[students.length];
		double[] nameAvg = new double[students.length];
		
		for(int i=0; i < students.length;i++){
				nameSum[i]=students[i].kor+students[i].eng+students[i].math;
				nameAvg[i]=Math.round(100*nameSum[i]/3.0)/100.0;
			}
		
		
		//석차구하기
		for (int i = 0; i < students.length; i++) {
			for (int j = 0; j < students.length; j++) {
				if (nameSum[i] < nameSum[j]) {
					students[i].rank++;
				}
			}
		}
		
		//석차순으로 정렬하기
		for (int i = 0 ; i < students.length-1; i++){
			int min = i;
			for(int j =i+1; j<students.length; j++){
				if(nameSum[j] > nameSum[min]){
					min = j;
				}
			}
			int temp;
			temp = nameSum[i];
			nameSum[i] = nameSum[min];
			nameSum[min] = temp;

			double temp2;
			temp2 = nameAvg[i];
			nameAvg[i] = nameAvg[min];
			nameAvg[min] = temp2;
			
			Student temp3;
			temp3 = students[i];
			students[i] = students[min];
			students[min] = temp3;
		}
		
		System.out.println("이름"+"\t"+"국어"+"\t"+"영어"+"\t"+"수학"+"\t"+"과목 합계"+"\t"+"과목 평균"+"\t"+"석차");
		
		for(int i =0; i < students.length;i++){
			System.out.print(students[i].name+"\t"+students[i].kor+"\t" +students[i].eng+"\t"+students[i].math+"\t"+nameSum[i]+"\t"+nameAvg[i]+"\t"+students[i].rank);
			System.out.println();
		}
	
		int[] subSum = new int[3];
		double[] subAvg = new double[3];
		
		for (int i = 0 ; i < 3 ; i++){
			for(int j = 0 ; j < students.length ; j++){
				if (i==0) subSum[i] += students[j].kor;
				if (i==1) subSum[i] += students[j].eng;
				if (i==2) subSum[i] += students[j].math;
			}
			subAvg[i] = Math.round(100*subSum[i]/students.length)/100.0;
		}
		
		
		
		
		System.out.print("과목별 합계");
		for(int i = 0 ; i < 3 ; i++){
			System.out.print(subSum[i]+"\t");
		}
		System.out.println();
		
		System.out.print("과목별 평균");
		for(int i = 0 ; i < 3 ; i++){
			System.out.print(subAvg[i]+"\t");
		}
		
		
		//Student 클래스에 sum 이랑 avg가 이미 있었네 그것도 모르고 쌩으로 또 만들어서 낭비함
		//공유폴더에 선생님 코딩이 있음
		
		
		
	}

}
