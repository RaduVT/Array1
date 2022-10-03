import java.util.Scanner;

public class Array {
    public static void main(String[] args) {
        int count = 0;
        int[] array;
        array = new int[10];
        Scanner input = new Scanner(System.in);

        for (int i = 0; i < array.length; i++) {
            array[i] = input.nextInt();
        }
        for (int i = array.length - 1; i >= 0 ;i--) {
            System.out.print(array[i] + " ");
        }
    }
}
