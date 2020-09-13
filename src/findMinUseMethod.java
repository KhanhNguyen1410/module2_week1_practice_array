public class findMinUseMethod {
    public static void main(String[] args) {
        int[] arr = {3,4,6,8,9,1,7};
        int index = minArr(arr);
        System.out.println("the smallest element in the list is: "+ arr[index]);
    }
    public  static  int minArr(int[] arr){
        int min = arr[0];
        int index = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < min){
                min = arr[i];
                index = i;
            }
        } return index;
    }
}
