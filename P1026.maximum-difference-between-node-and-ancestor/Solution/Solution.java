// class Solution {
//     int res = Integer.MIN_VALUE;

//     public int maxAncestorDiff(TreeNode root) {
//         if (root == null) return 0;
//         //如果当前节点没有子节点，则直接返回
//         helper(root, root.val, root.val);
//         return res;
//     }

//     /**
//      * 每条从根节点到叶子节点的路径中的最大值和最小值，并求出差值更新全局变量
//      */
//     private void helper(TreeNode node, int max, int min) {
//         if (node == null) return;
//         max = Math.max(node.val, max);
//         min = Math.min(node.val, min);
//         //到达叶子节点，求最大差值
//         if (node.left == null && node.right == null) {
//             res = Math.max(res, Math.abs(max - min));
//         }
//         helper(node.left, max, min);
//         helper(node.right, max, min);
//     }
// }


class Solution {

    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }

    public int maxAncestorDiff(TreeNode root) {
        if (root == null)
            return 0;
        else {
            int[] res = findmaxmin(root, root.val, root.val);
            return res[0] - res[1];
        }
    }

    public int[] findmaxmin(TreeNode root, int max, int min) {
        int[] resl=new int[2];
        int[] resr=new int[2];
        if (root.val > max)
            max = root.val;
        if (root.val < min)
            min = root.val;
        if (root.left != null) {
            resl = findmaxmin(root.left, max, min);
        }
        else
        {
            resl[0] = max;
            resl[1] = min;
        }
        if (root.right != null) {
            resr = findmaxmin(root.right, max, min);
        }
        else
        {
            resr[0] = max;
            resr[1] = min;
        }
        if (max > resl[0])
            resl[0] = max;
        if (min < resl[1])
            resl[1] = min;
        if (max > resr[0])
            resr[0] = max;
        if (min < resr[1])
            resr[1] = min;
        if (resl[0] - resl[1] > resr[0] - resr[1])
            return resl;
        else
            return resr;
    }
}