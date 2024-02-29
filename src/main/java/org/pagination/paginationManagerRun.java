package org.pagination;

import java.util.Scanner;

public class paginationManagerRun implements IRunner {
    private Scanner scanner;
    private PaginationManager<String> manager;

    public paginationManagerRun() {
        this.scanner = new Scanner(System.in);

        this.manager = new PaginationManager<>(3);
    }

    @Override
    public void run() {
        while (true) {
            String command = scanner.nextLine().trim();

            switch (command) {
                case "add":
                    addItem();
                    break;

                case "first":
                    manager.firstPage();
                    break;
                case "last":
                    manager.lastPage();
                    break;
                case "display":

                    manager.getdisplayPage(manager.getcurrentPage());

                    // manager.displayPage(manager.getcurrentPage());
                    break;
                case "next":
                    manager.nextPage();
                    break;
                case "prev":
                    manager.previousPage();
                    break;
                case "goto":
                    gotoPage();
                    break;
                case "exit":
                    System.out.println("Exiting program.");
                    return;
                default:
                    System.out.println("Invalid command. Please try again.");
            }
            Menu();

        }

    }

    private void addItem() {
        System.out.println("Enter item to add:");
        String item = scanner.nextLine().trim();
        manager.addItem(item);
    }


    private void gotoPage() {
        System.out.println("Enter page number:");
        int pageNumber = Integer.parseInt(scanner.nextLine().trim());
        manager.pageByNumber(pageNumber);
    }

    @Override
    public void Menu() {

        System.out.println("Commands:");
        System.out.println("add, first , display, last, next, prev, goto");


    }
}
