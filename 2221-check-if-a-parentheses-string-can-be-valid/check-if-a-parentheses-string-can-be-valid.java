class Solution {
    public boolean canBeValid(String s, String l) {
        int n=s.length();
        if(n%2==1)
        return false;

        if(s.charAt(0)==')' && l.charAt(0)=='1')
        return false;

        if(s.charAt(n-1)=='(' && l.charAt(n-1)=='1')
        return false;

        int open=0;
        int closed=0;
        int wild=0;
        for(int i=0;i<n;i++)
        {
            if(l.charAt(i)=='0')
            wild++;
            else if(s.charAt(i)=='(')
            open++;
            else if(s.charAt(i)==')')
            closed++;

            if(closed> wild+open)
            return false;
        }
        open=0;
        closed=0;
        wild=0;

        for(int i=n-1;i>=0;i--)
        {
            if(l.charAt(i)=='0')
            {
                wild++;
            }
            else if(s.charAt(i)=='(')
            {
                open++;
            }
            else if(s.charAt(i)==')')
            {
                closed++;
            }
            if(open>closed+wild)
            return false;
        }
        return true;
    }
}