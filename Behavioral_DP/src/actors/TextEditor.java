package Behavioral_DP.src.actors;

import Behavioral_DP.src.observers.TextEditorObserver;

import java.util.ArrayList;
import java.util.List;

public class TextEditor implements  TextEditorSubject{

    List<TextEditorObserver> observerList;
    String currText;

    public TextEditor(String currText){
        this.currText = currText;
        this.observerList = new ArrayList<>();
    }

    public void setCurrText(String updatedText){
        this.currText = updatedText;
    }

    @Override
    public void registerObserver(TextEditorObserver observer) {
        this.observerList.add(observer);
    }

    @Override
    public void removerObserver(TextEditorObserver observer) {
        this.observerList.remove(observer);
    }

    @Override
    public void notifyObserver() {
        for(TextEditorObserver observer : this.observerList){
            observer.update(this.currText);
        }
    }
}
