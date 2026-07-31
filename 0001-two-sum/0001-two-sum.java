class Solution {
    public int[] twoSum(int[] nums, int target) {
        ArrayList<Integer> ls = new ArrayList<>();
        for(int i=0;i<nums.length;i++){
            for(int j=i+1;j<nums.length;j++){
                if(nums[i]+nums[j]==target){
                    ls.add(i);
                    ls.add(j);
                }
            }
        }
        int [] arr = new int[2];
        int l=0;
        for(int i=0;i<2;i++){
            arr[l]=ls.get(i);
            l++;
        }
        return arr;
        
    }
}