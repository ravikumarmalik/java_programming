public class bitManupulation13 {
    /*
    check if a number is power of 2 or not
    if will give the result of (n&(n-1)==0) that's power of 2

    ex- 8->     1000
        7->     0111
        result (&)0000
     */
    public static boolean isPowerOfTwo(int n) {
        return (n&(n-1))==0;

}
    public static void main(String[] args) {
        System.out.println(isPowerOfTwo(7));//false
        System.out.println(isPowerOfTwo(8));//true

    }
}
