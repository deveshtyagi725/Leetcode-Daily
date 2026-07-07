class Solution {
    public long sumAndMultiply(int n) {
        ArrayList<Integer> ls = new ArrayList();
        long k=0;
        while(n>0){
            int a = n%10;
            if(a!=0){
                k+=a;
                ls.add(a);
             
            }
            n=n/10;
        }
        long f = 0;
        Collections.reverse(ls);
        for(int l : ls){
            f=f*10+l;
            
        }
        return f*k;
    }
}