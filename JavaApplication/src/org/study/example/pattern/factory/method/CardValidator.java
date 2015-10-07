package org.study.example.pattern.factory.method;

public class CardValidator {

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
