import java.util.Scanner;
import java.util.Arrays;
public class ED212{
     
    public static int[] sumLevels(BTree<Integer> t){
        int[] result = new int[t.depth()+1];
        sumLevels(t.getRoot(),result,0);
        return result;
    }
    private static void sumLevels(BTNode<Integer> n,int[] result, int pos){
        if (n==null) return;
        result[pos] += n.getValue();
        sumLevels(n.getLeft(),result,pos+1);
        sumLevels(n.getRight(),result,pos+1);
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        BTree<Integer> t = LibBTree.readIntTree(in);
        System.out.println(Arrays.toString(sumLevels(t)));
    }
}