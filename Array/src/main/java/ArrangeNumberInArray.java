import java.util.Arrays;

public class ArrangeNumberInArray {
    public static void main(String[] args) {
        int[] arr = {7,4,8,3,9,6,5};
        System.out.println(Arrays.toString(deleteItem(arr, 4)));
    }

    public static int[] deleteItem(int[] array, int index){
        for (int i=index; i < array.length-1; i++){
            array[i] = array[i+1];
        }
        return Arrays.copyOf(array, array.length-1);
    }
}
