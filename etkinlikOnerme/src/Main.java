import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int derece;
        System.out.print("Sıcaklık değerini giriniz :");
        Scanner scanner = new Scanner(System.in);
        derece = scanner.nextInt();

        if(derece < 5){
            System.out.println("Kayak yapabilirsiniz");
        }
        else if (derece >= 5 && derece <=25 ) {
                if (derece <= 15){
                    System.out.println("sinemaya gidebilirsin");
                }
                if ((derece >= 10 && derece <=15) || ( derece >= 15&& derece <= 25)){
                    System.out.println("Piknik yapabilirsin");
                }
        }
        else{
            System.out.println("Yüzmeye gidebilirsin");
        }
        }
    }