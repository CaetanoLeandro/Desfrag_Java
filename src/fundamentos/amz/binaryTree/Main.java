package fundamentos.amz.binaryTree;

public class Main {

    public static void main(String[] args) {

        Three<Integer> three = new Three<Integer>();
        three.toAdd(10);
        three.toAdd(8);
        three.toAdd(5);
        three.toAdd(9);
        three.toAdd(7);
        three.toAdd(18);
        three.toAdd(13);
        three.toAdd(20);
        System.out.println("\n\nIn-Order");
        three.inOrder(three.getSource());

        System.out.println("\n\nPre-Order");
        three.preOrder(three.getSource());

        System.out.println("\n\nPost-Order");
        three.postOrder(three.getSource());
    }
}
