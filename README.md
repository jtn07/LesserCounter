# LesserCounter


![image](https://user-images.githubusercontent.com/51705706/139429461-09648ace-39bf-47f2-8ca3-a7b289b846dd.png)


The Problem was solved using 2 approaches
1. create a balanced binary search tree
   search for the lesser elements accordingly
   Time complexity:
   Time complexity with BinarySearchTree  O(n log(n)) +O(n) (for creating balanced binary tree)+ O(N log(N)) (for searching)
   ==> O(n log(n)) + O(N log(N))
   But slower compared with BinearySearchTreeWithLesserCounter approach
     Where N is not of numbers searched, n is no of elements in array arr.

2. Create a balanced binary search tree with a new feature in the tree structure which can keep track of number of lesser number from it
   when we are searching a with element to get number of lesser elements, It uses the lesserCounter files created in TreeNode to get the result
   Time complexity with BinarySearchTreeWithLesserCounter  O(n log(n)) +O(n) (for creating balanced binary tree)+ O(N log(N)) (for searching)
      ==> O(n log(n)) + O(N log(N))
      But Faster compared with BinearySearchTree approach.
