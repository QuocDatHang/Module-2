import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class test {
    public static void main(String[] args) {
        String[] nums = {"a","b","c"};
        String[] log = {"b","d"};
        int count = 0;
        for (int i=0; i < log.length; i++){
            for (int j=0; j < nums.length; j++){
                if (!log[i].equals(nums[j])){
                }
                else{
                    count++;
                }
            }
        }
        if (count == log.length){
            System.out.println("trung mang");
        }
        else {
            System.out.println("khong trung mang");
        }
    }

    /*
    public static int[] twoSum(int[] nums, int target) {
        int[] array = new int[2];
        for (int i=0; i < nums.length-1; i++){
            for (int j=1; j <nums.length; j++){
                if (nums[i] + nums[j] == target){
                    array[0] = i;
                    array[1] = j;
                }
            }
        }
        return array;
    }
    */

}


        //=============================================================
        //Bai 7
//        int[] arr = {10,-5,4,-8,0,-7,6};
//        for (int i=0; i <arr.length-1; i++){
//            if (arr[i] > 0){
//                for (int j=i+1; j<arr.length; j++){
//                    if (arr[j] > 0 ){
//                        if (arr[i] > arr[j]){
//                            int temp = arr[i];
//                            arr[i] = arr[j];
//                            arr[j] = temp;
//                        }
//                    }
//                }
//            }
//        }
//        System.out.println(Arrays.toString(arr));

//=======================================================================
        //BAI 9
        /*
        int[] arr = {10,-5,4,-8,0,-7,6};

        for (int i=0; i <arr.length-1; i++){
            if (arr[i] > 0){
                for (int j=i+1; j<arr.length; j++){
                    if (arr[j] > 0 ){
                        if (arr[i] > arr[j]){
                            int temp = arr[i];
                            arr[i] = arr[j];
                            arr[j] = temp;
                        }
                    }
                }
            }
            else {
                for (int j=i+1; j<arr.length; j++){
                    if (arr[j] < 0 ){
                        if (arr[i] < arr[j]){
                            int temp = arr[i];
                            arr[i] = arr[j];
                            arr[j] = temp;
                        }
                    }
                }
            }
        }
        System.out.println(Arrays.toString(arr));

         */

//=======================================================================
        //Bai 10
        /*
        int[] arr = {10, -5, 4, 8, 1, -7, 6};
        int[] arr1 = new int[arr.length + 1];
        int k = 3;
        int value = 100;
        int i;
        for (i = 0; i < arr.length + 1; i++) {
            if (i == k) {
                arr1[i] = value;
            } else if (i > k) {
                arr1[i] = arr[i - 1];
            } else {
                arr1[i] = arr[i];
            }
        }
        System.out.println(Arrays.toString(arr1));

         */
        //=====================================================



/*
        List<Integer> arr1 = new ArrayList<>();
        arr1.add(1);
        arr1.add(2);
        arr1.add(3);
        arr1.add(4);
        System.out.println(arr1);
        arr1.remove(1);
        System.out.println(arr1);
*/
