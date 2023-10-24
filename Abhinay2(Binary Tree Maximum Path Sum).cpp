class Solution {
public:
    int solve(TreeNode* root,int &maxi) {
        if(root==NULL){
            return NULL;
        }
        int left=solve(root->left,maxi);
        int right=solve(root->right,maxi);
        int temp=max(max(left,right)+root->val,root->val);
        int ans=max(temp,left+right+root->val);
        maxi=max(ans,maxi);
        return temp;
    }

    int maxPathSum(TreeNode* root) {
       int maxi=INT_MIN;
       solve(root,maxi);
       return maxi;

    }
};
