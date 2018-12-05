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
  public static void selectionsort(int [] ary) {
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
    System.out.println(Arrays.toString(ary));
  }
}

  public static void main(String[] args) {
    int[] ary1 =  {7, 5, 4, 2};
    System.out.println("This is your original: " + Arrays.toString(ary1));
    //I'm just too lazy to copy over toString AGAIN
    selectionsort(ary1);
  }
}
