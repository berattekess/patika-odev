import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //Değişkenlerin belirlenmesi
        int i ,number ,total = 0;

        //Kullanıcıdan sayının alınması
        System.out.println("Bir sayi giriniz : ");
        number = scanner.nextInt();

        //İşlemlerin yapılması
        if (number == 1){
            total = 1;
        }
        for (i = 1 ; i < number ; i++){
            if (number % i == 0){
                total = total + i;
            }
        }
        //Koşulların değerlendirilmesi ve ekrana çıktı
        if (total == number && number != 1){
            System.out.println(+total + " bir mükemmel sayıdır.");
        }
        else {
            System.out.println(+total + " bir mükemmel sayı değildir.");
        }

    }
}