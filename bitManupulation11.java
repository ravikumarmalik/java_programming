public class bitManupulation11 {
    public static int clearLastIthBit(int n, int i) {
        int bitMask=~(0)<<i;
        return n & bitMask;

    }
    public static void main(String[] args) {
        System.out.println(clearLastIthBit(15,2));//12

        /*
        n=15        1111
        n<<2        1100    ~(0)<<i or (-1)<<i
        (& op)      1100 which is 12
         */

    }
}
