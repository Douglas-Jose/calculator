package br.com.calculator;

import java.util.Scanner;

public class Selection {
    Scanner scanner = new Scanner(System.in);
    Sum sum = new Sum();
    Subtraction subtraction = new Subtraction();
    Multiplication multiplication = new Multiplication();
    Division division = new Division();



    public void selectionoperation() {
        int choice = 0;
        while (choice != 5) {
            System.out.println("Select an option:\n1-Sum\n2-Subtraction\n3-Multiplication\n4-Division\n5-Exit");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    sum.displaysum();
                    break;
                case 2:
                    subtraction.displaysub();
                    break;
                case 3:
                    multiplication.displaymult();
                    break;
                case 4:
                    division.displaydiv();
                    break;
                case 5:
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid choice, please enter a valid number (1-5).");
                    break;
            }
        }
        }
    }