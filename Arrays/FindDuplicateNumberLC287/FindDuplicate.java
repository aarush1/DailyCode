package FindDuplicateNumberLC287;

public class FindDuplicate {

    /* Approach 1.
    Arrays.sort(nums);
        int ans = 0;
        for(int i = 0;i<nums.length;i++){
            if(nums[i] == nums[i+1]){
                ans = nums[i];
                break;
            }
        }

    return ans;

     */
    /* Approach 2.

    int ans=0;
        int[] nw = new int[nums.length];

        for(int i = 0;i<nums.length;i++){
            nw[i] = 0;
        }

        int m =0;

        for(int j = 0;j<nums.length;j++){
            nw[nums[m]]++;
            m++;

        }

        for(int k = 0;k<nums.length;k++){
            if(nw[k]>1){
                ans = k;
            }
        }
        return ans;



     */
    /* Approach 3
     int slow = nums[0];
        int fast = nums[0];

        do {
            slow = nums[slow];
            fast = nums[nums[fast]];
        }while(slow!=fast);

        fast = nums[0];
        while(slow!=fast){
            slow = nums[slow];
            fast = nums[fast];
        }

        return slow;
      }

     */
}
