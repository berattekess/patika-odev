import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Değişkenleri oluşturma
        int  kilo;
        double boy,sonuc;

        //Değerleri kullanıcıdan alma
        Scanner scanner = new Scanner(System.in);
        System.out.println("Boyunuzu Giriniz :");
        boy = scanner.nextDouble();
        System.out.println("Kilonuzu Giriniz :");
        kilo = scanner.nextInt();

        //İndeks hesaplanması
        sonuc = kilo / (boy * boy);

        System.out.println("Vücut kitle indeksiniz : " + sonuc);
    }
}