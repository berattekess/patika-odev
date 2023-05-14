import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Değişken belirleme
        int num,num1 = 0,num2 = 1,i,a;

        //Kullanıcıdan değer alma
        Scanner scanner = new Scanner(System.in);
        System.out.print("Sayi giriniz : ");
        a = scanner.nextInt();

        //İşlemlerin yapılması ve ekrana çıktı
        System.out.print(num1 + " " +num2);
        for (i=2 ; i <= a ; i++){
            num = num1 + num2;
            System.out.print(" " +num);
            num1 = num2;
            num2 = num;
        }
    }
}