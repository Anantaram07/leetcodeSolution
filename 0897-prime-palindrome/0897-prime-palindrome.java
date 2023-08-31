class Solution {
    public int primePalindrome(int n) {
      if(n == 0 || n == 1) return 2;
        return helper(n); 
    }

    int helper(int n) {
        if (10_000_000 < n && n < 100_000_000) return helper(100_000_000);
        if(isPrime(n) && isPal(n)) return n;
        if(n % 2 == 0) {
            return helper(n+1);
        }else{
            return helper(n+2);
        }
    }

    boolean isPrime(int n) {

        for(int i = 2; i<=(int) Math.sqrt(n); i++) {
            if(n%i == 0) return false;
        }
        return true;
    }


    boolean isPal(int n) {
        int rev = 0;
        int temp = n;
        while(n != 0) {
            int r = n%10;
            rev = rev*10+r;
            n = n/10;
        }
        return rev == temp;
    }
}  