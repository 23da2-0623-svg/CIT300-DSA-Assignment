import java.util.*;

public class GraphOperations {
    private Map<Integer, List<Integer>> adjList = new HashMap<>();

    // Add Vertex
    public void addVertex(int vertex) {
        adjList.putIfAbsent(vertex, new ArrayList<>());
        System.out.println("Vertex " + vertex + " added.");
    }

    // Add Edge
    public void addEdge(int source, int destination) {
        adjList.putIfAbsent(source, new ArrayList<>());
        adjList.putIfAbsent(destination, new ArrayList<>());
        adjList.get(source).add(destination);
        adjList.get(destination).add(source); // Undirected graph
        System.out.println("Edge added between " + source + " and " + destination);
    }

    // Display Graph
    public void displayGraph() {
        if (adjList.isEmpty()) {
            System.out.println("Graph is empty.");
            return;
        }
        System.out.println("\n--- Graph Adjacency List ---");
        for (var entry : adjList.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }
    }

    // BFS Traversal
    public void bfsTraversal(int startVertex) {
        if (!adjList.containsKey(startVertex)) {
            System.out.println("Start vertex not found in graph.");
            return;
        }
        Set<Integer> visited = new HashSet<>();
        Queue<Integer> queue = new LinkedList<>();

        visited.add(startVertex);
        queue.add(startVertex);

        System.out.print("BFS Traversal starting from " + startVertex + ": ");
        int steps = 0;
        while (!queue.isEmpty()) {
            int current = queue.poll();
            System.out.print(current + " ");
            steps++;

            for (int neighbor : adjList.getOrDefault(current, new ArrayList<>())) {
                if (!visited.contains(neighbor)) {
                    visited.add(neighbor);
                    queue.add(neighbor);
                }
            }
        }
        System.out.println("\nTotal BFS Steps: " + steps);
    }

    // DFS Traversal
    public void dfsTraversal(int startVertex) {
        if (!adjList.containsKey(startVertex)) {
            System.out.println("Start vertex not found in graph.");
            return;
        }
        Set<Integer> visited = new HashSet<>();
        System.out.print("DFS Traversal starting from " + startVertex + ": ");
        int[] steps = new int[1];
        dfsHelper(startVertex, visited, steps);
        System.out.println("\nTotal DFS Steps: " + steps[0]);
    }

    private void dfsHelper(int vertex, Set<Integer> visited, int[] steps) {
        visited.add(vertex);
        System.out.print(vertex + " ");
        steps[0]++;

        for (int neighbor : adjList.getOrDefault(vertex, new ArrayList<>())) {
            if (!visited.contains(neighbor)) {
                dfsHelper(neighbor, visited, steps);
            }
        }
    }
}
