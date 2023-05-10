import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String sifre = "123456",giris,secim,yeniSfire;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Lütfen şifrenizi giriniz : ");
        giris = scanner.nextLine();
        if (giris.equals(sifre)) {
            System.out.println("Şifreniz doğru.");
        } else {
            System.out.print("Şifreniz yanlış. Şifrenizi sıfırlamak ister misiniz? (E/H) : ");
            secim = scanner.nextLine();
            if (secim.equalsIgnoreCase("E")) {
                System.out.print("Lütfen yeni şifrenizi giriniz : ");
                yeniSfire = scanner.nextLine();
                if (yeniSfire.equals(sifre)) {
                    System.out.println("Yeni şifreniz eskisiyle aynı olamaz, lütfen başka şifre giriniz.");
                } else {
                    System.out.println("Şifre oluşturuldu. Yeni şifreniz : " +yeniSfire);
                }
            } else {
                System.out.println("Şifrenizi sıfırlamadınız.");
            }
        }

    }
}