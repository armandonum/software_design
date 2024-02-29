package org.pagination;

import java.util.List;

public interface IListManager<T> {


    void addItem(T item);


    /**
     * this method print the first page of the list
     */
    void firstPage();

    void lastPage();

    void nextPage();

    void previousPage();

    void pageByNumber(int pageNumber);

    int getNumberOfPages();


}
