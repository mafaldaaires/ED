import java.util.Scanner;
public class ED172{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        BSTMap<String,Integer> t = new BSTMap<>();
        while(in.hasNextLine()){
            String s = in.nextLine();
            String[] words = s.split(" ");
            for(int i=0; i<words.length; i++){
                if (t.get(words[i])==null){t.put(words[i],1);}
                else{t.put(words[i],t.get(words[i])+1);}
            }
        }
        for (String k : t.keys())
                System.out.println(k + ": " + t.get(k));
    }
}