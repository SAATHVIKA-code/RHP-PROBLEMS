//Number of provinces
class Solution {
    //to find the leader of node
    private int find(int l[], int n){
        if(l[n] != n){
            l[n] = find(l, l[n]);
        }
        return l[n];
        //each node has the specific leader
    }
    private void join(int ldr[], int lt, int rt){
        ldr[find(ldr,rt)] = find(ldr,lt);
    }
    public int findCircleNum(int[][] gr) {
        int N = gr.length;
        int ldr[] = new int[N+1];
        for(int node = 1; node <= N; node++) ldr[node] = node;
        for(int col=1; col<=N; col++){
            for(int row=1; row<=N; row++){
                if (row == col) continue;
                if(gr[row-1][col-1] == 1){
                    join(ldr,row,col);
                }
            }
        }
        int prov = 0;
        for (int node = 1; node <= N; node++){
            if(ldr[node] == node){
                prov++;
            }
        }
        return prov;
    }
};
