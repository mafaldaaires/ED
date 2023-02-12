import java.util.Arrays;

public class ED197{

    public static MyQueue<Integer> merge(MyQueue<Integer> a, MyQueue<Integer> b){
        MyQueue<Integer> sum = new LinkedListQueue<>();

        int size = a.size()+b.size();

        int list[] = new int[size];

        int i=0;

        while(a.size()>0){
            list[i] = a.dequeue();
            i++;
        }

        while(b.size()>0){
            list[i] = b.dequeue();
            i++;
        }

        Arrays.sort(list);

        for(int j=0; j<size; j++){
            sum.enqueue(list[j]);
        }
        return sum;
    }

    public static void main(String[] args){
        MyQueue<Integer> a = new LinkedListQueue<>();
        MyQueue<Integer> b = new LinkedListQueue<>();

        a.enqueue(10);
        a.enqueue(8);
        a.enqueue(4);
        a.enqueue(2);

        b.enqueue(9);
        b.enqueue(4);
        b.enqueue(1);

        System.out.println(merge(a,b));
    }
}