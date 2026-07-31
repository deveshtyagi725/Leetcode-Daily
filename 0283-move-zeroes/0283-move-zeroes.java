class Solution {
    public void moveZeroes(int[] nums) {
        int [] arr = new int[nums.length];
        int count=0;
        int j=0;
        for(int i=0;i<nums.length;i++){
        if(nums[i]==0){
            count++;
            continue;
        } else{
            arr[j]=nums[i];
            j++;
        }
        
        }
        while(count!=0){
            arr[j]=0;
            j++;
            count--;
        }
        for(int i=0;i<nums.length;i++){
            nums[i]=arr[i];
        }
        
    }
}