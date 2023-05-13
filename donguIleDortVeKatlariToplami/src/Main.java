import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int n ,toplam = 0;
        Scanner scanner = new Scanner(System.in);
        do{
            n=scanner.nextInt();
            if (n % 2 == 0 && n % 4 == 0){
                toplam = toplam + n;
            }
            else
                break;
        }while(n > 0);
        System.out.println("toplam = " +toplam);
    }
}