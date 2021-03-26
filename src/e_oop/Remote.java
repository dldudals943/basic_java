package e_oop;

import java.util.Scanner;

public class Remote {

	public static void main(String[] args) {
		TV tv = new TV();
		
		Scanner sc = new Scanner(System.in);
		System.out.println("TV를 켤까요? 네/아니오");
		String answer = sc.nextLine();
		if (answer.equals("네")) tv.turn();
		
		if (tv.power==true){
			System.out.println(tv.channel);
			System.out.println("채널을 변경합니까? 위로/아래로/채널 직접 입력(1~100) ");
			answer = sc.nextLine();
			boolean flag = true;
			if(answer.equals("위로")){
				tv.chan_up();
				flag = false;
			}
			if(answer.equals("아래로")){
				tv.chan_down();
				flag = false;
			}
			if(flag && 0<Integer.parseInt(answer)&&Integer.parseInt(answer)<=100){
				tv.chan_ch(Integer.parseInt(answer));
			}
			System.out.println(tv.channel);
			System.out.println(tv.volume);
			System.out.println("볼륨을 변경합니까? 위로/아래로");
			answer = sc.nextLine();
			if(answer.equals("위로")){
				tv.vol_up();
			}
			if(answer.equals("아래로")){
				tv.vol_down();
			}
			System.out.println(tv.volume);
		}
		
		
	}

}
