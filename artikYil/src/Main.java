import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int yil;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Hesaplamak istediğiniz yılı giriniz : ");
        yil = scanner.nextInt();

        if (yil % 4 == 0 && yil % 100 != 0){
            System.out.println(+yil + " artık bir yıldır.");
        }
        else if (yil % 4 == 0 && yil % 400 == 0 )  {
            System.out.println(+yil + " artık bir yıldır");
        }
        else{
            System.out.println(+yil + " artık bir yıl değildir.");
        }
    }
    }
