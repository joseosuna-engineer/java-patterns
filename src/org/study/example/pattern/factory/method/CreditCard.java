

package org.study.example.pattern.factory.method;



public class CreditCard {
    private long id;
    private CreditCardType type;

    public CreditCard() {
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public CreditCardType getType() {
        return type;
    }

    public void setType(CreditCardType type) {
        this.type = type;
    }


    
}
