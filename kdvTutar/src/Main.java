import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        //Değişkenleri tanımlama.
        double tutar, kdvTutar, kdvOran = 0.18, kdvliTutar;

        //Değer alma
        Scanner scanner = new Scanner(System.in);
        System.out.println("Tutarı giriniz:");
        tutar = scanner.nextInt();

        //Kdvli tutarı hesaplama
        kdvTutar = kdvOran * tutar;
        kdvliTutar = tutar + kdvTutar;

        System.out.println("Tutarınız :" + tutar);
        System.out.println("Kdv oranı :" + kdvOran);
        System.out.println("Kdv tutarı :" + kdvTutar);
        System.out.println("Kdvli tutarınız : " + kdvliTutar);

    }
}