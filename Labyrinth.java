import java.util.*;
public class Labyrinth{
    public static void bfs(char ch[][],int srow,int scol){
        Queue<int[]> q=new LinkedList<>();
        char path[][]=new char[ch.length][ch[0].length];
        if(srow>=0&&srow<ch.length&&scol>=0&&scol<ch[0].length&&ch[srow][scol]=='A'){
            q.add(new int[]{srow,scol});
            ch[srow][scol]='#';
            path[srow][scol]='A';
        }
        //since we cant mark srow scol as # then we dont know where to stop while backtracking
        int endrow=-1;
        int endcol=-1;
        boolean found=false;
        while(!q.isEmpty()){
            int[] cell=q.poll();
            int cr=cell[0];
            int cc=cell[1];
            
            if(ch[cr][cc]=='B'){
                endrow=cr;
                endcol=cc;
                found=true;
                break;
            }
            int dr[]={0,0,-1,1};
            int dc[]={-1,1,0,0};
            char move[]={'L','R','U','D'};

            for(int i=0;i<4;i++){
                int nr=cr+dr[i];
                int nc=cc+dc[i];
            
            if(nr>=0&&nr<ch.length&&nc>=0&&nc<ch[0].length&&(ch[nr][nc]=='.'||ch[nr][nc]=='B')){
                q.add(new int[]{nr,nc});
                path[nr][nc]=move[i];
                //move array
                if(ch[nr][nc]!='B'){
                    ch[nr][nc]='#';
                }

            }
        }


    }
    if(found){
        System.out.println("YES");
        StringBuilder sb=new StringBuilder();
        int cr=endrow;
        int cc=endcol;
        while(path[cr][cc]!='A'){
            char step=path[cr][cc];
            sb.append(step);
            if(step=='R') cc--;
            else if(step=='L') cc++;
            else if(step=='U') cr++;
            else{
                cr--;
            }
        }
        sb.reverse();
        System.out.println(sb.length());
        System.out.println(sb);
    }
    else{
        System.out.println("NO");
    }


}
public static void main(String args[]){
    Scanner s=new Scanner(System.in);
    int row=s.nextInt();
    int col=s.nextInt();
    char g[][]=new char[row][col];
    for(int i=0;i<row;i++){
        String n=s.next();
        for(int j=0;j<col;j++){
            g[i][j]=n.charAt(j);
        }
    }
    outer:
    for(int i=0;i<row;i++){
        for(int j=0;j<col;j++){
            if(g[i][j]=='A'){
                bfs(g,i,j);
                break outer;
            }

        }
    }
}
}
