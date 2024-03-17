package tasks.Memory_allocation;

public interface IMemoryAllocator {

    boolean Allocate( String object, int size);
    boolean DeAllocate(String object);

    boolean IsEmpty();
    boolean IsFull();
    void ShowMemory();

}
