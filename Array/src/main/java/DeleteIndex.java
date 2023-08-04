import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class DeleteIndex {
    public static void main(String[] args) {
        int[] arr = {2,2,3,4,2,1,1,0,1,1,6,5,5,6};
        List<Integer> arr1 = new ArrayList<>();
        Arrays.sort(arr);
        arr1.add(arr[0]);
        for (int i=1; i < arr.length; i++){
            if (arr[i] != arr[i-1]){
                arr1.add(arr[i]);
            }
        }
        System.out.println(arr1);
    }

    public static int[] delete(int[] array, int x) {
        int[] newArray = new int[array.length - 1];
        for (int i = 0; i < array.length - 1; i++) {
            if (i < x) {
                newArray[i] = array[i];
            }
            if (i >= x) {
                newArray[i] = array[i + 1];
            }
        }
        return newArray;
    }
}

