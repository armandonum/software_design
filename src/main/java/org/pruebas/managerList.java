package org.pruebas;

import java.util.ArrayList;
import java.util.List;

public class managerList<T> {
    private List<T> items;
    private int pageSize;
    private int currentPage;

    public managerList(int pageSize) {
        this.pageSize = pageSize;
        this.items = new ArrayList<>();
        this.currentPage = 0;
    }

    public void addItem(T item) {
        items.add(item);
    }

    public void setPageSize(int pageSize) {
        this.pageSize = pageSize;
    }

    public void displayPage(int page) {
        int startIndex = page * pageSize;
        int endIndex = Math.min(startIndex + pageSize, items.size());

        if (startIndex >= items.size()) {
            System.out.println("Page not found.");
            return;
        }

        for (int i = startIndex; i < endIndex; i++) {
            System.out.println(items.get(i));
        }
        System.out.println("Page " + (page + 1) + "/" + getNumPages());
    }

    public void displayFirstPage() {
        displayPage(0);
    }

    public void displayLastPage() {
        displayPage(getNumPages() - 1);
    }

    public void displayNextPage() {
        if (currentPage < getNumPages() - 1) {
            currentPage++;
            displayPage(currentPage);
        } else {
            System.out.println("No next page available.");
        }
    }

    public void displayPreviousPage() {
        if (currentPage > 0) {
            currentPage--;
            displayPage(currentPage);
        } else {
            System.out.println("No previous page available.");
        }
    }

    public void displayPageByNumber(int pageNumber) {
        if (pageNumber >= 1 && pageNumber <= getNumPages()) {
            currentPage = pageNumber - 1;
            displayPage(currentPage);
        } else {
            System.out.println("Invalid page number.");
        }
    }

    public int getNumPages() {
        return (int) Math.ceil((double) items.size() / pageSize);
    }

    public int getCurrentPage() {
        return currentPage;
    }
}
