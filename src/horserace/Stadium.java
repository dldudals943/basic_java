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
		horse.ingamestat[1] -= ((double)horse.ingamestat[0]/100)*data[length][level];//데이터시트에 의해서 스태미나소모
		horse.position+=horse.ingamestat[0];
		System.out.println(horse.ingamestat[0] + "m를 달렸습니다. "+ horse.name + "의 현재 위치는 " + horse.position +"m입니다.");
		if(horse.condition) horse.staminaCheck();
		finish(horse);
	}
	void crash(Horse h1, Horse h2){
		if(h1.ingamestat[2] > h2.ingamestat[2]){
			h2.ingamestat[1] -= 10;
		}else if(h1.ingamestat[2] < h2.ingamestat[2]){
			h1.ingamestat[1] -= 10;
		}
	}

	void finish(Horse horse){
		if(horse.position > meter){
			horse.finish = false;
			System.out.println(horse.name + "이 결승점을 통과했습니다!");
		}
	}
	
}
