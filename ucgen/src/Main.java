import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int i, k, j, yukseklik;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Üçgen için basamak değeri : ");
        yukseklik = scanner.nextInt();

        for (i = 1; i < yukseklik * 2; i += 2) {
            for (k = 0; k < (5 - i / 2); k++)
                System.out.print(" ");

            for (j = 0; j < i; j++)
                System.out.print("*");

            System.out.println("");
        }
        for (i = 0; i < yukseklik; i++) {
            for (j = 0; j <= i; j++) {
                System.out.print(" ");
            }
            for (k = 2 * yukseklik - 1; k >= (2 * i + 1); k--) {
                System.out.print("*");

            }
            System.out.println();
        }
    }
}