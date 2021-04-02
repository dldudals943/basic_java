package horserace;

public class Stadium {
	
	int length;	// 0. 1200 1. 1600 2.2000 3.3000
	int meter;
	int corner; // 코너의 개수
	int ground; // 0. 초원	1. 더트
	int level; // 0. 주니어	1. 클래식		2. 시니어		3. URA
	int[] info;
	int[][] data = new int[][]{{5,5,5,10},{5,5,10,15},{5,10,15,20},{10,15,20,25}};
	
	
	Stadium(int length, int corner, int ground, int level){
		this.length = length;
		this.corner = corner;
		this.ground = ground;
		this.level = level;
		info = new int[]{length, corner, ground, level};
		meter(length);
	}
	void meter(int length){
		meter=(new int[]{1200,1600,2000,3000})[length];
	}
	void horseRunning(Horse horse){
		//스피드 미터씩 달렸다고 가정
		int n = (int)(Math.random()*21);
		int m = horse.ingamestat[0]+(int)(horse.ingamestat[4]*0.2);
		horse.ingamestat[1] -= ((double)(horse.ingamestat[0]-n+m))/(100)*data[length][level];//데이터시트에 의해서 스태미나소모
		horse.position+= n + m;
		System.out.println(n + m + "m를 달렸습니다. "+ horse.name + "의 현재 위치는 " + horse.position +"m입니다.");
		if(horse.condition) horse.staminaCheck();
		
		finish(horse);
	}
	void crash(Horse h1, Horse h2){
		System.out.println(h1.name+ "와 "+ h2.name + "가 부딪혔다!");
		if(h1.ingamestat[2]+(int)(h1.ingamestat[4]*0.2) > h2.ingamestat[2]+(int)(h2.ingamestat[4]*0.2)){
			h2.ingamestat[1] -= 5;
			System.out.println(h2.name + "가 밀려났다!");
		}else if(h1.ingamestat[2]+(int)(h1.ingamestat[4]*0.2) < h2.ingamestat[2]+(int)(h2.ingamestat[4]*0.2)){
			h1.ingamestat[1] -= 5;
			System.out.println(h1.name + "가 밀려났다!");
		}
		try {
			Thread.sleep(750);
		} catch (InterruptedException e) {
			
			e.printStackTrace();
		}
	}

	void finish(Horse horse){
		if(horse.position >= meter){
			horse.finish = false;
			System.out.println(horse.name + "가 결승점을 통과했습니다!");
		}
	}
	
}
