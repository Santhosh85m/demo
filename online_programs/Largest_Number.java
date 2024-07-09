import java.util.Scanner;

class Largest_Number {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    System.out.println("enter a value");
    int num = scan.nextInt();
    int Largest_Number = num % 10;
    num = num / 10;
    while (num != 0) {
      int digit = num % 10;
      if (digit > Largest_Number) {
        Largest_Number = digit;
      }
      num = num / 10;
    }
    System.out.println(Largest_Number);
  }
}