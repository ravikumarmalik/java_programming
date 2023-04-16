public class divideConquer2 {
    public static void printArray(int[] arr) {
        for (int i=0;i<arr.length;i++){
            System.out.println(arr[i]+" ");
        }
        System.out.println();

    }

    public static void quickSort(int[] arr,int si,int ei) {
        if (si>=ei){
            return;
        }
        //last elemnt piviot
       int pIdx=partition(arr,si,ei);
       quickSort(arr,si,pIdx-1);//left part
        quickSort(arr,pIdx+1,ei);//right
    }

    public static int partition(int[] arr,int si,int ei) {
        int pivot=arr[ei];//to make place for els smaller then pivot
        int i=si-1;

        for (int j=si;j<ei;j++){
            if (arr[j]<=pivot){
                i++;
                //swap
                int temp=arr[j];
                arr[j]=arr[i];
                arr[i]=temp;
            }
        }
        i++;
        int temp=pivot;
        arr[ei]=arr[i];
        arr[i]=temp;
        return i;
    }
    public static void main(String[] args) {
        int[] arr={6,3,9,5,2,8};
        quickSort(arr,0,arr.length-1);
       printArray(arr);
    }
}

/*

2
3
5
6
8
9


 */
