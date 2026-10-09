public class PerformanceAnalyzer {
    public static void displayComparison() {
        System.out.println("\n==========================================");
        System.out.println("         PERFORMANCE COMPARISON           ");
        System.out.println("==========================================");
        System.out.printf("%-18s | %-15s | %-10s\n", "Operation", "Algorithm", "Time Complexity");
        System.out.println("------------------------------------------");
        System.out.printf("%-18s | %-15s | %-10s\n", "Search", "Linear Search", "O(N)");
        System.out.printf("%-18s | %-15s | %-10s\n", "Search", "Binary Search", "O(log N)");
        System.out.printf("%-18s | %-15s | %-10s\n", "Graph Traversal", "BFS", "O(V + E)");
        System.out.printf("%-18s | %-15s | %-10s\n", "Graph Traversal", "DFS", "O(V + E)");
        System.out.println("==========================================");
        System.out.println("Note: Binary Search is faster than Linear Search for sorted data.");
        System.out.println("BFS uses Queue (Level-by-level), DFS uses Stack/Recursion (Depth-first).");
    }
}
