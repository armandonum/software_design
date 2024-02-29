package org.paginacion_2;
import org.paginacion_2.interfaces.IPaginador;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import static java.lang.System.in;

public class Paginador<T> implements IPaginador<T>{
    private List<T> items;
    private int pageSize;
    private int currentPage;

    public Paginador(int pageSize) {
        this.items = new ArrayList<>();
        this.pageSize = pageSize;
        this.currentPage = 0;

    }

    public void displayPage(int page) {
        int start = page * pageSize;
        int End = Math.min(start + pageSize, items.size());

        for (int i = start; i < End; i++) {
            System.out.println(items.get(i));
        }
        System.out.println("pagina " + (page + 1) + " de " + getNumberOfPages());
    }

@Override
    public int getcurrentPage() {
        return currentPage;
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
    public void pageByNumber() {
        System.out.println("Enter page number:");
        Scanner in = new Scanner(System.in);
        int pageNumber = in.nextInt();
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
