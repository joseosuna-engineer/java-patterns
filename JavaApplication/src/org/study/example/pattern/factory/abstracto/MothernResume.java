package org.study.example.pattern.factory.abstracto;

public class MothernResume implements Resume {

    @Override
    public void save() {
        System.out.println("Saving a mothern resume.");
    }

}
