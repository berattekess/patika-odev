import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Değişkenlerin tanımlanması
        double armut = 2.14, elma = 3.67, domates = 1.11, muz = 0.95, patlıcan = 5.00, toplam;
        int a,e,d,m,p;

        //Kullanıcıdan veri alma
        Scanner scanner = new Scanner(System.in);
        System.out.print("Armut kaç kilo ? : ");
        a = scanner.nextInt();

        System.out.print("Elma kaç kilo ? : ");
        e = scanner.nextInt();

        System.out.print("Domates kaç kilo ? : ");
        d = scanner.nextInt();

        System.out.print("Muz kaç kilo ? : ");
        m = scanner.nextInt();

        System.out.print("Patlıcan kaç kilo ? : ");
        p = scanner.nextInt();

        toplam = (a * armut) + (e * elma) + (d * domates) + (m * muz) + (p * patlıcan);
        System.out.print("Toplam Tutar : " + toplam + " TL");
    }
}