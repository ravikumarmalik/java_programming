public class ReverseOfString {
    public static void main(String[] args) {
        String str="";
        String name="hello";
        for (int i=0;i<name.length();i++){
            str=name.charAt(i)+str;
        }
        System.out.println(str);
    }
}
