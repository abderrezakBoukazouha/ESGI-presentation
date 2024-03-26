package org.winside;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class ApplicationTest {

    @Test
    void givenEmptyString_whenCompressed_shouldGiveEmptyString() {

    }

    @Test
    void givenStringWithSpaces_whenCompressed_shouldGiveStringWithoutSpaces() {

    }

    @Test
    void givenValidString_whenCompressed_shouldCompressString() {

    }


    @ParameterizedTest
    @CsvSource({"a b c, abc", "apple, ap2le", "banana, banana"})
    void givenInput_WhenCompressed_shouldGiveValidOutput(String input, String compressedInput) {

    }
}
