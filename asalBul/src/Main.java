import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Değişken belirleme
        int sayi, i,sayac = 0;

        //Değer alma işlemleri
        Scanner scanner = new Scanner(System.in);
        System.out.print("0 ile hangi sayı arasına bakmak istersiniz ? Giriniz : ");
        sayi = scanner.nextInt();

        if(sayi == 1 ||sayi == 0){
            sayac++;
        }

        //İşlemlerin uygulanması ve ekrana çıktı
        for (i = 2 ; i < sayi ; i++){
            if (sayi % i == 0){
                sayac++;
            }
        }

        if (sayac == 0){
            System.out.println("Sayi asaldır...");
        }
        else {
            System.out.println("Sayi asal değildir...");
        }
    }
}