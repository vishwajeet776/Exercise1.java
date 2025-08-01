public class StringSum {
    public static int addsum(String temp,int k){
        int final_sum=0;
        while(k>0){
            int sum=0;
            for (char c:temp.toCharArray()
            ) {

                sum+=Character.getNumericValue(c);
            }
            temp=Integer.toString(sum);
            final_sum=sum;
            k--;

        }
        return final_sum;
    }
    public static void main(String[] args) {
        String str="zbax";
        int k=2;
        String temp="";
        for (int i = 0; i < str.length(); i++) {
            temp+=str.charAt(i)-'a'+1;
        }
        System.out.println(temp);
        System.out.println(addsum(temp,k));
    }
}
