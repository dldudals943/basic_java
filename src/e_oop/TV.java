package e_oop;

public class TV {

	//전원1 ,채널3, 볼륨2
	boolean power;
	int channel;
	int volume;
	
	TV(){
		power = false;
		channel = 3;
		volume = 70;
	}
	
	void turn(){
		if (power == false) power = true;
		else power = false;
	}
	
	void chan_ch(int a){
		if(power==true && 0<a && a<=100) channel = a;
	}
	void chan_up(){
		if(power==true && channel < 100) channel++;
		
	}
	void chan_down(){
		if(power==true && channel > 1) channel--;
	}
	
	void vol_up(){
		if(power==true && volume < 100) volume++;
	}
	
	void vol_down(){
		if(power==true && volume > 0) volume--;
	}
	
	
}
