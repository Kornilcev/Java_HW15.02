package lesson8;

import java.util.Arrays;

public class HW8 {
    public static void main(String[] args) {
        int[] a = new int[]{1, 5, 7, 4, -2};
        System.out.println(getSmaller(a));
        System.out.println(getSecondLargest(a));
        Student[] group = {
                new Student("Alex Sergeev", 20),
                new Student("Nina Elizarova", 19),
                new Student("Max Kotkov", 18),
                new Student("Olga Petrova", 22)
        };
        printStu(group);
        int[] b = new int[]{2, 1, 6, 9};
        System.out.println(getSum(b));
        System.out.println(Arrays.toString((group)));
    }

    public static int getSmaller(int a[]) {
        int min = a[0];
        for (int i = 0; i < a.length; i++) {

            if (a[i] < min) {
                min = a[i];
            }
        }
        return min;
    }

    public static int getSum(int a[]) {
        int min = a[0];
        int max = a[0];

        for (int i = 0; i < a.length; i++) {
            if (a[i] < min) {
                min = a[i];
            } else {
                if (a[i] > max) {
                    max = a[i];
                }


            }

        }
        return max + min;
    }

    public static int getSecondLargest(int a[]) {
        Arrays.sort(a);
        return a[a.length - 2];
    }

    public static void printStu(Student[] s) {
        for (int i = 0; i < s.length; i++) {
            System.out.println(s[i].getName());
        }
    }

    public static void studentBubbleSort(Student [] a) {
        for (int i = 0; i < a.length; i++) {
            for(int j = 1; j < a.length - i; j++) {
                if(a[j-1].getAge() > a[j].getAge()) {
                    Student temp = a[j-1];
                    a[j-1] = a[j];
                    a[j] = temp;
                }
            }
        }
    }
}



















