package SOLID_Principles.src.items;

import java.util.List;

public class LateFeeCalculator {

    //DEPENDECY INVERSION (LateFeeCalculatable) is an interface and we are passing items as interface instead of 
    // concrete implmentation so coding on abstraction instead of low level modules
    public double calculateTotalLateFee(List<LateFeeCalculatable> items,int days){
        double totalValue = 0;

        for(LateFeeCalculatable item : items){
            totalValue += item.calculateLateFee(days);
        }

        return totalValue;
    }

}
