package jainamproject;

class palindrome {
    public boolean isPalindrome(int x) {
        if(x < 0)
            return false;
        int y = 0;
        int tmp = x;
        while(x > 0){
           int n = x % 10 ;
           y = y *10 + n ;
            x = x / 10;
        }  
        if(tmp == y)
            return true;
        return false;
    }
}