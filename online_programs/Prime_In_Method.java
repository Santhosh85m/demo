
import java.util.Scanner;

class Prime_In_Method {
  public static int methodprime(int n) {
    int count = 0;
    for (int i = 1; i <= n; i++) {

      if (n % i == 0) {
        System.out.println(i + ", ");
        count++;

      }
    }
    return count;

  }

  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    System.out.println("enter n value");
    int n = scan.nextInt();
    int count = methodprime(n);
    if (count == 2) {
      System.out.println(n + " is a prime number");
    } else {
      System.out.println(n + " is not a prime number");
    }
  }
}