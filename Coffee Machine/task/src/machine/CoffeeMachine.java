package machine;

import java.util.Scanner;

public class CoffeeMachine {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int currentWater = 400;
        int currentMilk = 540;
        int currentBeans = 120;
        int currentCups = 9;
        int currentMoney = 550;

        System.out.println("Write action (buy, fill, take, remaining, exit):");
        String operation = scanner.nextLine();

        while (!operation.equals("exit")) {
            switch (operation) {
                case "buy":
                    System.out.println("What do you want to buy? 1 - espresso, 2 - latte, 3 - cappuccino:, back - to main menu");
                    String buyOperation = scanner.nextLine();

                    switch (buyOperation) {
                        case "1":
                            if (currentWater >= 250 && currentBeans >= 16 && currentCups >= 1) {
                                currentWater -= 250;
                                currentBeans -= 16;
                                currentMoney += 4;
                                currentCups -= 1;

                                System.out.println("I have enough resources, making you a coffee!");
                                break;
                            } else if (currentWater < 250) {
                                System.out.println("Sorry, not enough water!");
                                break;
                            } else if (currentBeans < 16) {
                                System.out.println("Sorry, not enough coffee beans!");
                                break;
                            } else if (currentCups == 0) {
                                System.out.println("Sorry, not enough cups!");
                                break;
                            }

                            break;

                        case "2":
                            if (currentWater >= 350 && currentMilk >= 75 && currentBeans >= 20
                                    && currentCups >= 1) {
                                currentWater -= 350;
                                currentMilk -= 75;
                                currentBeans -= 20;
                                currentMoney += 7;
                                currentCups -= 1;

                                System.out.println("I have enough resources, making you a coffee!");
                                break;
                            } else if (currentWater < 350) {
                                System.out.println("Sorry, not enough water!");
                                break;
                            } else if (currentMilk < 75) {
                                System.out.println("Sorry, not enough milk!");
                                break;
                            } else if (currentBeans < 20) {
                                System.out.println("Sorry, not enough coffee beans!");
                                break;
                            } else if (currentCups == 0) {
                                System.out.println("Sorry, not enough cups!");
                                break;
                            }
                            break;

                        case "3":
                            if (currentWater >= 200 && currentMilk >= 100 && currentBeans >= 12
                                    && currentCups >= 1) {
                                currentWater -= 200;
                                currentMilk -= 100;
                                currentBeans -= 12;
                                currentMoney += 6;
                                currentCups -= 1;

                                System.out.println("I have enough resources, making you a coffee!");
                                break;
                            } else if (currentWater < 200) {
                                System.out.println("Sorry, not enough water!");
                                break;
                            } else if (currentMilk < 100) {
                                System.out.println("Sorry, not enough milk!");
                                break;
                            } else if (currentBeans < 12) {
                                System.out.println("Sorry, not enough coffee beans!");
                                break;
                            } else if (currentCups == 0) {
                                System.out.println("Sorry, not enough cups!");
                                break;
                            }

                        case "back": {
                            break;
                        }
                    }

                    System.out.println("\nWrite action (buy, fill, take, remaining, exit):");
                    operation = scanner.nextLine();

                    break;

                case "fill":
                    System.out.println("Write how many ml of water do you want to add: ");
                    int addedWater = Integer.parseInt(scanner.nextLine());
                    System.out.println("Write how many ml of milk do you want to add: ");
                    int addedMilk = Integer.parseInt(scanner.nextLine());
                    System.out.println("Write how many grams of coffee beans do you want to add: ");
                    int addedBeans = Integer.parseInt(scanner.nextLine());
                    System.out.println("Write how many disposable cups of coffee do you want to add: ");
                    int addedCups = Integer.parseInt(scanner.nextLine());

                    currentWater += addedWater;
                    currentMilk += addedMilk;
                    currentBeans += addedBeans;
                    currentCups += addedCups;

                    System.out.println("\nWrite action (buy, fill, take, remaining, exit):");
                    operation = scanner.nextLine();

                    break;

                case "take":
                    System.out.println("I gave you $" + currentMoney);
                    currentMoney = 0;

                    System.out.println("\nWrite action (buy, fill, take, remaining, exit):");
                    operation = scanner.nextLine();

                    break;

                case "remaining":
                    currentState(currentWater, currentMilk, currentBeans, currentCups, currentMoney);
                    System.out.println("\nWrite action (buy, fill, take, remaining, exit):");
                    operation = scanner.nextLine();

                    break;
            }
        }
    }

    public static void currentState(int currentWater, int currentMilk, int currentBeans,
                                    int currentCups, int currentMoney) {
        System.out.println("The coffee machine has:");
        System.out.println(currentWater + " of water");
        System.out.println(currentMilk + " of milk");
        System.out.println(currentBeans + " of coffee beans");
        System.out.println(currentCups + " of disposable cups");
        System.out.println(currentMoney + " of money");
    }
}