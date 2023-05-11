import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int yas,mesafe,secim;
        double ilkFiyat;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Tek Yön -> 1  Gidiş Dönüş -> 2");
        System.out.print("Lütfen seçim yapınız : ");
        secim = scanner.nextInt();
        System.out.print("Km cinsinde Mesafe Girinizi : ");
        mesafe = scanner.nextInt();
        System.out.print("Yaşınızı giriniz : ");
        yas = scanner.nextInt();

        ilkFiyat = mesafe * 0.10;

        if(secim == 1 && mesafe > 0 && yas > 0){

            if (yas < 12){
                ilkFiyat = ilkFiyat - (ilkFiyat * 0.50);
            }
            else if (yas == 12 || yas <= 24){
                ilkFiyat = ilkFiyat - (ilkFiyat * 0.10);
            }
            else if (yas > 25 ||yas <=65){
                ilkFiyat = ilkFiyat - (ilkFiyat * 0.00);
            }
            else{
                ilkFiyat = ilkFiyat - (ilkFiyat * 0.30);
            }
        }
        else if(secim == 2 && mesafe > 0 && yas > 0){
            ilkFiyat = (ilkFiyat - (ilkFiyat * 0.20)) * 2;
            if (yas < 12){
                ilkFiyat = ilkFiyat - (ilkFiyat * 0.50);
            }
            else if (yas == 12 || yas <= 24){
                ilkFiyat = ilkFiyat - (ilkFiyat * 0.10);
            }
            else if (yas > 25 ||yas <=65){
                ilkFiyat = ilkFiyat - (ilkFiyat * 0.00);
            }
            else{
                ilkFiyat = ilkFiyat - (ilkFiyat * 0.30);
            }
        }
        else {
            System.out.println("Hatalı veri girişi...");
        }
        if (ilkFiyat < 0){
            System.out.println(" ");
        }
        else {
            System.out.println("Fiyat : " +ilkFiyat + " TL");
        }

    }
}