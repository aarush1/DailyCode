public class MergeSort {

    public static void main(String[] args) {
        int [] arr = new int[]{3,2,1,6,4,7};

        int[] ans = new int[6];
        ans = mergeSort(arr, 0, 6);

        for(int l = 0 ;l<9;l++){
            System.out.println(ans[l]);
        }



    }


    public static int[] mergeSort(int[] n, int low,int high){

//        int low = 0;
//        int high = n.length;
        int mid =  low+high/2;
        int fsh = merge(n,low,mid);
        int ssh = merge(n,mid+1,high);
        int fss =  merge(fsh,ssh);


    }

    public static int[] merge(int[] nums1, int[] nums2){

//        int [] nums1 = new int[]{2,6,5,7};
//        int [] nums2 = new int[]{9,10,11,32,62};62

        int n = nums1.length;
        int m = nums2.length;
        //System.out.println(n);
        //System.out.println(m);

        int[]  nums3 = new int[9];

        int i = 0;
        int j = 0;
        int k = 0;

        while(i < nums1.length && j < nums2.length){

            if(nums1[i] < nums2[j]){
                nums3[k] = nums1[i];
                i++;
                k++;

            }else{
                nums3[k] = nums2[j];
                j++;
                k++;
            }
        }

        while(i < nums1.length){
            nums3[k] = nums1[i];
            i++;
            k++;
        }

        while(j < nums2.length){
            nums3[k] = nums2[j];
            j++;
            k++;
        }




        return nums3;



}
}
