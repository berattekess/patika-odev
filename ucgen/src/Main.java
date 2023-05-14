import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int yukseklik;
        Scanner scanner =new Scanner(System.in);
        System.out.print("Üçgen için basamak değeri : ");
        yukseklik =scanner.nextInt();

        for (int i=1; i<yukseklik*2; i+= 2)
        {
            for (int k=0; k < (10 - i/2); k++)
                System.out.print(" ");

            for (int j=0; j<i; j++)
                System.out.print("*");

            System.out.println("");
        }
    }
}