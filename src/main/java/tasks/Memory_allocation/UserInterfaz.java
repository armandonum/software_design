package tasks.Memory_allocation;

import tasks.Memory_allocation.BestFit.BestFitAlgoritm;
import tasks.Memory_allocation.FirstFit.FirstFitAlgorithm;
import tasks.Memory_allocation.WorstFit.WorstFitAlgorithm;

import java.util.Scanner;

public class UserInterfaz {

    private IMemoryAllocator allocator;

    IAllocationAlgorithm algorithm;
    public void run( ){
        Scanner in=new Scanner(System.in);

        boolean running = true;
        while (running) {
            Menu();
            int choice = in.nextInt();
            in.nextLine();

            switch (choice) {
                case 1:
                    System.out.print("Enter object name: ");
                    String objectName = in.nextLine();
                    System.out.print("Enter memory size: ");
                    int size = in.nextInt();
                    allocator.Allocate(objectName, size);
                    break;
                case 2:
                    System.out.print("Enter object name to deallocate: ");
                    objectName = in.nextLine();
                    allocator.DeAllocate(objectName);
                    break;
                case 3:
                    allocator.ShowMemory();
                    break;
                case 4:
                    running = false;
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
        in.close();

    }

    private static void Menu() {
        System.out.println("1. Allocate");
        System.out.println("2. Deallocate");
        System.out.println("3. Print");
        System.out.println("4. Exit");
        System.out.println("Enter option: ");
    }


    public  void ChoiseAlgorithm(int size){
        Scanner in=new Scanner(System.in);
        System.out.println("1. First Fit");
        System.out.println("2. Best Fit");
        System.out.println("3. Worst Fit");
        int option=in.nextInt();
        switch(option){
            case 1:
                algorithm = new FirstFitAlgorithm();
                allocator = new MemoryAllocator(size, algorithm);
                run();
                    break;
            case 2:
                algorithm=new BestFitAlgoritm();
                allocator=new MemoryAllocator(size,algorithm);
                run();
                break;
            case 3:
                algorithm=new WorstFitAlgorithm();
                allocator=new MemoryAllocator(size,algorithm);
                run();

                break;
            default:
                System.out.println("Invalid option");
        }
    }


}
