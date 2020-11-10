package com.prottonne.pattern.factory.abstracto;

public class MothernDocumentCreator implements IDocumentCreator {

    @Override
    public Letter createLetter() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Resume createResume() {
        return new MothernResume();
    }

}
