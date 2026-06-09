// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.*;
class Main {
    public static void main(String[] args) {
        //input
        Scanner s=new Scanner(System.in);
        int r=s.nextInt();
        int c=s.nextInt();
        int arr[][]=new int[r][c];
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                arr[i][j]=s.nextInt();
            }
        }
        int diff[][]={{-1,-1},{-1,0},{-1,1},{0,-1},{0,1},{1,-1},{1,0},{1,1}};
        int sum=0;
        int dr=s.nextInt();
        int dc=s.nextInt();
        for(int i=0;i<8;i++){
            int ar=dr+diff[i][0];
            int ac=dc+diff[i][1];
            if(ar>=0&&ar<r&&ac>=0&&ac<c){
                sum=sum+arr[ar][ac];
            }
        }
        System.out.println(sum);
    }
}
