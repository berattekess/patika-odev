
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        //Değişkenleri oluştur.
        int mat,fzk,kimya,turkce,tarih,muzik;

        //Scanner sınıfı tanımla.
        Scanner scanner = new Scanner(System.in);

        //Kullanıcıdan değerleri al.
        System.out.print("Matematik notunuzu giriniz:");
        mat = scanner.nextInt();

        System.out.print("Fizik notunuzu giriniz:");
        fzk = scanner.nextInt();

        System.out.print("Kimya notunuzu giriniz:");
        kimya = scanner.nextInt();

        System.out.print("Türkçe notunuzu giriniz:");
        turkce = scanner.nextInt();

        System.out.print("Tarih notunuzu giriniz:");
        tarih = scanner.nextInt();

        System.out.print("Müzik notunuzu giriniz:");
        muzik = scanner.nextInt();

        //Ortalama hesabı.
        int toplam = (mat + fzk + kimya + turkce + tarih + muzik);
        double ortalama = toplam / 6;

        System.out.println("Ortalamanız :" + ortalama);

        //Koşulları sağlama.
        boolean kosul = ortalama >= 60;
        System.out.println(kosul ? "Geçtiniz" : "Kaldınız");

     }
}