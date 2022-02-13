package fundamentos.amz.binaryTree;


public class Three<TYPE extends Comparable> { // Torna o objeto comparable, extendendo a classe, podendo usar o compareTo

    private Element<TYPE> source;

    public Three() {
        this.source = null;
    }

    public void toAdd(TYPE value) { //Método que adiciona um elemento na árvore
        Element<TYPE> newElement = new Element<TYPE>(value);
        if (source == null) { //Inicia a raíz adiciona o primeiro elemento
            this.source = newElement;
        } else {
            Element<TYPE> current = this.source; //Inicia a raíz adiciona o primeiro elemento
            while (true) {
                if (newElement.getValue().compareTo(current.getValue()) == -1) { //0 -> igual | 1 -> maior | e -1 -> menor

                    if (current.getLeft() != null) { // Verifica se há um filho a esquerda (elemento menor)
                        current = current.getLeft();
                    } else {
                        current.setLeft(newElement);
                        break;
                    }
                } else { // Verifica se é maior ou igual
                    if (current.getRight() != null) {
                        current = current.getRight();
                    } else {
                        current.setRight(newElement);
                        break;
                    }
                }
            }
        }
    }

    public Element<TYPE> getSource() {
        return source;
    }

    public void inOrder(Element<TYPE> current) { //Esquerda -> em cima -> direita
        if (current != null) {
            inOrder(current.getLeft());
            System.out.println(current.getValue());
            inOrder(current.getRight());
        }
    }

    public void preOrder(Element<TYPE> current) { // Em cima -> esquerda -> direita
        if (current != null) {
            System.out.println(current.getValue());
            preOrder(current.getLeft());
            preOrder(current.getRight());
        }
    }

    public void postOrder(Element<TYPE> current) { // Esquerda -> direita -> em cima
        if (current != null) {
            postOrder(current.getLeft());
            postOrder(current.getRight());
            System.out.println(current.getValue());
        }
    }
}
