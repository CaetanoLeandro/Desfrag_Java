package fundamentos.amz;

public class NodeThree {

    private int value;
    private NodeThree left;
    private NodeThree right;

    public NodeThree(int value, NodeThree left, NodeThree right) {
        this.value = value;
        this.left = left;
        this.right = right;
    }

    public static void main(String[] args) {

//        NodeThree Three = new NodeThree(4, new NodeThree(2, new NodeThree(3, null, null), new NodeThree(1, null, null)),
//                new NodeThree(6, new NodeThree(5, null, null), new NodeThree(7, null, null)));

        NodeThree node = new NodeThree(3, new NodeThree(2, new NodeThree(1, null, null), null),
                new NodeThree(5, new NodeThree(4, null, null), new NodeThree(6, null, new NodeThree(7, null, null))));


        //NodeThree no

        System.out.println("Pre-Order");

        NodeThree.printPreOrder(node);
        NodeThree.printInOrder(node);
        NodeThree.printPostOrder(node);

    }

    public static void printPreOrder(NodeThree num) {

        if (num.left != null) {
            printPreOrder(num.left);
        }
        if (num.right != null) {
            printPreOrder(num.right);
        }
    }

    public static void printInOrder(NodeThree num) {

        if (num.left != null) {
            printPreOrder(num.left);
        }
        if (num.right != null) {
            printPreOrder(num.right);
        }
    }

    public static void printPostOrder(NodeThree num) {

        if (num.left != null) {
            printPreOrder(num.left);
        }
        if (num.right != null) {
            printPreOrder(num.right);
        }
    }
}