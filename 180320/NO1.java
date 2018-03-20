public class NO1 {


    /**
     * @param a: An integer
     * @param b: An integer
     * @return: The sum of a and b
     */
    public int aplusb(int a, int b) {

        while (b != 0) {
            int a1 = a ^ b;
            int b1 = (a & b) << 1;
            a = a1;
            b = b1;
        }
        return a;
    }

    public static void main(String[] args) {
        System.out.println(new NO1().aplusb(1, 2));
    }

    /**
     * 总结
     * 1.java的7种为运算
     *      &按位与 |按位或 ～按位非 ^按位异或 <<左移运算符 >>右移运算符 <<<无符号左移
     * 2.加法的模拟运算
     *      (1)先用异或求出和之后没有进位的部分
     *      (2)再用与求出进位的部分，并且向前移一个单位作为进位
     *      (3)再把上述相加
     * 3.减法同样如此
     */

}
