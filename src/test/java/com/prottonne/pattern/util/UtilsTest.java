package com.prottonne.pattern.util;

import static org.assertj.core.api.Assertions.assertThat;
import org.junit.jupiter.api.Test;

/**
 *
 * @author jose
 */
class UtilsTest {

    @Test
    void testCreateRandomIntBetween() {
        int random = Utils.createRandomIntBetween(10, 50);
        assertThat(random).isBetween(10, 50);

        int randomClosed = Utils.createRandomIntBetween(1, 2);
        assertThat(randomClosed).isBetween(1, 2);
    }

}
