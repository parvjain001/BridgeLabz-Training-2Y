class Node {
    String name;
    int size; 
    boolean isFile;
    Node[] children;

    Node(String name, int size, boolean isFile) {
        this.name = name;
        this.size = size;
        this.isFile = isFile;
    }
}

public class Q1 {
    static int getSize(Node root) {
        if (root.isFile) return root.size;

        int total = 0;
        for (Node child : root.children) {
            total += getSize(child);
        }
        return total;
    }
}