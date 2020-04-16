package test;

import Course.Book;

public class test {





    public int[] sort(int[] arr){
        for (int i=0; i<arr.length-1; i++){
            for (int j=0; j<arr.length-1; j++ ){
                if(arr[j] > arr[j+1]){
                    int t = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = t;
                }
            }
        }
        return arr;
    }

    public static void main(String[] args) {
        int listBook[] = {4,7,6,2,1};
        test sx = new test();
        int arrayM[] = sx.sort(listBook);
        for (int element: arrayM
             ) {
            System.out.print(element+" ");
        }
        System.out.println();
        System.out.print("Long".toLowerCase());
    }

    }
