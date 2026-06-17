class Solution {
    public String intToRoman(int num) {
        // define string array for every combination possible
        final String[] I = {"","I","II","III","IV","V","VI","VII","VIII","IX"};
        final String[] X = {"","X","XX","XXX","XL","L","LX","LXX","LXXX","XC"};
        final String[] C = {"","C","CC","CCC","CD","D","DC","DCC","DCCC","CM"};
        final String[] M = {"","M","MM","MMM"}; // since max limit is 3999

        return M[num/1000]+C[(num%1000)/100]+X[(num%100)/10]+I[num%10];
    }
}