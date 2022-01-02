import java.util.Scanner;

public class JavaPractiseSet2 {


    // "Write a program in qbasic to enter any ten strings and print the shortest string",
//    public static void main(String[] args) {
//        String[] str = new String[10];
//        int min = 0;
//        int max = 0;
//        for (int i = 0; i < str.length; i++) {
//            System.out.println("Enter string " + (i + 1));
//            str[i] = MyScanner.nextLine();
//        }
//        for (int i = 0; i < str.length; i++) {
//            if (str[i].length() < str[min].length()) {
//                min = i;
//            }
//            if (str[i].length() > str[max].length()) {
//                max = i;
//            }
//        }
//        System.out.println("Shortest string is " + str[min]);
//        System.out.println("Longest string is " + str[max]);
//    }


    // "Write a program to enter any two numbers and display the greater one.",
//    public static void main(String[] args) {
//        int num1 = 0;
//        int num2 = 0;
//        System.out.println("Enter first number");
//        num1 = MyScanner.nextInt();
//        System.out.println("Enter second number");
//        num2 = MyScanner.nextInt();
//        if (num1 > num2) {
//            System.out.println("Greater number is " + num1);
//        } else {
//            System.out.println("Greater number is " + num2);
//        }
//    }


    // " Write a program in qbasic to enter any 15 numbers and print only those numbers which are divisible by 5 and 7",
//    public static void main(String[] args) {
//        int[] num = new int[15];
//        for (int i = 0; i < num.length; i++) {
//            System.out.println("Enter number " + (i + 1));
//            Scanner MyScanner = new Scanner(System.in);
//            num[i] = MyScanner.nextInt();
//        }
//        for (int i = 0; i < num.length; i++) {
//            if (num[i] % 5 == 0 && num[i] % 7 == 0) {
//                System.out.println(num[i]);
//            }
//        }
//    }


    // "Write a program in qbasic to generate the following series 1,23,456,78910",


    // "Write a program in qbasic to ask number and check whether the given no is prime or composite",
//    public static void main(String[] args) {
//        int num = 0;
//        System.out.println("Enter number");
//        Scanner MyScanner = new Scanner(System.in);
//        num = MyScanner.nextInt();
//        int count = 0;
//        for (int i = 1; i <= num; i++) {
//            if (num % i == 0) {
//                count++;
//            }
//        }
//        if (count == 2) {
//            System.out.println("Number is prime");
//        } else {
//            System.out.println("Number is composite");
//        }
//    }


    // "Write a program in qbasic to convert binary number to decimal number",
//    public static void main(String[] args) {
//        int num = 0;
//        System.out.println("Enter binary number");
//        Scanner MyScanner = new Scanner(System.in);
//        num = MyScanner.nextInt();
//        int dec = 0;
//        int i = 0;
//        while (num != 0) {
//            int rem = num % 10;
//            dec = (int) (dec + rem * Math.pow(2, i));
//            i++;
//            num = num / 10;
//        }
//        System.out.println("Decimal number is " + dec);
//    }


    // "Write a program in qbasic to ask any number and check whether the given number is Armstrong or not"
//    public static void main(String[] args) {
//        int num = 0;
//        System.out.println("Enter number");
//        Scanner MyScanner = new Scanner(System.in);
//        num = MyScanner.nextInt();
//        int sum = 0;
//        int temp = num;
//        while (num != 0) {
//            int rem = num % 10;
//            sum = sum + (rem * rem * rem);
//            num = num / 10;
//        }
//        if (temp == sum) {
//            System.out.println("Number is Armstrong");
//        } else {
//            System.out.println("Number is not Armstrong");
//        }
//    }


    // "Write a program in qbasic to print first ten multiples of ask number"
//    public static void main(String[] args) {
//        int num = 0;
//        System.out.println("Enter number");
//        Scanner MyScanner = new Scanner(System.in);
//        num = MyScanner.nextInt();
//        for (int i = 1; i <= 10; i++) {
//            System.out.println(num * i);
//        }
//    }


