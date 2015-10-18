package org.study.example.pattern.factory.abstracto;

//abstract factory
public interface IDocumentCreator {

    Letter createLetter();

    Resume createResume();
}
