import java.util.Scanner;

public class ED101{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        /*int flag = in.nextInt();

        int lins,cols = in.nextInt();

        String aux = in.nextLine();
        while(aux.equals("end")){
            aux=in.nextLine();
        }*/

        int n = in.nextInt();
        int m = in.nextInt();
        char mat[][] = new char[n][m];
        for(int i=0; i<=n; i++){
            String s = in.nextLine();
            for (int j=0; j<s.length(); j++){
                mat[i][j] = s.charAt(j);
            }
        }
    }
}