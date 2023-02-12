import java.util.Scanner;
public class ED120{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        int hashtag = 1;
        int pontos = n-hashtag;
        int meio=n/2+n%2;

        for(int i=0; i<meio; i++){
            if (pontos>0){
                for(int j=0; j<n; j++){
                    if(j<(pontos/2)){System.out.print(".");}
                    else if (j>=(n-(pontos/2))){
                        if(j==n-1){System.out.println('.');}
                        else{System.out.print('.');}
                    }
                    else{System.out.print('#');}
                }
            }
            else{
                for(int j=0; j<n; j++){
                    if(j==n-1){System.out.println('#');}
                    else{System.out.print('#');}
                }
            }
            pontos-=2;
            hashtag+=2;
        }
        pontos=2;
        hashtag=n-pontos;
        for(int i=meio; i<n; i++){
            for(int j=0; j<n; j++){
                if(j<(pontos/2)){System.out.print(".");}
                else if (j>=(n-(pontos/2))){
                    if(j==n-1){System.out.println('.');}
                    else{System.out.print('.');}
                }
                else{System.out.print('#');}
            }
            pontos +=2;
            hashtag -=2;
        }
    }
}