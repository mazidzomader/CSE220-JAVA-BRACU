import java.util.Scanner;

public class Graph_Tester {
    public static void main(String[] args){
        System.out.println("Enter any number between 1 to 4.\nTo run all tasks just press enter");
        System.out.print("Which Task do you wanna check: ");
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();

        if( input.equals("1") || input.equals("") ) task1();
        if( input.equals("2") || input.equals("") ) task2();
        if( input.equals("3") || input.equals("") ) task3();
        if( input.equals("4") || input.equals("") ) task4();
    }
    public static void task1(){
        System.out.println("=======================  Testing Task 01  =======================\nEnter 1 for Matrix\nEnter 2 for List\nHit Enter to run both tasks");
        System.out.print("Enter: ");
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        if( input.equals("1") || input.equals("") ) {System.out.println("===========  Testing Matrix Version  ===========");task1_matrix();};
        if( input.equals("2") || input.equals("") ) {System.out.println("===========  Testing LinkedList Version  ===========");task1_list();};
    }
    public static void task2(){
        System.out.println("=======================  Testing Task 02  =======================\nEnter 1 for Matrix\nEnter 2 for List\nHit Enter to run both tasks");
        System.out.print("Enter: ");
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        if( input.equals("1") || input.equals("") ) {System.out.println("===========  Testing Matrix Version  ===========");task2_matrix();};
        if( input.equals("2") || input.equals("") ) {System.out.println("===========  Testing LinkedList Version  ===========");task2_list();};
    }
    public static void task3(){
        System.out.println("=======================  Testing Task 03  =======================\nEnter 1 for Matrix\nEnter 2 for List\nHit Enter to run both tasks");
        System.out.print("Enter: ");
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        if( input.equals("1") || input.equals("") ) {System.out.println("===========  Testing Matrix Version  ===========");task3_matrix();};
        if( input.equals("2") || input.equals("") ) {System.out.println("===========  Testing LinkedList Version  ===========");task3_list();};
    }
    public static void task4(){
        System.out.println("=======================  Testing Task 04  =======================\nEnter 1 for Matrix\nEnter 2 for List\nHit Enter to run both tasks");
        System.out.print("Enter: ");
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        if( input.equals("1") || input.equals("") ) {System.out.println("===========  Testing Matrix Version  ===========");task4_matrix();};
        if( input.equals("2") || input.equals("") ) {System.out.println("===========  Testing LinkedList Version  ===========");task4_list();};
    }
    public static void task1_matrix(){
        graph graph1 = new graph(8, false);
        graph1.insertEdge(0, 1);
        graph1.insertEdge(2, 1);
        graph1.insertEdge(1, 3);
        graph1.insertEdge(2, 3);
        graph1.insertEdge(4, 1);
        graph1.insertEdge(4, 2);
        graph1.insertEdge(4, 3);
        graph1.insertEdge(4, 6);
        graph1.insertEdge(5, 1);
        graph1.insertEdge(5, 7);
        graph1.insertEdge(6, 7);
        graph1.insertEdge(6, 3);
        graph1.insertEdge(6, 0);
        graph1.insertEdge(7, 4);
        graph1.insertEdge(0, 7);
        graph1.insertEdge(0, 5);
        graph1.insertEdge(2, 7);
        graph1.insertEdge(3, 7);
        Task_01_Matrix.print2D(graph1.matrix);
        int[] maxDegree = Task_01_Matrix.maximumDegree(graph1);
        System.out.println("The Vertex " + maxDegree[1] + " has the maximum degree having " + maxDegree[0] + " edges");
    }
    public static void task1_list(){
        LinkedList graph1 = new LinkedList(8, false);
        graph1.insertEdge(0,1);
        graph1.insertEdge(2,1);
        graph1.insertEdge(1,3);
        graph1.insertEdge(2,3);
        graph1.insertEdge(4,1);
        graph1.insertEdge(4,2);
        graph1.insertEdge(4,3);
        graph1.insertEdge(4,6);
        graph1.insertEdge(5,1);
        graph1.insertEdge(5,7);
        graph1.insertEdge(6,7);
        graph1.insertEdge(6,3);
        graph1.insertEdge(6,0);
        graph1.insertEdge(7,4);
        graph1.insertEdge(0,7);
        graph1.insertEdge(0,5);
        graph1.insertEdge(2,7);
        graph1.insertEdge(3,7);
        graph1.printAdjList();
        int[] maxDegree = Task_01_List.maximumDegree(graph1);
        System.out.println("The Vertex " + maxDegree[1] + " has the maximum degree having " + maxDegree[0] + " edges");
    }
    public static void task2_matrix(){
        graph testCase = new graph(9, false);

        testCase.insertEdge(0, 2, 10);
        testCase.insertEdge(0, 1, 65);
        testCase.insertEdge(0, 8, 50);
        testCase.insertEdge(1, 2, 1);
        testCase.insertEdge(1, 4, 60);
        testCase.insertEdge(1, 7, 70);
        testCase.insertEdge(1, 8, 5);
        testCase.insertEdge(2, 6, 15);
        testCase.insertEdge(2, 3, 90);
        testCase.insertEdge(3, 5, 75);
        testCase.insertEdge(3, 4, 30);
        testCase.insertEdge(3, 7, 35);
        testCase.insertEdge(4, 6, 20);
        testCase.insertEdge(4, 5, 25);
        testCase.insertEdge(5, 6, 85);
        testCase.insertEdge(5, 7, 40);

        Task_01_Matrix.print2D(testCase.matrix);;
        System.out.println("Vertex " + Task_02_Matrix.maximumEdgeWeightWithMatrix(testCase) + " has maximum sum of edge weights");
    }
    public static void task2_list(){
        LinkedList test_case = new LinkedList(9, false);
        test_case.insertEdge(0, 2, 10);
        test_case.insertEdge(0, 1, 65);
        test_case.insertEdge(0, 8, 50);
        test_case.insertEdge(1, 2, 1);
        test_case.insertEdge(1, 4, 60);
        test_case.insertEdge(1, 7, 70);
        test_case.insertEdge(1, 8, 5);
        test_case.insertEdge(2, 6, 15);
        test_case.insertEdge(2, 3, 90);
        test_case.insertEdge(3, 5, 75);
        test_case.insertEdge(3, 4, 30);
        test_case.insertEdge(3, 7, 35);
        test_case.insertEdge(4, 6, 20);
        test_case.insertEdge(4, 5, 25);
        test_case.insertEdge(5, 6, 85);
        test_case.insertEdge(5, 7, 40);
        test_case.printAdjList();
        System.out.println("\nSum of edge weights of the vertex " + Task_02_List.maximumEdgeWeightWithList(test_case) + " is maximum");
    }
    public static void task3_list() {
        LinkedList testCase = new LinkedList(9, true);
        testCase.insertEdge(4, 6, 20);
        testCase.insertEdge(5, 4, 25);
        testCase.insertEdge(5, 6, 85);
        testCase.insertEdge(0, 1, 65);
        testCase.insertEdge(2, 3, 90);
        testCase.insertEdge(3, 5, 75);
        testCase.insertEdge(1, 4, 60);
        testCase.insertEdge(1, 2, 55);
        testCase.insertEdge(2, 0, 10);
        testCase.insertEdge(6, 2, 15);
        testCase.insertEdge(1, 7, 70);
        testCase.insertEdge(5, 7, 40);
        testCase.insertEdge(3, 7, 35);
        testCase.insertEdge(4, 3, 30);
        testCase.insertEdge(8, 1, 45);
        testCase.insertEdge(0, 8, 50);
        testCase.printAdjList();

        int[] maxDegVertex = Task_01_List.maximumDegree(testCase);
        System.out.println("The maximum outdegree is " + maxDegVertex[0]);
        System.out.println("Sum of outgoing edge weights of the vertex " + Task_02_List.maximumEdgeWeightWithList(testCase) + " is maximum");
      
    }
    public static void task3_matrix() {
        graph test_case = new graph(9, true);
        test_case.insertEdge(4, 6, 20);
        test_case.insertEdge(5, 4, 25);
        test_case.insertEdge(5, 6, 85);
        test_case.insertEdge(0, 1, 65);
        test_case.insertEdge(2, 3, 90);
        test_case.insertEdge(3, 5, 75);
        test_case.insertEdge(1, 4, 60);
        test_case.insertEdge(1, 2, 55);
        test_case.insertEdge(2, 0, 10);
        test_case.insertEdge(6, 2, 15);
        test_case.insertEdge(1, 7, 70);
        test_case.insertEdge(5, 7, 40);
        test_case.insertEdge(3, 7, 35);
        test_case.insertEdge(4, 3, 30);
        test_case.insertEdge(8, 1, 45);
        test_case.insertEdge(0, 8, 50);
        
        Task_01_Matrix.print2D(test_case.matrix);
        
        int[] maxDeg = Task_01_Matrix.maximumDegree(test_case);
        System.out.printf("The vertex %d has maximum outdegree and it is %d%n", maxDeg[1], maxDeg[0]);
        System.out.printf("Sum of outgoing edge weights of the vertex %d is maximum%n", Task_02_Matrix.maximumEdgeWeightWithMatrix(test_case));
    }
    public static void task4_list() {
        LinkedList test_case = new LinkedList(9, true);

        test_case.insertEdge(4, 6, 20);
        test_case.insertEdge(5, 4, 25);
        test_case.insertEdge(5, 6, 85);
        test_case.insertEdge(0, 1, 65);
        test_case.insertEdge(2, 3, 90);
        test_case.insertEdge(3, 5, 75);
        test_case.insertEdge(1, 4, 60);
        test_case.insertEdge(1, 2, 55);
        test_case.insertEdge(2, 0, 10);
        test_case.insertEdge(6, 2, 15);
        test_case.insertEdge(1, 7, 70);
        test_case.insertEdge(5, 7, 40);
        test_case.insertEdge(3, 7, 35);
        test_case.insertEdge(4, 3, 30);
        test_case.insertEdge(8, 1, 45);
        test_case.insertEdge(0, 8, 50);

        System.out.println("Directed weighted graph:");
        test_case.printAdjList();
        Task_04_List.directedToUndirected(test_case);
        System.out.println("\nConverted undirected weighted graph:");
        test_case.printAdjList();
    }
    public static void task4_matrix() {
        graph testCase = new graph(9, true);

        testCase.insertEdge(4, 6, 20);
        testCase.insertEdge(5, 4, 25);
        testCase.insertEdge(5, 6, 85);
        testCase.insertEdge(0, 1, 65);
        testCase.insertEdge(2, 3, 90);
        testCase.insertEdge(3, 5, 75);
        testCase.insertEdge(1, 4, 60);
        testCase.insertEdge(1, 2, 55);
        testCase.insertEdge(2, 0, 10);
        testCase.insertEdge(6, 2, 15);
        testCase.insertEdge(1, 7, 70);
        testCase.insertEdge(5, 7, 40);
        testCase.insertEdge(3, 7, 35);
        testCase.insertEdge(4, 3, 30);
        testCase.insertEdge(8, 1, 45);
        testCase.insertEdge(0, 8, 50);

        System.out.println("Directed weighted graph:");
        Task_01_Matrix.print2D(testCase.matrix);
        Task_04_Matrix.directedToUndirected(testCase);
        System.out.println("\nConverted undirected weighted graph:");
        Task_01_Matrix.print2D(testCase.matrix);
    }
}
