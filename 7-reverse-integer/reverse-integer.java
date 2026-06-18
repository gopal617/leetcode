class Solution {
    public int reverse(int x) {
        long num = Math.abs((long) x);
        if(num>=2147483648L) return 0;
        long r=0;
        while(num!=0){
            long d= num%10;
            r=r*10+d;
            num=num/10;
        }
        if(r>=2147483648L) return 0;
        return x<=0? (int)(-1*r):(int) r;
    }
}