public class divideConquer3 {
    public static int search(int[] arr,int tar,int si,int ei) {
        if (si>ei){
            return -1;
        }
        //kaam
        int mid=(si+ei)/2;
        if (arr[mid]==tar){
            return mid;
        }
        //mid on L1
        if (arr[si]<=arr[mid]){
            //case 1
            if (arr[si]<=tar && tar<=arr[mid]){
                return search(arr,tar,si,mid-1);

            }else{
                //case b right
              return search(arr,tar,mid+1,mid);

            }

            //mid on line 2
        }else{
            //case c right
            if (arr[mid]<=tar && tar<=arr[ei]){
                return search(arr,tar,mid+1,mid);
            }else{
                //case d left
                return search(arr,tar,tar,mid-1);
            }
        }
    }
    public static void main(String[] args) {
        int[] arr={4,5,6,7,0,1,2};
        int target=6;
        int tarIdx=search(arr,target,0,arr.length-1);
        System.out.println(tarIdx);//2

    }
}
