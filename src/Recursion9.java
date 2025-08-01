public class Recursion9 {
// To print Subsequences of abc/alphabets
    public static void Subsequences(String scr,int idx,String new_string){
        if (idx==scr.length()){
            System.out.println(new_string);
            return;
        }
        char current=scr.charAt(idx);
        Subsequences(scr, idx+1, new_string+current);Subsequences(scr, idx+1, new_string);

    }
    public static void main(String[] args) {;
        String scr="abc";
        Subsequences(scr,0," ");


    }
}
