package Behavioral_DP.src.actors;

import Behavioral_DP.src.observers.TextEditorObserver;

public interface TextEditorSubject {

    void registerObserver(TextEditorObserver observer);

    void removerObserver(TextEditorObserver observer);

    void notifyObserver();
}
