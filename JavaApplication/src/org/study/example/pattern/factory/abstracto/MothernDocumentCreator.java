package org.study.example.pattern.factory.abstracto;

public class MothernDocumentCreator implements DocumentCreator {

    @Override
    public Letter createLetter() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Resume createResume() {
        return new MothernResume();
    }

}
