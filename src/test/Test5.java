package test;

import java.util.LinkedList;

public class Test5 {
	public static void main(String[] args) {
		int n = 10;
        int answer = 0;
        int count = 0; 
//      ArrayList<Integer> arr = new ArrayList<>(); // 2부터 n까지 넣을 배열 만든다.
        LinkedList<Integer> arr = new LinkedList<>(); // 2부터 n까지 넣을 배열 만든다.
        for(int i=2; i <=n; i++){
            arr.add(i); // 2부터 n까지 넣어준다.
        }
        
        while(true){
            if(arr.get(count)!=0 && arr.get(count)<=Math.sqrt(n)){ //해당 수가 0이 아니라면
                for(int i = count + 1; i < arr.size(); i++){
                    if(arr.get(i)%arr.get(count)==0){ //0이 아닌 수로 수를 나뉘어떨어지는지 체크한다.
                        arr.remove(i);//소수가 아닌 수를 0으로 만들어 주고,
                        i--;
                    }
                }
                
            }
            System.out.println(count+"회 반복");
            count++; //다음 나눠줄 소수를 찾기위해 count++한다.
            if(count>=arr.size()){
                break;
            }
        }
        
        answer = arr.size();
		System.out.println(answer);
		
		
		System.out.println(Math.sqrt(100));
	}
}
