import java.util.*;
public class countingrooms{
    public static void bfs(char ch[][],int row,int col){
        
        Queue<int[]> q=new LinkedList<>();
        if(row>=0&&row<ch.length&&col>=0&&col<ch[0].length&&ch[row][col]=='.'){
            q.add(new int[]{row,col});
            ch[row][col]='#';

        }
        //add the dot coordinates in queue q
        int dr[]={0,0,1,-1};
        int dc[]={1,-1,0,0};
        while(!q.isEmpty()){
            int cell[]=q.poll();
            int cr=cell[0];
            int cc=cell[1];
            for(int i=0;i<4;i++){
                int nr=cr+dr[i];
                int nc=cc+dc[i];
                if(nr>=0&&nr<ch.length&&nc>=0&&nc<ch[0].length&&ch[nr][nc]=='.'){
                    ch[nr][nc]='#';
                    q.add(new int[]{nr,nc});
                }
            }
        }


    }
    public static void main(String args[]){
        Scanner s=new Scanner(System.in);
        int row=s.nextInt();
        int col=s.nextInt();
        char g[][]=new char[row][col];
        for(int i=0;i<row;i++){
            String k=s.next();
            for(int j=0;j<col;j++){
                g[i][j]=k.charAt(j);

            }
        }
        int cnt=0;
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                if(g[i][j]=='.'){
                    bfs(g,i,j);
                    cnt++;
                }
            }
        }
        System.out.println(cnt);
    }
}
