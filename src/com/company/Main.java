package com.company;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        int[] nums = new int[]{3, 4, 5, 2, 8};

        //Array Sort
        bubbleSort(nums);
        printArray(nums);

        //Binary Search
        int left = 0;
        int right = nums.length - 1;
        System.out.println(binarySearch(nums, 8, left, right));

        //Celsius to Fahrenheit, Kelvin Converter
        System.out.println("Input temperature:");
        Scanner in = new Scanner(System.in);
        float t = in.nextFloat();
        System.out.println(temperatureConverter(t, 'F'));
        System.out.println(temperatureConverter(t, 'K'));

        //Shape Hierarchy
        ArrayList<Shape> shapes = new ArrayList<>();
        shapes.add(new Triangle());
        shapes.add(new Rectangle());
        shapes.add(new Square());
        shapes.add(new Circle());

        boolean exitFlag = false;
        while (!exitFlag) {
            System.out.println("Input num of shape");
            System.out.println("(0) Exit");
            for(int i = 0; i < shapes.size(); i++){
                System.out.println(" (" + (i+1) + ") " + shapes.get(i).getName());
            }
            int choice =0;
            if(in.hasNextInt()) {
                choice = in.nextInt();
            }
            else
            {
                System.out.println("Invalid num");
            }
            if(choice == 0){
                exitFlag = true;
                continue;
            }
            if(choice > shapes.size()){
                System.out.println("Invalid num");
                continue;
            }

            Shape shape = shapes.get(choice-1);
            shape.inputParameters();
            System.out.println("Area of " + shape.getName() + ": " +
                    shape.getArea());
        }
    }

    static void bubbleSort(int arr[]) {
        int j, temp, n = arr.length;
        boolean swapped;
        for (int i = 0; i < n - 1; i++) {
            swapped = false;
            for (j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    swapped = true;
                }
            }
            if (!swapped)
                break;
        }
    }

    static int binarySearch(int[] arr, int key, int left, int right) {
        int index = -1;

        while (left <= right) {
            int mid = (left + right) / 2;
            if (arr[mid] < key) {
                left = mid + 1;
            } else if (arr[mid] > key) {
                right = mid - 1;
            } else if (arr[mid] == key) {
                index = mid;
                break;
            }
        }
        return index;
    }

    static float temperatureConverter(float t, char tempType) {
        float value = -1;
        if (tempType == 'F') {
            value = t * (9f / 5) + 32;
        }
        if (tempType == 'K') {
            value = (float) (t + 273.15);
        }
        return value;
    }

    static void printArray(int arr[]) {
        int i, n = arr.length;
        for (i = 0; i < n; i++)
            System.out.print(arr[i] + " ");
        System.out.println();
    }
}
