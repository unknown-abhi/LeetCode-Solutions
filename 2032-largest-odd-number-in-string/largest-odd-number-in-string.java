import java.math.BigInteger;
class Solution {
    public String largestOddNumber(String num) {

        int maxIndex = -1;
        for (int i = num.length() - 1; i >= 0; i--) {
            if(Character.getNumericValue(num.charAt(i))%2 != 0){
                maxIndex = i;
                break;
            }
        }
        return maxIndex == -1 ? "" : num.substring(0, maxIndex + 1);
    }
}