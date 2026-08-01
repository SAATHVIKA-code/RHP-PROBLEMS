import java.util.*;
public class Setsum{
    public static void main(String args[]){
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        Set <Integer> a=new TreeSet<>();
        for(int i=0;i<n;i++){
            int e=s.nextInt();
            a.add(e);
        }
        System.out.println(a.size());
        for(int k:a){
            System.out.print(k+" ");
        }
    }
}
