package org.study.example.pattern.factory.abstracto;

public class FancyLetter implements Letter {

    @Override
    public void save() {
        System.out.println("Saving a fancy letter.");
    }

}
