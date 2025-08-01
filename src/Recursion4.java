public class Recursion4 {
    public static void TowerOFHanoi(int n,String source,String helper,String destination){
        if(n==1){
            System.out.println("transfer "+n+" from "+source+" to "+destination);
            return;
        }
        TowerOFHanoi(n-1,source,destination,helper);
        System.out.println("transfer "+n+" from "+source+" to "+destination);
        TowerOFHanoi(n-1,helper,source,destination);
    }
    public static void main(String[] args) {
        int n=3;
        TowerOFHanoi(n,"S","H","D");

    }
}
