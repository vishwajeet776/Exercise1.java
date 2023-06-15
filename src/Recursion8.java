public class Recursion8 {
    public static void string_sort(String scr,int n,String new_string,int count){

        if (n==scr.length()){
            for (int i=0;i<count;i++){
                new_string+='x';
            }
            System.out.println();
            System.out.println(new_string);
            return ;
        }
        System.out.print(scr.charAt(n));
        if (scr.charAt(n)!='x'){
            new_string+=scr.charAt(n);
        }
        else {
            count++;
        }
        string_sort(scr,n+1,new_string,count);

    }
    public static void main(String[] args) {
        String scr="abcdefxghxixjxxxk";
        string_sort(scr,0,"",0);
    }
}
