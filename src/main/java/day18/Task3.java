package day18;

public class Task3 {
    public static void main(String[] args) {

        Node root = new Node();
        root.setValue(20);

        root.insertNode(20, root);
        root.insertNode(16, root);
        root.insertNode(22, root);
        root.insertNode(5, root);
        root.insertNode(11, root);
        root.insertNode(8, root);
        root.insertNode(150, root);
        root.insertNode(23, root);
        root.insertNode(14, root);
        root.insertNode(27, root);
        root.insertNode(24, root);
        root.insertNode(15, root);
        root.insertNode(18, root);

//        Node root = new Node(20);
//        root.insertRecursive(20, root);
//        root.insertRecursive(16, root);
//        root.insertRecursive(22, root);
//        root.insertRecursive(5, root);
//        root.insertRecursive(11, root);
//        root.insertRecursive(8, root);
//        root.insertRecursive(150, root);
//        root.insertRecursive(23, root);
//        root.insertRecursive(14, root);
//        root.insertRecursive(27, root);
//        root.insertRecursive(24, root);
//        root.insertRecursive(15, root);
//        root.insertRecursive(18, root);

        dfs(root);

    }

    public static void dfs(Node node) {
        if (node != null) {
            dfs(node.getLeftChild());
            System.out.print(" " + node.getValue());
            dfs(node.getRightChild());
        }
    }

//    public static void dfs(Node node) {
//        if (node != null) {
//            dfs(node.leftChild);
//            System.out.print(" " + node.value);
//            dfs(node.rightChild);
//        }
//    }

}
