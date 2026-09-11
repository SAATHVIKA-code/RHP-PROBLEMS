import java.util.*;
public class Main{
  public static void main(String args[]){
    Scanner s=new Scanner(System.in);
    int n=s.nextInt();
    s.nextLine();
    //how many headlinew will be recieved
    int cmn[]=new int[26];
    for(int i=0;i<cmn.length;i++){
      cmn[i]=50;
    }
    for(int j=0;j<n;j++){
      String st=s.nextLine();
      /*we dont create a common character counter because for each string the counter of characters will vary and also we need to find 
      common between them so we need common only as global variable*/
      int chcnt[]=new int[26];
      for(int i=0;i<st.length();i++){
        char ch=st.charAt(i);
        chcnt[ch-'a']++;
        
      }
      for(int i=0;i<cmn.length;i++){
        cmn[i]=Math.min(cmn[i],chcnt[i]);
      }
      //common characters between everything is filled now
    }
    boolean found=false;
    for(int i=0;i<26;i++){
        if(cmn[i]!=0){
            for(int j=0;j<cmn[i];j++){
            found=true;
      System.out.print((char)(i+97));
        }
        }
    }
    if(found==false){
        System.out.println();
    }
  }
}
