import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    double liczba1, liczba2;
    System.out.println("Wpisz pierwszą liczbę:");
    liczba1 = scanner.nextDouble();
    System.out.println("Wpisz drugą liczbę:");
    liczba2 = scanner.nextDouble();
    System.out.println("Wybierz rodzaj działania (+, -, *, /):");
    char operator = scanner.next().charAt(0);
    double wynik = 0;
    switch (operator) {
      case '+':
        wynik = liczba1 + liczba2;
        break;
      case '-':
        wynik = liczba1 - liczba2;
        break;
      case '*':
        wynik = liczba1 * liczba2;
        break;
      case '/':
        if (liczba2 != 0) {
          wynik = liczba1 / liczba2;
        } else {
          System.out.println("Nie można dzielić przez 0");
          return;
        }
        break;
      default:
        System.out.println("Zły rodzaj działania");
        return;
    }
    System.out.println("Wynik działania: " + wynik);
    scanner.close();
  }
}