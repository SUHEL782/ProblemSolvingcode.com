package Basic_Level;
import java.text.DecimalFormat;
import java.util.Scanner;

/*Calculate the compound intrest */
public class Question5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double P = sc.nextDouble();
        double r = sc.nextDouble();
        int t = sc.nextInt();
        int n = sc.nextInt();

        double A = P * Math.pow(1 + (r / n), n * t);
        double CI = A - P;

        DecimalFormat df = new DecimalFormat("0.00");
        System.out.println(df.format(CI));

        sc.close();
    }
    }
    

