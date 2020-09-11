package reverse_array;

import java.util.Scanner;

public class ReverseArray {
    public static void main(String[] args) {
        int size;
        int[] array;
        Scanner sc = new Scanner(System.in);
        do {
            System.out.print("enter a size: ");
            size = sc.nextInt();
            if (size > 20){
                System.out.println("size does not exceed 20");
            }
        } while (size > 20);
        array = new int[size];
        int i = 0;
        while (i < size){
            System.out.print("enter element "+ (i + 1)+ ": ");
            array[i] = sc.nextInt();
            i++;
        }
        System.out.printf("%-20s%s", "elements in array: ", "");
        for (int j = 0; j < size; j++) {
            System.out.print(array[j]+ ", ");
        }
        for (int j = 0; j < size/2; j++) {
            int temp = array[j];
            array[j] = array[size - 1 -j];
            array[size-1-j] = temp;
        }
        System.out.println();
        System.out.printf("%-20s%s", "element after reverse: ", "");
        for (int j = 0; j < size; j++) {

            System.out.print(array[j] + ", ");
        }
    }
}
