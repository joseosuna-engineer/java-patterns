package org.study.example.pattern.factory.abstracto;

import java.util.logging.Level;
import java.util.logging.Logger;

public class MainFactory {

    public static void main(String[] args) {
        try {
            DocumentType userChoise = DocumentType.MOTHERN;
            new Document(DocumentFactory.getDocumentCreator(userChoise));
        } catch (Exception ex) {
            Logger.getLogger(MainFactory.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

}
