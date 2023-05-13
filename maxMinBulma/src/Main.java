import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Değişkenleri belirleme
        int numbers, numb;
        int max = 0,min = 0;

        //Say adedinin girilmesi
        Scanner scanner = new Scanner(System.in);
        System.out.print("Kaç sayı girilecek : ");
        numbers = scanner.nextInt();

        //Büyük-küçük sayıları belirleme
        for (int i = 0 ; i < numbers ; i++){
            System.out.print(+(i+1) + ". Sayıyı Giriniz : ");
            numb = scanner.nextInt();
            if(numb > max){
                max = numb;
            } else if (numb < min ) {
                min = numb;
            }
            else {
                continue;
            }
        }

        //Sonuçların ekrana yazdırılması
        System.out.println("Max değer = " +max);
        System.out.print("Min değer = " +min);


    }
}