/************************************************************
PROBLEM STATEMENT
************************************************************/

/************************************************************
In a binary tree, the root node is at depth 0, and children of each depth k node are at depth k+1.

Two nodes of a binary tree are cousins if they have the same depth, but have different parents.

We are given the root of a binary tree with unique values, and the values x and y of two different nodes in the tree.

Return true if and only if the nodes corresponding to the values x and y are cousins.


Example 1:
    1
  2    3
4

Input: root = [1,2,3,4], x = 4, y = 3
Output: false

Example 2:
     1
  2     3
X   4 X   5

Input: root = [1,2,3,null,4,null,5], x = 5, y = 4
Output: true
Example 3:



Input: root = [1,2,3,null,4], x = 2, y = 3
Output: false
 

Constraints:

The number of nodes in the tree will be between 2 and 100.
Each node has a unique integer value from 1 to 100.
************************************************************/

/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */

/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    TreeNode parentX=null;
    TreeNode parentY=null;
    int depthX=-1;
    int depthY=-1;

    public boolean isCousins(TreeNode root, int x, int y) {
        getDepthAndParent(root, x, y, 0, null);
        return (depthX==depthY && parentX != parentY);
    }
    
    public void getDepthAndParent(TreeNode root, int x, int y, int depth, TreeNode parent) {
        if (root == null) {
            return;
        }
        
        if (root.val == x) {
            parentX = parent;
            depthX = depth;
        }
        
        if (root.val == y) {
            parentY = parent;
            depthY = depth;
        }
        
        getDepthAndParent(root.left, x, y, depth+1, root);
        getDepthAndParent(root.right, x, y, depth+1, root);
    }
}