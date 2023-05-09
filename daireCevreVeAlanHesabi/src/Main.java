import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        //değer alma
        int deger;
        double pi = 3.14 ,alan,cevre;
        
        Scanner scanner = new Scanner(System.in);
        System.out.println("Dairenin yarıçapını giriniz :");
        deger = scanner.nextInt();

        //hesaplamalar
        alan = pi * deger * deger;
        cevre = 2 * pi * deger;

        System.out.println("Çevre : " +cevre);
        System.out.println("Alan :" + alan);
    }
}