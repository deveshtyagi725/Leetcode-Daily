class Solution {
    public int maxProduct(int n) {
        ArrayList<Integer> ls = new ArrayList<>();
        int max=0;
        while(n>0){
            int a=n%10;
            ls.add(a);
            n=n/10; 
        }
        for(int j=0;j<ls.size();j++){
          for(int i=j+1;i<ls.size();i++){
            int a=(ls.get(j)*ls.get(i));
            max=Math.max(max,a);
          }
        }
        
        return max;
        
    }
}