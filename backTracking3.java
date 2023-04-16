public class backTracking3 {
    public static void permutation(String str, String ans) {
        //base
        if (str.length()==0){
            System.out.println(ans);
            return;
        }
        //recursion
        for (int i=0;i<str.length();i++){
            char current =str.charAt(i);
            //abcde- ab+de=abde and c is removed from the string
            String Newstr=str.substring(0,i)+str.substring(i+1);//to remove ith char
            permutation(Newstr,ans+current);
        }
    }
    public static void main(String[] args) {
        String str="abc";
        permutation(str," ");//o(n*n!)
    }
}

/*

 abc
 acb
 bac
 bca
 cab
 cba

 */
