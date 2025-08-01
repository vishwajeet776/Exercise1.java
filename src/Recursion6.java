public class Recursion6 {
    public static void find_character(String name,int n,int count){
        if (n==-1){
            return;
        }

        if(name.charAt(n)=='a'){
            count++;
        }

        find_character(name,n-1,count);

    }
    public static void main(String[] args) {
        String name="abaacdaefaah";
        int count=0;
        find_character(name,name.length()-1,count);
        System.out.println(count);
    }
}
