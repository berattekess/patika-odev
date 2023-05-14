import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        //Değişkenlerin belirlenmesi
        int i,j,k;
        System.out.print("Üçgen basamak sayısını giriniz : ");
        Scanner scanner = new Scanner(System.in);
        int n=scanner.nextInt();

        for(i = 0;i < n; i++){
            for(j = 0;j <= i; j++){
                System.out.print(" ");
            }
            for(k = 2*n-1;k >= (2*i+1); k--){
                System.out.print("*");

            }
            System.out.println();

        }
    }
}