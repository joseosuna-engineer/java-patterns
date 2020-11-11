package com.prottonne.pattern.factory.method;

public class VisaCardValidator implements ICardValidator {

    public VisaCardValidator() {
        super();
    }

    @Override
    public boolean validate(CreditCard creditCard) {
        return true;
    }

}
