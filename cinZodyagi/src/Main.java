import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int dogumYili,hesap;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Doğum yılınızı giriniz : ");
        dogumYili = scanner.nextInt();
        hesap = dogumYili % 12;

        if (hesap == 0) {
            System.out.println("Zodyak Burcunuz MAYMUN");
        } else if (hesap == 1) {
            System.out.println("Zodyak Burcunuz HOROZ");
        } else if (hesap == 2) {
            System.out.println("Zodyak Burcunuz KÖPEK");
        } else if (hesap == 3) {
            System.out.println("Zodyak Burcunuz DOMUZ");
        } else if (hesap == 4) {
            System.out.println("Zodyak Burcunuz FARE");
        } else if (hesap == 5){
            System.out.println("Zodyak Burcunuz ÖKÜZ");
        } else if (hesap == 6) {
            System.out.println("Zodyak Burcunuz KAPLAN");
        } else if (hesap == 7) {
            System.out.println("Zodyak Burcunuz TAVŞAN");
        } else if (hesap == 8) {
            System.out.println("Zodyak Burcunuz EJDERHA");
        } else if (hesap == 9) {
            System.out.println("Zodyak Burcunuz YILAN");
        } else if (hesap == 10) {
            System.out.println("Zodyak Burcunuz AT");
        } else if (hesap == 11) {
            System.out.println("Zodyak Burcunuz KOYUN");
        }
        else {
            System.out.println("Tekrar deneyin...");
        }
    }

    }
