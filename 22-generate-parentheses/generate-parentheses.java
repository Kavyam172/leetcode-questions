class Solution {
    public void helper(int n, String ans, int open, int close,List<String> a){
        if(ans.length()==n*2){
            a.add(ans);
            return;
        }

        if(open<n){
            helper(n,ans+"(",open+1,close,a);
        }

        if(close<open){
            helper(n,ans+")",open,close+1,a);
        }
    }
    public List<String> generateParenthesis(int n) {
        List<String> ans = new ArrayList<>();
        helper(n,"",0,0,ans);
        return ans;
    }
}