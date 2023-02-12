import java.util.Scanner;
import java.lang.String;
public class ED007{
    public static String parenteses(String aux){
        MyStack<Character> list = new LinkedListStack<>();
        for(int j=0; j<aux.length(); j++){
            if (aux.charAt(j)=='(' || aux.charAt(j)=='['){
                char ch = aux.charAt(j);
                list.push(ch);
            }
            else if (aux.charAt(j)==')' || aux.charAt(j)==']'){
                if (list.isEmpty()){
                    return "Erro na posicao " + j;
                }
                else if ((aux.charAt(j) == ')' && list.top() == '(') || (aux.charAt(j) == ']' && list.top() == '[')){
                    list.pop();
                }
                else if ((aux.charAt(j)==']' && list.top()=='(') || (aux.charAt(j)==')' && list.top()=='[')){
                    return "Erro na posicao " + j;
                }
            }
        }
        if (list.isEmpty()){return "Expressao bem formada";}
        else{return "Ficam parenteses por fechar";}
    }

    public static void main(String[] args){
        Scanner stdin = new Scanner(System.in);
        int n = stdin.nextInt();
        stdin.nextLine();
        String[] aux = new String[n];
        for(int i=0; i<n; i++){
            aux[i] = stdin.nextLine();
        }
        for(int i=0; i<n; i++){
            System.out.println(parenteses(aux[i]));
        }
    }   
}