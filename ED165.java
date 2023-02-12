import java.util.Scanner;
public class ED165{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        BSTree<Integer> t = new BSTree<>();
        int n = in.nextInt();
        int v[] = new int[n];
        int pos=0;
        for(int i=0; i<n; i++){
            int num=in.nextInt();
            v[pos++]=num;
        }
        for(int j=0; j<v.length; j++){
            int value = v[j]+v[j];
            t.insert(value);
        }
        for(int k=0; k<v.length-1; k++){
            int aux=k;
            while(aux!=v.length-1){
                int x = v[k] + v[aux+1];
                t.insert(x);
                aux++;
            }
        }
        int p = in.nextInt();
        for(int i=0; i<p; i++){
            int question=in.nextInt();
            if(t.contains(question)){System.out.println (question + ": sim");}
            else{System.out.println (question + ": nao");}
        }
    }
}