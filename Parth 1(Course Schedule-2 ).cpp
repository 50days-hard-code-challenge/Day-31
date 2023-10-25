class Solution {
public:
    vector<int> findOrder(int numCourses, vector<vector<int>>& prerequisites) {
        int v=numCourses; 
        vector<int>ind(v,0); 
        vector<int>adj[v]; 
        for(auto it:prerequisites) 
        {
            adj[it[1]].push_back(it[0]);
        } 
        vector<int>topo; 
        queue<int>q; 
        for(int i=0;i<v;i++) 
        {
            for(auto it:adj[i]) 
            {
                ind[it]++;
            }
        } 
        for(int i=0;i<v;i++) 
        {
            if(ind[i]==0) 
            q.push(i);
        } 
        while(!q.empty()) 
        {
            int node=q.front(); 
            q.pop(); 
            topo.push_back(node); 
            for(auto it:adj[node]) 
            {
                ind[it]--; 
                if(ind[it]==0) 
                q.push(it);
            }
        } 
        if(topo.size()==numCourses) 
        return topo; 
        vector<int>temp; 
        return temp;
    }
};
