import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int mat, fizik, kimya, muzik, turkce;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lütfen ders notlarını giriniz ");
        System.out.print("Matematik : ");
        mat = scanner.nextInt();

        System.out.print("Fizik : ");
        fizik = scanner.nextInt();

        System.out.print("Kimya : ");
        kimya = scanner.nextInt();

        System.out.print("Müzik : ");
        muzik = scanner.nextInt();

        System.out.print("Türkçe : ");
        turkce = scanner.nextInt();

        if(mat < 0 || mat > 100){
            mat = 0;
        }
         if (fizik < 0 || fizik > 100) {
            fizik = 0;
        }
         if (kimya < 0 ||kimya > 100) {
            kimya = 0;
        }
         if (muzik < 0 || muzik > 100) {
            muzik = 0;
        }
         if (turkce < 0 ||turkce > 100) {
            turkce = 0;
        }

        double average = (mat + kimya + fizik + turkce +muzik) / 5;

        if(average < 55){
            System.out.print("Sınıfta kaldınız ortalamanız : " +average);
        }
        else {
            System.out.print("Sınıfı geçtiniz ortalamanız : " +average);
        }
    }
}