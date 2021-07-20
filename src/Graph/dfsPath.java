package Graph;
import java.util.*;
public class dfsPath {
    
    static class Edge {
        int src;//source
        int nbr;//neighbor
        int wt;//weight
        Edge(int src,int nbr,int wt){
            this.src=src;
            this.nbr=nbr;
            this.wt=wt;
        }
    }    
    public static boolean hasPath(ArrayList<Edge>[] graph, int src, int dest, boolean[] visited){
        if(src==dest){
            return true;
        }
        visited[src]=true;
        for(Edge edge: graph[src]){
            if(visited[edge.nbr]==false){
                boolean hasNbrPath=hasPath(graph,edge.nbr,dest,visited);
                if(hasNbrPath==true){
                    return true;
                }
            }
        }
        return false;

    }
    @SuppressWarnings("unchecked")
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int vt=7;
        // int edges=8;
        int src=0;
        int dest=6;
        ArrayList<Edge>[] graph =new ArrayList[vt];
        for(int i=0;i<vt;i++){
            graph[i]=new ArrayList<>();
        }
        graph[0].add(new Edge (0,1,10));
        graph[1].add(new Edge (1,0,10));

        graph[1].add(new Edge (1,2,10));
        graph[2].add(new Edge (2,1,10));

        graph[2].add(new Edge (2,3,10));
        graph[3].add(new Edge (3,2,10));

        graph[0].add(new Edge (0,3,10));
        graph[3].add(new Edge (3,0,10));

        graph[3].add(new Edge (3,4,10));
        graph[4].add(new Edge (4,3,10));

        graph[4].add(new Edge (4,5,10));
        graph[5].add(new Edge (5,4,10));

        graph[5].add(new Edge (5,6,10));
        graph[6].add(new Edge (6,5,10));

        graph[4].add(new Edge (4,6,10));
        graph[6].add(new Edge (6,4,10));
        boolean visited[]=new boolean [vt];
        boolean path=hasPath(graph,src,dest,visited);
        System.out.println(path);
        sc.close();

    }
}
