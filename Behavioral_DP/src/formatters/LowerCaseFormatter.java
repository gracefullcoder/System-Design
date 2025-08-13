package Behavioral_DP.src.formatters;

public class LowerCaseFormatter implements TextFormattingStrategy{

    @Override
    public String format(String text){
        System.out.println(text  + " formatted to " + text.toLowerCase());
        return text.toLowerCase();
    }
}
