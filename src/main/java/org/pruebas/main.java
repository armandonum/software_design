package org.pruebas;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        managerList<String> manager = new managerList<>(5); // Set page size to 5

        while (true) {
            System.out.println("\nEnter command: (add, setPageSize, display, first, last, next, prev, goto, exit)");
            String command = scanner.nextLine().trim();

            switch (command) {
                case "add":
                    System.out.println("Enter item to add:");
                    String item = scanner.nextLine().trim();
                    manager.addItem(item);
                    break;
                case "setPageSize":
                    System.out.println("Enter page size:");
                    int pageSize = Integer.parseInt(scanner.nextLine().trim());
                    manager.setPageSize(pageSize);
                    break;
                case "display":
                    manager.displayPage(manager.getCurrentPage());
                    break;
                case "first":
                    manager.displayFirstPage();
                    break;
                case "last":
                    manager.displayLastPage();
                    break;
                case "next":
                    manager.displayNextPage();
                    break;
                case "prev":
                    manager.displayPreviousPage();
                    break;
                case "goto":
                    System.out.println("Enter page number:");
                    int pageNumber = Integer.parseInt(scanner.nextLine().trim());
                    manager.displayPageByNumber(pageNumber);
                    break;
                case "exit":
                    System.out.println("Exiting program.");
                    return;
                default:
                    System.out.println("Invalid command. Please try again.");
            }
        }
    }
}
