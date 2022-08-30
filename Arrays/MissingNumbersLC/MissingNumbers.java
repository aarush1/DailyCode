package MissingNumbersLC;

public class MissingNumbers {
    public static void main(int[] nums) {
        int sum = 0;

        int n = nums.length;

        int rangesum = n*(n+1)/2;

        for(int i = 0; i<n;i++){
            sum+= nums[i];
        }

       // return rangesum - sum;

    }

    }

