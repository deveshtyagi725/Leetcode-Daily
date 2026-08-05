class Solution {
    public int search(int[] nums, int target) {
        int i=0;
        int ans = -1;
        int j=nums.length-1;
        while(i<=j){
            int mid=(i+j)/2;
            if(nums[mid]==target){
                ans=mid;
                return ans;
            }
            if(nums[i]<=nums[mid]){
                if(nums[i]<=target && target<=nums[mid]){
                    j=mid-1;
                }else{
                    i=mid+1;
                }
            }else{
                if(nums[mid]<=target && target<=nums[j]){
                    i=mid+1;
                }else{
                    j=mid-1;
                }
            }
        }
        return ans;
        
    }
}