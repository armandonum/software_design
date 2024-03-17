package tasks.Memory_allocation.WorstFit;

import tasks.Memory_allocation.*;

import java.util.List;

public class WorstFitAlgorithm implements IAllocationAlgorithm {
    @Override
    public MemoryBlock GetMemoryBlock(List<MemoryBlock> blocks, int size) {
        MemoryBlock worstFit = null;
        int largestDifference = Integer.MIN_VALUE;

        for(MemoryBlock b: blocks){
            if(b.IsFree() && b.getSize() >= size && b.getSize() > largestDifference)
            {
                worstFit = b;
                largestDifference = b.getSize();
            }
        }
        return worstFit;
    }
}
