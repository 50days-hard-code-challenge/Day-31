class Solution {
    public List<Integer> largestValues(TreeNode root) {
        if(root == null){
            List<Integer> ans = new ArrayList<>();
            return ans;
        }
        Queue<TreeNode> q = new LinkedList<>();
        List<Integer> ans = new ArrayList<>();
        // add the root element
        q.add(root);
        while(!q.isEmpty()){
            // current  length of queue
            int n = q.size();
            int currMax = Integer.MIN_VALUE;
            for(int i = 0; i<n; i++){
                TreeNode current = q.poll();// remove 

               // Update currMax with node.val if it is larger.
               currMax = Math.max(currMax,current.val);

               if(current.left!=null){
                   q.add(current.left);
               }
               if(current.right!=null){
                   q.add(current.right);
               }
            }
            ans.add(currMax);
        }
        return ans;
    }
    
}
