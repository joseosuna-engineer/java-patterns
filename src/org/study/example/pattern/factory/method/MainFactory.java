

package org.study.example.pattern.factory.method;

import java.util.logging.Level;
import java.util.logging.Logger;



public class MainFactory {

    public static void main(String[] args) {
        CreditCard creditCard = new CreditCard();
        creditCard.setType(CreditCardType.VISA);
        try {
            ICardValidator cardValidator = CardValidator.getCardValidator(creditCard);
            boolean valid = cardValidator.validate(creditCard);
            System.out.println(valid);
        } catch (CreditCardTypeException ex) {
            Logger.getLogger(MainFactory.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
