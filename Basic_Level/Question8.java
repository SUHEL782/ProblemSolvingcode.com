package Basic_Level;
import java.util.Scanner;

/*Calculate the of cicumfrence and  Area*/
public class Question {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double r = sc.nextDouble();
        double c = 2 * Math.PI * r;
        double A = Math.PI * Math.pow(r, 2);
        System.out.println("C= " + c);
        System.out.println("A= " + A);
        sc.close();
    }
}
