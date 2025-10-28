import java.util.Scanner;

public class Triangle05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukan nilai n = ");
        int n = sc.nextInt();
        int i = 0;
        while (i <= n) { // mengubah (i <= 0) jadi (i <= n)
            int j = 0;
            while (j < i) {
                System.out.print("*");
                j++;
            }
            System.out.println();
            i++;
        }
    }
}
