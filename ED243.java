import java.util.*;
public class ED243{
    public static void main(String[] args){
        Scanner stdin = new Scanner(System.in);
        int ng = stdin.nextInt();
        ArrayList<Integer> list = new ArrayList<>();
        for(int i=0; i<ng; i++){
            int ing = stdin.nextInt();
            list.add(ing);
        }
        int p = stdin.nextInt();
        int sum=0;
        for(int i=0; i<p; i++){
            int num = stdin.nextInt();
            int aux=0;
            for(int j=0; j<num; j++){
                int ingp = stdin.nextInt();
                if (!list.contains(ingp)){
                    aux += 1;
                }
                if (aux==num){sum+=1;}
            }
        }
        System.out.println(sum);
    }
}