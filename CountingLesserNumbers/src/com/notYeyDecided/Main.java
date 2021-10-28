package com.notYeyDecided;

import java.util.Scanner;

class TreeNode{
    int value;
    TreeNode left;
    TreeNode right;
    int lesserCount=0;
    public TreeNode(){
    }
    public TreeNode(int value){
        this.value=value;
    }
    public TreeNode(int value,int lesserCount){
        this.value=value;
        this.lesserCount=lesserCount;
    }
}
public class Main {

    public static void main(String[] args) {

        Scanner sc =new Scanner (System.in);
        System.out.println("Enter no of elements in array");
        int n =sc.nextInt();
        int[] arr=new int [n];
       for (int i = 0; i < n; i++) {
           System.out.println("Enter array Elements");
            arr[i]=sc.nextInt();
            ////int [] arr={-1,-3,14,-16,10,20,7,15,8,4};
        }


        // Time complexity with BinearySearchTree O(n) + O(N log(N)), But slower compared with BinearySearchTreeWithLesserCounter approach
        // Where N is not of numbers searched, n is no of elements in array arr.

            BinearySearchTreeClass b=new BinearySearchTreeClass();

            TreeNode root = b.BinarySearchTree(arr);
            while (true) {
                //enter -123 to exit the loop
                int search = sc.nextInt();
                if (search == -123)
                    break;
                System.out.println(b.searchBinaryTree(root, search));
            }


            // Time complexity with lesserCounter  O(n) + O(N log(N)), But faster compared with BinearySearchTree approach
            // Where N is not of numbers searched, n is no of elements in array arr.

            BinearySearchTreeWithLesserCountClass b2=new BinearySearchTreeWithLesserCountClass();
           TreeNode  Root= b2.BinarySearchTreeWithLesserCount(arr);
           //enter -123 to exit the loop
           while (true) {
             int  search=sc.nextInt();
             if(search == -123)
                 break;
             System.out.println(b2.searchBinaryTreeWithLesserCount(Root,search));
        }

    }
}
