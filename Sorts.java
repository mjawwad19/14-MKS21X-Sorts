import java.util.*;
import java.io.*;
/*
*@param ary is any array to be sorted.
Directions:
choose the smallest put it into ary[0]
choose the next smallest put it into ary[1]  (you can ignore the slots before the current position)
choose the next smallest put it into ary[2]  (you can ignore the slots before the current position)
...
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

  public static void bubbleSort(int [] ary) {
    int least, temp;
    for (int i = 0; i < ary.length; i++) {
      int end = ary.length -1;
      least = i;
      for (int j = 0; j < end; j++) {
        if (ary[j] > ary[least]) {
          temp = ary[j];
          ary[j] = ary[least];
          ary[least] = temp;
        }
      }
      end--;
    }
  }

  public static void main(String[] args) {
    int[] ary1 =  {7, 5, 4, 2};
    int[] ary2 = {5,1,12,-5,16,2,12,14};
    int[] ary3 = {5,1,12,-5,16};
    int[] ary4 = {2,3,4,5,1};
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

  }
}
