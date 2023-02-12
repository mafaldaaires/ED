import java.util.Scanner;
public class ED164{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        BSTree<String> t = new BSTree<>();
        int n = in.nextInt();
        String v[] = new String[n];
        int pos=0;
        for(int i=0; i<n; i++){
            v[pos++]=in.next();
        }
        for(int i=0; i<n; i++){
            t.insert(v[i]); //metodo inserir descarta todos os elementos iguais
        }
        System.out.println(t.numberNodes());
    }
}