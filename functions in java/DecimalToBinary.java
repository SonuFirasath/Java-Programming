public class DecimalToBinary {

    public static int dectobin(int n)
    {
        int pow = 0;
        int bin = 0;

        while(n>0)
        {
            int rem = n %2;

            bin += rem * (int)Math.pow(10,pow);

            pow++;
            n = n/2;
        }
        return bin;
    }
    public static void main(String[] args) {
        int n = 5;

        System.out.println("The Binary form of the given " + n + " is "+ dectobin(n));
    }
}
