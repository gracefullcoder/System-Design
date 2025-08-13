package Behavioral_DP.src.commands;

import Behavioral_DP.src.actors.TextEditor;
import Behavioral_DP.src.formatters.TextFormattingStrategy;

public class FormatTextCommand implements TextEditorCommand {
    TextFormattingStrategy formattingStrategy;
    String textToFormat;
    TextEditor textEditor;

    public FormatTextCommand(TextEditor textEditor, TextFormattingStrategy formattingStrategy,String currText){
        this.formattingStrategy = formattingStrategy;
        this.textToFormat = currText;
        this.textEditor = textEditor;
    }

    @Override
    public void execute(){
        String formattedText = this.formattingStrategy.format(this.textToFormat);
        textEditor.setCurrText(formattedText);
        textEditor.notifyObserver();
    }
}
