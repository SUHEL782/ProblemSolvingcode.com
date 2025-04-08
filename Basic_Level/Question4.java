package Basic_Level;
import java.util.Scanner;
 /*Write the area of parameter */
public class Question4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
 int a= sc.nextInt();
    int b= sc.nextInt();
    int area= a*b;
    int parameter= 2*(a+b);
    System.out.println("Area of the rectangle is: " + area);
    System.out.println("Parameter of the rectangle is: " + parameter);
    sc.close();

    }
}
