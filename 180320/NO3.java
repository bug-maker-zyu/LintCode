public class NO3 {
    /*
     * @param : An integer
     * @param : An integer
     * @return: An integer denote the count of digit k in 1..n
     */
    public int digitCounts(int k, int n) {
        //强推，遍历所有的数 居然通过了=-=
        int count = 0;
        for (int i = k; i <= n; i++) {
            count += isShow(i, k);
        }
        return count;
    }
    
    public static int isShow(int i, int k) {
        if (i == 0 && k == 0) {
            return 1;   
        }
        int count = 0;
        while (i > 0) {
            if (i%10 == k) {
                count++;
            }
            i /= 10;
        }
        return count;
    }
}