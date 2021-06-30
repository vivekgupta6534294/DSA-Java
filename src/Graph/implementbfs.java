package Graph;

import java.util.*;

public class implementbfs {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<ArrayList<Integer>> ab = new ArrayList<>();
        int V = sc.nextInt();
        int E = sc.nextInt();
        for (int i = 0; i < V; i++) {
            ab.add(new ArrayList<>());
        }
        for (int i = 0; i < E; i++) {
            int u = sc.nextInt();
            int v = sc.nextInt();
            ab.get(u).add(v);
            ab.get(v).add(u);
        }
        sc.close();
        Solution obj = new Solution();
        ArrayList<Integer> aa = obj.bfsOfGraph(V, ab);
        for (Integer it : aa) {
            System.out.print(it + " ");
        }
        System.out.println();
    }
}

class Solution {
    // Function to return Breadth First Traversal of given graph.
    public ArrayList<Integer> bfsOfGraph(int V, ArrayList<ArrayList<Integer>> adj) {
        boolean visited[] = new boolean[V];
        Queue<Integer> q = new LinkedList<>();
        ArrayList<Integer> ans = new ArrayList<>();
        q.add(0);
        visited[0] = true;
        while (!q.isEmpty()) {
            int number = q.poll();
            ans.add(number);
            for (int i : adj.get(number)) {
                if (!visited[i]) {
                    visited[i] = true;
                    q.add(i);
                }
            }
        }
        return ans;
    }

}
