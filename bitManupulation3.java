public class bitManupulation3 {
    /*
    BINARY XOR(^)
    in same value o/p will 0
    in different value o/p will 1
    ex- 5-> 101
        6->110
        (5^6)-> (101 ^ 110)->011
     */
    public static void main(String[] args) {
        int a=101;//5
        int b=110;//6
        int result = (a^b);
        System.out.println(result);//11
    }
}
