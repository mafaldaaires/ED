import java.util.Scanner;
public class ED216 {
    static int conta_linhas(char mat[][], int l, int c){
        int count_max=0;
        for(int k=0; k<l; k++){
            int count=0;
            for(int s=0; s<c;s++){
                if (mat[k][s]=='#'){count += 1;}
                else {
                    int count2 = count;
                    count=0;
                    if (count2 > count_max){count_max=count2;}
                }
            }
            if (count>count_max){count_max=count;}
        }
        return count_max;
    }
    static int conta_colunas(char mat[][], int l, int c){
        int count_max=0;
        for(int k=0; k<c; k++){
            int count=0;
            for(int s=0; s<l;s++){
                if (mat[s][k]=='#'){count += 1;}
                else {
                    int count2 = count;
                    count=0;
                    if (count2 > count_max){count_max=count2;}
                }
            }
            if (count>count_max){count_max=count;}
        }
        return count_max;
    }

    static int vezes_col(char mat[][], int l, int c, int max){
        int vezes=0;
        for(int k=0; k<c; k++){
            int count=0;
            for(int s=0; s<l;s++){
                if (mat[s][k]=='#'){count += 1;}
                else {
                    int count2 = count;
                    count=0;
                    if (count2==max){vezes+=1;}
                }
            }
            if (count==max){vezes+=1;}
        }
        return vezes;
    }

    static int vezes_lines(char mat[][], int l, int c,int max){
        int vezes=0;
        for(int k=0; k<l; k++){
            int count=0;
            for(int s=0; s<c;s++){
                if (mat[k][s]=='#'){count += 1;}
                else {
                    int count2 = count;
                    count=0;
                    if (count2==max){vezes+=1;}
                }
            }
            if (count==max){vezes+=1;}
        }
        return vezes;
    }

    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int l = in.nextInt();
        int c = in.nextInt();
        char[][] mat = new char[l][c];
        for (int i=0; i<l; i++){
            String ch = in.next();
            for (int j=0; j<c; j++){
                mat[i][j] = ch.charAt(j);
            }
        }
        int x = 0;
        int vezes=0;
        if (conta_linhas(mat,l,c)>=conta_colunas(mat,l,c)){x = conta_linhas(mat,l,c);}
        else if (conta_linhas(mat,l,c)<conta_colunas(mat,l,c)){x = conta_colunas(mat,l,c);}

        if (x==conta_linhas(mat,l,c) && x!=conta_colunas(mat,l,c)){vezes = vezes_lines(mat,l,c,x);}
        else if (x==conta_colunas(mat,l,c) && x!=conta_linhas(mat,l,c)){vezes = vezes_col(mat,l,c,x);}
        else if (x==conta_linhas(mat,l,c) && x==conta_colunas(mat,l,c)){vezes = vezes_col(mat,l,c,x)+vezes_lines(mat,l,c,x);}
        System.out.printf("%d %d%n", x, vezes);
    }
}