public class String5 {
    public static void main(String[] args) {
        String[] str={"++X","++X","X++"};

        int x=0;
        for (String s:str
             ) {
            if (s.equals("++X") || (s.equals("X++"))){
                x++;
            }else {
                x--;
            }
        }
        System.out.println(x);
        String str2="xxOxxOOxx";
        int count=1;
        for (int i=0;i<str2.length()-1;i++) {
            if(str2.charAt(i)=='O'){
                count++;
            }
        }
        System.out.println(count);
    }
}
