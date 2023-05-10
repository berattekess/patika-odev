import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Değişkenlerin belirlenmesi
        int sayi1, sayi2, secim;

        //Yapılmak istenen işlemin belirlenmesi
        Scanner scanner = new Scanner(System.in);
        System.out.println("1-Toplama\n2-Çıkarma\n3-Çarpma\n4-Bölme");
        System.out.print("Lütfen yapmak istediğiniz işlemmi belirtiniz : ");
        secim = scanner.nextInt();

        //Kullanıcıdan değerlerin alınması
        System.out.print("Birinci sayiyi giriniz : ");
        sayi1 = scanner.nextInt();
        System.out.print("İkinci sayiyi girinizi : ");
        sayi2 = scanner.nextInt();

        //işlemlerin yapılması
        switch (secim){
            case 1 :
                System.out.println("Sonuç : " + (sayi1 + sayi2));
                break;
            case 2 :
                System.out.println("Sonuç : " + (sayi1 - 2sayi2));
                break;
            case 3 :
                System.out.println("Sonuç : " + (sayi1 * sayi2));
                break;
            case 4 :
                System.out.println("Sonuç : " + (sayi1 / sayi2));
                break;
            default:
                System.out.println("Hatalı giriş...");
        }


    }
}