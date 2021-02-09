import java.util.ArrayList;

public class MyMain {

    // Sorts the ArrayList using insertion sort
    public static ArrayList<Integer> insertionSort(ArrayList<Integer> list) {
        //Arraylist<Integer> fin = new ArrayList<Integer>();
        for (int i = 1; i < list.size(); i++){
            int num = list.get(i);
            int before = i-1;
            while ((before > -1) && (list.get(before).compareTo(num) == 1)){
                list.set(before+1, list.get(before));
                before--;
            }
            list.set(before+1, num);
        }
        return list;
    }

     // Merges two sorted arrays into one large combined
     // sorted array
     // You may assume arr1 and arr2 are the same length
    public static int[] merge(int[] arr1, int[] arr2) { 
        int[] fin = new int[arr1.length + arr2.length];
        int count = 0;
        int temp1 = 0;
        int temp2 = 0;

        while ((temp1 < arr1.length) && (temp2 < arr2.length)) {
            if (arr1[temp1] < arr2[temp2]){
                fin[count] = arr1[temp1];
                temp1++;
            }
            else{
                fin[count] = arr2[temp2];
                temp2++;
            }
            count++;
        }

        while (temp1 < arr1.length) {
            fin[count] = arr1[temp1];
            temp1++;
            count++;
        }
        while (temp2 < arr2.length) {
            fin[count] = arr2[temp2];
            temp2++;
            count++;
        }

        return fin;
    }

    public static void main(String[] args) {
        // You can test your code here
    }
}
