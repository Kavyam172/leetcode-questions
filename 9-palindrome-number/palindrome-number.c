bool isPalindrome(int x){
    long int new = 0;
    int original = x;
    while(x>0){
        new = (new*10)+(x%10);
        x=x/10;
    }
    if(new == original){
        return true;
    }
    return false;
}