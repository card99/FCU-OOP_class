package Lab9_4;

public class Student {
	
	public void listenToMusic(MusicPlayer cdPlayer) {  //使用多型 polynomail
		cdPlayer.play("May Day"); 
	}
	
	public void listenToMusic(SmartphonePlayer smartphonePlayer) {
		smartphonePlayer.play("May Day");
	}

}
