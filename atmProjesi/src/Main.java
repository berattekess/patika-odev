import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String userName, password;
        Scanner input = new Scanner(System.in);
        int right = 3;
        int select;
        int balance = 1500, deger;

        while(right > 0){
            System.out.println("Kullanıcı adınız :");
            userName = input.nextLine();
            System.out.println("Şifreniz :");
            password = input.nextLine();

            if (userName.equals("berattekes") && password.equals("123456789")){
                System.out.println("Merahaba  ***** Bankasına giriş yaptınız");
                do {
                    System.out.println("Yapmak istediğiniz işlemi seçiniz");
                    System.out.println("1-Para Yatırma\n" +
                            "2-Para Çekme\n" +
                            "3-Bakiye Sorgulama\n" +
                            "4-Çıkış");
                    select = input.nextInt();

                    switch (select){
                        case 1:
                            System.out.println("Bakiyeniz : " +balance + "TL");
                            System.out.println("Lütfen yatırmak istediğiniz tutarı giriniz: ");
                            deger = input.nextInt();
                            balance += deger;
                            System.out.println("İşlem başarılı...");
                            System.out.println("Yeni bakiyeniz :" +balance + "TL"); break;

                        case 2:
                            System.out.println("Bakiyeniz : " +balance + "TL");
                            System.out.println("Lütfen çekmek istediğiniz tutarı giriniz:" );
                            deger = input.nextInt();
                            if (balance >= deger) {
                                balance -= deger;
                                System.out.println("İşlem başarılı...");
                                System.out.println("Yeni bakiyeniz : " +balance + "TL"); break;
                            }
                            else{
                                System.out.println("Yetersiz bakiye..."); break;
                            }
                        case 3:
                            System.out.println("BAKİYENİZ : "+ balance + "TL"); break;

                        case 4:
                            System.out.println("Çıkışınınz başarıyla yapılmışıtr iyi günler dileriz....");


                    }

                }while (select != 4);
                break;
            }
            else{
                right--;
                System.out.println("hatalı giriş lütfen tekrar deneyiniz");
                if (right == 0){
                    System.out.println("Hesabınız bloke olmuştur lütfen banka ile iletişime geçiniz...");
                }
                else {
                    System.out.println("kalan hakkınız : " +right);
                }
            }
        }
    }
}