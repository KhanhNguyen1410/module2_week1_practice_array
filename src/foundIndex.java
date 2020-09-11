import java.util.Scanner;

public class foundIndex {
    public static void main(String[] args) {
        String[] students = {"Christian", "Michael", "Camila", "Sienna", "Tanya", "Connor", "Zachariah", "Mallory", "Zoe", "Emily"};
        Scanner input_name = new Scanner(System.in);
        System.out.println("enter a name's student");
        String name = input_name.nextLine();
        boolean isExit = false;

        for (int i = 0; i < students.length; i++) {
            if (students[i].equals(name)){
                System.out.println(name+ "is in students and has index "+ i);
                isExit = true;
                break;
            }
        }
        if (!isExit){
            System.out.println("not found "+ name + " in the list");
        }
    }
}
