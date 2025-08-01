public class LC2 {
    public static void main(String[] args) {
        String str1="ABABABAB";
        String str2="ABAB";
        if (str1.length()>str2.length()){
            for (int i = 0; i < str2.length(); i++) {
                String temp=str2.substring(0,i);
                if (str2.substring(i,str2.length()).contains(temp)){
                    System.out.println(temp);

                } else if (str1.contains(str2)) {

                    System.out.println(str2);
                }
            }
        }


    }
}
