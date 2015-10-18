package org.study.example.pattern.factory.abstracto;

public class DocumentCreator {

    public static IDocumentCreator getDocumentCreator(DocumentType documentType) throws Exception {
        switch (documentType) {
            case FANCY:
                return new FancyDocumentCreator();
            case MOTHERN:
                return new MothernDocumentCreator();
            default:
                throw new Exception();
        }
    }

}
