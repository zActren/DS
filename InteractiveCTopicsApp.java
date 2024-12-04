package wk;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.util.HashMap;
import java.util.Map;

public class InteractiveCTopicsApp {
    private static JTextArea codeArea;
    private static JTextArea outputArea;
    private static JLabel imageLabel; // Label to display images
    private static Map<String, String> imageMap; // Map to store topic-image mappings

    public static void main(String[] args) {
        // Create the main frame
        initializeImageMap();

    	
        JFrame frame = new JFrame("Interactive C Code Topics");
        frame.setSize(800, 600);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new BorderLayout());

        // Create a text area to input C code
        codeArea = new JTextArea("Enter your C code here...");
        frame.add(new JScrollPane(codeArea), BorderLayout.CENTER);

        // Create a text area to display output
        outputArea = new JTextArea();
        outputArea.setEditable(false);
        frame.add(new JScrollPane(outputArea), BorderLayout.SOUTH);

        // Create a panel for buttons
        JPanel buttonPanel = new JPanel();
        buttonPanel.setLayout(new GridLayout(4, 3)); // 10 topics + Run button

        // Button for each topic
        JButton button1 = new JButton("Arrays");
        button1.addActionListener(e -> displayCodeForTopic("Arrays"));

        JButton button2 = new JButton("Linked Lists");
        button2.addActionListener(e -> displayCodeForTopic("Linked Lists"));

        JButton button3 = new JButton("Stacks");
        button3.addActionListener(e -> displayCodeForTopic("Stacks"));

        JButton button4 = new JButton("Queues");
        button4.addActionListener(e -> displayCodeForTopic("Queues"));

        JButton button5 = new JButton("Trees");
        button5.addActionListener(e -> displayCodeForTopic("Trees"));

        JButton button6 = new JButton("Binary Search Trees");
        button6.addActionListener(e -> displayCodeForTopic("Binary Search Trees"));

        JButton button7 = new JButton("Hash Tables");
        button7.addActionListener(e -> displayCodeForTopic("Hash Tables"));

        JButton button8 = new JButton("Heaps and Priority Queues");
        button8.addActionListener(e -> displayCodeForTopic("Heaps and Priority Queues"));

        JButton button9 = new JButton("Graphs");
        button9.addActionListener(e -> displayCodeForTopic("Graphs"));

        JButton button10 = new JButton("Sorting Algorithms");
        button10.addActionListener(e -> displayCodeForTopic("Sorting Algorithms"));

        JButton button11 = new JButton("Searching Algorithms");
        button11.addActionListener(e -> displayCodeForTopic("Searching Algorithms"));


        buttonPanel.add(button1);
        buttonPanel.add(button2);
        buttonPanel.add(button3);
        buttonPanel.add(button4);
        buttonPanel.add(button5);
        buttonPanel.add(button6);
        buttonPanel.add(button7);
        buttonPanel.add(button8);
        buttonPanel.add(button9);
        buttonPanel.add(button10);
        buttonPanel.add(button11);
      

        
        frame.add(buttonPanel, BorderLayout.NORTH);
        
        
        JPanel imagePanel = new JPanel();
        imageLabel = new JLabel("No image loaded", SwingConstants.CENTER);
        imagePanel.add(imageLabel);
        frame.add(imagePanel, BorderLayout.WEST);

