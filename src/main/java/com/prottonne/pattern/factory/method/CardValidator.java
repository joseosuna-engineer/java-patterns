package com.prottonne.pattern.factory.method;

public class CardValidator {

    // factory method
    public static ICardValidator getCardValidator(CreditCard creditCard) throws CreditCardTypeException {
        switch (creditCard.getType()) {
            case VISA:
                return new VisaCardValidator();
            case MASTERCARD:
                return new MastercardValidator();
            default:
                throw new CreditCardTypeException();
        }
    }
}
