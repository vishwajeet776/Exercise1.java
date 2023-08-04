import java.util.ArrayList;

public class BTS_PrintPath {
    static class Node{
        int data;
        Node left;
        Node right;
        Node(int data){
            this.data=data;
        }
    }
    public static Node insert(Node root,int val){
        if (root==null){
            root=new Node(val);
            return root;
        }
        if (root.data>val){
            root.left=insert(root.left,val);
        }else {
            root.right=insert(root.right,val);
        }
        return root;
    }
    public static void inorder(Node root){
        if (root==null){
            return;
        }
        inorder(root.left);
        System.out.print(root.data+" ");
        inorder(root.right);
    }
    public static void PrintPath(ArrayList<Integer> path){
        for (int i=0;i< path.size();i++){
            System.out.print(path.get(i)+"-->");
        }
        System.out.println();
    }
    public static void PrintRoot2Leaf(Node root, ArrayList<Integer> path){
        if (root==null){
            return;
        }
        path.add(root.data);
        if (root.left==null&&root.right==null) {
           PrintPath(path);
        }else {
            PrintRoot2Leaf(root.left, path);
            PrintRoot2Leaf(root.right, path);
        }
        path.remove(path.size()-1);
    }
    public static void main(String[] args) {
        int val[]={8,5,3,1,4,6,10,11,14};
        Node root=null;
        for (int i=0;i< val.length;i++){
            root=insert(root,val[i]);
        }
        inorder(root);
        System.out.println();
        PrintRoot2Leaf(root,new ArrayList<>());
    }
}
