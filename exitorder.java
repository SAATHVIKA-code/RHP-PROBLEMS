import java.util.*;
public class Main{
  public static void main(String args[]){
    Scanner s=new Scanner(System.in);
    int n;
    n=s.nextInt();
    int arr[]=new int[n];
    int brr[]=new int[n];
    Map<Integer,Integer> m=new LinkedHashMap<Integer,Integer>();
    for(int i=0;i<n;i++){
      int e;
      e=s.nextInt();
      arr[i]=e;
      m.put(e,((e-1)/10+1));
      //now it will be 11-2 10-1 7-1 so on
    }
    List<Map.Entry<Integer,Integer>> l=new ArrayList<>(m.entrySet());
    l.sort((a,b)->a.getValue().compareTo(b.getValue()));
    Map<Integer,Integer> sm=new LinkedHashMap<Integer,Integer>();
    for(Map.Entry<Integer,Integer> temp:l){
      sm.put(temp.getKey(),temp.getValue());
    }
    int idx=0;
    for(int key:sm.keySet()){
      brr[idx]=key;
      idx++;
    }
    if(Arrays.equals(arr,brr)){
      System.out.println("Yes");
    }
    else{
      System.out.println("No");
    }
  }
}
