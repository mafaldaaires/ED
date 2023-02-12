/*
public class SinglyLinkedList<T>{
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

    public T get(int pos){
        Node<T> cur = first;
        for(int i=0; i<size; i++){
            if (i==pos) return cur.getValue();
            cur = cur.getNext();
        }
        return null;
    }

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
            for(int i=0; i<size-2; i++){
                cur = cur.getNext();
            }
            cur.setNext(cur.getNext().getNext());
        }
        size--;
    }
*/
    public T remove(int pos){
        Node<T> cur = first;
        T n = get(pos);
        
        if(pos==0){
            removeFirst();
            return n;
        }

        if(pos==size-1){
            removeLast();
            return n;
        }
  
        for(int i=0; i<size; i++){
            if(i+1==pos && i+1<size){
                cur.setNext(cur.getNext().getNext());
                size--;
                return n;
            }
            cur = cur.getNext();
        }

        return null;
    }

    /*
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
}
*/

public class ED189{
    public static void main(String[] args){
        SinglyLinkedList<Integer> list = new SinglyLinkedList<>();

        list.addFirst(6);
        list.addFirst(4);
        list.addFirst(2);

        System.out.println(list.remove(0));

        System.out.println(list);
        
    }
}