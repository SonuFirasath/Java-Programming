import java.util.*;
public class variables {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of new name : ");
        String new_name = sc.nextLine();
        String name = "Mikey";
        int age = 13;
        double price = 454.323;
        int a = 54;
        int b = 32;
        System.out.println("The new name value that you have entered is : "+new_name);
        System.out.println(name + " " + age + " " + price + " The sum of a and b is : " + (a+b));
    }
}
