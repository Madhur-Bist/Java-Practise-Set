import java.util.Scanner;

public class JavaPractiseSet3 {


    // "Write a program in qbasic to ask string and find whether the first character is a number or uppercase or lowercase"
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter your string");
//        String str = sc.nextLine();
//        char ch = str.charAt(0);
//        if (Character.isDigit(ch)) {
//            System.out.println("First character is a number");
//        } else if (Character.isUpperCase(ch)) {
//            System.out.println("First character is a uppercase");
//        } else if (Character.isLowerCase(ch)) {
//            System.out.println("First character is a lowercase");
//        } else {
//            System.out.println("First character is a special character");
//        }
//    }



    // "Write a program in qbasic to count the frequency of characters R or S present in the supplied string"
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter your string");
//        String str = sc.nextLine();
//        int count = 0;
//        for (int i = 0; i < str.length(); i++) {
//            char ch = str.charAt(i);
//            if (ch == 'R' || ch == 'S') {
//                count++;
//            }
//        }
//        System.out.println("The frequency of R or S is " + count);
//    }



    // "Write a program to input any number and check whether the given no. is divisible by 3 and 7 or not."
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter your number");
//        int num = sc.nextInt();
//        if (num % 3 == 0 && num % 7 == 0) {
//            System.out.println("The number is divisible by 3 and 7");
//        } else {
//            System.out.println("The number is not divisible by 3 and 7");
//        }
//    }



    // "Write a program in qbasic to ask any string and count total no. of sentences"
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter your string");
//        String str = sc.nextLine();
//        int count = 0;
//        for (int i = 0; i < str.length(); i++) {
//            char ch = str.charAt(i);
//            if (ch == '.' || ch == '!' || ch == '?') {
//                count++;
//            }
//        }
//        System.out.println("The total no. of sentences is " + count);
//    }



    // "Write a program in qbasic TO PRINT MULTIPLICATION TABLE OF A GIVEN NUMBER"
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter your number");
//        int num = sc.nextInt();
//        for (int i = 1; i <= 10; i++) {
//            System.out.println(num + " * " + i + " = " + num * i);
//        }
//    }


    // "Write a program in qbasic using to print first 19 even numbers"
//    public static void main(String[] args) {
//        for (int i = 0; i <= 19; i++) {
//            if (i % 2 == 0) {
//                System.out.println(i);
//            }
//        }
//    }



    // "Write a program in qbasic to print all even numbers from 2 to 100 in descending order"
//    public static void main(String[] args) {
//        for (int i = 100; i >= 2; i--) {
//            if (i % 2 == 0) {
//                System.out.println(i);
//            }
//        }
//    }



    // "Write a program in qbasic to generate the following series
    // 11111
    // 1111
    // 111
    // 11
    // 1

//    public static void main(String[] args) {
//        for (int i = 1; i <= 5; i++) {
//            for (int j = 1; j <= i; j++) {
//                System.out.print("1");
//            }
//            System.out.println();
//        }
//    }



    // "Write a program to input any number and check whether the given no. is positive or negative."
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter your number");
//        int num = sc.nextInt();
//        if (num > 0) {
//            System.out.println("The number is positive");
//        } else {
//            System.out.println("The number is negative");
//        }
//    }



    // "Write a program in qbasic TO ENTER ANY DIGIT AND PRINT SQUARE OF EVEN DIGITS"
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter your number");
//        int num = sc.nextInt();
//        if (num % 2 == 0) {
//            System.out.println("The square of the number is " + num * num);
//        } else {
//            System.out.println("The number is not even");
//        }
//    }



    // "Write a program in qbasic to print sum of square of any three ask numbers"
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter your number");
//        int num1 = sc.nextInt();
//        System.out.println("Enter your number");
//        int num2 = sc.nextInt();
//        System.out.println("Enter your number");
//        int num3 = sc.nextInt();
//        int sum = (num1 * num1) + (num2 * num2) + (num3 * num3);
//        System.out.println("The sum of square of three numbers is " + sum);
//    }



    // "Write a program in qbasic to ask any string and check whether the given string is palindrome or not"
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter your string");
//        String str = sc.nextLine();
//        String rev = "";
//        for (int i = str.length() - 1; i >= 0; i--) {
//            rev = rev + str.charAt(i);
//        }
//        if (str.equals(rev)) {
//            System.out.println("The string is palindrome");
//        } else {
//            System.out.println("The string is not palindrome");
//        }
//    }




    // "Write a program to input a year and display whether that year is a leap year or not."
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter your year");
//        int year = sc.nextInt();
//        if (year % 4 == 0) {
//            if (year % 100 == 0) {
//                if (year % 400 == 0) {
//                    System.out.println("The year is leap year");
//                } else {
//                    System.out.println("The year is not leap year");
//                }
//            } else {
//                System.out.println("The year is leap year");
//            }
//        } else {
//            System.out.println("The year is not leap year");
//        }
//    }




