package SOLID_Principles.src.items;


//SINGLE RESPONSIBILTY PRINCIPLE (Single class or interface is having only one job to manage one work that is Library item)
public interface LibraryItem extends LateFeeCalculatable{

    public String getTitle();

    public int getUid();

    public String getAuthor();
    
    // this one is odd as it is calculating something so we can make interface of this and extend here
    //This here is Interface Segregation principle 
    // public double calculateLateFee(int days); 

    public double getValue();
}
