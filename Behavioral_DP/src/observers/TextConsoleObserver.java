package Behavioral_DP.src.observers;

import Behavioral_DP.src.formatters.TextFormattingStrategy;

public class TextConsoleObserver implements TextEditorObserver{
    TextFormattingStrategy formattingStrategy;

    public TextConsoleObserver(TextFormattingStrategy formattingStrategy){
        this.formattingStrategy = formattingStrategy;
    }

    @Override
    public void update(String text){
        System.out.println("Text updated in console " + text);
    }
}
