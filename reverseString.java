public class reverseString {
    public static void main(String[] args) {
        String str = "I am ravi kumar";

        for (int i = str.length() - 1; i >= 0; i--) {
            System.out.print(str.charAt(i));
        }
    }
}

