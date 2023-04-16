public class divideConquer1 {

    public static void printArray(int[] arr) {
        for (int i=0;i<arr.length;i++){
            System.out.println(arr[i]+" ");
        }
        System.out.println();

    }
    public static void mergeSort(int[] arr,int si,int ei) {
        if (si>=ei){
            return;
        }
        int mid=si+(ei-si)/2; //(si+ei)/2
        mergeSort(arr,si,mid);//left part
        mergeSort(arr,mid+1,ei);//right part
        merge(arr,si,mid,ei);
    }

    public static void merge(int[] arr,int si,int mid,int ei) {
        //left(0,3)=4 | right(4,6)=3 ->6+0+1=7
        int[] temp=new int[ei-si+1];//size of tem arr
        int i=si;//iterator for left
        int j=mid+1;//iterator right part
        int k=0;//iterator for temp

        while (i<=mid && j <=ei){
            if (arr[i]<arr[j]){
                temp[k]=arr[i];
                i++;
            }else{
                temp[k]=arr[j];
                j++;
            }
            k++;
        }
        //left
        while (i<=mid){
            temp[k++]=arr[i++];
        }
        //right
        while (j<=ei){
            temp[k++]=arr[j++];
        }

        //copy temp to original array
        for (k=0, i=si;k<temp.length;k++,i++){
            arr[i]=temp[k];

        }
    }
    public static void main(String[] args) {
        int[] arr={6,3,9,5,2,8};
        mergeSort(arr,0,arr.length-1);
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
