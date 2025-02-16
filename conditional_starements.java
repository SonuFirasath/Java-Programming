import java.util.*;
public class conditional_starements {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your age : ");
        int age = sc.nextInt();
        if(age >= 18){
            System.out.println("You are ready to drive just go and get the documents .......");
        }
        else{
            System.out.println("You are not an adult.");
        }

        System.out.println("Enter the value of number : ");
        int num = sc.nextInt();

        if((num%2) == 0)
        {
            System.out.println("The number is even...");
        }
        else
        {
            System.out.println("The Given number is odd....");
        }
    }
}
