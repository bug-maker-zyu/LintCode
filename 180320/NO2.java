public class NO2 {
    /** 
     * @param n: An integer
     * @return: An integer, denote the number of trailing zeros in n!
     */
    public long trailingZeros(long n) {
        // write your code here, try to do it without arithmetic operators.
        long count = 0;
        while (n != 0) {
            count += n / 5;
            n /= 5;
        }
        return count;
    }
}