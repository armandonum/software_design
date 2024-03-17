package tasks.Memory_allocation;

public interface IAllocationAlgorithm {
    MemoryBlock GetMemoryBlock(java.util.List<MemoryBlock> blocks, int size);
}