    // "Write a program in qbasic to ask three sides of a triangle and determine whether a triangle is right angled triangle or not"
//    public static void main(String[] args) {
//        int a = 0;
//        int b = 0;
//        int c = 0;
//        System.out.println("Enter first side");
//        Scanner MyScanner = new Scanner(System.in);
//        a = MyScanner.nextInt();
//        System.out.println("Enter second side");
//        b = MyScanner.nextInt();
//        System.out.println("Enter third side");
//        c = MyScanner.nextInt();
//        if (a * a + b * b == c * c) {
//            System.out.println("Triangle is right angled");
//        } else {
//            System.out.println("Triangle is not right angled");
//        }
//    }


    // "Write a program in qbasic TO CHECK WHETHER THE ASK NUMBER IS PERFECT NUMBER OR NOT"
//    public static void main(String[] args) {
//        int num = 0;
//        System.out.println("Enter number");
//        Scanner MyScanner = new Scanner(System.in);
//        num = MyScanner.nextInt();
//        int sum = 0;
//        for (int i = 1; i < num; i++) {
//            if (num % i == 0) {
//                sum = sum + i;
//            }
//        }
//        if (sum == num) {
//            System.out.println("Number is perfect");
//        } else {
//            System.out.println("Number is not perfect");
//        }
//    }


    // "Write a program in qbasic to print the sum of the numbers between 2 to 50"
//    public static void main(String[] args) {
//        int sum = 0;
//        for (int i = 2; i <= 50; i++) {
//            sum = sum + i;
//        }
//        System.out.println("Sum is " + sum);
//    }


    // "Write a program in qbasic to generate the following numeric pattern 1,12,123,1234,12345"
//    public static void main(String[] args) {
//        for (int i = 1; i <= 5; i++) {
//            for (int j = 1; j <= i; j++) {
//                System.out.print(j);
//            }
//            System.out.println();
//        }
//    }


    // "Write a program in qbasic to check whether the supplied character is alphabet or not"
//    public static void main(String[] args) {
//        char ch = ' ';
//        System.out.println("Enter character");
//        Scanner MyScanner = new Scanner(System.in);
//        ch = MyScanner.next().charAt(0);
//        if (ch >= 'a' && ch <= 'z') {
//            System.out.println("Character is alphabet");
//        } else if (ch >= 'A' && ch <= 'Z') {
//            System.out.println("Character is alphabet");
//        } else {
//            System.out.println("Character is not alphabet");
//        }
//    }


    // "Write a program to input any number and check whether the given no. is positive, negative or zero. "
//    public static void main(String[] args) {
//        int num = 0;
//        System.out.println("Enter number");
//        Scanner MyScanner = new Scanner(System.in);
//        num = MyScanner.nextInt();
//        if (num > 0) {
//            System.out.println("Number is positive");
//        } else if (num < 0) {
//            System.out.println("Number is negative");
//        } else {
//            System.out.println("Number is zero");
//        }
//    }


    // "Write a program in qbasic to generate the following series
    // 55555,4444,333,22,1"


    // "Write a program in qbasic to print all odd numbers from 1 to 100 in descending order"
//    public static void main(String[] args) {
//        for (int i = 100; i >= 1; i--) {
//            if (i % 2 != 0) {
//                System.out.println(i);
//            }
//        }
//    }


    // "Write a program to enter any two numbers and display the smaller one."
//    public static void main(String[] args) {
//        int num1 = 0;
//        int num2 = 0;
//        System.out.println("Enter first number");
//        Scanner MyScanner = new Scanner(System.in);
//        num1 = MyScanner.nextInt();
//        System.out.println("Enter second number");
//        num2 = MyScanner.nextInt();
//        if (num1 > num2) {
//            System.out.println("Smaller number is " + num2);
//        } else if (num1 < num2) {
//            System.out.println("Smaller number is " + num1);
//        } else {
//            System.out.println("Both numbers are equal");
//        }
//    }


    // "Write a program in qbasic to print numbers 1,3,5……..30"
//    public static void main(String[] args) {
//        for (int i = 1; i <= 30; i++) {
//            if (i % 2 != 0) {
//                System.out.println(i);
//            }
//        }
//    }


    // "Write a program to input the age of a person and find out whether the person is eligible to vote or not."
//    public static void main(String[] args) {
//        int age = 0;
//        System.out.println("Enter age");
//        Scanner MyScanner = new Scanner(System.in);
//        age = MyScanner.nextInt();
//        if (age >= 18) {
//            System.out.println("Person is eligible to vote");
//        } else {
//            System.out.println("Person is not eligible to vote");
//        }
//    }


