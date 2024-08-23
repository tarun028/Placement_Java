import java.util.*;

public class graph {

    static class Edge{
        int src;
        int dest;

        public Edge(int s, int d){
            this.src=s;
            this.dest=d;
        }

    }

    public static void createGraph(ArrayList<Edge> graph[]){
        for(int i=0;i<graph.length;i++){
            graph[i]=new ArrayList<Edge>();
        }
        graph[0].add(new Edge(0, 2));
        graph[1].add(new Edge(1, 2));
        graph[1].add(new Edge(1, 3));
        graph[2].add(new Edge(2, 0));
        graph[2].add(new Edge(2, 1));
        graph[2].add(new Edge(2, 3));
        graph[3].add(new Edge(3, 1));
        graph[3].add(new Edge(3, 2));

    }

    public static void bfs(ArrayList<Edge> graph[],boolean vis[],int V){
        Queue<Integer> q=new LinkedList<>();
        boolean visited[]=new boolean[V];

        q.add(0);

        while(!q.isEmpty()){
            int curr=q.remove();
            if(visited[curr]==false){
                //print
                System.out.println(curr+" ");
                //mark it 
                visited[curr]=true;

                //find neighbour and add them

                for(int i=0;i<graph[curr].size();i++){
                    Edge e= graph[curr].get(i);
                    q.add(e.dest);
                }

            }
        }
    }

    public static void dfs(ArrayList<Edge> graph[],int curr,boolean vis[]){
        System.out.println(curr+" ");
        vis[curr]=true;

        for(int i=0;i<graph[curr].size();i++){
            Edge e= graph[curr].get(i);

            if(vis[e.dest]==false){
                dfs(graph, e.dest, vis);
            }
        }
    }

    public static void find(ArrayList<Edge> graph[],int curr,boolean vis[], String path,int target){
       
        if(curr==target){
            System.out.println(path);
            return;
        }

        for(int i=0;i<graph[curr].size();i++){
            Edge e= graph[curr].get(i);
            
            if(!vis[curr]){
                vis[curr]=true;
                find(graph, e.dest, vis, path+e.dest, target);

                vis[curr]=false;
            }
        }
    }

    public static boolean undirectedFindCycle(ArrayList<Edge> graph[],int curr,boolean vis[],int par){
        //curr will be parent in next iteration

        vis[curr]=true;

        for(int i=0;i<graph[curr].size();i++){
            Edge e= graph[curr].get(i);

            if(vis[e.dest]==true && e.dest!=par){
                return true;
            }

            else if(!vis[e.dest]){
                    if(undirectedFindCycle(graph, e.dest, vis, curr)){
                        return true;
                    }
            }
        }

        return false;

    }

    public static void topSortUtil(ArrayList<Edge> graph[],int curr,boolean vis[],Stack<Integer> stack){
        vis[curr]=true;

        for(int i=0;i<graph[curr].size();i++){
            Edge e=graph[curr].get(i);

            if(!vis[e.dest]){
                topSortUtil(graph, e.dest, vis, stack);
            }
        }
        stack.push(curr);
    }

    public static void topSort(ArrayList<Edge> graph[],int V){
        boolean vis[]=new boolean[V];
        Stack<Integer> stack = new Stack<>();

        for(int i=0;i<V;i++){
            if(!vis[i]){
                topSortUtil(graph, i, vis, stack);
            }
        }
        while(!stack.isEmpty()){
            System.out.println(stack.pop()+" ");
        }
    }








    public static void main(String[] args) {

        int V=4;
        ArrayList<Edge> graph[]=new ArrayList[V];
        createGraph(graph);

        //neighbour
        for(int i=0;i<graph[2].size();i++){
            Edge e=graph[2].get(i);
            //System.out.println(e.dest+" ");
        }
        boolean visited[]=new boolean[V];

        //bfs(graph, visited, V);
        int src=0;
        int target=3;
        //dfs(graph, 0, visited);
        //find(graph, src, visited, "0", target);
        System.out.println(undirectedFindCycle(graph, 0, visited, -1));
    }
}
