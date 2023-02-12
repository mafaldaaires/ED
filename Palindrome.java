import java.util.Scanner;  

class Palindrome{

    static boolean isPalindrome (String str){

		str = str.toLowerCase();
		
		str = str.replaceAll ("[^a-z]", ""); //pode ser uma frase

        int size = str.length()-1;

        for(int i=0; i<size; i++){
            if (str.charAt(i)!=str.charAt(size))
                return false;
			size--;
		}
		return true;
	}

    public static void main(String[] args) {

        Scanner stdin = new Scanner(System.in);   //Só posso ter um Scanner
        int n = stdin.nextInt();

        String vec[] = new String[n+1];
        
        for (int j=0; j<=n; j++){

            String str = stdin.nextLine();

            boolean resultado = isPalindrome(str);

            if(!resultado){
		        vec[j]="nao";
            }
            else{
                vec[j]="sim";
            }
            
        }
        System.out.println(n);

        for(int k=1;k<=n;k++){
            System.out.println(vec[k]);
        }
        stdin.close();
    }
}