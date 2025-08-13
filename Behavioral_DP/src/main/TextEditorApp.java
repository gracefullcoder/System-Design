package Behavioral_DP.src.main;

import Behavioral_DP.src.actors.TextEditor;
import Behavioral_DP.src.commands.FormatTextCommand;
import Behavioral_DP.src.formatters.TextFormattingStrategy;
import Behavioral_DP.src.formatters.UpperCaseFormatter;
import Behavioral_DP.src.observers.TextConsoleObserver;
import Behavioral_DP.src.observers.TextEditorObserver;

public class TextEditorApp {
    public static void main(String[] args) {
        TextFormattingStrategy upperCaseStrategy = new UpperCaseFormatter();
        TextEditorObserver consoleObserver = new TextConsoleObserver(upperCaseStrategy);
        String currText = "vaibhav";

        TextEditor textEditor = new TextEditor(currText);
        textEditor.registerObserver(consoleObserver);

        FormatTextCommand formatTextCommand = new FormatTextCommand(textEditor,upperCaseStrategy,currText);

        formatTextCommand.execute();
    }
}
