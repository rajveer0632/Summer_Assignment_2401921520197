class Solution {
    public void generator(int n,int l,int r,String str,List<String> ans)
    {
        if(r==n)
        {
            ans.add(str);
            return;
        }
        if(l<n)
        generator(n,l+1,r,str+"(",ans);
        if(r<l)
        generator(n,l,r+1,str+")",ans);
        
    }
    public List<String> generateParenthesis(int n) {
        List<String> ans = new ArrayList<>();
        generator(n,0,0,"",ans);
        return ans;
    }
}