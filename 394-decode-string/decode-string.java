class Solution {
    public String decodeString(String s) {
        Stack<Integer> digits = new Stack<>();
        Stack<StringBuilder> prev= new Stack<>();
        StringBuilder curr = new StringBuilder();
        int i=0;
        while(i<s.length()){
            char current = s.charAt(i);
            if(Character.isDigit(current)){
                int temp = 0;
                while(Character.isDigit(s.charAt(i))){
                    temp = temp*10+(s.charAt(i)-'0');
                    i++;
                }
                digits.push(temp);
            }
            else if(current=='['){
                prev.push(curr);
                curr = new StringBuilder();
                i++;
            }
            else if(current==']'){
                StringBuilder prevres = prev.pop();
                int count = digits.pop();
                for(int j=0;j<count;j++){
                    prevres.append(curr);
                }
                curr = prevres;
                i++;
            }
            else{
                curr.append(current);
                i++;
            }
        }
        return curr.toString();
    }
}