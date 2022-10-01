public class BSTree {
    public class Node{
        public Node(int data)
        {
            this.data = data;
        }
        public Node lNode = null;
        public Node rNode = null;
        public int getData()
        {
            return data;
        }
        public void setData(int data)
        {
            this.data = data;
        }
        private int data;
    }

    public Node root = null;
    public BSTree(int data)
    {
        root = new Node(data);
    }

    public BSTree()
    {
    }
    public void insert(int data)
    {
        doInsert(data,root);
    }
    private Node doInsert(int data, Node node)
    {
        if (node == null)
        {
           node = new Node(data);
           return node;
        }
        else
        {
            if (data > node.getData())
            {
                doInsert(data, node.rNode);
            }
            else
            {
                doInsert(data, node.lNode);
            }
        }
        return new Node(-1);
    }
}
