package horserace;

public class Horse {
	String name;
	int speed;
	int stamina;
	int power;
	int spirit;
	int intel;
	int[] stat;
	int[] ingamestat;
	int position;
	boolean condition;
	boolean finish;
	
	Horse(String name, int speed, int stamina, int power, int spirit, int intel){
		this.name = name;
		this.speed = speed;
		this.stamina = stamina;
		this.power = power;
		this.spirit = spirit;
		this.intel = intel;
		stat = new int[]{speed,stamina,power,spirit,intel};
		upDate();
		condition = true;
		finish = true;
	}
	
	Horse(){
		name = "다크호스";
		speed = 100;
		stamina = 100;
		power = 100;
		spirit = 100;
		intel = 100;
		stat = new int[]{speed,stamina,power,spirit,intel};
		upDate();
		condition = true;
		finish = true;
	}
	
	Horse(String name){
		this.name = name;
		speed = 90;
		stamina = 90;
		power = 90;
		spirit = 90;
		intel = 90;
		stat = new int[]{speed,stamina,power,spirit,intel};
		upDate();
		condition = true;
		finish = true;
	}
	
	void upDate(){
		ingamestat = stat;
	}
	
	void staminaCheck(){
		if(ingamestat[1] < 0){
			ingamestat[0]/=1.5;
			condition = false;
			System.out.println(name + "는 스태미나가 없다!");
		}
	}
}
