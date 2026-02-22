class Solution {
    public boolean isPrime(int x) {
        if (x == 1) {
            return false;
        }
        for (int i = 2; i * i <= x; i++) {
            if (x % i == 0) {
                return false;
            }
        }
        return true;
    }
    public boolean completePrime(int n) {
        if (n == 1) {
            return false;
        }
        int digits = 0, j = 0, sum = 0;
        int temp = n; 
        while (temp > 0) {
            int rem2 = temp % 10;
            int x = (int) Math.pow(10, j);
            sum = sum + (rem2 * x);
            if (!isPrime(sum)) {
                return false;
            }
            if (!isPrime(temp)) {
                return false;
            }
            temp = temp / 10;
            j++;
        }
        return true;
    }
}