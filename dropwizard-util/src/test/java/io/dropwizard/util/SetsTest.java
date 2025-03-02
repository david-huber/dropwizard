package io.dropwizard.util;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

import static org.assertj.core.api.Assertions.assertThat;

class SetsTest {

    @Test
    void of2Elements() {
        final Set set = Sets.of(1, 2);

        assertThat(set).isEqualTo(new HashSet(Arrays.asList(1, 2)));
    }

    @Test
    void of3Elements() {
        final Set set = Sets.of(1, 2, 1);

        assertThat(set).isEqualTo(new HashSet(Arrays.asList(1, 2)));
    }

    @Test
    void of4Elements() {
        final Set set = Sets.of(1, 2, 1, 1);

        assertThat(set).isEqualTo(new HashSet(Arrays.asList(1, 2)));
    }

    @Test
    void of5Elements() {
        final Set set = Sets.of(1, 1, 2, 3, 3);

        assertThat(set).isEqualTo(new HashSet(Arrays.asList(1, 2, 3)));
    }

}
