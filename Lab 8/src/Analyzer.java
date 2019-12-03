import java.util.Scanner;
public class Analyzer {
    public static int linearSearch(String[] dataSet, String element){

        for (int i = 0;i<dataSet.length;i++)//for loop to go through the entries from the class String Data
        {
            if (dataSet[i].equals(element))//statement that compares the entries to the element
            {
                return i;
            }
        }
        return -1;//return -1 if element is not found.
    }
    public static int binarySearch(String[] dataSet, String element){
        String b = "-1";
        int left = 0;
        int right = dataSet.length-1;

        while (left <= right) {//while the right of the array is equal or more than the left
            int middle = left + (right - left)/2;//find the middle

            if (dataSet[middle].equals(element))
            {
                return middle;//return middle
            }
            if (dataSet[middle].compareTo(element) < 0)//compare the element to the dataset in the middle
            {
                left = middle + 1;//left is gonna be the middle plus 1 if the middle is less the 0
            }
            else
            {
                right = middle - 1;
            }
        }
        return -1;//if not found then return -1
    }

    public static void main (String[] args) {
        String [] entries = StringData.getData();
        //String [] entries = {"1", "2", "3", "4", "5", "6", "7", "8", "9", "10"};
        System.out.println("input element");//just for the eyes

        long startTime = System.nanoTime();//create start time variable
        linearSearch(entries,"not_here");//call method that i want to get time of
        long endTime = System.nanoTime();//create end time variable

        long timeElapsed = endTime - startTime;//to get the time it spent looking for the element on the entries subtract endTime minus startTime
        System.out.println("not_here linear search time elapsed: " + timeElapsed);//for the eye
//repeat everything for every other time test inclusing the binary search
        startTime = System.nanoTime();
        binarySearch(entries,"not_here");
        endTime = System.nanoTime();

        timeElapsed = endTime - startTime;
        System.out.println("not_here binary search time elapsed: " + timeElapsed);


        startTime = System.nanoTime();//repeated
        linearSearch(entries,"mzzzz");
        endTime = System.nanoTime();

        timeElapsed = endTime - startTime;//repeated
        System.out.println("mzzzz linear search time elapsed: " + timeElapsed);

        startTime = System.nanoTime();
        binarySearch(entries,"mzzzz");
        endTime = System.nanoTime();

        timeElapsed = endTime - startTime;
        System.out.println("mzzzz binary search time elapsed: " + timeElapsed);


        startTime = System.nanoTime();//repeated
        linearSearch(entries,"aaaaa");
        endTime = System.nanoTime();

        timeElapsed = endTime - startTime;
        System.out.println("aaaaa linear search time elapsed: " + timeElapsed);

        startTime = System.nanoTime();//repeated
        binarySearch(entries,"aaaaa");
        endTime = System.nanoTime();

        timeElapsed = endTime - startTime;
        System.out.println("aaaaa binary search time elapsed: " + timeElapsed);
    }
}
