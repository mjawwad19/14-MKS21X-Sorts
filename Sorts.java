import java.util.*;
import java.io.*;
/**Selection sort of an int array.
  *Upon completion, the elements of the array will be in increasing order.
  *@param data  the elements to be sorted.
  */
public class Sorts {
  public static void selectionSort(int [] ary) {
    int least,temp;
    //advised by others that I should not use Math.min :/
    for (int i = 0; i < ary.length; i++) {
      least = i;
      for (int j = i; j < ary.length; j++) {
        //this is how we ignore previously sorted
        if (ary[j] < ary[least]) least = j;
      }
    //swapping the vals into place -- technically could be a helper like Mr.K's demo
    temp = ary[least];
    ary[least] = ary[i];
    ary[i] = temp;
    //System.out.println(Arrays.toString(ary));
  }
}
/**Bubble sort of an int array.
*Upon completion, the elements of the array will be in increasing order.
*@param data  the elements to be sorted.
*/
  public static void bubbleSort(int [] ary) {
    int least, temp;
    for (int i = 0; i < ary.length; i++) {
      int end = ary.length -1;
      least = i;
      for (int j = 0; j < end; j++) {
        if (ary[j] > ary[least]) {
          //swaqpping two vals
          temp = ary[j];
          ary[j] = ary[least];
          ary[least] = temp;
          //considering if I should just make a swap method
        }
      }
      end--;
      //we know the last value will be the largest so we don't need to iterate to it again
    }
  }

  public static void main(String[] args) {
    int[] ary1 =  {7, 5, 4, 2};
    int[] ary2 = {5,1,12,-5,16,2,12,14};
    int[] ary3 = {5,1,12,-5,16};
    int[] ary4 = {2,3,4,5,1};
    int[] ary5 = {6,1,2,3,4,5};
    System.out.println("This is your original: " + Arrays.toString(ary1));
    //I'm just too lazy to copy over toString AGAIN
    selectionSort(ary1);
    System.out.println("Selection Sorted: " + Arrays.toString(ary1));
    System.out.println("This is your original: " + Arrays.toString(ary2));
    selectionSort(ary2);
    System.out.println("Selection Sorted: " + Arrays.toString(ary2));
    System.out.println("This is your original: " + Arrays.toString(ary3));
    bubbleSort(ary3);
    System.out.println("Bubble Sorted: " + Arrays.toString(ary3));
    System.out.println("This is your original: " + Arrays.toString(ary4));
    bubbleSort(ary4);
    System.out.println("Bubble Sorted: " + Arrays.toString(ary4));
    System.out.println("This is your original: " + Arrays.toString(ary5));
    bubbleSort(ary5);
    System.out.println("Bubble Sorted: " + Arrays.toString(ary5));

  }
}
