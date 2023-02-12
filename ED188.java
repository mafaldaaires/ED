public class SinglyLinkedList<T>{
    /*
    private Node<T> first;
    private int size;

    SinglyLinkedList(){
        first = null;
        size = 0;
    }

    public int size(){return size;}

    public boolean isEmpty(){
        return (size == 0);     //size == 0 e uma comparacao de size com 0 (true se for 0)
    }

    public void addFirst(T value){
        Node<T> n = new Node<>(value, first);
        first = n;
        size++;
    }

    public void addLast(T value){
        Node<T> n = new Node<>(value,null);
        if (isEmpty()){
            first = n;
        } 
        else{
            Node<T> cur = first;
            while(cur.getNext() != null){
                cur = cur.getNext();
            }
            cur.setNext(n);
        }   
        size++;
    }

    public T getFirst(){
        return(first.getValue());
    }

    public T getLast(){
        if (isEmpty()) return null;
        Node<T> cur = first;
        while(cur.getNext() != null){
            cur = cur.getNext();
        }
        return cur.getValue();
    }
    */
    public T get(int pos){
        Node<T> cur = first;
        for(int i=0; i<size; i++){
            if (i==pos) return cur.getValue();
            cur = cur.getNext();
        }
        return null;
    }
    /*
    public void removeFirst(){
        if (!isEmpty()){
            first = first.getNext();
            size--;
        }

    }

    public void removeLast(){
        if (isEmpty()) return;
        if (size == 1){
            first = null;
        }
        else{
            Node<T> cur = first;
            while(cur.getNext() != null){
                cur = cur.getNext();
            }
            cur.setNext(null);
        }
        size--;
    }

    public String toString(){
        String ans = "{";

        Node<T> cur = first;
        while(cur != null){
            ans += cur.getValue();
            cur = cur.getNext();
            if (cur!=null) ans += ",";
        }

        ans += "}";
        return ans;
    }
    */
}


public class ED188{
    public static void main(String[] args){
        SinglyLinkedList<String> list = new SinglyLinkedList<>();

        list.addFirst("dados");
        list.addFirst("de");
        list.addFirst("estruturas");

        System.out.println(list.get(0));
    }
}

