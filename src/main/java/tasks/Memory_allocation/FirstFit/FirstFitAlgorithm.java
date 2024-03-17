package tasks.Memory_allocation.FirstFit;

import tasks.Memory_allocation.IAllocationAlgorithm;
import tasks.Memory_allocation.MemoryBlock;

import java.util.List;

public class FirstFitAlgorithm implements IAllocationAlgorithm {
    @Override
    public MemoryBlock GetMemoryBlock(List<MemoryBlock> blocks, int size) {

        for(MemoryBlock b:blocks){
            if(b.IsFree() && b.getSize()>=size){
                return b;
            }
        }
        return null;
    }
}
