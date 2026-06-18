class Solution:
    def reverse(self, x: int) -> int:
        n=abs(x-0)
        r=0
        while(n!=0):
            d=n%10
            r=r*10+d
            n=n//10
        if(r>=2147483648):
            return 0
        if(x<0) :
            return -1*r
        return r%2147483648
        