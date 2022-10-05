public class BSTree<T extends Comparable<T>> {

    class Node<T extends Comparable<T>> implements Comparable<Node<T>> {
        public Node(T data) {
            this.data = data;
        }

        public T getData() {
            return data;
        }

        public void setData(T data) {
            this.data = data;
        }

        public Node<T> getLNode() {
            return lNode;
        }

        public Node<T> getRNode() {
            return rNode;
        }

        public void setLNode(Node<T> node) {
            lNode = node;
        }

        public void setRNode(Node<T> node) {
            rNode = node;
        }

        private Node lNode;
        private Node rNode;
        private T data;

        @Override
        public int compareTo(Node<T> o) {
            return this.data.compareTo(o.getData());
        }
    }
    public BSTree(T data) {
        root = new Node<T>(data);
    }

    public BSTree() {
    };

    private Node doInsert(T data, Node<T> node) {
        if (node == null)
            node = new Node<T>(data);
        else {
            if (data.compareTo(node.getData()) > 0)
                node.setRNode(doInsert(data, node.getRNode()));
            else
                node.setLNode(doInsert(data, node.getLNode()));
        }
        return node;
    }

    public void insert(T data) {
        root = doInsert(data, root);
    }

    public Node find(T data) {
        return doFind(data, root);
    }

    private Node doFind(T data, Node<T> node) {

        if (node.getData() == data || node == null) {
            return node;
        } else {
            if (data.compareTo(node.getData()) > 0)
                return doFind(data, node.getRNode());
            else
                return doFind(data, node.getLNode());
        }
    }

    public void inorderTraversal() {
        inorderTraversal(root);
    }

    private void inorderTraversal(Node<T> root) {
        if (root.getLNode() != null)
            inorderTraversal(root.getLNode());

        System.out.println(root.getData());

        if (root.getRNode() != null)
            inorderTraversal(root.getRNode());
    }

    public void preorderTravers() {
        preorderTravers(root);
    }

    private void preorderTravers(Node root) {
        System.out.println(root.getData());
        if (root.getLNode() != null)
            preorderTravers(root.getLNode());
        if (root.getRNode() != null)
            preorderTravers(root.getRNode());
    }

    public void postorderTravers() {
        postorderTravers(root);
    }

    private void postorderTravers(Node<T> root) {
        if (root.getLNode() != null)
            postorderTravers(root.getLNode());
        if (root.getRNode() != null)
            postorderTravers(root.getRNode());
        System.out.println(root.getData());
    }
    private Node<T> root = null;
}
