class Node {
    String data;
    Node left, right;

    Node(String d) {
        data = d;
    }
}

public class OrgTree {
    public static void main(String[] args) {
        Node root = new Node("CEO");

        root.left = new Node("CTO");
        root.right = new Node("CFO");

        root.left.left = new Node("Dev Lead");
        root.left.right = new Node("HR");

        root.left.left.left = new Node("Dev1");
        root.left.left.right = new Node("Dev2");
    }
}