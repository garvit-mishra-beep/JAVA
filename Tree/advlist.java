import java.util.*;

public class Advlist {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = 7, m = 6;

        ArrayList<Integer>[] graph = new ArrayList[n + 1];

        for (int i = 0; i <= n; i++)
            graph[i] = new ArrayList<>();

        while (m-- > 0) {
            int u = sc.nextInt();
            int v = sc.nextInt();

            graph[u].add(v);
            graph[v].add(u); 
        }

        for (int i = 1; i <= n; i++)
            System.out.println(i + " -> " + graph[i]);

        sc.close();
    }
}