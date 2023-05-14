import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("iki sayı girin");
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int ebob = 0;
        int ekok = 0;

        for (int i = 1 ; i <= a ; i++){
            if (a%i==0 && b%i==0){
                ebob = i;
            }
        }
        System.out.println(ebob);
        for (int j = 1 ; j <= a*b ; j++) {
            if (j % a == 0 && j % b == 0) {
                System.out.println(j);
                break;
            }
        }


    }


}