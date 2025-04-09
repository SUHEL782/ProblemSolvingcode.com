package Basic_Level;
import java.util.Scanner;
/*Calculate the area of surface */
public class Question7 {
 public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double r = sc.nextDouble();
        double A= 4 * Math.PI * Math.pow(r, 2);
    System.out.println("A= " + A);
        sc.close();
 }   
}
