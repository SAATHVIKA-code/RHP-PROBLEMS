import java.util.*;
public class Main{
  public static void main(String args[]){
    Scanner s=new Scanner(System.in);
    String a=s.nextLine();
    String b=s.nextLine();
    //if b+b substring is a then we can surely say rotation gives it
    if((b+b).contains(a)){
      System.out.println("Yes");
    }
    else{
      System.out.println("No");
    }
  }
}
