package PWskill_Assignments;
import java.util.Scanner;
public class Assignment1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number : ");
        int x = sc.nextInt();
        System.out.print("Enter second number : ");
        int y = sc.nextInt();
        System.out.println("Their product is : "+(x*y));

        char ch = 'U';
        System.out.println("The ASC|| value of U is : "+ (int)ch);

        System.out.print("Enter the length of rectangle : ");
        int l = sc.nextInt();
        System.out.print("Enter the breadth of rectangle : ");
        int b = sc.nextInt();
        System.out.println("The area of rectangle is : "+(l*b));

        System.out.print("Enter the number : ");
        int X = sc.nextInt();
        System.out.println("The cube of the number is : "+(X*X*X));

        System.out.print("Enter the first number before swap : ");
        int x1 = sc.nextInt();
        System.out.print("Enter the second number before swap : ");
        int x2 = sc.nextInt();
        int temp;
        temp = x1;
        x1 = x2;
        x2 = temp;
        System.out.println("The first number after swap is : "+x1);
        System.out.println("The second number after swap is : "+x2);



    }
}
