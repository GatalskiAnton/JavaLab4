public class Main {
    public static void main(String[] args) {
        BSTree<Integer> tree = new BSTree(10);
        tree.insert(5);
        tree.insert(3);
        tree.insert(9);
        tree.insert(7);
        tree.insert(8);
        tree.insert(9);
        tree.insert(4);
        tree.inorderTraversal();
        System.out.println();
        tree.preorderTravers();
        System.out.println();
        tree.postorderTravers();
    }
}
