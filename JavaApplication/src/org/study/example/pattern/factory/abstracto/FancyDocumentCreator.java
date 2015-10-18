package org.study.example.pattern.factory.abstracto;

public class FancyDocumentCreator implements DocumentCreator {

    @Override
    public Letter createLetter() {
        return new FancyLetter();
    }

    @Override
    public Resume createResume() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

}
