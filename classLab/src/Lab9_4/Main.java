package Lab9_4;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CDPlayer cdPlayer = new CDPlayer();
		SmartphonePlayer smartphonePlayer = new SmartphonePlayer();
	
		Student student = new Student();
		
	  student.listenToMusic(cdPlayer);
	  student.listenToMusic(smartphonePlayer);

	}

}