    // "Write a program in qbasic to print all natural numbers from 1 to 100 also print its sum"
//    public static void main(String[] args) {
//        int sum = 0;
//        for (int i = 1; i <= 100; i++) {
//            System.out.println(i);
//            sum = sum + i;
//        }
//        System.out.println("The sum of all natural numbers is " + sum);
//    }



    // "Write a program in qbasic to convert hexadecimal number to decimal number"
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter your hexadecimal number");
//        String hex = sc.nextLine();
//        int dec = 0;
//        for (int i = 0; i < hex.length(); i++) {
//            char ch = hex.charAt(i);
//            if (ch == 'A') {
//                dec = dec + 10 * (int) Math.pow(16, hex.length() - 1 - i);
//            } else if (ch == 'B') {
//                dec = dec + 11 * (int) Math.pow(16, hex.length() - 1 - i);
//            } else if (ch == 'C') {
//                dec = dec + 12 * (int) Math.pow(16, hex.length() - 1 - i);
//            } else if (ch == 'D') {
//                dec = dec + 13 * (int) Math.pow(16, hex.length() - 1 - i);
//            } else if (ch == 'E') {
//                dec = dec + 14 * (int) Math.pow(16, hex.length() - 1 - i);
//            } else if (ch == 'F') {
//                dec = dec + 15 * (int) Math.pow(16, hex.length() - 1 - i);
//            } else {
//                dec = dec + (int) ch * (int) Math.pow(16, hex.length() - 1 - i);
//            }
//        }
//        System.out.println("The decimal number is " + dec);
//    }




    // "Write a program to input the age of a person and find out whether the person is eligible to drive or not."
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter your age");
//        int age = sc.nextInt();
//        if (age >= 18) {
//            System.out.println("You are eligible to drive");
//        } else {
//            System.out.println("You are not eligible to drive");
//        }
//    }




    // "Write a program to enter any 20 numbers and display the greatest one using array."
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter your 20 numbers");
//        int[] num = new int[20];
//        for (int i = 0; i < 20; i++) {
//            num[i] = sc.nextInt();
//        }
//        int max = num[0];
//        for (int i = 0; i < 20; i++) {
//            if (num[i] > max) {
//                max = num[i];
//            }
//        }
//        System.out.println("The greatest number is " + max);
//    }



    // "Write a program in qbasic TO PRINT L.C.M OF A GIVEN ANY TWO NUMBERS"
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter two numbers");
//        int num1 = sc.nextInt();
//        int num2 = sc.nextInt();
//        int lcm = 0;
//        for (int i = 1; i <= num1 && i <= num2; i++) {
//            if (num1 % i == 0 && num2 % i == 0) {
//                lcm = i;
//            }
//        }
//        System.out.println("The least common multiple is " + lcm);
//    }




    // "Write a program in qbasic to enter any 10 numbers and find the sum of even numbers"
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter your 10 numbers");
//        int[] num = new int[10];
//        for (int i = 0; i < 10; i++) {
//            num[i] = sc.nextInt();
//        }
//        int sum = 0;
//        for (int i = 0; i < 10; i++) {
//            if (num[i] % 2 == 0) {
//                sum = sum + num[i];
//            }
//        }
//        System.out.println("The sum of even numbers is " + sum);
//    }



    // "Write a program to divide a number by another number and find the quotient and remainder."
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter your two numbers");
//        int num1 = sc.nextInt();
//        int num2 = sc.nextInt();
//        int quotient = num1 / num2;
//        int remainder = num1 % num2;
//        System.out.println("The quotient is " + quotient);
//        System.out.println("The remainder is " + remainder);
//    }




    // "Write a program in qbasic using to print the sum of first ten positive integers"
//    public static void main(String[] args) {
//        int sum = 0;
//        for (int i = 1; i <= 10; i++) {
//            sum = sum + i;
//        }
//        System.out.println("The sum of first ten positive integers is " + sum);
//    }



    // "Write a program in qbasic to print cube root of an ask number"
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter your number");
//        int num = sc.nextInt();
//        int cube = (int) Math.pow(num, 1 / 3);
//        System.out.println("The cube root of " + num + " is " + cube);
//    }



    // "Write a program in qbasic to convert octal number to decimal number"
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter your octal number");
//        int oct = sc.nextInt();
//        int dec = 0;
//        int i = 0;
//        while (oct != 0) {
//            int rem = oct % 10;
//            dec = dec + rem * (int) Math.pow(8, i);
//            i++;
//            oct = oct / 10;
//        }
//        System.out.println("The decimal number is " + dec);
//    }




    // "Write a program in qbasic to ask number and check whether the given no is prime or not"
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter your number");
//        int num = sc.nextInt();
//        int flag = 0;
//        for (int i = 2; i <= num / 2; i++) {
//            if (num % i == 0) {
//                flag = 1;
//                break;
//            }
//        }
//        if (flag == 0) {
//            System.out.println("The number is prime");
//        } else {
//            System.out.println("The number is not prime");
//        }
//    }




