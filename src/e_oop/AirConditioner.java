package e_oop;

public class AirConditioner {

	boolean power;
	int windspeed;
	int temperature;
	int operation;
	
	final int MIN_WIND_SPEED = 1;
	final int MAX_WIND_SPEED = 10;
	final int MIN_temperature = 18;
	final int MAX_temperature = 30;
	final int MIN_operation = 1;
	final int MAX_operation = 4;
	
	
	AirConditioner(){
		power = false;
		windspeed = 1;
		temperature = 18;
		operation = 1;
	}
	void changeoperation(){
		if(MIN_operation <= this.operation && this.operation < MAX_operation){
			this.operation++;
		}
		else if(this.operation == MAX_operation){
			this.operation = 1;
		}
		switch(this.operation){
		case 1 : System.out.println("자동 운전 모드입니다."); break;
		case 2 : System.out.println("냉방 운전 모드입니다."); break;
		case 3 : System.out.println("제습 운전 모드입니다."); break;
		case 4 : System.out.println("송풍 운전 모드입니다."); break;
		default : break;
 		}
	}
	
	
	void power(){
		power = !power;
		System.out.println(power ? "에어컨 켜짐" : "에어컨 꺼짐");
	}
	
	void changewind_speed(int windspeed){
		if(power){
			if(MIN_WIND_SPEED <= windspeed && windspeed <= MAX_WIND_SPEED){
				this.windspeed = windspeed;
			}
			System.out.println("풍속. " + this.windspeed);
		}
	}
	
	void wind_speedUp(){
		changewind_speed(windspeed + 1);
	}
	void wind_speedDown(){
		changewind_speed(windspeed - 1);
	}
	
	void temperatureUp(){
		if(power){
			if(temperature < MAX_temperature){
				temperature++;
			}
			showtemperature();
		}
	}
	
	void temperatureDown(){
		if(power){
			if(MIN_temperature < temperature){
				temperature--;
			}
			showtemperature();
		}
	}
	
	void showtemperature(){
		System.out.println("온도는" + temperature + "도 입니다.");
	}
	
	public static void main(String[] args) {
		AirConditioner AirCon = new AirConditioner();
		
		while(true){
			System.out.println("----------------------------------------------------");
			System.out.println("1. 전원 	2. 풍속변경	3.바람 속도를 빠르게	4.바람 속도를 느리게");
			System.out.println("5. 온도 올리기	6. 온도 내리기	7.운전모드 변경	0. 종료");
			System.out.println("----------------------------------------------------");
			System.out.print("번호 입력>");
			int input = ScanUtil.nextInt();
			
			switch (input){
			case 1 : AirCon.power(); break;
			case 2 :
				System.out.print("변경할 바람 속도 입력>");
				int wind_speed = ScanUtil.nextInt();
				AirCon.changewind_speed(wind_speed);
				break;
			
			case 3 : AirCon.wind_speedUp(); break;
			case 4 : AirCon.wind_speedDown(); break;
			case 5 : AirCon.temperatureUp(); break;
			case 6 : AirCon.temperatureDown(); break;
			case 7 : AirCon.changeoperation(); break;
			
			default:
				System.out.println("종료되었습니다.");
				System.exit(0);
				break;
			
			}
		}
		
	}

}
