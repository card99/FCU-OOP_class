package Lab8_2;

public class VehicleStation {
  private Vehicle auto = new Automobile();
  private Aircraft aircraft = new Aircraft();
  
  public VehicleStation() {
  	System.out.println("Vehicle Station");
  }
  
  public static void main(String[] args) {
  	VehicleStation station = new VehicleStation();
  }
}
