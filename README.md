class Solution {
    public int arraySign(int[] nums) {
        int neg_count=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==0){
                return 0;

            }
            else if(nums[i]<0){
                neg_count++;
            } 
        }
        if(neg_count%2==0){
            return 1;
        }
        else{
            return -1;
        }

    }
}
