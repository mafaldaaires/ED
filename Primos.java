import java.util.Scanner;
import java.util.Arrays;

public class Primos {
    
    public static void main(String[] args) {
	
        Scanner stdin = new Scanner(System.in);
        int a = stdin.nextInt();
        int b = stdin.nextInt();

        boolean[] primos = new boolean[b+1];
        Arrays.fill(primos,true);

        int soma=0;

	    for (int i=2; i<=Math.sqrt(b); i++){
	        if (primos[i]){
                for(int j=(i*i);j<=b;j+=i){
                    primos[j]=false;
                }
            }
        }

        for(int n=a;n<(b+1);n++){
            if(primos[n])
                soma++;
        }

        System.out.println(soma);
    }
}