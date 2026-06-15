import java.util.*;
public class BFS {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of nodes: ");
        int n = sc.nextInt();
        System.out.print("Enter number of edges: ");
        int m = sc.nextInt();
        ArrayList<Integer>[] graph = new ArrayList[n + 1];
        for (int i = 0; i <= n; i++) {
            graph[i] = new ArrayList<>();
        }
        System.out.println("Enter the edges (u v):");
        for (int i = 0; i < m; i++) {
            int u = sc.nextInt();
            int v = sc.nextInt();
            graph[u].add(v);
            graph[v].add(u); 
        }
        System.out.println("\nAdjacency List:");
        for (int i = 1; i <= n; i++) {
            System.out.println(i + " -> " + graph[i]);
        }
        System.out.print("\nEnter source node: ");
        int source = sc.nextInt();
        Queue<Integer> q = new LinkedList<>();
        boolean[] visited = new boolean[n + 1];
        q.add(source);
        visited[source] = true;
        System.out.print("BFS Traversal: ");
        while (!q.isEmpty()) {
            int u = q.poll();
            System.out.print(u + " ");
            for (int v : graph[u]) {
                if (!visited[v]) {
                    visited[v] = true;
                    q.add(v);
                }
            }
        }
        sc.close();
    }
}