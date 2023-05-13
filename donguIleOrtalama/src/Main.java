import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int i=0,sayi,toplam = 0,sayac = 0;
        System.out.print("Lütfen bir sayi giriniz : ");
        Scanner scanner = new Scanner(System.in);
        sayi = scanner.nextInt();

        while (i <= sayi){
            i++;
            if (i%12 == 0){
                toplam += i;
                sayac++;
            }
            else {
                continue;
            }

        }

        System.out.println("toplam = " +toplam);
        System.out.println("ortalama = " +(toplam/sayac));
    }
}