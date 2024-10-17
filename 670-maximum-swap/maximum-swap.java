class Solution {
    public int maximumSwap(int num) {
        String s = Integer.toString(num);
        
        
        for(int i=0; i<s.length()-1; i++){
            int max = -1;
            int maxIndex = i;
            for(int j=i+1; j<s.length(); j++){

                if(s.charAt(j)-0 >= max){
                    max = s.charAt(j)-0;
                    maxIndex = j;
                }
            }
            if(s.charAt(i)-0 < s.charAt(maxIndex)-0){
                char[] charArray = s.toCharArray();
                char temp = charArray[i];
                charArray[i] = charArray[maxIndex];
                charArray[maxIndex] = temp;
                String result = new String(charArray);
                return Integer.parseInt(result);
            }
        }
        return num;
    }
}