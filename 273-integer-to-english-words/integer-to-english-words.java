class Solution {
    public String integerToEnglish(int num, String[] belowTen, String[] belowTwenty, String[] belowHundred) {
        if (num == 0) {
            return "Zero";
        } else if (num < 10) {
            return belowTen[num];
        } else if (num < 20) {
            return belowTwenty[num - 10];
        } else if (num < 100) {
            return belowHundred[num / 10] + (num % 10 != 0 ? " " + belowTen[num % 10] : "");
        } else if (num < 1000) {
            return belowTen[num / 100] + " Hundred"
                    + (num % 100 != 0 ? " " + integerToEnglish(num % 100, belowTen, belowTwenty, belowHundred) : "");
        } else if (num < 1000000) {
            return integerToEnglish(num / 1000, belowTen, belowTwenty, belowHundred) + " Thousand"
                    + (num % 1000 != 0 ? " " + integerToEnglish(num % 1000, belowTen, belowTwenty, belowHundred) : "");
        } else if (num < 1000000000) {
            return integerToEnglish(num / 1000000, belowTen, belowTwenty, belowHundred) + " Million"
                    + (num % 1000000 != 0 ? " " + integerToEnglish(num % 1000000, belowTen, belowTwenty, belowHundred)
                            : "");
        } else {
            return integerToEnglish(num / 1000000000, belowTen, belowTwenty, belowHundred) + " Billion"
                    + (num % 1000000000 != 0 ? " " + integerToEnglish(num % 1000000000, belowTen, belowTwenty, belowHundred)
                            : "");
        }
    }

    public String numberToWords(int num) {
        String[] belowTen = { "", "One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine" };

        String[] belowTwenty = { "Ten", "Eleven", "Twelve", "Thirteen", "Fourteen", "Fifteen", "Sixteen", "Seventeen",
                "Eighteen", "Nineteen" };

        String[] belowHundred = { "", "Ten", "Twenty", "Thirty", "Forty", "Fifty", "Sixty", "Seventy", "Eighty",
                "Ninety" };

        return integerToEnglish(num, belowTen, belowTwenty, belowHundred);
    }
}