    // "Write a program in qbasic to print the sum of even numbers between 2 to 50"
//    public static void main(String[] args) {
//        int sum = 0;
//        for (int i = 2; i <= 50; i++) {
//            if (i % 2 == 0) {
//                sum = sum + i;
//            }
//        }
//        System.out.println("Sum is " + sum);
//    }


    // "Write a program in qbasic using to print product of all numbers from 4 to 8"
//    public static void main(String[] args) {
//        int product = 1;
//        for (int i = 4; i <= 8; i++) {
//            product = product * i;
//        }
//        System.out.println("Product is " + product);
//    }


    // "Write a program in qbasic to print the series 2,8,18,32…..upto 10th term"


    // "Write a program in qbasic to generate the following series 5,54,543,5432,54321"


    // "Write a program in qbasic to ask number and find sum square of digits"
//    public static void main(String[] args) {
//        int num = 0;
//        int sum = 0;
//        System.out.println("Enter number");
//        Scanner MyScanner = new Scanner(System.in);
//        num = MyScanner.nextInt();
//        while (num != 0) {
//            sum = sum + (num % 10) * (num % 10);
//            num = num / 10;
//        }
//        System.out.println("Sum of square of digits is " + sum);
//    }


    // "Write a program in qbasic to ask any string and count total no. of words"
//    public static void main(String[] args) {
//        String str = "";
//        int count = 0;
//        System.out.println("Enter string");
//        Scanner MyScanner = new Scanner(System.in);
//        str = MyScanner.nextLine();
//        String[] strArr = str.split(" ");
//        count = strArr.length;
//        System.out.println("Total number of words is " + count);
//    }


    // "Write a program in qbasic to ask any string and count total no. of vowels"
//    public static void main(String[] args) {
//        String str = "";
//        int count = 0;
//        System.out.println("Enter string");
//        Scanner MyScanner = new Scanner(System.in);
//        str = MyScanner.nextLine();
//        String[] strArr = str.split("");
//        for (int i = 0; i < strArr.length; i++) {
//            if (strArr[i].equals("a") || strArr[i].equals("e") || strArr[i].equals("i") || strArr[i].equals("o") || strArr[i].equals("u")) {
//                count++;
//            }
//        }
//        System.out.println("Total number of vowels is " + count);
//    }


    // "Write a program in qbasic TO PRINT H.C.F AND L.C.M OF ANY TWO Given NUMBERS by user"
//    public static void main(String[] args) {
//        int num1 = 0;
//        int num2 = 0;
//        int hcf = 0;
//        int lcm = 0;
//        System.out.println("Enter first number");
//        Scanner MyScanner = new Scanner(System.in);
//        num1 = MyScanner.nextInt();
//        System.out.println("Enter second number");
//        num2 = MyScanner.nextInt();
//        if (num1 > num2) {
//            hcf = num1;
//            lcm = num1 * num2;
//        } else {
//            hcf = num2;
//            lcm = num1 * num2;
//        }
//        while (hcf != 0) {
//            if (num1 % hcf == 0 && num2 % hcf == 0) {
//                break;
//            }
//            hcf--;
//        }
//        System.out.println("HCF is " + hcf);
//        System.out.println("LCM is " + lcm);
//    }


    // "Write a program in qbasic to generate the series 3,10,5,16………………11th term"


    // "Write a program in qbasic to print the following series 9,7,5,...1"


    // "Write a program in qbasic to convert decimal number to hexadecimal number"
//    public static void main(String[] args) {
//        int num = 0;
//        System.out.println("Enter number");
//        Scanner MyScanner = new Scanner(System.in);
//        num = MyScanner.nextInt();
//        String hex = "";
//        while (num != 0) {
//            int rem = num % 16;
//            if (rem < 10) {
//                hex = rem + hex;
//            } else {
//                switch (rem) {
//                    case 10:
//                        hex = "A" + hex;
//                        break;
//                    case 11:
//                        hex = "B" + hex;
//                        break;
//                    case 12:
//                        hex = "C" + hex;
//                        break;
//                    case 13:
//                        hex = "D" + hex;
//                        break;
//                    case 14:
//                        hex = "E" + hex;
//                        break;
//                    case 15:
//                        hex = "F" + hex;
//                        break;
//                }
//            }
//            num = num / 16;
//        }
//        System.out.println("Hexadecimal number is " + hex);
//    }


