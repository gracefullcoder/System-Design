package SOLID_Principles.src.main;

import java.util.ArrayList;
import java.util.List;

import SOLID_Principles.src.items.Book;
import SOLID_Principles.src.items.CD;
import SOLID_Principles.src.items.DVD;
import SOLID_Principles.src.items.LibraryItem;

//Question

// Develop a library system that manages various types of library items such as books, CDs, and DVDs.
// Each item has a title, a unique identifier, and a type-specific property (e.g., author for books).
// The system should allow users to check out items, calculate late fees based on the item type, and 
// determine the total value of all items in the library.

public class Library {
    public static void main(String[] args) {
        List<LibraryItem> items = new ArrayList<>();

        LibraryItem book = new Book(0, "E sala Placement Namde", "Vaibhav", 12);
        LibraryItem cd = new CD(1, "E sala Placement Namde", "Nikhil", 13);
        LibraryItem dvd = new DVD(2, "E sala Placement Namde", "Ujjawal", 14);
        LibraryItem book2 = new Book(3, "E sala Placement Namde", "Sangam", 15);

        items.add(book);
        items.add(book2);
        items.add(cd);
        items.add(dvd);

        double totalLateFee = 0;

        //Liskov Substitution Principle (Item could be anything book cd , dvd instance of template LibraryItem 
        //and anything of it can be added in the item and used in substitution or vice versa
        //could be said no need to change interface for different items (Like example a fly function in bird) but ostrich does not fly
        
        for(LibraryItem item : items){
            double charge = item.calculateLateFee(1);
            System.out.println("Late fee charge for item id " + item.getUid() + " " + item.getAuthor() + " " + charge);
            totalLateFee += charge;
        }

        System.out.println("Total Late Fee = " +  totalLateFee);

    }
}
