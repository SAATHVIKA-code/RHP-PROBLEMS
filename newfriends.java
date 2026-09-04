import java.util.*;

public class newfriends {
    private static int find(int ldr[], int node) {
        if (ldr[node] != node) {
            ldr[node] = find(ldr, ldr[node]);
        }
        return ldr[node];
    }

    private static void join(int ldr[], int lt, int rt) {
        ldr[find(ldr, rt)] = find(ldr, lt);
    }

    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);
        int V = s.nextInt();
        int E = s.nextInt();

        int ldr[] = new int[V + 1];
        for (int i = 1; i <= V; i++) {
            ldr[i] = i;
        }

        int edges[][] = new int[E][2];
        for (int i = 0; i < E; i++) {
            int a = s.nextInt();
            int b = s.nextInt();
            edges[i][0] = a;
            edges[i][1] = b;
            join(ldr, a, b);
        }

        long cnt[] = new long[V + 1];
        for (int node = 1; node <= V; node++) {
            cnt[find(ldr, node)]++;
        }

        long edgeCount[] = new long[V + 1];
        for (int i = 0; i < E; i++) {
            int root = find(ldr, edges[i][0]);
            edgeCount[root]++;
        }

        long ans = 0;
        for (int node = 1; node <= V; node++) {
            if (cnt[node] > 0) {
                long S = cnt[node];
                long maxEdges = (S * (S - 1)) / 2;
                ans += (maxEdges - edgeCount[node]);
            }
        }

        System.out.println(ans);
    }
}
