public class ED194{
    public static void reverse(MyStack<Integer> s, int n){
        int list[] = new int[n];
        for(int i=0; i<n; i++){
            int v = s.pop();
            list[i] = v;
        }

        for(int j=0; j<n;j++){
            int x = list[j];
            s.push(x);
        }
    }
    public static void main(String[] args){
        MyStack<Integer> s = new LinkedListStack<>(); 
        s.push(5);
        s.push(4);
        s.push(3);
        s.push(2);
        s.push(1);
        reverse(s,3);
        System.out.println(s);

    }
}