package org.study.example.pattern.factory.abstracto;

public class Document {

    public Document(DocumentCreator factory) {
        Resume resume = factory.createResume();
        resume.save();
    }
}
