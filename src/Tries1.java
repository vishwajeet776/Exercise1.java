//word break problem
public class Tries1 {
    static class Node{
        Node children[]=new Node[26];
        boolean EOW;
        public Node(){
            for (int i=0;i<26;i++){
                children[i]=null;
            }
        }
    }
   public static Node root=new Node();
    public static void insert(String word){
        Node curr=root;
        for (int i=0;i<word.length();i++){
            int idx=word.charAt(i)-'a';
            if (curr.children[idx]==null){
                curr.children[idx]=new Node();
            }
            if (i==word.length()-1){
                curr.children[idx].EOW=true;
            }
            curr=curr.children[idx];
        }
    }
    public static boolean search(String key){
        Node curr=root;
        for (int i=0;i<key.length();i++){
            int idx=key.charAt(i)-'a';
            if (curr.children[idx]==null){
                return false;
            }
            if (i==key.length()-1&& curr.children[idx].EOW==false){
                return false;
            }
            curr=curr.children[idx];
        }
        return true;
    }
    public static boolean wordBreak(String key){
        int len=key.length();
        if (len==0){
            return true;
        }
        for (int i=1;i<=len;i++){
            if (search(key.substring(0,i)) && wordBreak(key.substring(i))){
                return true;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        String words[]={"i","like","san","samsung","mobile"};
        for (int i=0;i< words.length;i++){
            insert(words[i]);
        }

        System.out.println(wordBreak("ilike"));
    }
}
