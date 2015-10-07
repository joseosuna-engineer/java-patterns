package org.study.example.pattern.factory.method;

public class VisaCardValidator implements ICardValidator {

    public VisaCardValidator() {
    }

    @Override
    public boolean validate(CreditCard creditCard) {
        return true;
    }

}