    // "Write a program in qbasic to convert decimal number to binary number"
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter your decimal number");
//        int dec = sc.nextInt();
//        int bin = 0;
//        int i = 0;
//        while (dec != 0) {
//            int rem = dec % 2;
//            bin = bin + rem * (int) Math.pow(10, i);
//            i++;
//            dec = dec / 2;
//        }
//        System.out.println("The binary number is " + bin);
//    }



    // " Write a program in qbasic to print all palindrome numbers from 1 to 200"
//    public static void main(String[] args) {
//        for (int i = 1; i <= 200; i++) {
//            String str = String.valueOf(i);
//            String rev = "";
//            for (int j = str.length() - 1; j >= 0; j--) {
//                rev = rev + str.charAt(j);
//            }
//            if (str.equals(rev)) {
//                System.out.println(str);
//            }
//        }
//    }





    // "Write a program to enter any three numbers and display the middle number."
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter three numbers");
//        int num1 = sc.nextInt();
//        int num2 = sc.nextInt();
//        int num3 = sc.nextInt();
//        if (num1 > num2 && num1 > num3) {
//            if (num2 > num3) {
//                System.out.println("The middle number is " + num2);
//            } else {
//                System.out.println("The middle number is " + num3);
//            }
//        } else if (num2 > num1 && num2 > num3) {
//            if (num1 > num3) {
//                System.out.println("The middle number is " + num1);
//            } else {
//                System.out.println("The middle number is " + num3);
//            }
//        } else if (num3 > num1 && num3 > num2) {
//            if (num1 > num2) {
//                System.out.println("The middle number is " + num1);
//            } else {
//                System.out.println("The middle number is " + num2);
//            }
//        }
//    }




    // "Write a program to solve a quadratic equation ax2+bx+c=0 on the basis of the coefficient values a, b, and c."
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter a, b, and c");
//        int a = sc.nextInt();
//        int b = sc.nextInt();
//        int c = sc.nextInt();
//        double d = Math.pow(b, 2) - 4 * a * c;
//        if (d < 0) {
//            System.out.println("The equation has no real roots");
//        } else if (d == 0) {
//            double x = -b / (2 * a);
//            System.out.println("The equation has one real root " + x);
//        } else {
//            double x1 = (-b + Math.sqrt(d)) / (2 * a);
//            double x2 = (-b - Math.sqrt(d)) / (2 * a);
//            System.out.println("The equation has two real roots " + x1 + " and " + x2);
//        }
//    }


    // "Write a program in qbasic to ask any string and print only consonant by removing vowels"
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter any string");
//        String str = sc.nextLine();
//        String str1 = "";
//        for (int i = 0; i < str.length(); i++) {
//            if (str.charAt(i) == 'a' || str.charAt(i) == 'e' || str.charAt(i) == 'i' || str.charAt(i) == 'o' || str.charAt(i) == 'u') {
//                str1 = str1 + str.charAt(i);
//            }
//        }
//        System.out.println("The consonant string is " + str1);
//    }






    // "Write a program in qbasic to ask number and count total number of digits"
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter any number");
//        int num = sc.nextInt();
//        int count = 0;
//        while (num != 0) {
//            num = num / 10;
//            count++;
//        }
//        System.out.println("The total number of digits is " + count);
//    }



    // "Write a program in qbasic to find the sum of all even numbers from 2 to 100"
//    public static void main(String[] args) {
//        int sum = 0;
//        for (int i = 2; i <= 100; i++) {
//            if (i % 2 == 0) {
//                sum = sum + i;
//            }
//        }
//        System.out.println("The sum of all even numbers from 2 to 100 is " + sum);
//    }




    // "Write a program to convert  Nepalese currency into Indian currency."
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter the amount in Nepalese currency");
//        double amount = sc.nextDouble();
//        double rate = 0.01;
//        double indian = amount * rate;
//        System.out.println("The amount in Indian currency is " + indian);
//    }


    // "Write a program to check whether the input number is divisible by 4 and  6  or not."
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter the number");
//        int num = sc.nextInt();
//        if (num % 4 == 0 && num % 6 == 0) {
//            System.out.println("The number is divisible by 4 and 6");
//        } else {
//            System.out.println("The number is not divisible by 4 and 6");
//        }
//    }

    


    // "Write a program to input monthly income in to compute annual tax to be paid. The tax rate is 15% if annual income is above Rs. 500000, otherwise tax rate is 10%."
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter the monthly income");
//        double income = sc.nextDouble();
//        double tax = 0;
//        if (income > 500000) {
//            tax = income * 0.15;
//        } else {
//            tax = income * 0.10;
//        }
//        System.out.println("The annual tax is " + tax);
//    }







}
