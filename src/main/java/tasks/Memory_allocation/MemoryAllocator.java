package tasks.Memory_allocation;

import java.util.ArrayList;
import java.util.List;

public class MemoryAllocator implements  IMemoryAllocator{

    private int totalsize;
    private IAllocationAlgorithm algorithm;
    private List<MemoryBlock> blocks;


    public MemoryAllocator(int totalsize, IAllocationAlgorithm algorithm) {
        this.totalsize = totalsize;
        this.algorithm = algorithm;
        blocks= new ArrayList<MemoryBlock>();
        MemoryBlock block= new MemoryBlock();
        block.setSize(totalsize);
        blocks.add(block);
    }

    @Override
    public boolean Allocate(String object, int size) {
        MemoryBlock block = algorithm.GetMemoryBlock(blocks, size);
        if (block == null) {
            return false;
        }
        MemoryBlock newBlock = new MemoryBlock();
        newBlock.setSize(size);
        newBlock.setObject(object);
        int idBlock = blocks.indexOf(block);
        blocks.add(idBlock, newBlock);

        block.setSize(block.getSize()-size);
        if(block.getSize()==0) {
            blocks.remove(block);
        }
        return true;
    }

    @Override
    public boolean DeAllocate(String object) {
        MemoryBlock block =SearchByName(object);
        if(block==null){
            return false;
        }
        block.setObject(null);
        CheckAdjacency();
        return true;
    }
    private MemoryBlock SearchByName(String objectName) {
        for (MemoryBlock b : blocks) {
            if (objectName.equals(b.getObject())) {
                return b;
            }
        }

        return null;
    }
    private void CheckAdjacency() {
        for(int i=0;i<blocks.size() ;i++){
            if(i == blocks.size()-1) {
                return;
            }
            if (blocks.get(i).IsFree() && blocks.get(i+1).IsFree()){
                MemoryBlock currentBlock = blocks.get(i);
                currentBlock.setSize(currentBlock.getSize() + blocks.get(i+1).getSize());
                blocks.remove(i+1);
                i -= 1;
            }
        }

    }
    @Override
    public boolean IsEmpty() {
        return false;
    }

    @Override
    public boolean IsFull() {
        return false;
    }

    @Override
    public void ShowMemory() {
        for(MemoryBlock m:blocks){
            System.out.println(m.getObject()+" "+m.getSize());
        }
        System.out.println("------------------------------");

    }
}
