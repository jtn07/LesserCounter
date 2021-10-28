package com.notYeyDecided;

import java.util.Arrays;

public class BinearySearchTreeWithLesserCountClass {

    public BinearySearchTreeWithLesserCountClass() {
    }

    public  TreeNode BinarySearchTreeWithLesserCount(int [] arr){
        Arrays.sort(arr);
        return createBinarySearchTreeWithLesserCount((arr), 0, arr.length-1);
    }

    //Function which creates Binary Search Tree Structure which has variable to keep track of numbers less than current node
    public  TreeNode createBinarySearchTreeWithLesserCount(int [] arr, int start, int end){
        if(start>end)
            return null;
        int mid=(start+end)/2;
        TreeNode root =new TreeNode(arr[mid],mid-start);
        root.left=createBinarySearchTreeWithLesserCount(arr,start,mid-1);
        root.right=createBinarySearchTreeWithLesserCount(arr,mid+1,end);
        return root;
    }

    //Function to get numbers of elements less than given search element with lesserCounter Feature
    public  int searchBinaryTreeWithLesserCount(TreeNode root, int search) {
        if(root == null)
            return 0;
        if(root.value >= search){
            return searchBinaryTreeWithLesserCount(root.left,search);
        }
        return 1+root.lesserCount+searchBinaryTreeWithLesserCount(root.right,search);
    }

}
