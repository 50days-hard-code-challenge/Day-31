import java.util.*;
public class Solution {
    public static int longestSuccessiveElements(int []a) {
        // Write your code here.
        Arrays.sort(a);
        int count=1;
        int max=-1;
        for(int i=0;i<a.length-1;i++)
        {
            if(a[i+1]-a[i]==1)
            {
                count++;
            }
            else if(a[i+1]-a[i]==0)
            {
              continue;
            }
           else
             {
             count = 1;
             }
             max=Math.max(max,count);
            }
       return max;

    }
}
