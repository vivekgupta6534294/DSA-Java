//dfs recursion  and stack , Implement Code
// 5 5 ver ede
// 0 4
// 4 3
// 3 2
// 2 1
// 1 2
// 0 4-src dest 
package Graph;
import java.util.*;
public class dfs {
    private static LinkedList<Integer> adj[];

    public  dfs(int v){
        adj=new LinkedList[v];
        for(int i=0;i<v;i++){
            adj[i]=new LinkedList<Integer>();
        }
    }

    public void addEdge(int source,int destination){
        adj[source].add(destination);
        adj[destination].add(source);
    }
    public static boolean dfss(int source,int destination,boolean[] vis){
        if(source==destination){
            return true;
        }
        for(int neighbor:adj[source]){
            if(!vis[neighbor]){
                vis[neighbor]=true;
                boolean isConnected =dfss(neighbor,destination,vis);
                if(isConnected){
                    return true;
                }
            }
        }
        return false;

    }
    public static boolean dfsstack(int source,int destination){
        boolean vis[]=new boolean[adj.length];
        vis[source]=true;
        Stack<Integer> stack=new Stack<>();
        stack.push(source);
        while(!stack.isEmpty()){
            int cur=stack.pop();
            if(cur==destination) return true;
            for(int neighbor:adj[cur]){
                if(!vis[neighbor]){
                    vis[neighbor]=true;
                    stack.push(neighbor);
                }
            }
        }
        return false;
    }
    public static boolean dfsbo(int source,int destination){
        boolean vis[]=new boolean[adj.length];
        vis[source]=true;
        return dfss(source,destination,vis);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of vertices and edge");
        int v = sc.nextInt();
        int e = sc.nextInt();
        dfs graph = new dfs(v);
        System.out.println("Enter" + e + "edges");
        for (int i = 0; i < e; i++) {
            int source = sc.nextInt();
            int destination = sc.nextInt();
            graph.addEdge(source, destination);
        }
        // sc.close();
        System.out.println("Enter source and destination");
        int source=sc.nextInt();
        int destination=sc.nextInt();
        // boolean vis[]=new boolean[adj.length];
        boolean ans=dfsbo(source,destination);
        boolean ansstack=dfsstack(source, destination);
        System.out.println(ans);//Using Recursion
        System.out.println(ansstack);//Using Stack
        sc.close();
        
    }
}

