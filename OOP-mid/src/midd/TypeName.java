package midd;

public class TypeName {
  private final String name;  
  private final Type type;  



  public TypeName(String name, Type type) {
		this.name = name;
		this.type = type;
	}

	public String getName() {
    return this.name;
  }

  public Type getType() {
    return this.type;
  }
 

}