    // "Write a program in qbasic to ask any number and print the prime factors"
//    public static void main(String[] args) {
//        int num = 0;
//        System.out.println("Enter number");
//        Scanner MyScanner = new Scanner(System.in);
//        num = MyScanner.nextInt();
//        for (int i = 2; i <= num; i++) {
//            if (num % i == 0) {
//                System.out.println(i);
//            }
//        }
//    }


    // "Write a program in qbasic TO PRINT H.C.F OF A GIVEN ANY TWO NUMBERS"
//    public static void main(String[] args) {
//        int num1 = 0;
//        int num2 = 0;
//        int hcf = 0;
//        System.out.println("Enter first number");
//        Scanner MyScanner = new Scanner(System.in);
//        num1 = MyScanner.nextInt();
//        System.out.println("Enter second number");
//        num2 = MyScanner.nextInt();
//        if (num1 > num2) {
//            hcf = num1;
//        } else {
//            hcf = num2;
//        }
//        while (hcf != 0) {
//            if (num1 % hcf == 0 && num2 % hcf == 0) {
//                break;
//            }
//            hcf--;
//        }
//        System.out.println("HCF is " + hcf);
//    }


    // "Write a program in qbasic to print all odd numbers from 1 to 100"
//    public static void main(String[] args) {
//        for (int i = 1; i <= 100; i++) {
//            if (i % 2 != 0) {
//                System.out.println(i);
//            }
//        }
//    }


    // " Write a program in qbasic to generate the series 1,22,333,4444,55555"
//    public static void main(String[] args) {
//        int num = 0;
//        System.out.println("Enter number");
//        Scanner MyScanner = new Scanner(System.in);
//        num = MyScanner.nextInt();
//        for (int i = 1; i <= num; i++) {
//            for (int j = 1; j <= i; j++) {
//                System.out.print(i);
//            }
//            System.out.println();
//        }
//    }


    // "Write a program in qbasic TO ENTER ANY DIGIT AND PRINT ITS REVERSED FORM"
//    public static void main(String[] args) {
//        int num = 0;
//        System.out.println("Enter number");
//        Scanner MyScanner = new Scanner(System.in);
//        num = MyScanner.nextInt();
//        int rev = 0;
//        while (num != 0) {
//            int rem = num % 10;
//            rev = rev * 10 + rem;
//            num = num / 10;
//        }
//        System.out.println("Reversed number is " + rev);
//    }


    // "Write a program to enter any three numbers and display the smallest one."
//    public static void main(String[] args) {
//        int num1 = 0;
//        int num2 = 0;
//        int num3 = 0;
//        System.out.println("Enter first number");
//        Scanner MyScanner = new Scanner(System.in);
//        num1 = MyScanner.nextInt();
//        System.out.println("Enter second number");
//        num2 = MyScanner.nextInt();
//        System.out.println("Enter third number");
//        num3 = MyScanner.nextInt();
//        if (num1 < num2 && num1 < num3) {
//            System.out.println("Smallest number is " + num1);
//        } else if (num2 < num1 && num2 < num3) {
//            System.out.println("Smallest number is " + num2);
//        } else {
//            System.out.println("Smallest number is " + num3);
//        }
//    }


    // "Write a program in qbasic to print the sum of square of odd numbers up to 100"
//    public static void main(String[] args) {
//        int sum = 0;
//        for (int i = 1; i <= 100; i++) {
//            if (i % 2 != 0) {
//                sum = sum + i * i;
//            }
//        }
//        System.out.println("Sum of square of odd numbers is " + sum);
//    }


    // "Write a program in qbasic to print the sum of cube of even numbers between 2 to 50"
//    public static void main(String[] args) {
//        int sum = 0;
//        for (int i = 2; i <= 50; i++) {
//            if (i % 2 == 0) {
//                sum = sum + i * i * i;
//            }
//        }
//        System.out.println("Sum of cube of even numbers is " + sum);
//    }


