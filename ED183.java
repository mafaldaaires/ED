import java.util.Scanner;
public class ED183{
    public static void main(String[] args){
        Scanner stdin = new Scanner(System.in);
        int n = stdin.nextInt();

        int num = stdin.nextInt();

        int sum = num;
        int max=num;
        int min=num;

        for(int i=1; i<n; i++){
            num = stdin.nextInt();
            if (num>max){max=num;}
            else if (num<min){min=num;}
            sum += num;
        }

        float media = (float)sum/n;
        int amp = max-min;

        System.out.printf("%.2f%n",media);
        System.out.println(amp);
    }
}