package horserace;

import java.util.Arrays;

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
	
	void check(){
		System.out.println(this.speed+" "+this.stamina+" "+this.power+" "+this.spirit+" "+this.intel);
		System.out.println(Arrays.toString(stat));
		System.out.println(Arrays.toString(ingamestat));
	}
	
	void init(){
		finish = true;
		condition = true;
		position = 0;
		upDate();
	}
	
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
		this.ingamestat = new int[]{stat[0],stat[1],stat[2],stat[3],stat[4]};
	}
	
	void staminaCheck(){
		if(ingamestat[1] < 0){
			ingamestat[0] = ((int)((double)ingamestat[0]*0.1) + (int)((double)ingamestat[3]*0.7));
			condition = false;
			System.out.println(name + "는 스태미나가 없다!");
		}
	}
	
	void statup(int speed, int stamina, int power, int spirit, int intel){
		this.speed +=speed;
		this.stamina += stamina;
		this.power += power;
		this.spirit += spirit;
		this.intel += intel;
		this.stat = new int[]{this.speed, this.stamina, this.power, this.spirit, this.intel};
		upDate();
	}
}