    // "Write a program to input a mark in a subject of a student and check if the student is pass or nor."
//    public static void main(String[] args) {
//        int mark = 0;
//        System.out.println("Enter mark");
//        Scanner MyScanner = new Scanner(System.in);
//        mark = MyScanner.nextInt();
//        if (mark >= 35) {
//            System.out.println("Pass");
//        } else {
//            System.out.println("Fail");
//        }
//    }


    // "Write a program in qbasic to ask number and find product of digits"
//    public static void main(String[] args) {
//        int num = 0;
//        System.out.println("Enter number");
//        Scanner MyScanner = new Scanner(System.in);
//        num = MyScanner.nextInt();
//        int prod = 1;
//        while (num != 0) {
//            int rem = num % 10;
//            prod = prod * rem;
//            num = num / 10;
//        }
//        System.out.println("Product of digits is " + prod);
//    }


    // "Write a program in qbasic using to print first 13 odd numbers"
//    public static void main(String[] args) {
//        for (int i = 1; i <= 25; i++) {
//            if (i % 2 != 0) {
//                System.out.println(i);
//            }
//        }
//    }


    // "Write a program in qbasic to ask any number and find sum of factors"
//    public static void main(String[] args) {
//        int num = 0;
//        System.out.println("Enter number");
//        Scanner MyScanner = new Scanner(System.in);
//        num = MyScanner.nextInt();
//        int sum = 0;
//        for (int i = 1; i <= num; i++) {
//            if (num % i == 0) {
//                sum = sum + i;
//            }
//        }
//        System.out.println("Sum of factors is " + sum);
//    }


    // "Write a program in qbasic to enter any ten strings and sort in descending order"
//    public static void main(String[] args) {
//        String[] str = new String[10];
//        System.out.println("Enter 10 strings");
//        Scanner MyScanner = new Scanner(System.in);
//        for (int i = 0; i < 10; i++) {
//            str[i] = MyScanner.nextLine();
//        }
//        for (int i = 0; i < 10; i++) {
//            for (int j = i + 1; j < 10; j++) {
//                if (str[i].compareTo(str[j]) < 0) {
//                    String temp = str[i];
//                    str[i] = str[j];
//                    str[j] = temp;
//                }
//            }
//        }
//        for (int i = 0; i < 10; i++) {
//            System.out.println(str[i]);
//        }
//    }


    // "Write a program in qbasic to ask any number and print the factorial of a given number"
//    public static void main(String[] args) {
//        int num = 0;
//        System.out.println("Enter number");
//        Scanner MyScanner = new Scanner(System.in);
//        num = MyScanner.nextInt();
//        int fact = 1;
//        for (int i = 1; i <= num; i++) {
//            fact = fact * i;
//        }
//        System.out.println("Factorial of " + num + " is " + fact);
//    }


    // "Write a program in qbasic to print square of all numbers from 1 to 50"
//    public static void main(String[] args) {
//        for (int i = 1; i <= 50; i++) {
//            System.out.println(i * i);
//        }
//    }


    // " Write a program in qbasic to print all prime numbers from 1 to 100"
//    public static void main(String[] args) {
//        for (int i = 2; i <= 100; i++) {
//            int count = 0;
//            for (int j = 2; j <= i; j++) {
//                if (i % j == 0) {
//                    count++;
//                }
//            }
//            if (count == 1) {
//                System.out.println(i);
//            }
//        }
//    }


    // "Write a program in qbasic to ask number and find sum of square of even digits"
//    public static void main(String[] args) {
//        int num = 0;
//        System.out.println("Enter number");
//        Scanner MyScanner = new Scanner(System.in);
//        num = MyScanner.nextInt();
//        int sum = 0;
//        while (num != 0) {
//            int rem = num % 10;
//            if (rem % 2 == 0) {
//                sum = sum + (rem * rem);
//            }
//            num = num / 10;
//        }
//        System.out.println("Sum of square of even digits is " + sum);
//    }


