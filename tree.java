
package tree;

public class Tree {

   
    static class Node{
    int value;
    Node left,right;
    
    Node(int value){
        this.value= value;
        left=null;
        right=null;
        
    }
    
}
    
    public void insert(Node node,int value){
        if (value < node.value) {
            if (node.left != null) {
                insert(node.left , value);  
            }
            else {
                System.out.println(" Inserted "+ value + " to left of " + node.value);
                node.left=new Node(value);
            }
        }
        else if (value > node.value) {
            if (node.right != null) {
                insert(node.right , value);
            }
            else{
                System.out.println(" Inserted "+ value + " to right of "  + node.value);
                node.right = new Node(value);
            }
        }
    }

        public void InOrder(Node node){
            if (node != null) {
                InOrder(node.left);
                System.out.println(" "+ node.value);
                InOrder(node.right);
            }
        }
        
        public void PreOrder(Node node){
            if (node != null) {
                System.out.println(" "+ node.value);
                PreOrder(node.left);
                PreOrder(node.right);
            }
        }
            
        public void PostOrder(Node node){
            if (node != null) {
                PostOrder(node.left);
                PostOrder(node.right);
                System.out.println(" "+ node.value);
            }    
        }
    
    
    
    
    
    public static void main(String[] args) {        
        Tree tree = new Tree();
        Node root = new Node(5);
        System.out.println("Binary Tree Example");
        System.out.println("Building tree with root value " + root.value);
        
        tree.insert(root, 2);
        tree.insert(root, 4);
        tree.insert(root, 8);
        tree.insert(root, 6);
        tree.insert(root, 7);
        tree.insert(root, 3);
        tree.insert(root, 9);
        
        
        System.out.println("Traversing tree preorder");
        tree.PreOrder(root);
        System.out.println("\n");
        System.out.println("Traversing tree inorder");
        tree.InOrder(root);
        System.out.println("\n");
        System.out.println("Traversing tree postorder");
        tree.PostOrder(root);
        System.out.println("\n");
        
        
        
        
        
    }    
}
