package SDA.collections;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

public class ListsTest {
    @Test
    public void shouldRemoveDuplicatedNumbers() {
        // given
        List<Integer> values = List.of(10, 11, 10, 11, 12, 11);

        // when
        List<Integer> result = Lists.makeDistinct(values);

        // then
        assertThat(result).containsExactly(10, 11, 12);
    }
}
