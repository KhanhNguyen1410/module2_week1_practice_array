import java.util.Scanner;

public class CountStudents {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size;
        int[] array;
        do {
            System.out.println("enter a size: ");
            size = sc.nextInt();
            if (size > 30){
                System.out.print("maximum size is 30 ");
            }
        } while (size > 30);

        array = new int[size];
        for (int i = 0; i < array.length ; i++) {
            System.out.print("enter a mark a student "+ (i + 1)+ ": ");
            array[i] = sc.nextInt();
        }
        int count = 0;
        System.out.println("list of mark is: ");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + "\t");
            if (array[i] >5 && array[i] <= 10){
                count++;
            }
        }
        System.out.println("\n The number of students passing the exam is " + count);

    }

}
