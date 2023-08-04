public class BTS_InRange {
    static class Node{
        int data;
        Node left;
        Node right;
        Node(int data){
            this .data=data;
        }
    }
    public static Node insert(Node root,int val){
        if (root==null){
            root=new Node(val);
            return root;
        }
        if (root.data>val){
            root.left=insert(root.left,val);
        }
        else {
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
    public static void PrintInRange(Node root,int x,int y){
        if (root==null){
            return;
        }
        if (root.data>=x && root.data<=y){
            PrintInRange(root.left,x,y);
            System.out.print(root.data+" ");
            PrintInRange(root.right,x,y);
        }
        else if (root.data>=y){
            PrintInRange(root.left, x, y);
        }else {
            PrintInRange(root.right, x, y);
        }
    }
    public static void main(String[] args) {
        int value[]={8,5,3,1,4,6,10,11,14};
        Node root=null;
        for (int i=0;i< value.length;i++){
            root=insert(root,value[i]);
        }
        inorder(root);
        System.out.println();
        PrintInRange(root,6,10);
    }
}
