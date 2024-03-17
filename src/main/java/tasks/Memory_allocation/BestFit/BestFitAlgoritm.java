package tasks.Memory_allocation.BestFit;

import tasks.Memory_allocation.*;

import java.util.List;

public class BestFitAlgoritm implements IAllocationAlgorithm {

    @Override
    public MemoryBlock GetMemoryBlock(List<MemoryBlock> blocks, int size) {
        MemoryBlock bestFit = null;
        int smallestDifference = Integer.MAX_VALUE;

        for(MemoryBlock b: blocks){
            if(b.IsFree() && b.getSize() >= size && b.getSize() < smallestDifference)
            {
                bestFit = b;
                smallestDifference = b.getSize();
            }
        }
        return bestFit;
    }
}
