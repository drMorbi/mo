package day18;

public class Node {

    private int value;
    private Node leftChild;
    private Node rightChild;

    public int getValue() {
        return value;
    }
    public void setValue(int value) {
        this.value = value;
    }

    public Node getLeftChild() {
        return leftChild;
    }
    public void setLeftChild(Node leftChild) {
        this.leftChild = leftChild;
    }

    public Node getRightChild() {
        return rightChild;
    }
    public void setRightChild(Node rightChild) {
        this.rightChild = rightChild;
    }


    public void insertNode(int value, Node node) {
        Node newNode = new Node();
        newNode.setValue(value);

        if (node == null)
            node = newNode;
        else {
            Node current = node;
            Node parrent;
            while (true){
                parrent = current;
                if (value == current.getValue())
                    return;
                else if (value < current.getValue()) {
                    current = current.getLeftChild();
                    if (current == null){
                        parrent.setLeftChild(newNode);
                        return;
                    }
                }else if (value > current.getValue()){
                    current = current.getRightChild();
                    if (current == null){
                        parrent.setRightChild(newNode);
                        return;
                    }
                }
            }
        }
    }

//    public int value;
//    public Node leftChild;
//    public Node rightChild;
//
//    public Node(int value) {
//        this.value = value;
//        leftChild = null;
//        rightChild = null;
//    }
//
//    public Node insertRecursive(int value, Node node){
//        if (node == null)
//            return new Node(value);
//
//        if (value < node.value){
//            node.leftChild = insertRecursive(value, node.leftChild);
//        } else if (value > node.value) {
//            node.rightChild = insertRecursive(value, node.rightChild);
//        }else
//            return node;
//
//        return node;
//    }

}
