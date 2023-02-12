public class ED195{
    public static void reverse(MyStack<Character> s, int n){
        char list[] = new char[n];
        for(int i=0; i<n; i++){
            char v = s.pop();
            list[i] = v;
        }

        for(int j=0; j<n;j++){
            char x = list[j];
            s.push(x);
        }
    }

    public static boolean balanced(String s){
        boolean balanced=true;
        
        MyStack<Character> aux = new LinkedListStack<>();

        for(int i=0; i<s.length(); i++){
            char x= s.charAt(i);
            aux.push(x); 
        }

        MyStack<Character> aux2 = new LinkedListStack<>();
        for (int j=0; j<(aux.size()/2); j++){
            aux2.push(aux.pop());
        }
        int size = aux2.size();
        reverse(aux2,size);

        int n = aux.size();
        while(n>0){
            if((aux.top()=='(' && aux2.top()!=')')||(aux.top()=='[' && aux2.top()!=']')){balanced=false;}
            n--;
        }

        return balanced;
    }

    public static void main(String[] args) {
		String s = "]()]";
		System.out.println(balanced(s));
	}
}