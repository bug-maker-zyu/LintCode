import java.util.ArrayList;

public class NO4 {
    /**
     * @param n: An integer
     * @return: the nth prime number as description.
     */
    public int nthUglyNumber(int n) {

        List<Integer> ugly = new ArrayList<Integer>();
        uglg.add(1);

        int n2 = 0, n3 = 0, n5 = 0;

        for (int i = 1; i < n; i++) {
            int lastNum = ugly.get(i - 1);
            while (uglys.get(n2) * 2 <= lastNum)
                n2++;
            while (uglys.get(n3) * 3 <= lastNum)
                n3++;
            while (uglys.get(n5) * 5 <= lastNum)
                n5++;

            ugly.add(Math.min(ugly.get(n2) * 2, Math.min(ugly.get(n3) * 3, ugly.get(n5) * 5)));
        }

    }

    // public int nthUglyNumber(int n) {
    //     // write your code here 
    //     //强推万岁=-= 果然没通过 时间复杂度高了
    //     int i = 1;
    //     int num = 0;
    //     while (n > 0) {
    //         if (isUgly(i)) {
    //             n--;
    //             num = i;
    //         }
    //         i++;
    //     }
    //     return num;
    // }

    // public static boolean isUgly(int n) {
    //     if (n == 1) return true;
    //     while (n > 1) {
    //         if (n % 2 == 0) {
    //             n /= 2;
    //         } else if (n % 3 == 0) {
    //             n /= 3;
    //         } else if (n % 5 == 0) {
    //             n /= 5;
    //         } else {
    //             return false;
    //         }
    //     }
    //     return true;
    // }

}