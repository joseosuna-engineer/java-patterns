package com.prottonne.pattern.factory.abstracto;

//abstract factory
public interface IDocumentCreator {

    Letter createLetter();

    Resume createResume();
}
