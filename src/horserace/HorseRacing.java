package horserace;



public class HorseRacing {

	public static void main(String[] args) {
		
		new HorseRacing().game(); 

		
	}
	
	Horse myhorse;
	Horse enemy1;
	Horse enemy2;
	Horse enemy3;
	Stadium sta1;
	
	
	HorseRacing() {
		myhorse = new Horse();
		enemy1 = new Horse("흑마");
		enemy2 = new Horse("백마");
		enemy3 = new Horse("적토마");
		sta1 = new Stadium(2, 4, 0, 2);
	}
	
	private void game(){
		race();
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
			
		}
	}
}
