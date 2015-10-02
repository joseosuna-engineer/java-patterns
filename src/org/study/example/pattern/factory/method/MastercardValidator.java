

package org.study.example.pattern.factory.method;



public class MastercardValidator implements ICardValidator{

    public MastercardValidator() {
    }

    @Override
    public boolean validate(CreditCard creditCard) {
        return false;
    }
    
}
