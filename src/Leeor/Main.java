package Leeor;
import java.math.*;

public class Main
{
    static int[] selectionSort(int[] myArray)
    {
        for (int sorted = myArray.length - 1; sorted > 0; sorted--)
        {
            int largest = myArray[0];
            int tempHolder = 0;
            int indexLocation = 0;

            for (int i = 1; i <= sorted; i++)
            {
                if (largest < myArray[i])
                {
                    largest = myArray[i];
                    indexLocation = i;
                }
            }

            tempHolder = myArray[sorted];
            myArray[sorted] = largest;
            myArray[indexLocation] = tempHolder;

        }

        return myArray;
    }



    static int[] bubbleSort(int[] unsortedArray)
    {
        for (int sorted = unsortedArray.length - 1; sorted > 0; sorted--)
        {
            for (int i = 0; i < sorted; i++)
            {
                int tempHolder = 0;

                if (unsortedArray[i] > unsortedArray[i+1])
                {
                    tempHolder = unsortedArray[i + 1];
                    unsortedArray[i + 1] = unsortedArray[i];
                    unsortedArray[i] = tempHolder;
                }
            }
        }

        return unsortedArray;
    }

    public static void main(String[] args)
    {
        int[] myArray = new int[]{20,35,-15,7,55,1,-22};

        int[] sortedArray = selectionSort(myArray);

//        for (int i = 0; i < sortedArray.length; i++)
//            System.out.println(sortedArray[i]);

        for (int i : sortedArray)
            System.out.println(i);

    }
}
