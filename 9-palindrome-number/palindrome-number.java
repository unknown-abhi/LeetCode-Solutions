class Solution {
    public boolean isPalindrome(int x) {
        if(x<0){
            return false;
        }

        int originalNumber = x;
        int reversedNumber = 0;

        while(x > 0){
            reversedNumber = (reversedNumber * 10) + (x % 10);
            x /= 10;
        }

        return originalNumber == reversedNumber ? true : false;
    }
}