public class Main {
    public static void main(String[] args) {
        BSTree tree = new BSTree();
        tree.insert(1);
        tree.insert(3);
        tree.insert(6);
        tree.insert(7);
        tree.insert(8);
        tree.insert(10);
        tree.insert(4);
        tree.inorderTraversal();
        System.out.println();
        tree.preorderTravers();
        System.out.println();
        tree.postorderTravers();
        System.out.println(tree.find(16).getData());
    }
}
