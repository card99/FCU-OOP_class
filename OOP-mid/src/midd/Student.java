package midd;

import java.util.Scanner;

public class Student {

		  String stdId;
			String name;
			String dept;
		  
		  public Student(String name) {

				this.name = name;
			}
		  
		  public String getStdId() {
				return stdId;
			}

			public void setStdId(String stdId) {
				if(stdId.matches("^D+[0-9]{7}$")) {
					this.stdId = stdId;
					System.out.println(this.stdId);
				} else {
					this.stdId = null;
					System.out.println(this.stdId);
				}
				
			}


}
