package org.study.example.pattern.factory.abstracto;

public class DocumentFactory {

    public static DocumentCreator getDocumentCreator(DocumentType documentType) throws Exception {
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
