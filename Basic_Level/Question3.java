package Basic_Level;
import java.util.Scanner;
/*Swaping the two number */
public class Question3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
    int a= sc.nextInt();
    int b= sc.nextInt();
a=a+b;
b=a-b;
a=a-b;
System.out.println("After Swaping the two number: " + a + " " + b);
    
    sc.close();
    }
}