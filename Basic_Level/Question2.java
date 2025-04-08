package Basic_Level;
import java.util.Scanner;
/*Greeding formate in the fllowing mags  */
//I am Suhel khan and I am 20 years old. I am from India
public class Question2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name= sc.nextLine();
        int age= sc.nextInt();
        String country= sc.nextLine();

        System.out.println("I am " + name + " and I am " + age + " years old. I am from " + country);
        sc.close();
    }

  
}
