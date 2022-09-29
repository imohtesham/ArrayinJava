import java.util.Scanner;

public class OddPosition {
    public static void main(String args[])
    {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the number of elements in the array: ");
        int num = scan.nextInt();
        int arr[] = new int[num];
        System.out.print("Enter the elements: ");
        for (int i = 0; i < num; i++)
        {
            arr[i] = scan.nextInt();
        }
        printArray(arr);
    }
      static void printArray(int arr[])
    {
        System.out.println("array elements at odd positions: ");
        for(int i = 1; i < arr.length ; i+=2)
            System.out.print(arr[i]+" ");
        System.out.println();
    }
}
