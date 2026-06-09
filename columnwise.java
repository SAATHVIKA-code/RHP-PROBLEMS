// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.*;
class Main {
    public static int[] getmax(int dp[][],int c,int r){
        int fmax=Math.max(dp[0][c],dp[1][c]);
        int smax=Math.min(dp[0][c],dp[1][c]);
        for(int j=2;j<r;j++){
            if(dp[j][c]>=fmax){
                smax=fmax;
                fmax=dp[j][c];
                
            }
            else if(dp[j][c]>=smax){
                smax=dp[j][c];
            }
        }
        return new int[]{fmax,smax};
    }
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
        //copying the entities of first column in dp matrix
        int dp[][]=new int[r][c];
        for(int i=0;i<r;i++){
            dp[i][0]=arr[i][0];
        }
        //then taking the maximum element
       //dp[1][0] dp[2][0]
       for(int i=1;i<c;i++){
           int max[]=getmax(dp,i-1,r);
           for(int j=0;j<r;j++){
               if(dp[j][i-1]==max[0]){
                   dp[j][i]=arr[j][i]+max[1];
               }
               else{
                   dp[j][i]=arr[j][i]+max[0];
               }
           }
       }
       System.out.println(getmax(dp,c-1,r)[0]);
    }
}
