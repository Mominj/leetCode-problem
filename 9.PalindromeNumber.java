class Solution {
    public boolean isPalindrome(int x) {
        
        int rnum = 0;
        int number = x;

        if(x < 0) {
            return false;
        } 
        while(number != 0) {
            rnum = (rnum * 10) + number % 10;
            number = number / 10; 
        }

        if( rnum == x) {
            return true;
        }
        return false;
    }
}