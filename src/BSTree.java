public class BSTree<T extends  Comparable<T>> implements Comparable<BSTree<T>> {

    @Override
    public int compareTo(BSTree<T> o) {
        return 0;
    }

    class Node{
        public Node(T data)
        {
            this.data = data;
        }
        public T getData()
        {
            return data;
        }
        public void setData(T data)
            {
            this.data = data;
        }
        private Node lNode;
        private Node rNode;
        private T data;
    }

    public BSTree(T data)
    {
        root = new Node(data);
    }
    public BSTree() {};

    private Node doInsert(T data, Node node)
    {
        if (node == null)
            node = new Node(data);
        else
        {
            if (data.compareTo(node.getData()) > 0)
                node.rNode =  doInsert(data, node.rNode);
            else
                node.lNode =  doInsert(data, node.lNode);
        }
        return node;
    }

    public void insert(T data)
    {
        root = doInsert(data,root);
    }

    public Node find(T data)
    {
        return doFind(data,root);
    }

    private Node doFind(T data, Node node)
    {

        if (node.getData() == data || node == null) {
            return node;
        }
        else {
            if (data.compareTo(node.getData()) > 0)
               return doFind(data, node.rNode);
            else
               return doFind(data, node.lNode);
        }
    }

    public void inorderTraversal()
    {
        inorderTraversal(root);
    }

    private void inorderTraversal(Node root)
    {
        if (root.lNode != null)
            inorderTraversal(root.lNode);

        System.out.println(root.getData());

        if (root.rNode != null)
            inorderTraversal(root.rNode);
    }
    public void preorderTravers()
    {
        preorderTravers(root);
    }
    private void preorderTravers(Node root)
    {
        System.out.println(root.getData());
        if (root.lNode != null)
            preorderTravers(root.lNode);
        if (root.rNode != null)
            preorderTravers(root.rNode);
    }

    public void postorderTravers()
    {
        postorderTravers(root);
    }
    private void postorderTravers(Node root)
    {
        if (root.lNode != null)
            postorderTravers(root.lNode);
        if (root.rNode != null)
            postorderTravers(root.rNode);
        System.out.println(root.getData());
    }
    private Node root = null;
}
