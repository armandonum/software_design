package tasks.Memory_allocation;

import java.util.List;

public class EmptyBlocks {

    public static List<MemoryBlock> emptyBlocks(List<MemoryBlock> blocks) {
        List<MemoryBlock> emptyBlocks = new java.util.ArrayList<MemoryBlock>();
        for (MemoryBlock b : blocks) {
            if (b.IsFree()) {
                emptyBlocks.add(b);
            }
        }
        return emptyBlocks;
    }
}
