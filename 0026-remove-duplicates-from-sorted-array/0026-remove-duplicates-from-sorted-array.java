class Solution {
    public int removeDuplicates(int[] nums) {
        HashSet<Integer> hs = new HashSet<>();
        for(int n: nums){
          hs.add(n);

        }
        int k=0;
        Iterator<Integer> it = hs.iterator();

while(it.hasNext()){
    int value = it.next();
    nums[k]=value;
    k++;
}
Arrays.sort(nums, 0, k);
        
        return k;
        
    }
}