    // " Write a program in qbasic to ask number and find sum of square of odd digits"
//    public static void main(String[] args) {
//        int num = 0;
//        System.out.println("Enter number");
//        Scanner MyScanner = new Scanner(System.in);
//        num = MyScanner.nextInt();
//        int sum = 0;
//        while (num != 0) {
//            int rem = num % 10;
//            if (rem % 2 != 0) {
//                sum = sum + (rem * rem);
//            }
//            num = num / 10;
//        }
//        System.out.println("Sum of square of odd digits is " + sum);
//    }


    // "Write a program in qbasic to ask number and find product of even digits"
//    public static void main(String[] args) {
//        int num = 0;
//        System.out.println("Enter number");
//        Scanner MyScanner = new Scanner(System.in);
//        num = MyScanner.nextInt();
//        int prod = 1;
//        while (num != 0) {
//            int rem = num % 10;
//            if (rem % 2 == 0) {
//                prod = prod * rem;
//            }
//            num = num / 10;
//        }
//        System.out.println("Product of even digits is " + prod);
//    }


    // "Write a program in qbasic TO CHECK WHETHER THE ASK NUMBER IS PERFECT SQUARE NUMBER OR NOT"
//    public static void main(String[] args) {
//        int num = 0;
//        System.out.println("Enter number");
//        Scanner MyScanner = new Scanner(System.in);
//        num = MyScanner.nextInt();
//        int sq = 0;
//        for (int i = 1; i <= num; i++) {
//            if (num % i == 0) {
//                sq = sq + i;
//            }
//        }
//        if (sq == num) {
//            System.out.println("Number is perfect square number");
//        } else {
//            System.out.println("Number is not perfect square number");
//        }
//    }


    // "Write a program to input sales amount and rate of commission then calculate commission and return net sales. [ns=sa-c)"
//    public static void main(String[] args) {
//        double sales = 0;
//        double rate = 0;
//        double commission = 0;
//        double netSales = 0;
//        System.out.println("Enter sales amount");
//        Scanner MyScanner = new Scanner(System.in);
//        sales = MyScanner.nextDouble();
//        System.out.println("Enter rate of commission");
//        rate = MyScanner.nextDouble();
//        commission = sales * rate / 100;
//        netSales = sales - commission;
//        System.out.println("Commission is " + commission);
//        System.out.println("Net sales is " + netSales);
//    }


    // "Write a program in qbasic to print all odd numbers from 1 to 100 also print its sum"
//    public static void main(String[] args) {
//        int sum = 0;
//        for (int i = 1; i <= 100; i++) {
//            if (i % 2 != 0) {
//                System.out.println(i);
//                sum = sum + i;
//            }
//        }
//        System.out.println("Sum of odd numbers is " + sum);
//    }


    // "Write a program in qbasic to enter any three strings and print the longest one"
//    public static void main(String[] args) {
//        String str1 = "";
//        String str2 = "";
//        String str3 = "";
//        System.out.println("Enter string 1");
//        Scanner MyScanner = new Scanner(System.in);
//        str1 = MyScanner.nextLine();
//        System.out.println("Enter string 2");
//        str2 = MyScanner.nextLine();
//        System.out.println("Enter string 3");
//        str3 = MyScanner.nextLine();
//        if (str1.length() > str2.length() && str1.length() > str3.length()) {
//            System.out.println("Longest string is " + str1);
//        } else if (str2.length() > str1.length() && str2.length() > str3.length()) {
//            System.out.println("Longest string is " + str2);
//        } else {
//            System.out.println("Longest string is " + str3);
//        }
//    }


    // "Write a program in qbasic to ask any string and count total no. of vowels, consonants, words and sentences"
//    public static void main(String[] args) {
//        String str = "";
//        int vowels = 0;
//        int consonants = 0;
//        int words = 0;
//        int sentences = 0;
//        System.out.println("Enter string");
//        Scanner MyScanner = new Scanner(System.in);
//        str = MyScanner.nextLine();
//        for (int i = 0; i < str.length(); i++) {
//            if (str.charAt(i) == 'a' || str.charAt(i) == 'e' || str.charAt(i) == 'i' || str.charAt(i) == 'o' || str.charAt(i) == 'u') {
//                vowels = vowels + 1;
//            } else if (str.charAt(i) == 'A' || str.charAt(i) == 'E' || str.charAt(i) == 'I' || str.charAt(i) == 'O' || str.charAt(i) == 'U') {
//                vowels = vowels + 1;
//            } else if (str.charAt(i) == ' ') {
//                words = words + 1;
//            } else if (str.charAt(i) == '.' || str.charAt(i) == '!' || str.charAt(i) == '?') {
//                sentences = sentences + 1;
//            } else {
//                consonants = consonants + 1;
//            }
//        }
//        System.out.println("No. of vowels is " + vowels);
//        System.out.println("No. of consonants is " + consonants);
//        System.out.println("No. of words is " + words);
//        System.out.println("No. of sentences is " + sentences);
//    }


