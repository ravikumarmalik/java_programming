public class nextGreater {
    public static void main(String[] args) {
        int[] arr={6,8,0,1,3};
        for (int i=0;i<arr.length;i++){
            for (int j=i+1; j<arr.length;j++){
                if (arr[i]<arr[j]){
                    arr[i]=arr[j];
                    System.out.println(arr[i]);
                    break;
                }
            }
        }
    }
}
