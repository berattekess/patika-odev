import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int sayi1,sayi2,sayi3;
        System.out.print("Lütfen sıralama istediiniz sayıları girin : ");
        Scanner scanner = new Scanner(System.in);
        sayi1 = scanner.nextInt();
        sayi2 = scanner.nextInt();
        sayi3 = scanner.nextInt();

        if (sayi1 > sayi2 && sayi1 > sayi3){
            if(sayi2 > sayi3){
                System.out.println(sayi1 + " > " + sayi2 + " > " +sayi3);
            }
            else {
                System.out.println(sayi1 + " > " + sayi3 + " > " +sayi2);
            }
        }

        if (sayi2 > sayi1 && sayi2 > sayi3){
            if(sayi1 > sayi3){
                System.out.println(sayi2 + " > " + sayi1 + " > " +sayi3);
            }
            else {
                System.out.println(sayi2 + " > " + sayi3 + " > " +sayi1);
            }
        }

        if (sayi3 > sayi2 && sayi3 > sayi1){
            if(sayi2 > sayi1){
                System.out.println(sayi3 + " > " + sayi2 + "  > " +sayi1);
            }
            else {
                System.out.println(sayi3 + " > " + sayi1 + " > " +sayi2);
            }
        }



    }
}