public class ED196{
    public static void process(MyQueue<String> q, MyQueue<String> a, MyQueue<String> b){
        int sizea = a.size();
        int sizeb = b.size();

        while(!q.isEmpty()){
            String aux = q.dequeue();
            String aux2 = q.dequeue();
            if (aux2.equals("A")){
                a.enqueue(aux);
                sizea ++;
            }
            else if (aux2.equals("B")){
                b.enqueue(aux);
                sizeb ++;
            }
            else if (aux2.equals("X")){
                if (sizea>sizeb){
                    b.enqueue(aux);
                    sizeb ++;
                }
                else if (sizea<sizeb){
                    a.enqueue(aux);
                    sizea ++;
                }
            }
        }
    }

    public static void main(String[] args){
        MyQueue<String> q = new LinkedListQueue<>();
        MyQueue<String> a = new LinkedListQueue<>(); 
        MyQueue<String> b = new LinkedListQueue<>();
        q.enqueue("Luis");
        q.enqueue("B");
        q.enqueue("Pedro");
        q.enqueue("A");
        q.enqueue("Luisa");
        q.enqueue("A");
        q.enqueue("Joao");
        q.enqueue("X");
        q.enqueue("Jose");
        q.enqueue("X");
        q.enqueue("Miguel");
        q.enqueue("B");
        process(q,a,b);
        System.out.println(q);
	    System.out.println(a);
	    System.out.println(b);
    }
}