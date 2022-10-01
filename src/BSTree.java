public class BSTree {
    public class Node{
        public Node(int data)
        {
            this.data = data;
        }
        public int getData()
        {
            return data;
        }
        public void setData(int data)
        {
            this.data = data;
        }
        private Node lNode;
        private Node rNode;
        private int data;
    }

    public BSTree(int data)
    {
        root = new Node(data);
    }
    public BSTree() {};

    private Node doInsert(int data, Node node)
    {
        if (node == null)
            node = new Node(data);
        else
        {
            if (data > node.getData())
                node.rNode =  doInsert(data, node.rNode);
            else
                node.lNode =  doInsert(data, node.lNode);
        }
        return node;
    }

    public void insert(int data)
    {
        root = doInsert(data,root);
    }

    public Node find(int data)
    {
        return doFind(data,root);
    }

    private Node doFind(int data, Node node)
    {
        if (node.rNode == null && node.lNode == null)
            return new Node(-1);
        if (node.getData() == data || node == null) {
            return node;
        }
        else {
            if (data > node.getData())
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
