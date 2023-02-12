import java.util.*;
public class ED235{
    public static void main(String[] args){
        Scanner stdin = new Scanner(System.in);
        int n = stdin.nextInt();
        ArrayList<Integer> list = new ArrayList<>();
        for(int i=0; i<n; i++){
            int line = stdin.nextInt();
            list.add(line);
        }
        for(int j=0; j<list.size(); j++){
            int hashtag=list.get(j);
            for(int k=0; k<list.get(j); k++){
                for(int t=0; t<hashtag; t++){
                    System.out.print("#");
                }
                for(int nt=0; nt<(list.get(j)-hashtag); nt++){
                    System.out.print(".");
                }
                hashtag--;
                System.out.println();
            }
        }
    }
}