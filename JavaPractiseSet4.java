package com.course.GUI;

public class JavaPractiseSet4 {


    // "Write a program in qbasic to print all even numbers from 2 to 100 also print its sum"
//    public static void main(String[] args) {
//        int sum = 0;
//        for (int i = 2; i <= 100; i++) {
//            if (i % 2 == 0) {
//                System.out.println(i);
//                sum += i;
//            }
//        }
//        System.out.println("Sum of even numbers is: " + sum);
//    }




    // "Write a program in qbasic to ask number and find sum of cube of digits"
//    public static void main(String[] args) {
//        int num = 0;
//        int sum = 0;
//        System.out.println("Enter a number: ");
//        num = Integer.parseInt(System.console().readLine());
//
//        while (num != 0) {
//            sum += (num % 10) * (num % 10) * (num % 10);
//            num = num / 10;
//        }
//        System.out.println("Sum of cube of digits is: " + sum);
//    }



    // " Write a program in qbasic to ask number and find sum of odd digits"
//    public static void main(String[] args) {
//        int num = 0;
//        int sum = 0;
//        System.out.println("Enter a number: ");
//        num = Integer.parseInt(System.console().readLine());
//
//        while (num != 0) {
//            if (num % 2 != 0) {
//                sum += num % 10;
//            }
//            num = num / 10;
//        }
//        System.out.println("Sum of odd digits is: " + sum);
//    }



    // "Write a program in qbasic to enter any 10 numbers and find the sum of numbers"
//    public static void main(String[] args) {
//        int num = 0;
//        int sum = 0;
//        System.out.println("Enter 10 numbers: ");
//        for (int i = 0; i < 10; i++) {
//            num = Integer.parseInt(System.console().readLine());
//            sum += num;
//        }
//        System.out.println("Sum of numbers is: " + sum);
//    }





    // "Write a program in qbasic TO ENTER ANY DIGIT AND PRINT CUBE OF ODD DIGITS"
//    public static void main(String[] args) {
//        int num = 0;
//        int sum = 0;
//        System.out.println("Enter a number: ");
//        num = Integer.parseInt(System.console().readLine());
//
//        while (num != 0) {
//            if (num % 2 != 0) {
//                System.out.println(num * num * num);
//                sum += num * num * num;
//            }
//            num = num / 10;
//        }
//        System.out.println("Sum of cube of odd digits is: " + sum);
//    }





    //  "Write a program in qbasic to enter any ten strings and print the longest strings"
//    public static void main(String[] args) {
//        String str = "";
//        String longestStr = "";
//        System.out.println("Enter 10 strings: ");
//        for (int i = 0; i < 10; i++) {
//            str = System.console().readLine();
//            if (str.length() > longestStr.length()) {
//                longestStr = str;
//            }
//        }
//        System.out.println("Longest string is: " + longestStr);
//    }





    // "Write a program in qbasic to generate the series 0,00003,0.0003,0.003,0.03,0.3"



    // "Write a program in qbasic to ask any number and print the prime factorial of a given number"
//    public static void main(String[] args) {
//        int num = 0;
//        int factorial = 1;
//        System.out.println("Enter a number: ");
//        num = Integer.parseInt(System.console().readLine());
//
//        for (int i = 2; i <= num; i++) {
//            if (num % i == 0) {
//                factorial *= i;
//            }
//        }
//        System.out.println("Factorial of " + num + " is: " + factorial);
//    }



    // "Write a program to enter any 10 numbers and display the smallest one."
//    public static void main(String[] args) {
//        int num = 0;
//        int smallestNum = 0;
//        System.out.println("Enter 10 numbers: ");
//        for (int i = 0; i < 10; i++) {
//            num = Integer.parseInt(System.console().readLine());
//            if (num < smallestNum || smallestNum == 0) {
//                smallestNum = num;
//            }
//        }
//        System.out.println("Smallest number is: " + smallestNum);
//    }



