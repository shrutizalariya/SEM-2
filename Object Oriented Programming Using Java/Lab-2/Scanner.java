import java.util.Scanner;
public class Scanner {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number : ");
        int a = sc.nextInt();
        System.out.println("A = " + a + "dyrteyte");
        sc.close();
    }
}