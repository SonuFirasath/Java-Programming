public class CheckPalindrome {
    public static void checkpalin(int n)
    {
        int palin = n;
        int rev = 0;

        while (palin!=0) {
            int rem = palin%10;
            rev = rev * 10 + rem;
            palin = palin/10;
        }
        if(rev == n){
            System.out.println("Palindrome....");
        }
        else{
            System.out.println("Not a palindrome...");
        }
    }
    public static void main(String[] args) {
        int n = 122;
        checkpalin(n);
    }
}
