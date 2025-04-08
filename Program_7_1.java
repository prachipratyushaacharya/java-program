import java.util.Scanner;
import java.util.Arrays;

public class Program_7_1 {
    public static void main(String[] args) {

        try {
            int[] arr = { 10, 20, 30, 40, 50 };

            Scanner sc = new Scanner(System.in);

            System.out.println("Enter An Index Number: ");
            int nu = sc.nextInt();
            System.out.println(arr[nu]);
        }

        catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Please enter a valid integer");
        }
    }
}