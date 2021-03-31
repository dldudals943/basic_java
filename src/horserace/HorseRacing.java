package horserace;

import e_oop.ScanUtil;



public class HorseRacing {

	public static void main(String[] args) {
		
		new HorseRacing().game();
		

		
	}
	
	Horse myhorse;
	Horse enemy1;
	Horse enemy2;
	Horse enemy3;
	Stadium sta1;
	Trainer hero;
	
	HorseRacing() {
		myhorse = new Horse();
		enemy1 = new Horse("흑마");
		enemy2 = new Horse("백마");
		enemy3 = new Horse("적토마");
		hero = new Trainer();
		sta1 = new Stadium(0, 4, 0, 2);
	}
	
	void game(){
		race(); // 첫번째 레이스
		train(); 
		race(); // 두번째 레이스
		train(); 
		race(); // 세번째 레이스
		train();
		race(); // 네번째 레이스
	}
	
	void race(){
		while (myhorse.finish && enemy1.finish && enemy2.finish && enemy3.finish) {
			System.out.println("----------------------------------------------------");
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
			if(!enemy1.finish || !enemy2.finish || !enemy3.finish){
				System.out.println("경기에서 패배했습니다. 게임을 종료합니다.");
			}
			
		}
		myhorse.init();
		enemy1.init();
		enemy2.init();
		enemy3.init();
	}
	
	void train(){
		for (int i = 0; i < 5; i++) {
			System.out.println("훈련 종목을 선택 : 1 스피드 2 스태미나 3 파워 4 근성 5 영리함");
			int n = ScanUtil.nextInt();
			if (1 <= n && n <= 5) {
				hero.training(n, myhorse);
			}
		}
	}
	
}
