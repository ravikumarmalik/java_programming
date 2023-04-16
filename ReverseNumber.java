public class ReverseNumber {
    public static void main(String[] args) {
        int n=78932;
        while (n>0){
            int lastdigit=n%10;
            System.out.print(lastdigit+" ");
            n=n/10;
        }

    }
}
