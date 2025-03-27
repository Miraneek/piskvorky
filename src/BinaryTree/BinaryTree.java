package BinaryTree;

import java.util.Scanner;

class Node{
    public int value;
    public Node left;
    public Node right;

    public Node(int value, Node left, Node right){
        this.value = value;
        this.left = left;
        this.right = right;
    }
}

class BinaryTree{
    public Node root;
    public BinaryTree(int[] list){
        // List<Integer> list = {4,2,1,8,3,5,15}
        root = new Node(list[0],null,null);

        for (int i = 1; i < list.length; i++) {
            Node currentNode = root;
            int value = list[i];
            while(true){
                if(value > currentNode.value){
                    //right
                    if(currentNode.right == null){
                        currentNode.right = new Node(value,null,null);
                        break;
                    }else currentNode = currentNode.right;
                }else{
                    //left
                    if(currentNode.left == null){
                        currentNode.left = new Node(value, null, null);
                        break;
                    }else currentNode = currentNode.left;
                }
            }
        }
        System.out.println("Tree has been created.");
    }

    public void postOrderPrint(Node node){
        if(node == null) return;
        postOrderPrint(node.left);
        postOrderPrint(node.right);
        System.out.print(node.value + " ");
    }

}
class Main{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("napiš počet, kolik chceš vložit čísel:");
        int[] list = new int[scan.nextInt()];
        System.out.print("\nnapiš čísla:");
        for (int i = 0; i < list.length; i++) {
            list[i] = scan.nextInt();
        }
        BinaryTree tree = new BinaryTree(list);
        tree.postOrderPrint(tree.root);
    }
}