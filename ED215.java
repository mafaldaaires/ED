import java.util.Scanner;
import java.lang.Comparable;
class Person implements Comparable<Person>{
    private String name;
    private int price;
    
    Person(String n, int p){
        this.name=n;
        this.price=p;
    }
    
    // comparador
    /*
     * queremos que as maiores ofertas tenham maior prioridade
     * como estamos a trabalhar numa MinHeap, vamos inverter a ordem 
     * de prioridade aproveitando o comparador da classe Integer
    */
    public int compareTo(Person p){
        return (-1)*Integer.compare(price,p.price);
    }

    public String toString(){
        return price + " " + name;
    }
}

public class ED215{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        MinHeap<Person> h = new MinHeap<>(n);
        for(int i=0; i<n; i++){
            String s = in.next(); //OFERTA OU VENDA
            if (s.equals("OFERTA")){
                String name=in.next();
                int price=in.nextInt();
                Person persona = new Person(name,price);
                h.insert(persona);
            }
            else if (s.equals("VENDA")){
                Person p = h.removeMin();
                System.out.println(p);
            }
        }   
    }
}