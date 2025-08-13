package Behavioral_DP.src.formatters;

public class UpperCaseFormatter implements TextFormattingStrategy{

    @Override
    public String format(String text){
        System.out.println(text  + " formatted to " + text.toUpperCase());
        return text.toUpperCase();
    }
}
