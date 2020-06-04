
public class ex02 {
  public static void main(String[] args) {
    String s = "HELLO FCU";
    String s1 = new String("HELLO FCU"); //與上列宣告都可以使用
    String s2 = s;
    
    System.out.println(s.replace("l", "L"));
    System.out.println(s.toLowerCase());
    if(s == s1) {
      System.out.println("string match")
    }
  }
    
}