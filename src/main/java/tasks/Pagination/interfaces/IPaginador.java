package tasks.Pagination.interfaces;

public interface IPaginador<T> {
    void addItem(T item);


    /**
     * this method print the first page of the list
     */
    void firstPage();

    void lastPage();

    void nextPage();

    void previousPage();

    void pageByNumber();

    int getNumberOfPages();
    void displayPage(int page);

    int getcurrentPage();
}
