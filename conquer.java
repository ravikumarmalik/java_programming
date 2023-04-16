
class conquer {
        public static void printArr(int[] arr) {
            for (int i=0;i<arr.length;i++){
                System.out.println(arr[i]+" ");
            }
            System.out.println();

        }
        public static void mergeSort(int[] arr,int si, int ei) {

            if (si>=ei){
                return;
            }

            //kam
            int mid=(si+ei)/2;//si+(ei-si)/2
            mergeSort(arr,si,mid);//this is my left part.
            mergeSort(arr,mid+1,ei);//this is my right part.

            merge(arr,si,mid,ei);//for merge

        }

        public static void merge(int[] arr, int si,int ei,int mid) {
            //left(0,3)=4,right(4,6)=3->6-0=6+1=7
            int temp[]=new int[ei-si-1];
            int i=si;//left part
            int j=mid+1;//right part
            int k=0;//temp
            while(i<=mid && j<=ei){
                if (arr[i]<arr[j]){
                    temp[k]=arr[i];
                    i++;
                }else{
                    temp[k]=arr[j];
                    j++;
                }
                k++;
            }
            //left part
            while (i<=mid){
                temp[k++]=arr[i++];

            }

            while (j<=ei) {
                temp[k++] = arr[j++];
            }

            //copy to temp
            for (k=0,i=si;k<temp.length;k++,i++){
                arr[i]=temp[k];

            }

        }
        public static void main(String[] args) {
            int[] arr={6,3,9,5,2,8,1};
            mergeSort(arr,0,arr.length-1);
            printArr(arr);
        }
    }




/*
class conquer {
    public static void printArr(int[] arr) {
        for (int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();

    }

    public static void mergeSort(int[] arr,int si,int ei) {
        if (si>=ei){
            return;
        }
        int mid=si+(ei-si)/2;//(si+ei)/2;

        mergeSort(arr,si,mid);//left part
        mergeSort(arr,mid+1,ei);//right part

        merge(arr,si,mid,ei);//for merge

    }

    public static void merge(int[] arr,int si,int mid,int ei) {
        //left(0,3)=4 right(4,6)=3->6-0+1
        int temp[]=new int[ei-si+1];
        int i=si;
        int j=mid+1;
        int k=0;

        while(i<=mid && j<=ei){
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
        while(j<=ei){
            temp[k++]=arr[j++];

        }
        //copy temp to original arr
        for (k=0,i=si;k<temp.length;k++,i++){
            arr[i]=temp[k];
        }


    }
    public static void main(String[] args) {
        int[] arr={6,3,9,5,2,8,-2};
        mergeSort(arr,0,arr.length-1);
        printArr(arr);//-2 2 3 5 6 8 9

    }
}

 */

/*
class conquer {
    public static void printArr(int[] arr) {
        for (int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }

    public static void quickSort(int[] arr,int si,int ei) {
        if (si>=ei){
            return;
        }
        //pivot last element
       int pIndex= partition(arr,si,ei);//pivot index
        quickSort(arr,si,pIndex-1);//left part
        quickSort(arr,pIndex+1,ei);//right part
    }

    public static int partition(int[] arr,int si,int ei) {
        int pivot = arr[ei];
        int i = si - 1;//to make palce for smaller than pivot

        for (int j = si; j < ei; j++) {
            if (arr[j] <= pivot) {
                i++;

                //swap

                int temp = arr[j];
                arr[j] = arr[i];
                arr[i] = temp;
            }
        }
        i++;
        int temp = pivot;
        arr[ei] = arr[i];
        arr[i] = temp;
        return i;

    }

    public static void main(String[] args) {
        int[] arr={6,3,9,8,2,5};
        quickSort(arr,0,arr.length-1);
        printArr(arr);//2 3 5 6 8 9
    }
}

 */

/*

class conquer {
    public static int rotatedSorted(int[] arr,int tar,int si,int ei) {
        if (si>ei){
            return -1;
        }

        //kam
        int mid = (si + ei) / 2;

        //case found'
        if (arr[mid] == tar) {
            return mid;
        }
        //mid on L1
        if (arr[si] <= arr[mid]) {
            //case a-to search in left
            if (arr[si] <= tar && tar <= arr[mid]) {
                return rotatedSorted(arr, tar, si, mid - 1);
            } else {
                //case b-to search right
                return rotatedSorted(arr, tar, mid + 1, ei);
            }

        }
        //mid line on l2
        else {
            //case c:right
            if (arr[mid] <= tar && tar <= arr[ei]) {
                return rotatedSorted(arr, tar, mid + 1, ei);
            } else {
                //case d:left
                return rotatedSorted(arr, tar, si, mid - 1);
            }

        }
    }
    public static void main(String[] args) {
        int[] arr={4,5,6,7,0,1,2};
        int target=0;//outpu=4
       int tarIndex =rotatedSorted(arr,target,0,arr.length-1);
        System.out.println(tarIndex);

    }
}

 */