    // "Write a program in qbasic to print sum of cube of any three ask numbers"
//    public static void main(String[] args) {
//        int num1 = 0;
//        int num2 = 0;
//        int num3 = 0;
//        int sum = 0;
//        System.out.println("Enter first number");
//        Scanner MyScanner = new Scanner(System.in);
//        num1 = MyScanner.nextInt();
//        System.out.println("Enter second number");
//        num2 = MyScanner.nextInt();
//        System.out.println("Enter third number");
//        num3 = MyScanner.nextInt();
//        sum = num1 * num1 * num1 + num2 * num2 * num2 + num3 * num3 * num3;
//        System.out.println("Sum of cube of three numbers is " + sum);
//    }


    // "Write a program in qbasic to enter any 10 numbers and sort in ascending order"
//    public static void main(String[] args) {
//        int[] arr = new int[10];
//        System.out.println("Enter 10 numbers");
//        Scanner MyScanner = new Scanner(System.in);
//        for (int i = 0; i < 10; i++) {
//            arr[i] = MyScanner.nextInt();
//        }
//        for (int i = 0; i < 10; i++) {
//            for (int j = i + 1; j < 10; j++) {
//                if (arr[i] > arr[j]) {
//                    int temp = arr[i];
//                    arr[i] = arr[j];
//                    arr[j] = temp;
//                }
//            }
//        }
//        System.out.println("Sorted array is ");
//        for (int i = 0; i < 10; i++) {
//            System.out.println(arr[i]);
//        }
//    }



    // " Write a program in qbasic to ask number and check whether the given nocomposite or not"
//    public static void main(String[] args) {
//        int num = 0;
//        System.out.println("Enter number");
//        Scanner MyScanner = new Scanner(System.in);
//        num = MyScanner.nextInt();
//        if (num % 2 == 0) {
//            System.out.println("Number is composite");
//        } else {
//            System.out.println("Number is not composite");
//        }
//    }



    // "Write a program in qbasic to enter any three strings and print the shortest one"
//    public static void main(String[] args) {
//        String str1 = "";
//        String str2 = "";
//        String str3 = "";
//        System.out.println("Enter first string");
//        Scanner MyScanner = new Scanner(System.in);
//        str1 = MyScanner.nextLine();
//        System.out.println("Enter second string");
//        str2 = MyScanner.nextLine();
//        System.out.println("Enter third string");
//        str3 = MyScanner.nextLine();
//        if (str1.length() < str2.length() && str1.length() < str3.length()) {
//            System.out.println("Shortest string is " + str1);
//        } else if (str2.length() < str1.length() && str2.length() < str3.length()) {
//            System.out.println("Shortest string is " + str2);
//        } else {
//            System.out.println("Shortest string is " + str3);
//        }
//    }



    // "Write a program in qbasic to ask number and find product of odd digits"
//    public static void main(String[] args) {
//        int num = 0;
//        int prod = 1;
//        System.out.println("Enter number");
//        Scanner MyScanner = new Scanner(System.in);
//        num = MyScanner.nextInt();
//        while (num > 0) {
//            int rem = num % 10;
//            if (rem % 2 != 0) {
//                prod = prod * rem;
//            }
//            num = num / 10;
//        }
//        System.out.println("Product of odd digits is " + prod);
//    }




    // "Write a program in qbasic TO ENTER ANY DIGIT AND PRINT EVEN DIGITS"
//    public static void main(String[] args) {
//        int num = 0;
//        System.out.println("Enter number");
//        Scanner MyScanner = new Scanner(System.in);
//        num = MyScanner.nextInt();
//        while (num > 0) {
//            int rem = num % 10;
//            if (rem % 2 == 0) {
//                System.out.println(rem);
//            }
//            num = num / 10;
//        }
//    }




