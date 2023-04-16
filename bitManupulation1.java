
/*
we will working on bit level because every information store in computer in the binary form
Bit-wise operator
Binary AND(&)
Binary OR(|)
Binary XOR(^)
Binary 1's complement(~)
Binary leftshift(<<)
Binary rightshift(>>)
 */

public class bitManupulation1 {
    /*
    Binary AND operation (5&6)
    5->101
    6->110
    after AND ->(100) ->4 in decimal number
     */
    public static void main(String[] args) {
        int a=101;
        int b=110;
        int result =(a&b);
        System.out.println(result);//100

    }
}
