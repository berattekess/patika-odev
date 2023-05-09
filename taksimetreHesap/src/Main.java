import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        //Değişkenleri tanımlama
        int km;
        double perKm = 2.20, total, baslangic = 10;

        //Değereleri alma
        Scanner scanner = new Scanner(System.in);
        System.out.println("Gidilen mesafeyi giriniz: ");
        km = scanner.nextInt();

        //ücret hesaplama
        total = (km * perKm) + baslangic;

        //koşullar
         total = (total > 20) ? total : 20;

         //sonuç
        System.out.println("Toplam Tutar : " + total);
    }
}