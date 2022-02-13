package fundamentos.amz.binaryTree;

public class Element<TYPE> {

    private TYPE value;
    private Element<TYPE> left;
    private Element<TYPE> right;

    public Element(TYPE newValue) {
        this.value = newValue;
    }

    public TYPE getValue() {
        return value;
    }

    public void setValue(TYPE value) {
        this.value = value;
    }

    public Element<TYPE> getLeft() {
        return left;
    }

    public void setLeft(Element<TYPE> left) {
        this.left = left;
    }

    public Element<TYPE> getRight() {
        return right;
    }

    public void setRight(Element<TYPE> right) {
        this.right = right;
    }
}
