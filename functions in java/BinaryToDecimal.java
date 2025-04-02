public class BinaryToDecimal{

    public static int bintodec(int n)
    {
        int pow = 0;
        int dec = 0;
        
        while(n>0)
        {
            int last = n% 10;

            dec += last * (int)Math.pow(2,pow);
            pow ++;
            n = n/10;
        }
        return dec;
    }
    public static void main(String[] args){
        int n = 101;
        System.out.println("The Decical value of the given binary number " + n + " is " + bintodec(n));
    }
}