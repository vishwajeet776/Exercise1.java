public class Recursion10 {
    public static void print_perm(String str,String permutation){
        if (str.length()==0){
            System.out.println(permutation);
            return;
        }
        for(int i=0;i<str.length();i++){
            char current=str.charAt(i);
            String new_str=str.substring(0,i)+str.substring(i+1);
            print_perm(new_str,permutation+current);
        }
    }
    public static void main(String[] args) {
        String str="abc";
        print_perm(str,"");

    }
}
