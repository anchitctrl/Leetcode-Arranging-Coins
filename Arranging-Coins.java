class Solution {
    public int arrangeCoins(int n) {
        int sum=0;
        int i=1;
        while(n!=0){
            sum=sum+i;
            n=n-i;
            i++;
            if(i>n) return i-1;
        }
        return i;
    }
}
