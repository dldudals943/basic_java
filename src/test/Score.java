package test;

import java.util.ArrayList;

public class Score {

	public static void main(String[] args) {
		/*
		 * 우리반 모두의 국어, 영어, 수학, 사회, 과학, Oracle, Java 점수를
		 * 0~100까지의 랜덤값으로 생성해주시고, 아래와 같이 출력해주세요.
		 * 
		 * 이름 국어 영어 수학 사회 과학 Oracle java 합계 평균 석차
		 * 홍길동 90 90 90 90 90 90 90 630 90 1
		 * 
		 * :
		 * :
		 * 과목합계 450 450 450 450 450 450 450
		 * 과목평균 90.0 90.0 90.0 90.0 90.0 90.0 90.0
		 */
		ArrayList<String> name = new ArrayList<>();
		
		name.add("이영민");
		name.add("강유진");
		name.add("강지수");
		name.add("권수연");
		name.add("김소희");
		name.add("김지수");
		name.add("김한기");
		name.add("또장군");
		name.add("승구");
		name.add("신희철");
		name.add("오수연");
		name.add("이경준");
		name.add("이석호");
		name.add("이여강");
		name.add("이영우");
		name.add("이용석");
		name.add("재우");
		name.add("정범");
		name.add("정원모");
		name.add("지혜");
		name.add("최기문");
		name.add("최윤지");
		name.add("희중");
		
		ArrayList<String> subject = new ArrayList<>();
		subject.add("국어");
		subject.add("영어");
		subject.add("수학");
		subject.add("사회");
		subject.add("과학");
		subject.add("Oracle");
		subject.add("Java");
		
		ArrayList<Integer> namesum = new ArrayList<>();
		ArrayList<Double> nameavg = new ArrayList<>();
		ArrayList<Integer> namerank = new ArrayList<>();
		
		for(int i = 0 ; i < name.size(); i++){
			namerank.add(1);
		}
		
		ArrayList<Integer> subjectsum = new ArrayList<>();
		ArrayList<Double> subjectavg = new ArrayList<>();
		
		ArrayList<ArrayList<Integer>> score = new ArrayList<>();
		for(int i = 0 ; i < name.size(); i++){
			int sum = 0;
			double avg = 0;
			ArrayList<Integer> scorei = new ArrayList<>();
			for(int j = 0 ; j < subject.size(); j++){
				scorei.add((int)(Math.random()*101));
				sum += scorei.get(j);
			}
			avg = Math.round((double)100*sum/subject.size())/100.0; 
			score.add(scorei);
			namesum.add(sum);
			nameavg.add(avg);
			
		}
		
		for(int i = 0 ; i < subject.size(); i++){
			int sum = 0;
			double avg = 0;
			for(int j = 0 ; j < name.size(); j++){
				sum+=score.get(j).get(i);
			}
			avg = Math.round((double)100*sum/name.size())/100.0; 
			subjectsum.add(sum);
			subjectavg.add(avg);
		}
		
		for(int i = 0 ; i < namesum.size(); i++){
			for(int j = 0 ; j < namesum.size(); j++){
				if(namesum.get(i)<namesum.get(j)){
					namerank.set(i,namerank.get(i)+1);
				}
			}
		}
		
		for(int i = 0 ; i < namesum.size()-1; i++){
			int min = i;
			
			for(int j = i+1 ; j < namesum.size(); j++){
				if(namesum.get(min)<namesum.get(j)){
					min = j;
				}
			}
			String temp = name.get(i);
			name.set(i, name.get(min));
			name.set(min, temp);
			
			int temp2 = namesum.get(i);
			namesum.set(i, namesum.get(min));
			namesum.set(min, temp2);
			
			double temp3 = nameavg.get(i);
			nameavg.set(i, nameavg.get(min));
			nameavg.set(min, temp3);
			
			int temp5 = namerank.get(i);
			namerank.set(i, namerank.get(min));
			namerank.set(min, temp5);
			
			ArrayList<Integer> temp4 = score.get(i);
			score.set(i, score.get(min));
			score.set(min, temp4);
			
			
		}
		
		System.out.println("이름\t국어\t영어\t수학\t사회\t과학\tOracle\tjava\t합계\t평균\t석차");
		for(int i = 0 ; i < name.size(); i++){
			System.out.print(name.get(i)+"\t");
			for(int j = 0 ; j < subject.size(); j++){
				System.out.print(score.get(i).get(j)+"\t");
			}
			System.out.print(namesum.get(i)+"\t");
			System.out.print(nameavg.get(i)+"\t");
			System.out.print(namerank.get(i)+"\t");
			System.out.println();
		}
		
		System.out.print("과목합계"+"\t");
		for(int i = 0 ; i < subject.size(); i ++){
			System.out.print(subjectsum.get(i)+"\t");
		}
		System.out.println();
		
		System.out.print("과목평균"+"\t");
		for(int i = 0 ; i < subject.size(); i ++){
			System.out.print(subjectavg.get(i)+"\t");
		}

	}

}
