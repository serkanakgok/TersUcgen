import java.util.Scanner;

public class TersUcgen {
    public static void main(String[] args) {
        Scanner data = new Scanner(System.in);
        System.out.print("Basamak Sayısı :");
        int a = data.nextInt();
        for (int i = a; i > 0; i--) {
            for (int k = (a - i); k >= 0; k--) {
                System.out.print(" ");
            }
            for (int m = (2 * i - 1); m >= 1; m--) {
                System.out.print("*");
            }
            System.out.println(" ");
        }
    }
}
