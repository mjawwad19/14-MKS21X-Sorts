import java.util.*;
import java.io.*;

/**Selection sort of an int array.
  *Upon completion, the elements of the array will be in increasing order.
  *@param data  the elements to be sorted.
  */

public class Sorts {
  //helper to check if sorted or not and not waste time
private static boolean isSorted(int[] data) {
  for (int i = 0; i < data.length -1; i++) {
    if (data[i] > data[i+1]) return false;
  }
  return true;
}
  public static void selectionSort(int [] data) {
    int least,temp;
    if (isSorted(data)) return;
    for (int i = 0; i < data.length; i++) {
      least = i;
      for (int j = i; j < data.length; j++) {
        //this is how we ignore previously sorted
        if (data[j] < data[least]) least = j;
      }
    //swapping the vals into place -- technically could be a helper like Mr.K's demo
    temp = data[least];
    data[least] = data[i];
    data[i] = temp;
    //System.out.println(Arrays.toString(ary));
  }
}
/**Bubble sort of an int array.
*Upon completion, the elements of the array will be in increasing order.
*@param data  the elements to be sorted.
*/
  public static void bubbleSort(int [] data) {
    int least, temp;
    boolean madeSwaps;
    for (int i = 0; i < data.length; i++) {
      int end = data.length -1;
      least = i;
      madeSwaps = false;
        for (int j = 0; j < end; j++) {
          if (data[j] > data[least]) {
            //swaqpping two vals
            temp = data[j];
            data[j] = data[least];
            data[least] = temp;
            madeSwaps = true;
            //considering if I should just make a swap method
          }
        }
        end--;
        if (!madeSwaps) return;
        //we know the last value will be the largest so we don't need to iterate to it again
      }
    }
  /**Insertion sort of an int array.
  *Upon completion, the elements of the array will be in increasing order.
  *@param data the elements to be sorted.
  */
  public static void insertionSort(int [] data) {
    int temp, curr;
    for (int i = 1; i < data.length; i++){
     if (data[i] < data[i - 1]){
       temp = data[i];
       curr = i - 1;
       //the element directly preceding the one that needs to be sorted.
       boolean placed = false;
       while (!placed){
         if (curr < 0 || data[curr] < temp){
           data[curr + 1] = temp;
           placed = true;
           //dropping in place based on increasing order
         }
         else{
           data[curr + 1] = data[curr];
           //the shift right
           curr--;
         }
       //System.out.println(Arrays.toString(ary));
       }
     }
   }
 }

  public static void main(String[] args) {
    int[] ary1 =  {7, 5, 4, 2};
    int[] ary2 = {5,1,12,-5,16,2,12,14};
    int[] ary3 = {5,1,12,-5,16};
    int[] ary4 = {2,3,4,5,1};
    int[] ary5 = {6,1,2,3,4,5};
    int[] ary6 = {4,3,2,10,12,1,5,6};
    int[] mill = new int[1000000];
    int[] ary7 = {2,3,4,5,6};
    System.out.println("This is your original: " + Arrays.toString(ary1));
    //I'm just too lazy to copy over toString AGAIN
    selectionSort(ary1);
    System.out.println("Selection Sorted: " + Arrays.toString(ary1) +'\n');
    System.out.println("This is your original: " + Arrays.toString(ary2));
    selectionSort(ary2);
    System.out.println("Selection Sorted: " + Arrays.toString(ary2)+'\n');
    System.out.println("This is your original: " + Arrays.toString(ary3));
    bubbleSort(ary3);
    System.out.println("Bubble Sorted: " + Arrays.toString(ary3)+'\n');
    System.out.println("This is your original: " + Arrays.toString(ary4));
    bubbleSort(ary4);
    System.out.println("Bubble Sorted: " + Arrays.toString(ary4)+'\n');
    System.out.println("This is your original: " + Arrays.toString(ary5));
    bubbleSort(ary5);
    System.out.println("Bubble Sorted: " + Arrays.toString(ary5)+'\n');
    System.out.println("This is your orignal: " + Arrays.toString(ary6));
    insertionSort(ary6);
    System.out.println("Insertion Sorted: " + Arrays.toString(ary6)+'\n');
    bubbleSort(mill);
    selectionSort(ary7);
    System.out.println("Selection Sorted: " + Arrays.toString(ary7)+'\n');
  }
}
