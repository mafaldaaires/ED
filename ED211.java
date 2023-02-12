import java.util.Scanner;
public class ED211 {
    public static int countEven(BTree<Integer> t){
        BTNode<Integer> n = t.getRoot();
        return countEven(n);
    }
  
    private static int countEven(BTNode<Integer> n){
        if (n==null){return 0;}
        if (n.getValue()%2==0){
            return 1 + countEven(n.getLeft()) + countEven(n.getRight());
        }
        return countEven(n.getLeft()) + countEven(n.getRight());
    }

    public static void main(String[] args) {
       Scanner in = new Scanner(System.in);
       BTree<Integer> t = LibBTree.readIntTree(in);
       System.out.println(countEven(t));
    }
}