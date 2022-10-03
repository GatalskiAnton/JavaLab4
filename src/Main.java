import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        BSTree<Double> tree = new BSTree();
        tree.insert(1.0);
        tree.insert(3.0);
        tree.insert(6.0);
        tree.insert(7.0);
        tree.insert(8.0);
        tree.insert(10.0);
        tree.insert(4.0);
        tree.inorderTraversal();
        System.out.println();
        tree.preorderTravers();
        System.out.println();
        tree.postorderTravers();
    }
}
