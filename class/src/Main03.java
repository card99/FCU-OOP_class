
public class Main03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student tom = new Student();
		tom.setName("Tom");
		tom.setYear(-2);  //印出結果為 0
		System.out.println(tom.getName());
		System.out.println(tom.getYear());
		
		Student mary = new Student("Mary");
		System.out.println(mary.getName());
		System.out.println(mary.getYear());
    
	}

}
