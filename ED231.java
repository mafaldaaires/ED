import java.util.*;
public class ED231{
    public static void main(String[] args){
        Scanner stdin = new Scanner(System.in);
        int dias = stdin.nextInt();
        ArrayList<Integer> list = new ArrayList<Integer>();
        for (int i=0; i<dias; i++){
            int casos = stdin.nextInt();
            list.add(casos);
        }

        int flag = stdin.nextInt(); //1,2 ou 3
        
        if (flag==1){
            int max=list.get(1)-list.get(0);
            int min=list.get(1)-list.get(0);
            for(int i=2; i<list.size(); i++){
                if(i==list.size()-1){break;}
                else if (list.get(i+1)-list.get(i)>max){
                    max = list.get(i+1)-list.get(i);
                }
                else if (list.get(i+1)-list.get(i)<min){
                    min = list.get(i+1)-list.get(i);
                }
            }
            System.out.printf("%d ",min);
            System.out.printf("%d%n",max);
        }
//da mal na flag 2
        else if(flag==2){
            int count=0;
            int sum=0;
            int sum_maior = sum;
            for(int i=1; i<list.size(); i++){
                float perc = (float)(list.get(i)-list.get(i-1))/list.get(i-1)*100;
                if (perc<=5.00){
                    sum += 1;
                    if (sum==1){count+=1;}
                    if (i==list.size()-1){
                        if (sum>sum_maior){sum_maior=sum;}
                    }
                }
                else if (perc>5.00){
                    if (sum>sum_maior){sum_maior=sum;}
                    sum=0;
                }
            }
            System.out.printf("%d ",count);
            System.out.printf("%d%n",sum_maior);
        }

        else if (flag==3){
            int h=0;
            int linhas = h;
            for(int i=0; i<list.size(); i++){
                h=list.get(i)/100;
                if(h>linhas){
                    linhas=h;
                }
            }

            for(int i=0; i<linhas; i++){
                for(int j=0; j<list.size(); j++){
                    int hashtag = list.get(j)/100;
                    if(hashtag>=(linhas-i)){
                        System.out.print('#');
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