import java.util.*;
public class Advmatrix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = 7, m = 6;

        int[][] graph = new int[n + 1][n + 1];

        while (m-- > 0) {
            int u = sc.nextInt();
            int v = sc.nextInt();

            graph[u][v] = 1;
            graph[v][u] = 1; 
        }
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                System.out.print(graph[i][j] + " ");
            }
            System.out.println();
        }
        sc.close();
    }
}