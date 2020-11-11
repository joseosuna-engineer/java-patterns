package com.prottonne.pattern.factory.abstracto;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class MothernResume implements Resume {

    private final Logger logger = LoggerFactory.getLogger(this.getClass());

    @Override
    public void save() {
        logger.info("Saving a mothern resume.");
    }

}
