import java.util.Scanner;
class Process{
    String n;
    int t;
    int iteracao;
    Process(String name, int time){
        n=name;
        t=time;
    }
    Process(String name, int time, int iter){
        n=name;
        t=time;
        iteracao=iter;
    }
}
public class ED237{

    static MyQueue<Process>  round(int tempo, MyQueue<Process> q){
        MyQueue<Process> res = new LinkedListQueue<>();
        int iteracao=0;
        int time=0;
        while(!q.isEmpty()){
            if (q.first().t!=0){
                if (tempo>q.first().t || tempo==q.first().t){
                    time += q.first().t;
                    q.first().t=0;
                }
                else if (tempo<q.first().t) {
                    time += tempo;
                    q.first().t -= tempo;
                }
            }
            iteracao++;
            if (q.first().t==0){
                Process p = new Process(q.first().n,time, iteracao);
                res.enqueue(p);
                q.dequeue();
            }
            else{
                Process p = q.dequeue();
                q.enqueue(p);
            }
        }
        return res;
    }

    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        MyQueue<Process> q = new LinkedListQueue<>();
        MyQueue<Process> result = new LinkedListQueue<>();
        int time = in.nextInt();
        int n = in.nextInt();
        for(int i=0; i<n; i++){
            Process p = new Process(in.next(),in.nextInt());
            q.enqueue(p);
        }
        result = round(time,q);
        for(int i=0; i<n; i++){
            System.out.println(result.first().n + " " + result.first().t + " " + result.first().iteracao);
            result.dequeue();
        }
        
    }
}