        // Set the frame visibility to true
        frame.setVisible(true);
    }
    
    private static void initializeImageMap() {
        imageMap = new HashMap<>();
        imageMap.put("Arrays", "C:\\Users\\Public\\Pictures\\Array.png");
        imageMap.put("Linked Lists", "C:\\Usuarios\\Acceso público\\Imágenes públicas\\Linked list.png");
        imageMap.put("Stacks", "C:\\Usuarios\\Acceso público\\Imágenes públicas\\Stack.png");
        imageMap.put("Queues", "C:\\Usuarios\\Acceso público\\Imágenes públicas\\Queue.png");
        imageMap.put("Trees", "C:\\Usuarios\\Acceso público\\Imágenes públicas\\Tree.png");
        imageMap.put("Binary Search Trees", "C:\\Usuarios\\Acceso público\\Imágenes públicas\\Binary Search Tree.png");
        imageMap.put("Hash Tables", "C:\\Usuarios\\Acceso público\\Imágenes públicas\\Hash.png");
        imageMap.put("Heaps and Priority Queues", "C:\\Usuarios\\Acceso público\\Imágenes públicas\\Heap.png");
        imageMap.put("Graphs", "C:\\Usuarios\\Acceso público\\Imágenes públicas\\Graph.png");
        imageMap.put("Sorting Algorithms", "C:\\Usuarios\\Acceso público\\Imágenes públicas\\Bubble Sort.png");
        imageMap.put("Searching Algorithms", "C:\\Usuarios\\Acceso público\\Imágenes públicas\\Searching.png");
    }
    
    // Display C code or topic information for the given topic
    private static void displayCodeForTopic(String topic) {
        switch (topic) {
            case "Arrays":
                codeArea.setText("\t\t### Arrays in C:\n\n" +
                        "An **array** is a collection of elements, all of the same type, stored in contiguous memory locations. Arrays allow you to store multiple values in a single variable, and each element in the array can be accessed using an index.\n" +
                        "\t- **Static Array**: An array with a fixed size that is known at compile time.\n" +
                        "\t- **Dynamic Array**: An array whose size can be changed during runtime.\n" +
                        "### Characteristics of Arrays:\n" +
                        "\t- **Indexing**: Array elements are accessed using indices, starting from index 0.\n" +
                        "\t- **Fixed Size**: The size of a static array is fixed at the time of declaration.\n" +
                        "\t- **Contiguous Memory**: All array elements are stored in consecutive memory locations.\n\n" +
                        "### Example C Code for Arrays:\n\n" +
                        "#include <stdio.h>\n" +
                        "int main() {\n" +
                        "    int arr[5] = {1, 2, 3, 4, 5};\n" +
                        "    for(int i = 0; i < 5; i++) {\n" +
                        "        printf(\"%d \", arr[i]);\n" +
                        "    }\n" +
                        "    return 0;\n}");
                break;

            case "Linked Lists":
                codeArea.setText("\t\t### Linked Lists in C:\n\n" +
                        "\tA **linked list** is a linear collection of elements, where each element (called a **node**) contains two parts:\n" +
                        "\t- **Data**: The value of the element.\n" +
                        "\t- **Pointer**: A reference (or link) to the next node in the list.\n\n" +
                        "### Types of Linked Lists:\n" +
                        "\t- **Singly Linked List**: Each node points to the next node, with the last node pointing to NULL.\n" +
                        "\t- **Doubly Linked List**: Each node has two pointers: one to the next node and one to the previous node.\n" +
                        "\t- **Circular Linked List**: The last node points to the first node, forming a circular structure.\n\n" +
                        "### Example C Code for Linked Lists:\n\n" +
                        "#include <stdio.h>\n" +
                        "struct Node {\n" +
                        "    int data;\n" +
                        "    struct Node* next;\n" +
                        "};\n" +
                        "void printList(struct Node* head) {\n" +
                        "    struct Node* current = head;\n" +
                        "    while (current != NULL) {\n" +
                        "        printf(\"%d -> \", current->data);\n" +
                        "        current = current->next;\n" +
                        "    }\n" +
                        "    printf(\"NULL\\n\");\n" +
                        "}\n" +
                        "int main() {\n" +
                        "    struct Node* head = NULL;\n" +
                        "    struct Node* second = NULL;\n" +
                        "    struct Node* third = NULL;\n" +
                        "    head = (struct Node*)malloc(sizeof(struct Node));\n" +
                        "    second = (struct Node*)malloc(sizeof(struct Node));\n" +
                        "    third = (struct Node*)malloc(sizeof(struct Node));\n" +
                        "    head->data = 1;\n" +
                        "    head->next = second;\n" +
                        "    second->data = 2;\n" +
                        "    second->next = third;\n" +
                        "    third->data = 3;\n" +
                        "    third->next = NULL;\n" +
                        "    printList(head);\n" +
                        "    return 0;\n}");
                break;

            case "Stacks":
                codeArea.setText("\t\t### Stacks in C:\n\n" +
                        "A **stack** is a linear data structure that follows the **Last In, First Out (LIFO)** principle. This means that the last element added to the stack is the first to be removed.\n" +
                        "### Operations on Stack:\n" +
                        "\t- **Push**: Add an element to the top of the stack.\n" +
                        "\t- **Pop**: Remove the top element from the stack.\n" +
                        "\t- **Peek**: Retrieve the top element without removing it.\n\n" +
                        "### Example C Code for Stacks:\n\n" +
                        "#include <stdio.h>\n" +
                        "#define MAX 5\n" +
                        "int stack[MAX], top = -1;\n" +
                        "void push(int value) {\n" +
                        "    if (top < MAX - 1) {\n" +
                        "        stack[++top] = value;\n" +
                        "        printf(\"Pushed %d\\n\", value);\n" +
                        "    }\n" +
                        "}\n" +
                        "void pop() {\n" +
                        "    if (top >= 0) {\n" +
                        "        printf(\"Popped %d\\n\", stack[top--]);\n" +
                        "    }\n" +
                        "}\n" +
                        "int main() {\n" +
                        "    push(10);\n" +
                        "    push(20);\n" +
                        "    pop();\n" +
                        "    return 0;\n}");
                break;

            case "Queues":
                codeArea.setText("\t\t### Queues in C:\n\n" +
                        "\tA **queue** is a linear data structure that follows the **First In, First Out (FIFO)** principle. The first element added to the queue is the first to be removed.\n" +
                        "### Operations on Queue:\n" +
                        "\t- **Enqueue**: Add an element to the rear of the queue.\n\n" +
                        "\t- **Dequeue**: Remove the front element from the queue.\n\n" +
                        "\t- **Peek**: Retrieve the front element without removing it.\n\n" +
                        "### Example C Code for Queues:\n\n" +
                        "#include <stdio.h>\n" +
                        "#define MAX 5\n" +
                        "int queue[MAX], front = -1, rear = -1;\n" +
                        "void enqueue(int value) {\n" +
                        "    if (rear < MAX - 1) {\n" +
                        "        if (front == -1) front = 0;\n" +
                        "        queue[++rear] = value;\n" +
                        "        printf(\"Enqueued %d\\n\", value);\n" +
                        "    }\n" +
                        "}\n" +
                        "void dequeue() {\n" +
                        "    if (front != -1) {\n" +
                        "        printf(\"Dequeued %d\\n\", queue[front++]);\n" +
                        "        if (front > rear) front = rear = -1;\n" +
                        "    }\n" +
                        "}\n" +
                        "int main() {\n" +
                        "    enqueue(10);\n" +
                        "    enqueue(20);\n" +
                        "    dequeue();\n" +
                        "    return 0;\n}");
                break;

            case "Trees":
                codeArea.setText("\t\t### Trees in C:\n\n" +
                        "\tA **tree** is a hierarchical data structure consisting of nodes. Each node contains a value and references (or pointers) to its child nodes.\n\n" +
                        "### Types of Trees:\n" +
                        "\t- **Binary Tree**: Each node has at most two children.\n" +
                        "\t- **Binary Search Tree (BST)**: A binary tree with the property that for each node, the left subtree contains only nodes with smaller values, and the right subtree contains only nodes with larger values.\n" +
                        "\t- **AVL Tree**: A self-balancing binary search tree.\n\n" +
                        "### Example C Code for Trees:\n\n" +
                        "#include <stdio.h>\n" +
                        "struct TreeNode {\n" +
                        "    int data;\n" +
                        "    struct TreeNode* left, *right;\n" +
                        "};\n" +
                        "int main() {\n" +
                        "    struct TreeNode* root = NULL;\n" +
                        "    return 0;\n}");
                break;

            case "Binary Search Trees":
                codeArea.setText("\t\t### Binary Search Trees (BST) in C:\n\n" +
                        "\tA **Binary Search Tree (BST)** is a binary tree with the property that for each node, the value in the left child is smaller than the value in the parent node, and the value in the right child is larger.\n\n" +
                        "### Operations in BST:\n" +
                        "\t- **Insertion**: Insert a new value into the BST.\n" +
                        "\t- **Search**: Find a value in the BST.\n" +
                        "\t- **Deletion**: Remove a node from the BST.\n\n" +
                        "### Example C Code for Binary Search Trees:\n\n" +
                        "#include <stdio.h>\n" +
                        "struct TreeNode {\n" +
                        "    int data;\n" +
                        "    struct TreeNode* left, *right;\n" +
                        "};\n" +
                        "void insert(struct TreeNode** root, int value) {\n" +
                        "    if (*root == NULL) {\n" +
                        "        *root = (struct TreeNode*)malloc(sizeof(struct TreeNode));\n" +
                        "        (*root)->data = value;\n" +
                        "        (*root)->left = (*root)->right = NULL;\n" +
                        "    }\n" +
                        "}\n" +
                        "int main() {\n" +
                        "    struct TreeNode* root = NULL;\n" +
                        "    insert(&root, 10);\n" +
                        "    return 0;\n}");
                break;

            case "Hash Tables":
                codeArea.setText("\t\t### Hash Tables in C:\n\n" +
                        "\tA **hash table** is a data structure that stores key-value pairs. It uses a hash function to compute an index into an array of buckets or slots, from which the desired value can be found.\n\n" +
                        "### Characteristics of Hash Tables:\n" +
                        "\t- **Fast Access**: Hash tables allow for constant time (O(1)) complexity for lookups, insertions, and deletions.\n\n" +
                        "\t- **Collision Handling**: When two keys hash to the same index, a collision occurs. Collision resolution methods include **chaining** and **open addressing**.\n\n" +
                        "### Example C Code for Hash Tables:\n\n" +
                        "#include <stdio.h>\n" +
                        "#include <stdlib.h>\n" +
                        "#define TABLE_SIZE 10\n" +
                        "struct HashNode {\n" +
                        "    int key;\n" +
                        "    int value;\n" +
                        "    struct HashNode* next;\n" +
                        "};\n" +
                        "struct HashNode* hashTable[TABLE_SIZE];\n" +
                        "int hash(int key) { return key % TABLE_SIZE; }\n" +
                        "void insert(int key, int value) {\n" +
                        "    int index = hash(key);\n" +
                        "    struct HashNode* newNode = (struct HashNode*)malloc(sizeof(struct HashNode));\n" +
                        "    newNode->key = key;\n" +
                        "    newNode->value = value;\n" +
                        "    newNode->next = hashTable[index];\n" +
                        "    hashTable[index] = newNode;\n}\n" +
                        "int search(int key) {\n" +
                        "    int index = hash(key);\n" +
                        "    struct HashNode* current = hashTable[index];\n" +
                        "    while (current != NULL) {\n" +
                        "        if (current->key == key) return current->value;\n" +
                        "        current = current->next;\n" +
                        "    }\n" +
                        "    return -1;\n}\n" +
                        "int main() {\n" +
                        "    insert(1, 10);\n" +
                        "    insert(2, 20);\n" +
                        "    insert(3, 30);\n" +
                        "    printf(\"Value at key 2: %d\\n\", search(2));\n" +
                        "    return 0;\n}");
                break;

            case "Heaps and Priority Queues":
                codeArea.setText("\t### Heaps and Priority Queues in C:\n\n" +
                        "\tA **HEAP** is a special type of binary tree-based data structure that satisfies the heap property. A **max-heap** ensures that the parent node is greater than the child nodes, while a **min-heap** ensures the parent is smaller than the children.\n\n" +
                        "\t\t### Priority Queue:\n" +
                        "\tA **priority queue** is an abstract data type that supports insertion and removal of elements in order of priority, rather than the order of insertion.\n" +
                        "\t### Example C Code for Heaps:\n\n" +
                        "#include <stdio.h>\n" +
                        "#include <stdlib.h>\n" +
                        "#define MAX 10\n" +
                        "int heap[MAX], size = 0;\n" +
                        "void insert(int value) {\n" +
                        "    heap[size++] = value;\n" +
                        "    int i = size - 1;\n" +
                        "    while (i > 0 && heap[(i - 1) / 2] < heap[i]) {\n" +
                        "        int temp = heap[i];\n" +
                        "        heap[i] = heap[(i - 1) / 2];\n" +
                        "        heap[(i - 1) / 2] = temp;\n" +
                        "        i = (i - 1) / 2;\n" +
                        "    }\n" +
                        "}\n" +
                        "int main() {\n" +
                        "    insert(10);\n" +
                        "    insert(20);\n" +
                        "    insert(15);\n" +
                        "    insert(30);\n" +
                        "    insert(40);\n" +
                        "    for (int i = 0; i < size; i++) {\n" +
                        "        printf(\"%d \", heap[i]);\n" +
                        "    }\n" +
                        "    return 0;\n}");
                break;

            case "Graphs":
                codeArea.setText("\t### Graphs in C:\n\n" +
                        "\tA **graph** is a collection of nodes (vertices) and edges (connections between nodes). Graphs are used to model pairwise relations between objects.\n\n" +
                        "\t### Types of Graphs:\n" +
                        "\t\t- **Undirected Graph**: Edges have no direction; they are bidirectional.\n" +
                        "\t\t- **Directed Graph (Digraph)**: Edges have a direction; they go from one vertex to another.\n" +
                        "\t\t- **Weighted Graph**: Edges have weights (costs, distances, etc.).\n" +
                        "\t### Example C Code for Graphs:\n\n" +
                        "#include <stdio.h>\n" +
                        "#define MAX 5\n" +
                        "int graph[MAX][MAX] = {0};\n" +
                        "void addEdge(int u, int v) {\n" +
                        "    graph[u][v] = 1;\n" +
                        "    graph[v][u] = 1;\n" +
                        "}\n" +
                        "void printGraph() {\n" +
                        "    for (int i = 0; i < MAX; i++) {\n" +
                        "        for (int j = 0; j < MAX; j++) {\n" +
                        "            printf(\"%d \", graph[i][j]);\n" +
                        "        }\n" +
                        "        printf(\"\\n\");\n" +
                        "    }\n" +
                        "}\n" +
                        "int main() {\n" +
                        "    addEdge(0, 1);\n" +
                        "    addEdge(0, 2);\n" +
                        "    addEdge(1, 3);\n" +
                        "    addEdge(3, 4);\n" +
                        "    printGraph();\n" +
                        "    return 0;\n}");
                break;

            case "Sorting Algorithms":
                codeArea.setText("\t\t### Sorting Algorithms in C:\n\n" +
                        "\tSorting algorithms are used to rearrange a collection of data into a specific order, typically ascending or descending.\n\n" +
                        "\t\t### Types of Sorting Algorithms:\n" +
                        "\t- **Bubble Sort**: Repeatedly steps through the list, compares adjacent elements, and swaps them if they are in the wrong order.\n\n" +
                        "\t- **Selection Sort**: Repeatedly selects the smallest (or largest) element from the unsorted part of the array and swaps it with the first unsorted element.\n\n" +
                        "\t- **Insertion Sort**: Builds the sorted array one element at a time by inserting each element into its correct position.\n\n" +
                        "### Example C Code for Bubble Sort:\n\n" +
                        "#include <stdio.h>\n" +
                        "void bubbleSort(int arr[], int n) {\n" +
                        "    for (int i = 0; i < n - 1; i++) {\n" +
                        "        for (int j = 0; j < n - i - 1; j++) {\n" +
                        "            if (arr[j] > arr[j + 1]) {\n" +
                        "                int temp = arr[j];\n" +
                        "                arr[j] = arr[j + 1];\n" +
                        "                arr[j + 1] = temp;\n" +
                        "            }\n" +
                        "        }\n" +
                        "    }\n}\n" +
                        "int main() {\n" +
                        "    int arr[5] = {5, 2, 9, 1, 5};\n" +
                        "    bubbleSort(arr, 5);\n" +
                        "    for (int i = 0; i < 5; i++) {\n" +
                        "        printf(\"%d \", arr[i]);\n" +
                        "    }\n" +
                        "    return 0;\n}");
                break;

            case "Searching Algorithms":
                codeArea.setText("### Searching Algorithms Overview:\n\n" +
                        "A **search algorithm** is used to find an item from a collection of items. Search algorithms are essential in fields like databases, artificial intelligence, and pathfinding.\n\n" +
                        "### Types of Searching Algorithms:\n\n" +
                        "\t#### 1. **Linear Search**:\n\n" +
                        "- **Description**: Sequentially checks each element in a list.\n" +
                        "- **Time Complexity**: O(n)\n" +
                        "- **Example C Code**:\n\n" +
                        "#include <stdio.h>\n" +
                        "int linearSearch(int arr[], int n, int key) {\n" +
                        "    for (int i = 0; i < n; i++) {\n" +
                        "        if (arr[i] == key) return i;\n" +
                        "    }\n" +
                        "    return -1;\n}\n" +
                        "int main() {\n" +
                        "    int arr[] = {5, 3, 7, 9, 1};\n" +
                        "    int result = linearSearch(arr, 5, 7);\n" +
                        "    printf(\"Found 7 at index: %d\\n\", result);\n" +
                        "    return 0;\n}\n\n" +

                        "\t#### 2. **Binary Search**:\n\n" +
                        "- **Description**: Efficient for searching in sorted arrays by repeatedly dividing the search interval in half.\n" +
                        "- **Time Complexity**: O(log n)\n" +
                        "- **Example C Code**:\n\n" +
                        "#include <stdio.h>\n" +
                        "int binarySearch(int arr[], int left, int right, int key) {\n" +
                        "    while (left <= right) {\n" +
                        "        int mid = left + (right - left) / 2;\n" +
                        "        if (arr[mid] == key) return mid;\n" +
                        "        if (arr[mid] < key) left = mid + 1;\n" +
                        "        else right = mid - 1;\n" +
                        "    }\n" +
                        "    return -1;\n}\n" +
                        "int main() {\n" +
                        "    int arr[] = {1, 3, 5, 7, 9};\n" +
                        "    int result = binarySearch(arr, 0, 4, 5);\n" +
                        "    printf(\"Found 5 at index: %d\\n\", result);\n" +
                        "    return 0;\n}");
                break;
        }
        outputArea.setText(""); // Clear the output
    }

}
