package com.prottonne.pattern.factory.abstracto;

import com.prottonne.pattern.exception.DocumentCreatorException;

public class DocumentCreator {
    
    private DocumentCreator(){}

    public static IDocumentCreator getDocumentCreator(DocumentType documentType)  {
        switch (documentType) {
            case FANCY:
                return new FancyDocumentCreator();
            case MOTHERN:
                return new MothernDocumentCreator();
            default:
                throw new DocumentCreatorException("it is not Fancy or mothern");
        }
    }

}
