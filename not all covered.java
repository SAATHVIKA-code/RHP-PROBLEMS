import java.util.*;
public class Main{
  public static void main(String args[]){
    Scanner s=new Scanner(System.in);
    int n=s.nextInt();
    int m=s.nextInt();
    //n walls guarded by m turrets
    int diff[]=new int[n+2];
    //since for 10th wall we need to mark -1 in 11th postion so array size should be 12
    //then until the number of turrets for each turret get from and to here array creation is not possible
    while(m-->0){
      int from=s.nextInt();
      int to=s.nextInt();
      diff[from]+=1;
      diff[to+1]+=-1;
    }
    //now we need to do prefix sum
    //start index is 1
    int cg=0;
    int min=diff[1];
    for(int i=1;i<=n;i++){
      diff[i]=diff[i]+diff[i-1];
      min=Math.min(diff[i],min);
    }
    System.out.println(min);
  }
}
