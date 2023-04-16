public class bitManupulation9 {
    public static int setIthBit(int n, int i) {
        int bitMask=1<<i;
        return n | bitMask;
        }

    public static void main(String[] args) {
        System.out.println(setIthBit(10,2));//14

    }
}
/*
        1.GET ith BIT
        2.SET ith BIT
        ex-10
        10->            1010
       n|(1<<i)         0100
                        -----
        Or operation    1110(which is 14)

        3.CLEAR ith BIT

         1.ex- 10->1010 check with ith bit 2 (0 or 1)
         need to use left shift operator


*/
