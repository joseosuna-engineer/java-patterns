package com.prottonne.pattern.util;

import static org.assertj.core.api.Assertions.assertThat;
import org.junit.jupiter.api.Test;

/**
 *
 * @author jose
 */
public class UtilsTest {

    @Test
    public void testCreateRandomIntBetween() {
        int random = Utils.createRandomIntBetween(10, 50);
        assertThat(random).isBetween(10, 50);

    }

}
