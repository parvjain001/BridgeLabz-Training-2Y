class Node {
    String data;
    Node left, right;

    Node(String d) {
        data = d;
    }
}

public class ExpressionTree {

    static int eval(Node root) {
        if (root.left == null && root.right == null)
            return Integer.parseInt(root.data);

        int l = eval(root.left);
        int r = eval(root.right);

        if (root.data.equals("+")) return l + r;
        if (root.data.equals("-")) return l - r;
        if (root.data.equals("*")) return l * r;
        return l / r;
    }

    public static void main(String[] args) {
        Node root = new Node("*");
        root.left = new Node("+");
        root.right = new Node("-");

        root.left.left = new Node("3");
        root.left.right = new Node("5");

        root.right.left = new Node("8");
        root.right.right = new Node("2");

        System.out.println(eval(root));
    }
}