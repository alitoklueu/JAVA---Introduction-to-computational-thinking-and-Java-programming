package Exercises_Day_1;
public class Variables_and_operations_3 {
    public static void main(String[] args) {
        int totalStorage = 5000;
        int fileSize = 256;
        int amountFilesInStorage = totalStorage / fileSize;
        int freeSpace = totalStorage - amountFilesInStorage * fileSize;
        System.out.println("The storage will be able to fit " + amountFilesInStorage + " files.");
        System.out.println(freeSpace + " GB will remain.");
    }
}


// Variables and operations Write a program that calculates storage capabilities

// Instructions The company has a 5000 GB data storage. The company was handed over 20 files for placement. The volume of one file is 256 GB. Not all the data will fit in the storage. How many files can we put in the storage? How much free space will be left?

// Write a program that does the computations.

// Expected output The storage will be able to fit 19 files 136 GB will remain