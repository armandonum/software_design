package org.pagination;

import java.util.ArrayList;
import java.util.List;

public class PaginationManager<T> implements IListManager<T> {

    private List<T> items;
    private int pageSize;
    private int currentPage;

    public PaginationManager(int pageSize) {
        this.items = new ArrayList<>();
        this.pageSize = pageSize;
        this.currentPage = 0;

    }

    private void displayPage(int page) {
        int start = page * pageSize;
        int End = Math.min(start + pageSize, items.size());

        for (int i = start; i < End; i++) {
            System.out.println(items.get(i));
        }
        System.out.println("pagina " + (page + 1) + " de " + getNumberOfPages());
    }

    public void getdisplayPage(int page) {
        displayPage(page);
    }

    public int getcurrentPage() {
        return currentPage;
    }

    public int getPageSize() {
        return pageSize;
    }

    public List<T> getItems() {
        return items;
    }


    @Override
    public void addItem(T item) {
        items.add(item);

    }


    @Override
    public void firstPage() {
        displayPage(0);
    }

    @Override
    public void lastPage() {
        displayPage(getNumberOfPages() - 1);
    }

    @Override
    public void nextPage() {
        if (currentPage < getNumberOfPages() - 1) {
            currentPage++;
            displayPage(currentPage);
        }
    }

    @Override
    public void previousPage() {
        if (currentPage > 0) {
            currentPage--;
            displayPage(currentPage);
        }
    }

    @Override
    public void pageByNumber(int pageNumber) {
        if (pageNumber >= 1 && pageNumber <= getNumberOfPages()) {
            currentPage = pageNumber - 1;
            displayPage(currentPage);
        }
    }

    @Override
    public int getNumberOfPages() {
        return (int) Math.ceil((double) items.size() / pageSize);
    }


}
