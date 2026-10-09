import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        GraphOperations graph = new GraphOperations();

        while (true) {
            System.out.println("\n==========================================");
            System.out.println("     DATA STRUCTURE & GRAPH ANALYZER      ");
            System.out.println("==========================================");
            System.out.println("1. Array Operations");
            System.out.println("2. Stack Operations");
            System.out.println("3. Queue Operations");
            System.out.println("4. Linked List Operations");
            System.out.println("5. Searching Operations");
            System.out.println("6. Graph Operations");
            System.out.println("7. Performance Comparison");
            System.out.println("8. Display All Results");
            System.out.println("9. Exit");
            System.out.print("Enter your choice: ");

            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("--> Array Operations selected.");
                    break;
                case 2:
                    System.out.println("--> Stack Operations selected.");
                    break;
                case 3:
                    System.out.println("--> Queue Operations selected.");
                    break;
                case 4:
                    System.out.println("--> Linked List Operations selected.");
                    break;
                case 5:
                    System.out.println("--> Searching Operations selected.");
                    break;
                case 6:
                    handleGraphMenu(scanner, graph);
                    break;
                case 7:
                    PerformanceAnalyzer.displayComparison();
                    break;
                case 8:
                    System.out.println("Displaying all current structure states...");
                    graph.displayGraph();
                    break;
                case 9:
                    System.out.println("Exiting System. Goodbye!");
                    scanner.close();
                    System.exit(0);
                default:
                    System.out.println("Invalid choice! Please try again.");
            }
        }
    }

    private static void handleGraphMenu(Scanner scanner, GraphOperations graph) {
        while (true) {
            System.out.println("\n--- GRAPH OPERATIONS ---");
            System.out.println("1. Add Vertex");
            System.out.println("2. Add Edge");
            System.out.println("3. Display Graph");
            System.out.println("4. BFS Traversal");
            System.out.println("5. DFS Traversal");
            System.out.println("6. Return to Main Menu");
            System.out.print("Enter your choice: ");

            int gChoice = scanner.nextInt();
            if (gChoice == 6) break;

            switch (gChoice) {
                case 1:
                    System.out.print("Enter Vertex Number: ");
                    int v = scanner.nextInt();
                    graph.addVertex(v);
                    break;
                case 2:
                    System.out.print("Enter Source Vertex: ");
                    int src = scanner.nextInt();
                    System.out.print("Enter Destination Vertex: ");
                    int dest = scanner.nextInt();
                    graph.addEdge(src, dest);
                    break;
                case 3:
                    graph.displayGraph();
                    break;
                case 4:
                    System.out.print("Enter Start Vertex for BFS: ");
                    int bfsStart = scanner.nextInt();
                    graph.bfsTraversal(bfsStart);
                    break;
                case 5:
                    System.out.print("Enter Start Vertex for DFS: ");
                    int dfsStart = scanner.nextInt();
                    graph.dfsTraversal(dfsStart);
                    break;
                default:
                    System.out.println("Invalid choice!");
            }
        }
    }
}
