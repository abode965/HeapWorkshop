package algorithmaanalysis;

public class HeapSort {

    public static void main(String[] args) {
        Integer array[] = {null, 10, 8, 7, 5, 2, 4,6,3,5,1};
        System.out.println("Given Array -> \t");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]+"\t");
        }System.out.println("");
        Integer b[] = Deletion(array, smallestElement(array));
        for (int i = 0; i < b.length; i++) {
            System.out.print(b[i] + "\t");
        }
        System.out.println("");
        Integer a[] = Deletion(b, smallestElement(b));
         for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + "\t");
        }
        System.out.println("");
        Integer c[] = Deletion(a, smallestElement(b));
         for (int i = 0; i < c.length; i++) {
            System.out.print(c[i] + "\t");
        }
        System.out.println("");
    }

    // if the heap is sorted the efficiency is o(n/2) we just look the the heap's leaves 
    public static Integer smallestElement(Integer[] array) {
        int min = array[array.length / 2];
        int index = array.length / 2;
        for (int i = array.length / 2; i < array.length; i++) {
            if(array[i]==null)
                break ;
            if (array[i] < min) {
                min = array[i];
                index = i;
            }
        }
        System.out.println("The smallest element in the heap is ---->  " + array[index]);
        return index;
    }

    public static Integer[] Deletion(Integer[] array, int index) {
        Integer[] temp = new Integer[array.length - 1];
        if (index >= array.length) {
            return null;
        }
        System.out.println("Element  " + array[index] + " is removed");
        if (index == array.length - 1) {
            array[index] = null;
        }
        if (index < array.length) {

            array[index] = array[array.length - 1];
            array[array.length - 1] = null;
        }
        for (int i = 0; i < temp.length; i++) {
            temp[i] = array[i];
        }

        return temp;
    }

    }
