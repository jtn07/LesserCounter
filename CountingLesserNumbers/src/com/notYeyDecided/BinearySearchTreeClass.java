package com.notYeyDecided;

import java.util.Arrays;


public class BinearySearchTreeClass {

    public BinearySearchTreeClass (){
    }

    public static TreeNode BinarySearchTree(int [] arr){
        Arrays.sort(arr);
        return createBinarySearchTree((arr), 0, arr.length-1);
    }

    //Function which creates Binary Search Tree
    public static TreeNode createBinarySearchTree(int [] arr, int start, int end){
        if(start>end)
            return null;
        int mid=(start+end)/2;

        TreeNode root =new TreeNode(arr[mid]);
        root.left=createBinarySearchTree(arr,start,mid-1);
        root.right=createBinarySearchTree(arr,mid+1,end);
        return root;
    }

    //Function to get numbers of elements less than given search element
    public static int searchBinaryTree(TreeNode root, int search) {
        if(root == null)
            return 0;
        if(root.value >= search){
            return searchBinaryTree(root.left,search);
        }
        return 1+searchBinaryTree(root.left,search)+searchBinaryTree(root.right,search);
    }

}