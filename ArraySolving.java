package org.example;

public class ArraySolving {
    public static void arrayMax(){
        int [][] arr={{3,5,7},{2,3,4},{7,9,8}};
        int max=arr[0][0];

        for(int i=0; i<arr.length;i++){
            for (int j=0;j<arr[i].length; j++){
                if(arr[i][j]>max){
                    max=arr[i][j];
                }
            }
        }
        System.out.println(max);
    }
    public static void arrayMin(){
        int [][] arr={{3,5,7},{2,3,4},{7,9,8}};
        int min=arr[0][0];
        for(int i=0;i<arr.length;i++){
            for (int j=0;j<arr[i].length;j++){
                if(arr[i][j]<min){
                    min=arr[i][j];
                }
            }
        }
        System.out.println(min);
    }

    public static void arrayShortingA(){
        int [] array={7,4,9,5,8,1,3,2,6};
        for(int i=0;i<array.length;i++){
            for (int j=0;j<array.length-1;j++){
                if(array[j]>array[j+1]){
                    int temp=array[j];
                    array[j]=array[j+1];
                    array[j+1]=temp;
                }
            }
        }
        for (int ele: array){
            System.out.println(ele+ " ");
        }
    }

    public static void arrayShortingD(){
        int [] array={7,4,9,5,8,1,3,2,6};
        for(int i=0;i<array.length;i++){
            for (int j=0;j<array.length-1;j++){
                if(array[j]<array[j+1]){
                    int temp=array[j];
                    array[j]=array[j+1];
                    array[j+1]=temp;
                }
            }
        }
        for (int ele: array){
            System.out.println(ele+ " ");
        }
    }
    public static void main(String[] args) {
        arrayMax();
        arrayMin();
        System.out.println("Howdy");
        arrayShortingA();
        System.out.println("Howdy");
        arrayShortingD();

    }
}
