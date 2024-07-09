import java.util.Scanner;

public class Factorial2 {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    System.out.println("enter a value");
    int n = scan.nextInt();
    int finalRes = factorialcal(n);
    System.out.println(finalRes);

  }

  public static int factorialcal(int n) {
    int result = 1;
    for (int i = 1; i <= n; n--) {
      result = result * n;
    }
    return result;
  }
}
