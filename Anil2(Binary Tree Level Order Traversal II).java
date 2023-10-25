lass Solution {
    public List<List<Integer>> levelOrderBottom(TreeNode root) {
        Queue<TreeNode> q = new LinkedList<>();
        List<List<Integer>> ans = new ArrayList<>();

        if(root==null)
            return ans;

        // add the root element in the queue
        q.add(root);

        while(!q.isEmpty()){
            // find current length of queue
            int n = q.size();
            // every times make a list to store in ans list
            List<Integer> temp = new ArrayList<>();
            for(int i = 0; i<n; i++){
                // // only get the current node(i.e address) of queue
                // TreeNode current = q.peek();

                // Remove the current node 
                TreeNode current = q.poll();
                // put it into temp list
                    temp.add(current.val);
                if(current.left!=null){
                    q.add(current.left);
                }
                if(current.right!=null){
                    q.add(current.right);
                }
                // // Remove the value of current node
                //   temp.add(q.poll().val);
            }
            ans.add(0,temp);
        }
        return ans;
    }
}
