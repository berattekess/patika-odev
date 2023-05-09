import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // değişkenleri tanımlama
        int kenar1, kenar2;
        double uzunKenar;

        //kulanıcıdan değerleri alma
        Scanner scanner = new Scanner(System.in);
        System.out.println("üçgenin 1.kenarını giriniz:");
        kenar1 = scanner.nextInt();
        System.out.println("üçgenin 2.kenaırnı giriniz");
        kenar2 = scanner.nextInt();

        //hipotenüs değerini bulma
        uzunKenar = Math.sqrt((kenar1*kenar1) + (kenar2*kenar2));
        System.out.println("Hipotenüs : " + uzunKenar);

    }
}