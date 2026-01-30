import java.util.*;
public class secondhighest{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of elements in the array:");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int firstHighest = Integer.MIN_VALUE;
        int secondHighest = Integer.MIN_VALUE;
        for (int num : arr) {
            if (num > firstHighest) {
                secondHighest = firstHighest;
                firstHighest = num;
            } else if (num > secondHighest && num != firstHighest) {
                secondHighest = num;
            }
        }
        if (secondHighest == Integer.MIN_VALUE) {
            System.out.println("There is no second highest element.");
        } else {
            System.out.println("The second highest element is: " + secondHighest);
        }
        sc.close();
    }
}