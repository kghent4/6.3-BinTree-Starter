public class BinTree {
    Node root;

    public class Node{
        int value;
        Node parent;
        Node leftChild;
        Node rightChild;

        public Node(int v){
            value = v;
        }
    }

    //You can do this using iteration/loops as in the slides
    //or you can do the recursive implementation.
    public void insert(int item){
// Create a new Node containing
        // the new element
        Node newnode = new Node(item);
 
        // Pointer to start traversing from root and
        // traverses downward path to search
        // where the new node to be inserted
        Node x = root;
 
        // Pointer y maintains the trailing
        // pointer of x
        Node y = null;
 
        while (x != null) {
            y = x;
            if (item < x.value)
                x = x.leftChild;
            else
                x = x.rightChild;
        }
 
        // If the root is null i.e the tree is empty
        // The new node is the root node
        if (y == null)
            root = newnode;
 
        // If the new key is less than the leaf node key
        // Assign the new node to be its left child
        else if (item < y.value)
            y.leftChild = newnode;
 
        // else assign the new node its right child
        else
            y.rightChild = newnode;
    }

    //You can do this using iteration/loops as in the slides
    //or you can do the recursive implementation.
    public boolean search(int item){
        return false;
    }

    // Function to print binary tree in 2D
    // It does reverse inorder traversal
    static void displayHelper(Node root, int space)
    {
        // Base case
        if (root == null)
            return;

        // Increase distance between levels
        space += 10;

        // Process right child first
        displayHelper(root.rightChild, space);

        // Print current node after space
        // count
        System.out.print("\n");
        for (int i = 10; i < space; i++)
            System.out.print(" ");
        System.out.print(root.value + "\n");

        // Process left child
        displayHelper(root.leftChild, space);
    }

    // Wrapper over print2DUtil()
    public void displayTree()
    {
        // Pass initial space count as 0
        displayHelper(root, 0);
    }
}
