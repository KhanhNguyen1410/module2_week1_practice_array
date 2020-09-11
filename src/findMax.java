import java.util.Scanner;

public class findMax {
    public static void main(String[] args) {
        int size;
        int[] array;
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.print("enter array size: ");
            size = scanner.nextInt();
            if (size > 20){
                System.out.println("maximum is 20");
            }
        } while (size>20);

        array = new int[size];
        for (int i = 0; i < size; i++) {
            System.out.print("enter element is "+ (i + 1) + ": ");
            array[i]= scanner.nextInt();
        }
        System.out.println("array imported is: ");
        for (int i = 0; i < size; i++) {
            System.out.print(array[i]+ " ");
        }
        int max = array[0];
        int index = 0;
        for (int i = 0; i <size ; i++) {
            if (array[i] > max){
                max = array[i];
                index = i;
            }
        }
        System.out.println();
        System.out.printf("%d is maximum in the array and is located %d ",max,index);
    }
}

