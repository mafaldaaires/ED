import java.util.Scanner;
public class ED268{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        int [] tam = new int[num];
        int pos=0;
        for(int k=0; k<num; k++){
            int n = in.nextInt();
            tam[pos] = n;
            pos++;
        }
        for(int s=0; s<num; s++){
            int x = tam[s];
            for(int i=0; i<x; i++){
                for(int j=0; j<x; j++){
                    if (i==j){System.out.print('#');}
                    else if (i>x/2){
                        if (j==x-i-1){System.out.print('#');}
                        else if (i==j){System.out.print('#');}
                        else{System.out.print('.');}
                    }
                    else{
                        System.out.print('.');
                    }
                }
                System.out.println();
            }
        }
    }
}