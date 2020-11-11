package com.prottonne.pattern.factory.abstracto;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class FancyLetter implements Letter {

    private final Logger logger = LoggerFactory.getLogger(this.getClass());

    @Override
    public void save() {
        logger.info("Saving a fancy letter.");
    }

}
