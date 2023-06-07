public class Strings1 {
    public static void main(String[] args) {
        String name="vishvajeet";
        String result="";
        for (int i=0;i<name.length();i++)
            if (name.charAt(i) == 'v') {
                  result+='w';
            }
        else {
            result+=name.charAt(i);
            }
        System.out.println(result);
    }
}