    // "Write a program in qbasic to ask any string and check whether the first character of a ask string is alphabet number or symbol"
//    public static void main(String[] args) {
//        String str = "";
//        System.out.println("Enter string");
//        Scanner MyScanner = new Scanner(System.in);
//        str = MyScanner.nextLine();
//        if (str.charAt(0) >= 'a' && str.charAt(0) <= 'z' || str.charAt(0) >= 'A' && str.charAt(0) <= 'Z') {
//            System.out.println("First character is alphabet");
//        } else {
//            System.out.println("First character is not alphabet");
//        }
//    }



    // "Write a program in qbasic to ask any string and reverse it"
//    public static void main(String[] args) {
//        String str = "";
//        System.out.println("Enter string");
//        Scanner MyScanner = new Scanner(System.in);
//        str = MyScanner.nextLine();
//        String rev = "";
//        for (int i = str.length() - 1; i >= 0; i--) {
//            rev = rev + str.charAt(i);
//        }
//        System.out.println("Reverse string is " + rev);
//    }



    // "Write a program to enter any three numbers and display the greatest one."
//    public static void main(String[] args) {
//        int num1 = 0;
//        int num2 = 0;
//        int num3 = 0;
//        System.out.println("Enter first number");
//        Scanner MyScanner = new Scanner(System.in);
//        num1 = MyScanner.nextInt();
//        System.out.println("Enter second number");
//        num2 = MyScanner.nextInt();
//        System.out.println("Enter third number");
//        num3 = MyScanner.nextInt();
//        if (num1 > num2 && num1 > num3) {
//            System.out.println("Greatest number is " + num1);
//        } else if (num2 > num1 && num2 > num3) {
//            System.out.println("Greatest number is " + num2);
//        } else {
//            System.out.println("Greatest number is " + num3);
//        }
//    }




    // "Write a program in qbasic to ask any string and count total no. of vowels consonants and words"
//    public static void main(String[] args) {
//        String str = "";
//        int vowels = 0;
//        int consonants = 0;
//        int words = 0;
//        System.out.println("Enter string");
//        Scanner MyScanner = new Scanner(System.in);
//        str = MyScanner.nextLine();
//        for (int i = 0; i < str.length(); i++) {
//            if (str.charAt(i) == 'a' || str.charAt(i) == 'e' || str.charAt(i) == 'i' || str.charAt(i) == 'o' || str.charAt(i) == 'u' || str.charAt(i) == 'A' || str.charAt(i) == 'E' || str.charAt(i) == 'I' || str.charAt(i) == 'O' || str.charAt(i) == 'U') {
//                vowels++;
//            } else if (str.charAt(i) == ' ') {
//                words++;
//            } else {
//                consonants++;
//            }
//        }
//        System.out.println("No. of vowels is " + vowels);
//        System.out.println("No. of consonants is " + consonants);
//        System.out.println("No. of words is " + words);
//    }



    // "Write a program in qbasic that reads six numbers from the list and prints sum of those numbers. The list of number contains: 9,6,93,25"
//    public static void main(String[] args) {
//        int num1 = 0;
//        int num2 = 0;
//        int num3 = 0;
//        int num4 = 0;
//        int num5 = 0;
//        int num6 = 0;
//        int sum = 0;
//        System.out.println("Enter first number");
//        Scanner MyScanner = new Scanner(System.in);
//        num1 = MyScanner.nextInt();
//        System.out.println("Enter second number");
//        num2 = MyScanner.nextInt();
//        System.out.println("Enter third number");
//        num3 = MyScanner.nextInt();
//        System.out.println("Enter fourth number");
//        num4 = MyScanner.nextInt();
//        System.out.println("Enter fifth number");
//        num5 = MyScanner.nextInt();
//        System.out.println("Enter sixth number");
//        num6 = MyScanner.nextInt();
//        sum = num1 + num2 + num3 + num4 + num5 + num6;
//        System.out.println("Sum of numbers is " + sum);
//    }




    // "Write a program in qbasic to print
    // first 5 Armstrong numbers"


}































































































































































