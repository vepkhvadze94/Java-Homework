package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        /*Task 1 – Imagine you are purchasing a product from an online store. Write code that performs the following:
        ● If the price of the product is 100 GEL or more, apply a 10% discount.
        ● Otherwise, the price remains unchanged.
        ● Print the final price.*/

        double prodPrice = 115;

        if (prodPrice >= 100) {

            prodPrice = (prodPrice * 90) / 100;
        } else {
           prodPrice = prodPrice;
        }
        System.out.println("--- Task 1 ---");
        System.out.println("Final Price: " + prodPrice + " GEL");

        {
            /*Task 2 – Write code that verifies user authorization credentials.
            Predefine a valid username and password.
            If the user enters both correctly, print "Login successful";
            if they make a mistake in either, print "Invalid username or password."*/

            System.out.println("--- Task 2 ---");

            String correctUN = "Ana";
            String correctPW = "Ana123";

            String username = "Ana";
            String password = "Ana123";

            if (username.equals(correctUN) && password.equals(correctPW)){
                System.out.println("Login Successful");
            } else {
                System.out.println(" Invalid username or password");
            }

        }
        {
            /*Task 3 – A tester verified a specific functionality using five test cases.
            The results of each test are provided in an array: int[] testResults = {1, 0, 1, 1, 0};
            where 1 represents "Passed" and 0 represents "Failed."
             Write code that uses a `for` loop to count the number of passed and failed tests,
             and then prints both results.*/

            System.out.println("--- Task 3 ---");


            int[] testResults = {1, 0, 1,  1, 0};

            int passed = 0;
            int failed = 0;

            for (int i = 0; i < testResults.length; i++) {

                if (testResults[i] == 1) {
                    passed++;
                } else {
                    failed++;
                }
            }

            System.out.println("Passed: " + passed);
            System.out.println("Failed: " + failed);

        }
        {
            /*Task 4 – A user has placed an order and should receive a notification
            based on the order status. Write code that uses a `switch` statement to handle the following values:
            ● When the order is new (status: `NEW`) → the user should receive the notification: "Order received"
            ● When the order is being prepared (status: `PROCESSING`) → the user should receive the notification: "Order is being prepared"
            ● When the order has been sent (status: `SHIPPED`) → the user should receive the notification: "Order is on the way"
            ● When the product has been received (status: `DELIVERED`) → the user should receive the notification: "Order delivered"
            ● If none of the above statuses are assigned, then print: "Unknown status." */

            System.out.println("--- Task 4 ---");

            String status = "SHIPPED";

            switch (status) {
                case "NEW":
                    System.out.println("Order received");
                    break;
                case "PROCESSING":
                    System.out.println("Order is being prepared");
                    break;
                case "SHIPPED":
                    System.out.println("Order is on the way");
                    break;
                case "DELIVERED":
                    System.out.println("Order delivered");
                    break;

                default:
                    System.out.println("Unknown status");
            }


            {
                 /* Task 5 – Create a variable of type `String` and write code that:
                 ● counts the number of vowels in the string using a `for` loop and prints the result;
                 ● finds the length of the string and prints it;
                 ● checks whether the length of the string is even or odd—if the length is an even number,
                 it should print "even", and if it is odd, it should print "odd".*/

                System.out.println("--- Task 5 ---");

                String text = "Automation QA Engineer";

                int vowels = 0;
                int i = 0;
                for (; i < text.length(); i++){
                    char letter = text.charAt(i);

                    if (letter == 'a'|| letter == 'A' ||
                    letter == 'e' || letter == 'E'||
                    letter == 'i' || letter == 'I' ||
                    letter == 'o'|| letter == 'O' ||
                    letter == 'u' || letter == 'U') {
                        vowels++;
                    }
                }
                System.out.println("Vowels:" + vowels);
                System.out.println("Length:" + text.length());

                System.out.println(text.length() % 2 == 0? "Even": "odd"  );



            }




        }


        }
    }
