import java.util.Scanner;

public class ED201 {

  public static int max=0;
  public static int dur; //variavel definida aqui, nao preciso de definir na main

  // Escrever todos os subconjuntos do array v[]
  static void sets(int v[]) {
    // array de booleanos para representar o conjunto
    boolean used[] = new boolean[v.length];
    goSets(0, v, used); // chamar funcao recursiva
  }

  // Gera todos os subconjuntos a partir da posicao 'cur'
  static void goSets(int cur, int v[], boolean used[]) {
    int soma=0;
    if (cur == v.length) {  // Caso base: terminamos o conjunto
      for (int i=0; i<v.length; i++){ 
        if (used[i]) soma += v[i];
      }
      if (soma>=max && soma<=dur){max=soma;}
    } 
    else {                  // Se nao terminamos, continuar a gerar
      used[cur] = true;      // Subconjuntos que incluem o elemento actual
      goSets(cur+1, v, used);// Chamada recursiva
      used[cur] = false;     // Subconjuntos que nao incluem o el. actual
      goSets(cur+1, v, used);// Chamada recursiva
    }
  }

  // -----------------------------------------------------------

  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    dur = in.nextInt();
    int m = in.nextInt();
    int v[] = new int[m];
    for(int i=0; i<m; i++){
      v[i]=in.nextInt();
    }
    sets(v);
    System.out.println(max);
  }
}