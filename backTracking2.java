public class backTracking2 {
    public static void findSubset(String str,String ans, int i) {//set is collection of object
        //base
        if (i==str.length()){
                System.out.println(ans);
                return;
        }
        //yes
       findSubset(str,ans+str.charAt(i),i+1);
       //no choice
        findSubset(str,ans,i+1);
    }
    public static void main(String[] args) {
        String str="abc";
        findSubset(str," ",0);
    }
}

/*

 abc
 ab
 ac
 a
 bc
 b
 c

 */
