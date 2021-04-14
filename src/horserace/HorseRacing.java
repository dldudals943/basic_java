package horserace;

import java.util.Arrays;

import util.ScanUtil;



public class HorseRacing {

	public static void main(String[] args) {
		
		new HorseRacing().game();
		

		
	}
	
	Horse myhorse;
	Horse enemy1;
	Horse enemy2;
	Horse enemy3;
	Stadium sta1;
	Stadium sta2;
	Stadium sta3;
	Stadium sta4;
	Trainer hero;
	int race = 1;
	
	HorseRacing() {
		myhorse = new Horse();
		enemy1 = new Horse("흑마");
		enemy2 = new Horse("백마");
		enemy3 = new Horse("적토마");
		hero = new Trainer();
		sta1 = new Stadium(0, 4, 0, 0);
		sta2 = new Stadium(1, 8, 0, 1);
		sta3 = new Stadium(2, 12, 0, 2);
		sta4 = new Stadium(3, 16, 0, 3);
		
	}
	
	void game(){
		race(sta1); // 첫번째 레이스
		train(); 
		race(sta2); // 두번째 레이스
		train(); 
		race(sta3); // 세번째 레이스
		train();
		race(sta4); // 네번째 레이스
		System.out.println("모든 레이스에서 승리했습니다!");
		System.out.println("최종 팬 수는 " + hero.fan + "명 입니다. 축하합니다!!");
	}
	
	void race(Stadium sta1){
		int turn = 1;
		while (myhorse.finish && enemy1.finish && enemy2.finish && enemy3.finish) {
			System.out.println("----------------------------------------------------");
			System.out.println(turn++ + "번째 턴입니다.");
			sta1.horseRunning(myhorse);
			sta1.horseRunning(enemy1);
			sta1.horseRunning(enemy2);
			sta1.horseRunning(enemy3);
			System.out.println("-----------------------------------------------------");
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				
				e.printStackTrace();
			}
			if(Math.abs(myhorse.position-enemy1.position)<30){
				sta1.crash(myhorse, enemy1);
			}
			if(Math.abs(myhorse.position-enemy2.position)<30){
				sta1.crash(myhorse, enemy2);
			}
			if(Math.abs(myhorse.position-enemy1.position)<30){
				sta1.crash(myhorse, enemy2);
			}
			
			
			if((myhorse.position<enemy1.position||myhorse.position<enemy2.position||myhorse.position<enemy3.position)
					&&(!enemy1.finish || !enemy2.finish || !enemy3.finish)){
				System.out.println("경기에서 패배했습니다. 게임을 종료합니다.");
				System.exit(0);
			}
			
		}
		System.out.println(race++ + "번째 경기에서 승리했습니다!");
		int plusfan = (sta1.meter)*(sta1.level+1)*(myhorse.position - (enemy1.position + enemy2.position + enemy3.position)/3);
		System.out.println(plusfan + "만큼의 팬이 증가했습니다!");
		hero.fan += plusfan;
		System.out.println("현재 팬 수는 " + hero.fan + "입니다!");
		myhorse.init();
		enemy1.init();
		enemy1.statup((int)(Math.random()*11), (int)(Math.random()*11), (int)(Math.random()*11)+5, (int)(Math.random()*11)+10, (int)(Math.random()*11)+5);
		//enemy1.check();
		enemy2.init();
		enemy2.statup((int)(Math.random()*11), (int)(Math.random()*11), (int)(Math.random()*11)+5, (int)(Math.random()*11)+10, (int)(Math.random()*11)+5);
		//enemy2.check();
		enemy3.init();
		enemy3.statup((int)(Math.random()*11), (int)(Math.random()*11), (int)(Math.random()*11)+5, (int)(Math.random()*11)+10, (int)(Math.random()*11)+5);
		//enemy3.check();
	}
	
	void train(){
		for (int i = 0; i < 5; i++) {
			System.out.println("훈련 종목을 선택 : 1 스피드 2 스태미나 3 파워 4 근성 5 영리함");
			System.out.println("현재 스탯은");
			System.out.println(Arrays.toString(myhorse.stat));
			int n = ScanUtil.nextInt();
			if (1 <= n && n <= 5) {
				hero.training(n, myhorse);
			}
		}
	}
	
}






