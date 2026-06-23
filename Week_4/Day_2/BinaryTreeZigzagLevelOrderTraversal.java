class Solution {
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> ans = new ArrayList<>();
        if (root == null) {
            return ans;
        }

        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        boolean l = true;

        while (!queue.isEmpty()) {
            int n = queue.size();
            LinkedList<Integer> level = new LinkedList<>();

            for (int i = 0; i < n; i++) {
                TreeNode node = queue.poll();

                if (l) {
                    level.addLast(node.val);
                } else {
                    level.addFirst(node.val);
                }

                if (node.left != null) {
                    queue.offer(node.left);
                }
                if (node.right != null) {
                    queue.offer(node.right);
                }
            }

            ans.add(level);
            l = !l;
        }

        return ans;
    }
}