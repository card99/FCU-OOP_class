
public class ex02 {
  public static void main(String[] args) {
    String s = "HELLO FCU";
    String s1 = new String("HELLO FCU"); //�P�W�C�ŧi���i�H�ϥ�
    String s2 = s;
    
    System.out.println(s.replace("l", "L"));
    System.out.println(s.toLowerCase());
    if(s == s1) {
      System.out.println("string match")
    }
  }
    
}