    // "Write a program in qbasic to ask any number and check whether the given number is palindrome or not"
//    public static void main(String[] args) {
//        int num = 0;
//        int reverseNum = 0;
//        System.out.println("Enter a number: ");
//        num = Integer.parseInt(System.console().readLine());
//
//        while (num != 0) {
//            reverseNum = (reverseNum * 10) + (num % 10);
//            num = num / 10;
//        }
//        if (reverseNum == num) {
//            System.out.println("Number is palindrome");
//        } else {
//            System.out.println("Number is not palindrome");
//        }
//    }





    // "Write a program in qbasic to ask three sides of a triangle and determine whether a triangle can be formed or not"
//    public static void main(String[] args) {
//        int side1 = 0;
//        int side2 = 0;
//        int side3 = 0;
//        System.out.println("Enter three sides of a triangle: ");
//        side1 = Integer.parseInt(System.console().readLine());
//        side2 = Integer.parseInt(System.console().readLine());
//        side3 = Integer.parseInt(System.console().readLine());
//
//        if (side1 + side2 > side3 && side2 + side3 > side1 && side1 + side3 > side2) {
//            System.out.println("Triangle can be formed");
//        } else {
//            System.out.println("Triangle cannot be formed");
//        }
//    }





    // "Write a program in qbasic to ask three sides of a triangle and determine whether a triangle is equilateral isosceles or scalene triangle or not"
//    public static void main(String[] args) {
//        int side1 = 0;
//        int side2 = 0;
//        int side3 = 0;
//        System.out.println("Enter three sides of a triangle: ");
//        side1 = Integer.parseInt(System.console().readLine());
//        side2 = Integer.parseInt(System.console().readLine());
//        side3 = Integer.parseInt(System.console().readLine());
//
//        if (side1 == side2 && side2 == side3) {
//            System.out.println("Triangle is equilateral");
//        } else if (side1 == side2 || side2 == side3 || side1 == side3) {
//            System.out.println("Triangle is isosceles");
//        } else {
//            System.out.println("Triangle is scalene");
//        }
//    }




    // "Write a program to input any number and display whether it is odd or even."
//    public static void main(String[] args) {
//        int num = 0;
//        System.out.println("Enter a number: ");
//        num = Integer.parseInt(System.console().readLine());
//
//        if (num % 2 == 0) {
//            System.out.println("Number is even");
//
//        }
//        else {
//            System.out.println("Number is odd");
//        }
//
//    }



    // "Write a program to input any number and check whether the given no. is divisible by 5 or not."
//    public static void main(String[] args) {
//        int num = 0;
//        System.out.println("Enter a number: ");
//        num = Integer.parseInt(System.console().readLine());
//
//        if (num % 5 == 0) {
//            System.out.println("Number is divisible by 5");
//        } else {
//            System.out.println("Number is not divisible by 5");
//        }
//    }



    // "Write a program in qbasic to enter any 15 numbers and print only those numbers which are divisible by 5"
//    public static void main(String[] args) {
//        int num = 0;
//        int count = 0;
//        int divisibleBy5 = 0;
//        System.out.println("Enter 15 numbers: ");
//        for (int i = 0; i < 15; i++) {
//            num = Integer.parseInt(System.console().readLine());
//            if (num % 5 == 0) {
//                divisibleBy5 = divisibleBy5 + num;
//                count++;
//            }
//        }
//        System.out.println("Total number of numbers divisible by 5 is: " + count);
//        System.out.println("Sum of numbers divisible by 5 is: " + divisibleBy5);
//    }





    // "Write a program in qbasic to generate the following series 9,28,14,7,22,11…………10th term"
//    public static void main(String[] args) {
//
//    }




    // "Write a program in qbasic to ask number and count total number of odd digits",
//    public static void main(String[] args) {
//        int num = 0;
//        int count = 0;
//        System.out.println("Enter a number: ");
//        num = Integer.parseInt(System.console().readLine());
//
//        while (num != 0) {
//            if (num % 2 != 0) {
//                count++;
//            }
//            num = num / 10;
//        }
//        System.out.println("Total number of odd digits is: " + count);
//    }




    // "Write a program in qbasic to print square root of an ask number"
//    public static void main(String[] args) {
//        int num = 0;
//        System.out.println("Enter a number: ");
//        num = Integer.parseInt(System.console().readLine());
//        double sqrt = Math.sqrt(num);
//        System.out.println("Square root of " + num + " is: " + sqrt);
//    }



}
