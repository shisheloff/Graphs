public class test {
    public static void main(String[] args) {
        Dijkstra graph = new Dijkstra(8);
        WeightedEdge d1 = new WeightedEdge(0, 2, 3);
        WeightedEdge d2 = new WeightedEdge(0, 4, 5);
        WeightedEdge d3 = new WeightedEdge(2, 7, 1);
        WeightedEdge d4 = new WeightedEdge(4, 7, 8);
        WeightedEdge d5 = new WeightedEdge(4, 5, 4);
        WeightedEdge d6 = new WeightedEdge(7, 3, 5);
        WeightedEdge d7 = new WeightedEdge(7, 5, 9);
        WeightedEdge d8 = new WeightedEdge(3, 6, 1);
        WeightedEdge d9 = new WeightedEdge(5, 7, 2);
        WeightedEdge d10 = new WeightedEdge(5, 1, 6);
        WeightedEdge d11 = new WeightedEdge(5, 4, 3);
        WeightedEdge d12 = new WeightedEdge(1, 3, 7);
        WeightedEdge d13 = new WeightedEdge(6, 2, 8);
        WeightedEdge d14 = new WeightedEdge(6, 0, 5);
        WeightedEdge d15 = new WeightedEdge(6, 4, 4);
        graph.addEdge(d1);
        graph.addEdge(d2);
        graph.addEdge(d3);
        graph.addEdge(d4);
        graph.addEdge(d5);
        graph.addEdge(d6);
        graph.addEdge(d7);
        graph.addEdge(d8);
        graph.addEdge(d9);
        graph.addEdge(d10);
        graph.addEdge(d11);
        graph.addEdge(d12);
        graph.addEdge(d13);
        graph.addEdge(d14);
        graph.addEdge(d15);
        System.out.println("Dijkstra's algorithm:");
        graph.DIjkstra(1);
        graph.pathTo(5);
        System.out.println("Floyd Warshall's algorithm:");
        FloydWarshall fw = new FloydWarshall(8);
        fw.addEdge(0, 1, 2);
        fw.addEdge(1, 2, 3);
        fw.addEdge(2, 3, 4);
        fw.addEdge(3, 4, 5);
        fw.addEdge(4, 5, 6);
        fw.addEdge(5, 6, 7);
        fw.addEdge(6, 7, 8);
        fw.floydWarshall();

        System.out.println("Prim's algorithm:");
        Prim p = new Prim(8);
        Edge e1 = new Edge(0, 1, 2);
        Edge e2 = new Edge(1, 2, 3);
        Edge e3 = new Edge(2, 3, 4);
        Edge e4 = new Edge(3, 4, 5);
        Edge e5 = new Edge(4, 5, 6);
        Edge e6 = new Edge(5, 6, 7);
        Edge e7 = new Edge(6, 7, 8);
        p.addEdge(e1);
        p.addEdge(e2);
        p.addEdge(e3);
        p.addEdge(e4);
        p.addEdge(e5);
        p.addEdge(e6);
        p.addEdge(e7);
        p.AlgPrim();

        System.out.println("Kruscal's algorithm:");
        Kruscal k = new Kruscal(8, 15);
        k.addEdge(0, 2, 3);
        k.addEdge(0, 4, 5);
        k.addEdge(2, 7, 1);
        k.addEdge(4, 7, 8);
        k.addEdge(4, 5, 4);
        k.addEdge(7, 3, 5);
        k.addEdge(7, 5, 9);
        k.addEdge(3, 6, 1);
        k.addEdge(5, 7, 2);
        k.addEdge(5, 1, 6);
        k.addEdge(5, 4, 3);
        k.addEdge(1, 3, 7);
        k.addEdge(6, 2, 8);
        k.addEdge(6, 0, 5);
        k.addEdge(6, 4, 4);
        k.kruskal();

        System.out.println("BFS:");
        BFS b = new BFS(6);
        b.addEdge(0,1);
        b.addEdge(1,2);
        b.addEdge(2,3);
        b.addEdge(3,4);
        b.addEdge(4,5);
        b.bfs(1);

        System.out.println("DFS:");
        DFS d = new DFS(6);
        d.addEdge(0,1);
        d.addEdge(1,2);
        d.addEdge(2,3);
        d.addEdge(3,4);
        d.addEdge(4,5);
        d.dfs(3);
    }
}
